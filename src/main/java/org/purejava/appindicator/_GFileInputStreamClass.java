// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GFileInputStreamClass {
 *     struct _GInputStreamClass parent_class;
 *     long (*tell)(struct _GFileInputStream*);
 *     int (*can_seek)(struct _GFileInputStream*);
 *     int (*seek)(struct _GFileInputStream*,long,enum GSeekType,struct _GCancellable*,struct _GError**);
 *     struct _GFileInfo* (*query_info)(struct _GFileInputStream*,char*,struct _GCancellable*,struct _GError**);
 *     void (*query_info_async)(struct _GFileInputStream*,char*,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
 *     struct _GFileInfo* (*query_info_finish)(struct _GFileInputStream*,struct _GAsyncResult*,struct _GError**);
 *     void (*_g_reserved1)();
 *     void (*_g_reserved2)();
 *     void (*_g_reserved3)();
 *     void (*_g_reserved4)();
 *     void (*_g_reserved5)();
 * };
 * }
 */
public class _GFileInputStreamClass {

    public static MemoryLayout $LAYOUT() {
        return constants$1065.const$1;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 248);
    }
    /**
     * {@snippet :
 * long (*tell)(struct _GFileInputStream*);
     * }
     */
    public interface tell {

        long apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(tell fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1065.const$2, fi, constants$4.const$0, scope);
        }
        static tell ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (long)constants$1065.const$3.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle tell$VH() {
        return constants$1065.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long (*tell)(struct _GFileInputStream*);
     * }
     */
    public static MemorySegment tell$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1065.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long (*tell)(struct _GFileInputStream*);
     * }
     */
    public static void tell$set(MemorySegment seg, MemorySegment x) {
        constants$1065.const$4.set(seg, x);
    }
    public static MemorySegment tell$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1065.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void tell$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1065.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static tell tell(MemorySegment segment, Arena scope) {
        return tell.ofAddress(tell$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*can_seek)(struct _GFileInputStream*);
     * }
     */
    public interface can_seek {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(can_seek fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1065.const$5, fi, constants$10.const$5, scope);
        }
        static can_seek ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle can_seek$VH() {
        return constants$1066.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*can_seek)(struct _GFileInputStream*);
     * }
     */
    public static MemorySegment can_seek$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1066.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*can_seek)(struct _GFileInputStream*);
     * }
     */
    public static void can_seek$set(MemorySegment seg, MemorySegment x) {
        constants$1066.const$0.set(seg, x);
    }
    public static MemorySegment can_seek$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1066.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void can_seek$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1066.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static can_seek can_seek(MemorySegment segment, Arena scope) {
        return can_seek.ofAddress(can_seek$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*seek)(struct _GFileInputStream*,long,enum GSeekType,struct _GCancellable*,struct _GError**);
     * }
     */
    public interface seek {

        int apply(java.lang.foreign.MemorySegment _x0, long _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(seek fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1066.const$2, fi, constants$1066.const$1, scope);
        }
        static seek ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, long __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)constants$1066.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle seek$VH() {
        return constants$1066.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*seek)(struct _GFileInputStream*,long,enum GSeekType,struct _GCancellable*,struct _GError**);
     * }
     */
    public static MemorySegment seek$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1066.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*seek)(struct _GFileInputStream*,long,enum GSeekType,struct _GCancellable*,struct _GError**);
     * }
     */
    public static void seek$set(MemorySegment seg, MemorySegment x) {
        constants$1066.const$4.set(seg, x);
    }
    public static MemorySegment seek$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1066.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void seek$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1066.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static seek seek(MemorySegment segment, Arena scope) {
        return seek.ofAddress(seek$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GFileInfo* (*query_info)(struct _GFileInputStream*,char*,struct _GCancellable*,struct _GError**);
     * }
     */
    public interface query_info {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment pattern, java.lang.foreign.MemorySegment callback_data, java.lang.foreign.MemorySegment target, java.lang.foreign.MemorySegment extents);
        static MemorySegment allocate(query_info fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1066.const$5, fi, constants$39.const$1, scope);
        }
        static query_info ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _pattern, java.lang.foreign.MemorySegment _callback_data, java.lang.foreign.MemorySegment _target, java.lang.foreign.MemorySegment _extents) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$865.const$5.invokeExact(symbol, _pattern, _callback_data, _target, _extents);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle query_info$VH() {
        return constants$1067.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GFileInfo* (*query_info)(struct _GFileInputStream*,char*,struct _GCancellable*,struct _GError**);
     * }
     */
    public static MemorySegment query_info$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1067.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GFileInfo* (*query_info)(struct _GFileInputStream*,char*,struct _GCancellable*,struct _GError**);
     * }
     */
    public static void query_info$set(MemorySegment seg, MemorySegment x) {
        constants$1067.const$0.set(seg, x);
    }
    public static MemorySegment query_info$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1067.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void query_info$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1067.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static query_info query_info(MemorySegment segment, Arena scope) {
        return query_info.ofAddress(query_info$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*query_info_async)(struct _GFileInputStream*,char*,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public interface query_info_async {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(query_info_async fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1067.const$1, fi, constants$584.const$3, scope);
        }
        static query_info_async ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    constants$584.const$5.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle query_info_async$VH() {
        return constants$1067.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*query_info_async)(struct _GFileInputStream*,char*,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static MemorySegment query_info_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1067.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*query_info_async)(struct _GFileInputStream*,char*,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static void query_info_async$set(MemorySegment seg, MemorySegment x) {
        constants$1067.const$2.set(seg, x);
    }
    public static MemorySegment query_info_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1067.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void query_info_async$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1067.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static query_info_async query_info_async(MemorySegment segment, Arena scope) {
        return query_info_async.ofAddress(query_info_async$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GFileInfo* (*query_info_finish)(struct _GFileInputStream*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public interface query_info_finish {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment vfs, java.lang.foreign.MemorySegment identifier, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(query_info_finish fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1067.const$3, fi, constants$23.const$0, scope);
        }
        static query_info_finish ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle query_info_finish$VH() {
        return constants$1067.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GFileInfo* (*query_info_finish)(struct _GFileInputStream*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static MemorySegment query_info_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1067.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GFileInfo* (*query_info_finish)(struct _GFileInputStream*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static void query_info_finish$set(MemorySegment seg, MemorySegment x) {
        constants$1067.const$4.set(seg, x);
    }
    public static MemorySegment query_info_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1067.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void query_info_finish$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1067.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static query_info_finish query_info_finish(MemorySegment segment, Arena scope) {
        return query_info_finish.ofAddress(query_info_finish$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved1)();
     * }
     */
    public interface _g_reserved1 {

        void apply();
        static MemorySegment allocate(_g_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1067.const$5, fi, constants$7.const$5, scope);
        }
        static _g_reserved1 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle _g_reserved1$VH() {
        return constants$1068.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static MemorySegment _g_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1068.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static void _g_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$1068.const$0.set(seg, x);
    }
    public static MemorySegment _g_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1068.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1068.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved1 _g_reserved1(MemorySegment segment, Arena scope) {
        return _g_reserved1.ofAddress(_g_reserved1$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved2)();
     * }
     */
    public interface _g_reserved2 {

        void apply();
        static MemorySegment allocate(_g_reserved2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1068.const$1, fi, constants$7.const$5, scope);
        }
        static _g_reserved2 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle _g_reserved2$VH() {
        return constants$1068.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static MemorySegment _g_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1068.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static void _g_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$1068.const$2.set(seg, x);
    }
    public static MemorySegment _g_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1068.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1068.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved2 _g_reserved2(MemorySegment segment, Arena scope) {
        return _g_reserved2.ofAddress(_g_reserved2$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved3)();
     * }
     */
    public interface _g_reserved3 {

        void apply();
        static MemorySegment allocate(_g_reserved3 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1068.const$3, fi, constants$7.const$5, scope);
        }
        static _g_reserved3 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle _g_reserved3$VH() {
        return constants$1068.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static MemorySegment _g_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1068.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static void _g_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$1068.const$4.set(seg, x);
    }
    public static MemorySegment _g_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1068.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1068.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved3 _g_reserved3(MemorySegment segment, Arena scope) {
        return _g_reserved3.ofAddress(_g_reserved3$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved4)();
     * }
     */
    public interface _g_reserved4 {

        void apply();
        static MemorySegment allocate(_g_reserved4 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1068.const$5, fi, constants$7.const$5, scope);
        }
        static _g_reserved4 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle _g_reserved4$VH() {
        return constants$1069.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved4)();
     * }
     */
    public static MemorySegment _g_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1069.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved4)();
     * }
     */
    public static void _g_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$1069.const$0.set(seg, x);
    }
    public static MemorySegment _g_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1069.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1069.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved4 _g_reserved4(MemorySegment segment, Arena scope) {
        return _g_reserved4.ofAddress(_g_reserved4$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved5)();
     * }
     */
    public interface _g_reserved5 {

        void apply();
        static MemorySegment allocate(_g_reserved5 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1069.const$1, fi, constants$7.const$5, scope);
        }
        static _g_reserved5 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle _g_reserved5$VH() {
        return constants$1069.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved5)();
     * }
     */
    public static MemorySegment _g_reserved5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1069.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved5)();
     * }
     */
    public static void _g_reserved5$set(MemorySegment seg, MemorySegment x) {
        constants$1069.const$2.set(seg, x);
    }
    public static MemorySegment _g_reserved5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1069.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved5$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1069.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved5 _g_reserved5(MemorySegment segment, Arena scope) {
        return _g_reserved5.ofAddress(_g_reserved5$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


