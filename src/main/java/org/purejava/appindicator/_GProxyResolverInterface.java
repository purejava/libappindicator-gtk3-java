// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GProxyResolverInterface {
 *     struct _GTypeInterface g_iface;
 *     int (*is_supported)(struct _GProxyResolver*);
 *     char** (*lookup)(struct _GProxyResolver*,char*,struct _GCancellable*,struct _GError**);
 *     void (*lookup_async)(struct _GProxyResolver*,char*,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
 *     char** (*lookup_finish)(struct _GProxyResolver*,struct _GAsyncResult*,struct _GError**);
 * };
 * }
 */
public class _GProxyResolverInterface {

    public static MemoryLayout $LAYOUT() {
        return constants$1230.const$0;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
 * int (*is_supported)(struct _GProxyResolver*);
     * }
     */
    public interface is_supported {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(is_supported fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1230.const$1, fi, constants$10.const$5, scope);
        }
        static is_supported ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle is_supported$VH() {
        return constants$1230.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*is_supported)(struct _GProxyResolver*);
     * }
     */
    public static MemorySegment is_supported$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1230.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*is_supported)(struct _GProxyResolver*);
     * }
     */
    public static void is_supported$set(MemorySegment seg, MemorySegment x) {
        constants$1230.const$2.set(seg, x);
    }
    public static MemorySegment is_supported$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1230.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void is_supported$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1230.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_supported is_supported(MemorySegment segment, Arena scope) {
        return is_supported.ofAddress(is_supported$get(segment), scope);
    }
    /**
     * {@snippet :
 * char** (*lookup)(struct _GProxyResolver*,char*,struct _GCancellable*,struct _GError**);
     * }
     */
    public interface lookup {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment pattern, java.lang.foreign.MemorySegment callback_data, java.lang.foreign.MemorySegment target, java.lang.foreign.MemorySegment extents);
        static MemorySegment allocate(lookup fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1230.const$3, fi, constants$39.const$1, scope);
        }
        static lookup ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle lookup$VH() {
        return constants$1230.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char** (*lookup)(struct _GProxyResolver*,char*,struct _GCancellable*,struct _GError**);
     * }
     */
    public static MemorySegment lookup$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1230.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char** (*lookup)(struct _GProxyResolver*,char*,struct _GCancellable*,struct _GError**);
     * }
     */
    public static void lookup$set(MemorySegment seg, MemorySegment x) {
        constants$1230.const$4.set(seg, x);
    }
    public static MemorySegment lookup$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1230.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void lookup$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1230.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static lookup lookup(MemorySegment segment, Arena scope) {
        return lookup.ofAddress(lookup$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*lookup_async)(struct _GProxyResolver*,char*,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public interface lookup_async {

        void apply(java.lang.foreign.MemorySegment cell_layout, java.lang.foreign.MemorySegment cell, java.lang.foreign.MemorySegment tree_model, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(lookup_async fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1230.const$5, fi, constants$332.const$1, scope);
        }
        static lookup_async ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _cell_layout, java.lang.foreign.MemorySegment _cell, java.lang.foreign.MemorySegment _tree_model, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$919.const$3.invokeExact(symbol, _cell_layout, _cell, _tree_model, _iter, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle lookup_async$VH() {
        return constants$1231.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*lookup_async)(struct _GProxyResolver*,char*,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static MemorySegment lookup_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1231.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*lookup_async)(struct _GProxyResolver*,char*,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static void lookup_async$set(MemorySegment seg, MemorySegment x) {
        constants$1231.const$0.set(seg, x);
    }
    public static MemorySegment lookup_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1231.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lookup_async$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1231.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static lookup_async lookup_async(MemorySegment segment, Arena scope) {
        return lookup_async.ofAddress(lookup_async$get(segment), scope);
    }
    /**
     * {@snippet :
 * char** (*lookup_finish)(struct _GProxyResolver*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public interface lookup_finish {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment vfs, java.lang.foreign.MemorySegment identifier, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(lookup_finish fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1231.const$1, fi, constants$23.const$0, scope);
        }
        static lookup_finish ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle lookup_finish$VH() {
        return constants$1231.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char** (*lookup_finish)(struct _GProxyResolver*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static MemorySegment lookup_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1231.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char** (*lookup_finish)(struct _GProxyResolver*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static void lookup_finish$set(MemorySegment seg, MemorySegment x) {
        constants$1231.const$2.set(seg, x);
    }
    public static MemorySegment lookup_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1231.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void lookup_finish$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1231.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static lookup_finish lookup_finish(MemorySegment segment, Arena scope) {
        return lookup_finish.ofAddress(lookup_finish$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


