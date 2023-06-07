// Generated by jextract
package org.purejava.appindicator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

import static java.lang.foreign.ValueLayout.*;

final class RuntimeHelper {

    private static final Linker LINKER = Linker.nativeLinker();
    private static final ClassLoader LOADER = RuntimeHelper.class.getClassLoader();
    private static final MethodHandles.Lookup MH_LOOKUP = MethodHandles.lookup();
    private static final SymbolLookup SYMBOL_LOOKUP;
    private static final SegmentAllocator THROWING_ALLOCATOR = (x, y) -> { throw new AssertionError("should not reach here"); };
    private static boolean isLoaded = false;
    private static final Logger LOG = LoggerFactory.getLogger(RuntimeHelper.class);

    final static SegmentAllocator CONSTANT_ALLOCATOR =
            (size, align) -> MemorySegment.allocateNative(size, align, SegmentScope.auto());

    static {
        try {
            System.loadLibrary("appindicator3");
            LOG.debug("Native code library appindicator3 successfully loaded");
            isLoaded = true;
        } catch (UnsatisfiedLinkError e) {
            LOG.info("Native code library appindicator3 failed to load");
        }
        SymbolLookup loaderLookup = SymbolLookup.loaderLookup();
        SYMBOL_LOOKUP = name -> loaderLookup.find(name).or(() -> LINKER.defaultLookup().find(name));
    }

    // Suppresses default constructor, ensuring non-instantiability.
    private RuntimeHelper() {}

    static <T> T requireNonNull(T obj, String symbolName) {
        if (obj == null) {
            throw new UnsatisfiedLinkError("unresolved symbol: " + symbolName);
        }
        return obj;
    }

    static MemorySegment lookupGlobalVariable(String name, MemoryLayout layout) {
        return SYMBOL_LOOKUP.find(name).map(symbol -> MemorySegment.ofAddress(symbol.address(), layout.byteSize(), symbol.scope())).orElse(null);
    }

    static MethodHandle downcallHandle(String name, FunctionDescriptor fdesc) {
        return SYMBOL_LOOKUP.find(name).
                map(addr -> LINKER.downcallHandle(addr, fdesc)).
                orElse(null);
    }

    static MethodHandle downcallHandle(FunctionDescriptor fdesc) {
        return LINKER.downcallHandle(fdesc);
    }

    static MethodHandle downcallHandleVariadic(String name, FunctionDescriptor fdesc) {
        return SYMBOL_LOOKUP.find(name).
                map(addr -> VarargsInvoker.make(addr, fdesc)).
                orElse(null);
    }

    static MethodHandle upcallHandle(Class<?> fi, String name, FunctionDescriptor fdesc) {
        try {
            return MH_LOOKUP.findVirtual(fi, name, fdesc.toMethodType());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }

    static <Z> MemorySegment upcallStub(MethodHandle fiHandle, Z z, FunctionDescriptor fdesc, SegmentScope scope) {
        try {
            fiHandle = fiHandle.bindTo(z);
            return LINKER.upcallStub(fiHandle, fdesc, scope);
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }

    static MemorySegment asArray(MemorySegment addr, MemoryLayout layout, int numElements, SegmentScope scope) {
         return MemorySegment.ofAddress(addr.address(), numElements * layout.byteSize(), scope);
    }

    // Internals only below this point

    private static final class VarargsInvoker {
        private static final MethodHandle INVOKE_MH;
        private final MemorySegment symbol;
        private final FunctionDescriptor function;

        private VarargsInvoker(MemorySegment symbol, FunctionDescriptor function) {
            this.symbol = symbol;
            this.function = function;
        }

        static {
            try {
                INVOKE_MH = MethodHandles.lookup().findVirtual(VarargsInvoker.class, "invoke", MethodType.methodType(Object.class, SegmentAllocator.class, Object[].class));
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException(e);
            }
        }

        static MethodHandle make(MemorySegment symbol, FunctionDescriptor function) {
            VarargsInvoker invoker = new VarargsInvoker(symbol, function);
            MethodHandle handle = INVOKE_MH.bindTo(invoker).asCollector(Object[].class, function.argumentLayouts().size() + 1);
            MethodType mtype = MethodType.methodType(function.returnLayout().isPresent() ? carrier(function.returnLayout().get(), true) : void.class);
            for (MemoryLayout layout : function.argumentLayouts()) {
                mtype = mtype.appendParameterTypes(carrier(layout, false));
            }
            mtype = mtype.appendParameterTypes(Object[].class);
            boolean needsAllocator = function.returnLayout().isPresent() &&
                                function.returnLayout().get() instanceof GroupLayout;
            if (needsAllocator) {
                mtype = mtype.insertParameterTypes(0, SegmentAllocator.class);
            } else {
                handle = MethodHandles.insertArguments(handle, 0, THROWING_ALLOCATOR);
            }
            return handle.asType(mtype);
        }

        static Class<?> carrier(MemoryLayout layout, boolean ret) {
            if (layout instanceof ValueLayout valueLayout) {
                return valueLayout.carrier();
            } else if (layout instanceof GroupLayout) {
                return MemorySegment.class;
            } else {
                throw new AssertionError("Cannot get here!");
            }
        }

        private Object invoke(SegmentAllocator allocator, Object[] args) throws Throwable {
            // one trailing Object[]
            int nNamedArgs = function.argumentLayouts().size();
            assert(args.length == nNamedArgs + 1);
            // The last argument is the array of vararg collector
            Object[] unnamedArgs = (Object[]) args[args.length - 1];

            int argsCount = nNamedArgs + unnamedArgs.length;
            Class<?>[] argTypes = new Class<?>[argsCount];
            MemoryLayout[] argLayouts = new MemoryLayout[nNamedArgs + unnamedArgs.length];

            int pos = 0;
            for (pos = 0; pos < nNamedArgs; pos++) {
                argLayouts[pos] = function.argumentLayouts().get(pos);
            }

            assert pos == nNamedArgs;
            for (Object o: unnamedArgs) {
                argLayouts[pos] = variadicLayout(normalize(o.getClass()));
                pos++;
            }
            assert pos == argsCount;

            FunctionDescriptor f = (function.returnLayout().isEmpty()) ?
                    FunctionDescriptor.ofVoid(argLayouts) :
                    FunctionDescriptor.of(function.returnLayout().get(), argLayouts);
            MethodHandle mh = LINKER.downcallHandle(symbol, f);
            boolean needsAllocator = function.returnLayout().isPresent() &&
                                            function.returnLayout().get() instanceof GroupLayout;
            if (needsAllocator) {
                mh = mh.bindTo(allocator);
            }
            // flatten argument list so that it can be passed to an asSpreader MH
            Object[] allArgs = new Object[nNamedArgs + unnamedArgs.length];
            System.arraycopy(args, 0, allArgs, 0, nNamedArgs);
            System.arraycopy(unnamedArgs, 0, allArgs, nNamedArgs, unnamedArgs.length);

            return mh.asSpreader(Object[].class, argsCount).invoke(allArgs);
        }

        private static Class<?> unboxIfNeeded(Class<?> clazz) {
            if (clazz == Boolean.class) {
                return boolean.class;
            } else if (clazz == Void.class) {
                return void.class;
            } else if (clazz == Byte.class) {
                return byte.class;
            } else if (clazz == Character.class) {
                return char.class;
            } else if (clazz == Short.class) {
                return short.class;
            } else if (clazz == Integer.class) {
                return int.class;
            } else if (clazz == Long.class) {
                return long.class;
            } else if (clazz == Float.class) {
                return float.class;
            } else if (clazz == Double.class) {
                return double.class;
            } else {
                return clazz;
            }
        }

        private Class<?> promote(Class<?> c) {
            if (c == byte.class || c == char.class || c == short.class || c == int.class) {
                return long.class;
            } else if (c == float.class) {
                return double.class;
            } else {
                return c;
            }
        }

        private Class<?> normalize(Class<?> c) {
            c = unboxIfNeeded(c);
            if (c.isPrimitive()) {
                return promote(c);
            }
            if (c == MemorySegment.class) {
                return MemorySegment.class;
            }
            throw new IllegalArgumentException("Invalid type for ABI: " + c.getTypeName());
        }

        private MemoryLayout variadicLayout(Class<?> c) {
            if (c == long.class) {
                return JAVA_LONG;
            } else if (c == double.class) {
                return JAVA_DOUBLE;
            } else if (c == MemorySegment.class) {
                return ADDRESS;
            } else {
                throw new IllegalArgumentException("Unhandled variadic argument class: " + c);
            }
        }
    }

    // Getter
    public static boolean isLoaded() {
        return isLoaded;
    }
}
