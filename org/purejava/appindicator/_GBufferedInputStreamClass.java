// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GBufferedInputStreamClass {
 *     struct _GFilterInputStreamClass parent_class;
 *     long (*fill)(struct _GBufferedInputStream*,long,struct _GCancellable*,struct _GError**);
 *     void (*fill_async)(struct _GBufferedInputStream*,long,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
 *     long (*fill_finish)(struct _GBufferedInputStream*,struct _GAsyncResult*,struct _GError**);
 *     void (*_g_reserved1)();
 *     void (*_g_reserved2)();
 *     void (*_g_reserved3)();
 *     void (*_g_reserved4)();
 *     void (*_g_reserved5)();
 * };
 * }
 */
public class _GBufferedInputStreamClass {

    public static MemoryLayout $LAYOUT() {
        return constants$772.const$3;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 272);
    }
    /**
     * {@snippet :
 * long (*fill)(struct _GBufferedInputStream*,long,struct _GCancellable*,struct _GError**);
     * }
     */
    public interface fill {

        long apply(java.lang.foreign.MemorySegment _x0, long _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(fill fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$772.const$4, fi, constants$4.const$5, scope);
        }
        static fill ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, long __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (long)constants$760.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle fill$VH() {
        return constants$772.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long (*fill)(struct _GBufferedInputStream*,long,struct _GCancellable*,struct _GError**);
     * }
     */
    public static MemorySegment fill$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$772.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long (*fill)(struct _GBufferedInputStream*,long,struct _GCancellable*,struct _GError**);
     * }
     */
    public static void fill$set(MemorySegment seg, MemorySegment x) {
        constants$772.const$5.set(seg, x);
    }
    public static MemorySegment fill$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$772.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void fill$set(MemorySegment seg, long index, MemorySegment x) {
        constants$772.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static fill fill(MemorySegment segment, Arena scope) {
        return fill.ofAddress(fill$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*fill_async)(struct _GBufferedInputStream*,long,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public interface fill_async {

        void apply(java.lang.foreign.MemorySegment _x0, long _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(fill_async fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$773.const$0, fi, constants$762.const$2, scope);
        }
        static fill_async ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, long __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    constants$762.const$4.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle fill_async$VH() {
        return constants$773.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*fill_async)(struct _GBufferedInputStream*,long,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static MemorySegment fill_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$773.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*fill_async)(struct _GBufferedInputStream*,long,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static void fill_async$set(MemorySegment seg, MemorySegment x) {
        constants$773.const$1.set(seg, x);
    }
    public static MemorySegment fill_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$773.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void fill_async$set(MemorySegment seg, long index, MemorySegment x) {
        constants$773.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static fill_async fill_async(MemorySegment segment, Arena scope) {
        return fill_async.ofAddress(fill_async$get(segment), scope);
    }
    /**
     * {@snippet :
 * long (*fill_finish)(struct _GBufferedInputStream*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public interface fill_finish {

        long apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(fill_finish fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$773.const$2, fi, constants$166.const$0, scope);
        }
        static fill_finish ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (long)constants$762.const$0.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle fill_finish$VH() {
        return constants$773.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long (*fill_finish)(struct _GBufferedInputStream*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static MemorySegment fill_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$773.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long (*fill_finish)(struct _GBufferedInputStream*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static void fill_finish$set(MemorySegment seg, MemorySegment x) {
        constants$773.const$3.set(seg, x);
    }
    public static MemorySegment fill_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$773.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void fill_finish$set(MemorySegment seg, long index, MemorySegment x) {
        constants$773.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static fill_finish fill_finish(MemorySegment segment, Arena scope) {
        return fill_finish.ofAddress(fill_finish$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved1)();
     * }
     */
    public interface _g_reserved1 {

        void apply();
        static MemorySegment allocate(_g_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$773.const$4, fi, constants$7.const$5, scope);
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
        return constants$773.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static MemorySegment _g_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$773.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static void _g_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$773.const$5.set(seg, x);
    }
    public static MemorySegment _g_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$773.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$773.const$5.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$774.const$0, fi, constants$7.const$5, scope);
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
        return constants$774.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static MemorySegment _g_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$774.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static void _g_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$774.const$1.set(seg, x);
    }
    public static MemorySegment _g_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$774.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$774.const$1.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$774.const$2, fi, constants$7.const$5, scope);
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
        return constants$774.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static MemorySegment _g_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$774.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static void _g_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$774.const$3.set(seg, x);
    }
    public static MemorySegment _g_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$774.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$774.const$3.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$774.const$4, fi, constants$7.const$5, scope);
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
        return constants$774.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved4)();
     * }
     */
    public static MemorySegment _g_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$774.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved4)();
     * }
     */
    public static void _g_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$774.const$5.set(seg, x);
    }
    public static MemorySegment _g_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$774.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$774.const$5.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$775.const$0, fi, constants$7.const$5, scope);
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
        return constants$775.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved5)();
     * }
     */
    public static MemorySegment _g_reserved5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$775.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved5)();
     * }
     */
    public static void _g_reserved5$set(MemorySegment seg, MemorySegment x) {
        constants$775.const$1.set(seg, x);
    }
    public static MemorySegment _g_reserved5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$775.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved5$set(MemorySegment seg, long index, MemorySegment x) {
        constants$775.const$1.set(seg.asSlice(index*sizeof()), x);
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

