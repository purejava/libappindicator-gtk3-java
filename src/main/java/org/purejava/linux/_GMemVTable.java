// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GMemVTable {
 *     gpointer (*malloc)(gsize);
 *     gpointer (*realloc)(gpointer,gsize);
 *     void (*free)(gpointer);
 *     gpointer (*calloc)(gsize,gsize);
 *     gpointer (*try_malloc)(gsize);
 *     gpointer (*try_realloc)(gpointer,gsize);
 * };
 * }
 */
public class _GMemVTable {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("malloc"),
        Constants$root.C_POINTER$LAYOUT.withName("realloc"),
        Constants$root.C_POINTER$LAYOUT.withName("free"),
        Constants$root.C_POINTER$LAYOUT.withName("calloc"),
        Constants$root.C_POINTER$LAYOUT.withName("try_malloc"),
        Constants$root.C_POINTER$LAYOUT.withName("try_realloc")
    ).withName("_GMemVTable");
    public static MemoryLayout $LAYOUT() {
        return _GMemVTable.$struct$LAYOUT;
    }
    static final FunctionDescriptor malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor malloc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle malloc_UP$MH = RuntimeHelper.upcallHandle(malloc.class, "apply", _GMemVTable.malloc_UP$FUNC);
    static final FunctionDescriptor malloc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle malloc_DOWN$MH = RuntimeHelper.downcallHandle(
        _GMemVTable.malloc_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gpointer (*malloc)(gsize);
     * }
     */
    public interface malloc {

        java.lang.foreign.MemorySegment apply(long _x0);
        static MemorySegment allocate(malloc fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GMemVTable.malloc_UP$MH, fi, _GMemVTable.malloc$FUNC, scope);
        }
        static malloc ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (long __x0) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GMemVTable.malloc_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle malloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("malloc"));
    public static VarHandle malloc$VH() {
        return _GMemVTable.malloc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer (*malloc)(gsize);
     * }
     */
    public static MemorySegment malloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GMemVTable.malloc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer (*malloc)(gsize);
     * }
     */
    public static void malloc$set(MemorySegment seg, MemorySegment x) {
        _GMemVTable.malloc$VH.set(seg, x);
    }
    public static MemorySegment malloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GMemVTable.malloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void malloc$set(MemorySegment seg, long index, MemorySegment x) {
        _GMemVTable.malloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static malloc malloc(MemorySegment segment, SegmentScope scope) {
        return malloc.ofAddress(malloc$get(segment), scope);
    }
    static final FunctionDescriptor realloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor realloc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle realloc_UP$MH = RuntimeHelper.upcallHandle(realloc.class, "apply", _GMemVTable.realloc_UP$FUNC);
    static final FunctionDescriptor realloc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle realloc_DOWN$MH = RuntimeHelper.downcallHandle(
        _GMemVTable.realloc_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gpointer (*realloc)(gpointer,gsize);
     * }
     */
    public interface realloc {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, long _x1);
        static MemorySegment allocate(realloc fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GMemVTable.realloc_UP$MH, fi, _GMemVTable.realloc$FUNC, scope);
        }
        static realloc ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, long __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GMemVTable.realloc_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle realloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("realloc"));
    public static VarHandle realloc$VH() {
        return _GMemVTable.realloc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer (*realloc)(gpointer,gsize);
     * }
     */
    public static MemorySegment realloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GMemVTable.realloc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer (*realloc)(gpointer,gsize);
     * }
     */
    public static void realloc$set(MemorySegment seg, MemorySegment x) {
        _GMemVTable.realloc$VH.set(seg, x);
    }
    public static MemorySegment realloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GMemVTable.realloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void realloc$set(MemorySegment seg, long index, MemorySegment x) {
        _GMemVTable.realloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static realloc realloc(MemorySegment segment, SegmentScope scope) {
        return realloc.ofAddress(realloc$get(segment), scope);
    }
    static final FunctionDescriptor free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor free_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle free_UP$MH = RuntimeHelper.upcallHandle(free.class, "apply", _GMemVTable.free_UP$FUNC);
    static final FunctionDescriptor free_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle free_DOWN$MH = RuntimeHelper.downcallHandle(
        _GMemVTable.free_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*free)(gpointer);
     * }
     */
    public interface free {

        void apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(free fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GMemVTable.free_UP$MH, fi, _GMemVTable.free$FUNC, scope);
        }
        static free ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    _GMemVTable.free_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle free$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("free"));
    public static VarHandle free$VH() {
        return _GMemVTable.free$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*free)(gpointer);
     * }
     */
    public static MemorySegment free$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GMemVTable.free$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*free)(gpointer);
     * }
     */
    public static void free$set(MemorySegment seg, MemorySegment x) {
        _GMemVTable.free$VH.set(seg, x);
    }
    public static MemorySegment free$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GMemVTable.free$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void free$set(MemorySegment seg, long index, MemorySegment x) {
        _GMemVTable.free$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static free free(MemorySegment segment, SegmentScope scope) {
        return free.ofAddress(free$get(segment), scope);
    }
    static final FunctionDescriptor calloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor calloc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle calloc_UP$MH = RuntimeHelper.upcallHandle(calloc.class, "apply", _GMemVTable.calloc_UP$FUNC);
    static final FunctionDescriptor calloc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle calloc_DOWN$MH = RuntimeHelper.downcallHandle(
        _GMemVTable.calloc_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gpointer (*calloc)(gsize,gsize);
     * }
     */
    public interface calloc {

        java.lang.foreign.MemorySegment apply(long _x0, long _x1);
        static MemorySegment allocate(calloc fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GMemVTable.calloc_UP$MH, fi, _GMemVTable.calloc$FUNC, scope);
        }
        static calloc ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (long __x0, long __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GMemVTable.calloc_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle calloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("calloc"));
    public static VarHandle calloc$VH() {
        return _GMemVTable.calloc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer (*calloc)(gsize,gsize);
     * }
     */
    public static MemorySegment calloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GMemVTable.calloc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer (*calloc)(gsize,gsize);
     * }
     */
    public static void calloc$set(MemorySegment seg, MemorySegment x) {
        _GMemVTable.calloc$VH.set(seg, x);
    }
    public static MemorySegment calloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GMemVTable.calloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void calloc$set(MemorySegment seg, long index, MemorySegment x) {
        _GMemVTable.calloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static calloc calloc(MemorySegment segment, SegmentScope scope) {
        return calloc.ofAddress(calloc$get(segment), scope);
    }
    static final FunctionDescriptor try_malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor try_malloc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle try_malloc_UP$MH = RuntimeHelper.upcallHandle(try_malloc.class, "apply", _GMemVTable.try_malloc_UP$FUNC);
    static final FunctionDescriptor try_malloc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle try_malloc_DOWN$MH = RuntimeHelper.downcallHandle(
        _GMemVTable.try_malloc_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gpointer (*try_malloc)(gsize);
     * }
     */
    public interface try_malloc {

        java.lang.foreign.MemorySegment apply(long _x0);
        static MemorySegment allocate(try_malloc fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GMemVTable.try_malloc_UP$MH, fi, _GMemVTable.try_malloc$FUNC, scope);
        }
        static try_malloc ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (long __x0) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GMemVTable.try_malloc_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle try_malloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("try_malloc"));
    public static VarHandle try_malloc$VH() {
        return _GMemVTable.try_malloc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer (*try_malloc)(gsize);
     * }
     */
    public static MemorySegment try_malloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GMemVTable.try_malloc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer (*try_malloc)(gsize);
     * }
     */
    public static void try_malloc$set(MemorySegment seg, MemorySegment x) {
        _GMemVTable.try_malloc$VH.set(seg, x);
    }
    public static MemorySegment try_malloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GMemVTable.try_malloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void try_malloc$set(MemorySegment seg, long index, MemorySegment x) {
        _GMemVTable.try_malloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static try_malloc try_malloc(MemorySegment segment, SegmentScope scope) {
        return try_malloc.ofAddress(try_malloc$get(segment), scope);
    }
    static final FunctionDescriptor try_realloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor try_realloc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle try_realloc_UP$MH = RuntimeHelper.upcallHandle(try_realloc.class, "apply", _GMemVTable.try_realloc_UP$FUNC);
    static final FunctionDescriptor try_realloc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle try_realloc_DOWN$MH = RuntimeHelper.downcallHandle(
        _GMemVTable.try_realloc_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gpointer (*try_realloc)(gpointer,gsize);
     * }
     */
    public interface try_realloc {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, long _x1);
        static MemorySegment allocate(try_realloc fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GMemVTable.try_realloc_UP$MH, fi, _GMemVTable.try_realloc$FUNC, scope);
        }
        static try_realloc ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, long __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GMemVTable.try_realloc_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle try_realloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("try_realloc"));
    public static VarHandle try_realloc$VH() {
        return _GMemVTable.try_realloc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer (*try_realloc)(gpointer,gsize);
     * }
     */
    public static MemorySegment try_realloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GMemVTable.try_realloc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer (*try_realloc)(gpointer,gsize);
     * }
     */
    public static void try_realloc$set(MemorySegment seg, MemorySegment x) {
        _GMemVTable.try_realloc$VH.set(seg, x);
    }
    public static MemorySegment try_realloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GMemVTable.try_realloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void try_realloc$set(MemorySegment seg, long index, MemorySegment x) {
        _GMemVTable.try_realloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static try_realloc try_realloc(MemorySegment segment, SegmentScope scope) {
        return try_realloc.ofAddress(try_realloc$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

