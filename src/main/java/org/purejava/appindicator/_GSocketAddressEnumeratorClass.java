// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GSocketAddressEnumeratorClass {
 *     struct _GObjectClass parent_class;
 *     struct _GSocketAddress* (*next)(struct _GSocketAddressEnumerator*,struct _GCancellable*,struct _GError**);
 *     void (*next_async)(struct _GSocketAddressEnumerator*,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
 *     struct _GSocketAddress* (*next_finish)(struct _GSocketAddressEnumerator*,struct _GAsyncResult*,struct _GError**);
 * };
 * }
 */
public class _GSocketAddressEnumeratorClass {

    public static MemoryLayout $LAYOUT() {
        return constants$1225.const$0;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * struct _GSocketAddress* (*next)(struct _GSocketAddressEnumerator*,struct _GCancellable*,struct _GError**);
     * }
     */
    public interface next {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment vfs, java.lang.foreign.MemorySegment identifier, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(next fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1225.const$1, fi, constants$23.const$0, scope);
        }
        static next ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _vfs, java.lang.foreign.MemorySegment _identifier, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$734.const$5.invokeExact(symbol, _vfs, _identifier, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle next$VH() {
        return constants$1225.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GSocketAddress* (*next)(struct _GSocketAddressEnumerator*,struct _GCancellable*,struct _GError**);
     * }
     */
    public static MemorySegment next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1225.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GSocketAddress* (*next)(struct _GSocketAddressEnumerator*,struct _GCancellable*,struct _GError**);
     * }
     */
    public static void next$set(MemorySegment seg, MemorySegment x) {
        constants$1225.const$2.set(seg, x);
    }
    public static MemorySegment next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1225.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1225.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static next next(MemorySegment segment, Arena scope) {
        return next.ofAddress(next$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*next_async)(struct _GSocketAddressEnumerator*,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public interface next_async {

        void apply(java.lang.foreign.MemorySegment model, java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(next_async fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1225.const$3, fi, constants$42.const$1, scope);
        }
        static next_async ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _model, java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$259.const$4.invokeExact(symbol, _model, _path, _iter, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle next_async$VH() {
        return constants$1225.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*next_async)(struct _GSocketAddressEnumerator*,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static MemorySegment next_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1225.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*next_async)(struct _GSocketAddressEnumerator*,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static void next_async$set(MemorySegment seg, MemorySegment x) {
        constants$1225.const$4.set(seg, x);
    }
    public static MemorySegment next_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1225.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void next_async$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1225.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static next_async next_async(MemorySegment segment, Arena scope) {
        return next_async.ofAddress(next_async$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GSocketAddress* (*next_finish)(struct _GSocketAddressEnumerator*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public interface next_finish {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment vfs, java.lang.foreign.MemorySegment identifier, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(next_finish fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1225.const$5, fi, constants$23.const$0, scope);
        }
        static next_finish ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _vfs, java.lang.foreign.MemorySegment _identifier, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$734.const$5.invokeExact(symbol, _vfs, _identifier, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle next_finish$VH() {
        return constants$1226.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GSocketAddress* (*next_finish)(struct _GSocketAddressEnumerator*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static MemorySegment next_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1226.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GSocketAddress* (*next_finish)(struct _GSocketAddressEnumerator*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static void next_finish$set(MemorySegment seg, MemorySegment x) {
        constants$1226.const$0.set(seg, x);
    }
    public static MemorySegment next_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1226.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void next_finish$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1226.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static next_finish next_finish(MemorySegment segment, Arena scope) {
        return next_finish.ofAddress(next_finish$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


