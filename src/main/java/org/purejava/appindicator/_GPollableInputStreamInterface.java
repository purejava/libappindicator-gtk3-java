// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GPollableInputStreamInterface {
 *     GTypeInterface g_iface;
 *     gboolean (*can_poll)(GPollableInputStream*);
 *     gboolean (*is_readable)(GPollableInputStream*);
 *     GSource* (*create_source)(GPollableInputStream*,GCancellable*);
 *     gssize (*read_nonblocking)(GPollableInputStream*,void*,gsize,GError**);
 * };
 * }
 */
public class _GPollableInputStreamInterface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("can_poll"),
        Constants$root.C_POINTER$LAYOUT.withName("is_readable"),
        Constants$root.C_POINTER$LAYOUT.withName("create_source"),
        Constants$root.C_POINTER$LAYOUT.withName("read_nonblocking")
    ).withName("_GPollableInputStreamInterface");
    public static MemoryLayout $LAYOUT() {
        return _GPollableInputStreamInterface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor can_poll$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor can_poll_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle can_poll_UP$MH = RuntimeHelper.upcallHandle(can_poll.class, "apply", _GPollableInputStreamInterface.can_poll_UP$FUNC);
    static final FunctionDescriptor can_poll_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle can_poll_DOWN$MH = RuntimeHelper.downcallHandle(
        _GPollableInputStreamInterface.can_poll_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*can_poll)(GPollableInputStream*);
     * }
     */
    public interface can_poll {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(can_poll fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GPollableInputStreamInterface.can_poll_UP$MH, fi, _GPollableInputStreamInterface.can_poll$FUNC, scope);
        }
        static can_poll ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)_GPollableInputStreamInterface.can_poll_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle can_poll$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("can_poll"));
    public static VarHandle can_poll$VH() {
        return _GPollableInputStreamInterface.can_poll$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*can_poll)(GPollableInputStream*);
     * }
     */
    public static MemorySegment can_poll$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GPollableInputStreamInterface.can_poll$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*can_poll)(GPollableInputStream*);
     * }
     */
    public static void can_poll$set(MemorySegment seg, MemorySegment x) {
        _GPollableInputStreamInterface.can_poll$VH.set(seg, x);
    }
    public static MemorySegment can_poll$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GPollableInputStreamInterface.can_poll$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void can_poll$set(MemorySegment seg, long index, MemorySegment x) {
        _GPollableInputStreamInterface.can_poll$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static can_poll can_poll(MemorySegment segment, SegmentScope scope) {
        return can_poll.ofAddress(can_poll$get(segment), scope);
    }
    static final FunctionDescriptor is_readable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor is_readable_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_readable_UP$MH = RuntimeHelper.upcallHandle(is_readable.class, "apply", _GPollableInputStreamInterface.is_readable_UP$FUNC);
    static final FunctionDescriptor is_readable_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_readable_DOWN$MH = RuntimeHelper.downcallHandle(
        _GPollableInputStreamInterface.is_readable_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*is_readable)(GPollableInputStream*);
     * }
     */
    public interface is_readable {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(is_readable fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GPollableInputStreamInterface.is_readable_UP$MH, fi, _GPollableInputStreamInterface.is_readable$FUNC, scope);
        }
        static is_readable ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)_GPollableInputStreamInterface.is_readable_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle is_readable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_readable"));
    public static VarHandle is_readable$VH() {
        return _GPollableInputStreamInterface.is_readable$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*is_readable)(GPollableInputStream*);
     * }
     */
    public static MemorySegment is_readable$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GPollableInputStreamInterface.is_readable$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*is_readable)(GPollableInputStream*);
     * }
     */
    public static void is_readable$set(MemorySegment seg, MemorySegment x) {
        _GPollableInputStreamInterface.is_readable$VH.set(seg, x);
    }
    public static MemorySegment is_readable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GPollableInputStreamInterface.is_readable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_readable$set(MemorySegment seg, long index, MemorySegment x) {
        _GPollableInputStreamInterface.is_readable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_readable is_readable(MemorySegment segment, SegmentScope scope) {
        return is_readable.ofAddress(is_readable$get(segment), scope);
    }
    static final FunctionDescriptor create_source$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor create_source_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle create_source_UP$MH = RuntimeHelper.upcallHandle(create_source.class, "apply", _GPollableInputStreamInterface.create_source_UP$FUNC);
    static final FunctionDescriptor create_source_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle create_source_DOWN$MH = RuntimeHelper.downcallHandle(
        _GPollableInputStreamInterface.create_source_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GSource* (*create_source)(GPollableInputStream*,GCancellable*);
     * }
     */
    public interface create_source {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment func_data);
        static MemorySegment allocate(create_source fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GPollableInputStreamInterface.create_source_UP$MH, fi, _GPollableInputStreamInterface.create_source$FUNC, scope);
        }
        static create_source ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _func_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GPollableInputStreamInterface.create_source_DOWN$MH.invokeExact(symbol, _path, _func_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle create_source$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("create_source"));
    public static VarHandle create_source$VH() {
        return _GPollableInputStreamInterface.create_source$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSource* (*create_source)(GPollableInputStream*,GCancellable*);
     * }
     */
    public static MemorySegment create_source$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GPollableInputStreamInterface.create_source$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSource* (*create_source)(GPollableInputStream*,GCancellable*);
     * }
     */
    public static void create_source$set(MemorySegment seg, MemorySegment x) {
        _GPollableInputStreamInterface.create_source$VH.set(seg, x);
    }
    public static MemorySegment create_source$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GPollableInputStreamInterface.create_source$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void create_source$set(MemorySegment seg, long index, MemorySegment x) {
        _GPollableInputStreamInterface.create_source$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static create_source create_source(MemorySegment segment, SegmentScope scope) {
        return create_source.ofAddress(create_source$get(segment), scope);
    }
    static final FunctionDescriptor read_nonblocking$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor read_nonblocking_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle read_nonblocking_UP$MH = RuntimeHelper.upcallHandle(read_nonblocking.class, "apply", _GPollableInputStreamInterface.read_nonblocking_UP$FUNC);
    static final FunctionDescriptor read_nonblocking_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle read_nonblocking_DOWN$MH = RuntimeHelper.downcallHandle(
        _GPollableInputStreamInterface.read_nonblocking_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gssize (*read_nonblocking)(GPollableInputStream*,void*,gsize,GError**);
     * }
     */
    public interface read_nonblocking {

        long apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, long _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(read_nonblocking fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GPollableInputStreamInterface.read_nonblocking_UP$MH, fi, _GPollableInputStreamInterface.read_nonblocking$FUNC, scope);
        }
        static read_nonblocking ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, long __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (long)_GPollableInputStreamInterface.read_nonblocking_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle read_nonblocking$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("read_nonblocking"));
    public static VarHandle read_nonblocking$VH() {
        return _GPollableInputStreamInterface.read_nonblocking$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gssize (*read_nonblocking)(GPollableInputStream*,void*,gsize,GError**);
     * }
     */
    public static MemorySegment read_nonblocking$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GPollableInputStreamInterface.read_nonblocking$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gssize (*read_nonblocking)(GPollableInputStream*,void*,gsize,GError**);
     * }
     */
    public static void read_nonblocking$set(MemorySegment seg, MemorySegment x) {
        _GPollableInputStreamInterface.read_nonblocking$VH.set(seg, x);
    }
    public static MemorySegment read_nonblocking$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GPollableInputStreamInterface.read_nonblocking$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void read_nonblocking$set(MemorySegment seg, long index, MemorySegment x) {
        _GPollableInputStreamInterface.read_nonblocking$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_nonblocking read_nonblocking(MemorySegment segment, SegmentScope scope) {
        return read_nonblocking.ofAddress(read_nonblocking$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

