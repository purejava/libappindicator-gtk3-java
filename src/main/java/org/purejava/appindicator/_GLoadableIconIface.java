// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GLoadableIconIface {
 *     struct _GTypeInterface g_iface;
 *     struct _GInputStream* (*load)(struct _GLoadableIcon*,int,char**,struct _GCancellable*,struct _GError**);
 *     void (*load_async)(struct _GLoadableIcon*,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
 *     struct _GInputStream* (*load_finish)(struct _GLoadableIcon*,struct _GAsyncResult*,char**,struct _GError**);
 * };
 * }
 */
public class _GLoadableIconIface {

    public static MemoryLayout $LAYOUT() {
        return constants$1137.const$5;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
 * struct _GInputStream* (*load)(struct _GLoadableIcon*,int,char**,struct _GCancellable*,struct _GError**);
     * }
     */
    public interface load {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(load fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1138.const$0, fi, constants$858.const$5, scope);
        }
        static load ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$1138.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle load$VH() {
        return constants$1138.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GInputStream* (*load)(struct _GLoadableIcon*,int,char**,struct _GCancellable*,struct _GError**);
     * }
     */
    public static MemorySegment load$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1138.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GInputStream* (*load)(struct _GLoadableIcon*,int,char**,struct _GCancellable*,struct _GError**);
     * }
     */
    public static void load$set(MemorySegment seg, MemorySegment x) {
        constants$1138.const$2.set(seg, x);
    }
    public static MemorySegment load$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1138.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void load$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1138.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static load load(MemorySegment segment, Arena scope) {
        return load.ofAddress(load$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*load_async)(struct _GLoadableIcon*,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public interface load_async {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(load_async fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1138.const$3, fi, constants$282.const$1, scope);
        }
        static load_async ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    constants$757.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle load_async$VH() {
        return constants$1138.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*load_async)(struct _GLoadableIcon*,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static MemorySegment load_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1138.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*load_async)(struct _GLoadableIcon*,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static void load_async$set(MemorySegment seg, MemorySegment x) {
        constants$1138.const$4.set(seg, x);
    }
    public static MemorySegment load_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1138.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void load_async$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1138.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static load_async load_async(MemorySegment segment, Arena scope) {
        return load_async.ofAddress(load_async$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GInputStream* (*load_finish)(struct _GLoadableIcon*,struct _GAsyncResult*,char**,struct _GError**);
     * }
     */
    public interface load_finish {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment pattern, java.lang.foreign.MemorySegment callback_data, java.lang.foreign.MemorySegment target, java.lang.foreign.MemorySegment extents);
        static MemorySegment allocate(load_finish fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1138.const$5, fi, constants$39.const$1, scope);
        }
        static load_finish ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _pattern, java.lang.foreign.MemorySegment _callback_data, java.lang.foreign.MemorySegment _target, java.lang.foreign.MemorySegment _extents) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$868.const$5.invokeExact(symbol, _pattern, _callback_data, _target, _extents);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle load_finish$VH() {
        return constants$1139.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GInputStream* (*load_finish)(struct _GLoadableIcon*,struct _GAsyncResult*,char**,struct _GError**);
     * }
     */
    public static MemorySegment load_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1139.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GInputStream* (*load_finish)(struct _GLoadableIcon*,struct _GAsyncResult*,char**,struct _GError**);
     * }
     */
    public static void load_finish$set(MemorySegment seg, MemorySegment x) {
        constants$1139.const$0.set(seg, x);
    }
    public static MemorySegment load_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1139.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void load_finish$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1139.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static load_finish load_finish(MemorySegment segment, Arena scope) {
        return load_finish.ofAddress(load_finish$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


