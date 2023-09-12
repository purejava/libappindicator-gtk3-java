// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GProxyInterface {
 *     struct _GTypeInterface g_iface;
 *     struct _GIOStream* (*connect)(struct _GProxy*,struct _GIOStream*,struct _GProxyAddress*,struct _GCancellable*,struct _GError**);
 *     void (*connect_async)(struct _GProxy*,struct _GIOStream*,struct _GProxyAddress*,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
 *     struct _GIOStream* (*connect_finish)(struct _GProxy*,struct _GAsyncResult*,struct _GError**);
 *     int (*supports_hostname)(struct _GProxy*);
 * };
 * }
 */
public class _GProxyInterface {

    public static MemoryLayout $LAYOUT() {
        return constants$1216.const$3;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
 * struct _GIOStream* (*connect)(struct _GProxy*,struct _GIOStream*,struct _GProxyAddress*,struct _GCancellable*,struct _GError**);
     * }
     */
    public interface connect {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment connection, java.lang.foreign.MemorySegment sender, java.lang.foreign.MemorySegment object_path, java.lang.foreign.MemorySegment node, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(connect fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1216.const$4, fi, constants$330.const$5, scope);
        }
        static connect ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _connection, java.lang.foreign.MemorySegment _sender, java.lang.foreign.MemorySegment _object_path, java.lang.foreign.MemorySegment _node, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$866.const$1.invokeExact(symbol, _connection, _sender, _object_path, _node, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle connect$VH() {
        return constants$1216.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GIOStream* (*connect)(struct _GProxy*,struct _GIOStream*,struct _GProxyAddress*,struct _GCancellable*,struct _GError**);
     * }
     */
    public static MemorySegment connect$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1216.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GIOStream* (*connect)(struct _GProxy*,struct _GIOStream*,struct _GProxyAddress*,struct _GCancellable*,struct _GError**);
     * }
     */
    public static void connect$set(MemorySegment seg, MemorySegment x) {
        constants$1216.const$5.set(seg, x);
    }
    public static MemorySegment connect$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1216.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void connect$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1216.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static connect connect(MemorySegment segment, Arena scope) {
        return connect.ofAddress(connect$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*connect_async)(struct _GProxy*,struct _GIOStream*,struct _GProxyAddress*,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public interface connect_async {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(connect_async fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1217.const$0, fi, constants$338.const$3, scope);
        }
        static connect_async ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    constants$338.const$5.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle connect_async$VH() {
        return constants$1217.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*connect_async)(struct _GProxy*,struct _GIOStream*,struct _GProxyAddress*,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static MemorySegment connect_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1217.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*connect_async)(struct _GProxy*,struct _GIOStream*,struct _GProxyAddress*,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static void connect_async$set(MemorySegment seg, MemorySegment x) {
        constants$1217.const$1.set(seg, x);
    }
    public static MemorySegment connect_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1217.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void connect_async$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1217.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static connect_async connect_async(MemorySegment segment, Arena scope) {
        return connect_async.ofAddress(connect_async$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GIOStream* (*connect_finish)(struct _GProxy*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public interface connect_finish {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment vfs, java.lang.foreign.MemorySegment identifier, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(connect_finish fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1217.const$2, fi, constants$23.const$0, scope);
        }
        static connect_finish ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _vfs, java.lang.foreign.MemorySegment _identifier, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$732.const$0.invokeExact(symbol, _vfs, _identifier, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle connect_finish$VH() {
        return constants$1217.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GIOStream* (*connect_finish)(struct _GProxy*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static MemorySegment connect_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1217.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GIOStream* (*connect_finish)(struct _GProxy*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static void connect_finish$set(MemorySegment seg, MemorySegment x) {
        constants$1217.const$3.set(seg, x);
    }
    public static MemorySegment connect_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1217.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void connect_finish$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1217.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static connect_finish connect_finish(MemorySegment segment, Arena scope) {
        return connect_finish.ofAddress(connect_finish$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*supports_hostname)(struct _GProxy*);
     * }
     */
    public interface supports_hostname {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(supports_hostname fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1217.const$4, fi, constants$10.const$5, scope);
        }
        static supports_hostname ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$14.const$2.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle supports_hostname$VH() {
        return constants$1217.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*supports_hostname)(struct _GProxy*);
     * }
     */
    public static MemorySegment supports_hostname$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1217.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*supports_hostname)(struct _GProxy*);
     * }
     */
    public static void supports_hostname$set(MemorySegment seg, MemorySegment x) {
        constants$1217.const$5.set(seg, x);
    }
    public static MemorySegment supports_hostname$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1217.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void supports_hostname$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1217.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static supports_hostname supports_hostname(MemorySegment segment, Arena scope) {
        return supports_hostname.ofAddress(supports_hostname$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


