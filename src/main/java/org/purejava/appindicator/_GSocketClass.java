// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GSocketClass {
 *     struct _GObjectClass parent_class;
 *     void (*_g_reserved1)();
 *     void (*_g_reserved2)();
 *     void (*_g_reserved3)();
 *     void (*_g_reserved4)();
 *     void (*_g_reserved5)();
 *     void (*_g_reserved6)();
 *     void (*_g_reserved7)();
 *     void (*_g_reserved8)();
 *     void (*_g_reserved9)();
 *     void (*_g_reserved10)();
 * };
 * }
 */
public class _GSocketClass {

    public static MemoryLayout $LAYOUT() {
        return constants$1276.const$0;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * void (*_g_reserved1)();
     * }
     */
    public interface _g_reserved1 {

        void apply();
        static MemorySegment allocate(_g_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1276.const$1, fi, constants$7.const$5, scope);
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
        return constants$1276.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static MemorySegment _g_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1276.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static void _g_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$1276.const$2.set(seg, x);
    }
    public static MemorySegment _g_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1276.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1276.const$2.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$1276.const$3, fi, constants$7.const$5, scope);
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
        return constants$1276.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static MemorySegment _g_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1276.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static void _g_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$1276.const$4.set(seg, x);
    }
    public static MemorySegment _g_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1276.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1276.const$4.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$1276.const$5, fi, constants$7.const$5, scope);
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
        return constants$1277.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static MemorySegment _g_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1277.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static void _g_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$1277.const$0.set(seg, x);
    }
    public static MemorySegment _g_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1277.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1277.const$0.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$1277.const$1, fi, constants$7.const$5, scope);
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
        return constants$1277.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved4)();
     * }
     */
    public static MemorySegment _g_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1277.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved4)();
     * }
     */
    public static void _g_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$1277.const$2.set(seg, x);
    }
    public static MemorySegment _g_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1277.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1277.const$2.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$1277.const$3, fi, constants$7.const$5, scope);
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
        return constants$1277.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved5)();
     * }
     */
    public static MemorySegment _g_reserved5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1277.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved5)();
     * }
     */
    public static void _g_reserved5$set(MemorySegment seg, MemorySegment x) {
        constants$1277.const$4.set(seg, x);
    }
    public static MemorySegment _g_reserved5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1277.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved5$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1277.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved5 _g_reserved5(MemorySegment segment, Arena scope) {
        return _g_reserved5.ofAddress(_g_reserved5$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved6)();
     * }
     */
    public interface _g_reserved6 {

        void apply();
        static MemorySegment allocate(_g_reserved6 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1277.const$5, fi, constants$7.const$5, scope);
        }
        static _g_reserved6 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _g_reserved6$VH() {
        return constants$1278.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved6)();
     * }
     */
    public static MemorySegment _g_reserved6$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1278.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved6)();
     * }
     */
    public static void _g_reserved6$set(MemorySegment seg, MemorySegment x) {
        constants$1278.const$0.set(seg, x);
    }
    public static MemorySegment _g_reserved6$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1278.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved6$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1278.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved6 _g_reserved6(MemorySegment segment, Arena scope) {
        return _g_reserved6.ofAddress(_g_reserved6$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved7)();
     * }
     */
    public interface _g_reserved7 {

        void apply();
        static MemorySegment allocate(_g_reserved7 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1278.const$1, fi, constants$7.const$5, scope);
        }
        static _g_reserved7 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _g_reserved7$VH() {
        return constants$1278.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved7)();
     * }
     */
    public static MemorySegment _g_reserved7$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1278.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved7)();
     * }
     */
    public static void _g_reserved7$set(MemorySegment seg, MemorySegment x) {
        constants$1278.const$2.set(seg, x);
    }
    public static MemorySegment _g_reserved7$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1278.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved7$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1278.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved7 _g_reserved7(MemorySegment segment, Arena scope) {
        return _g_reserved7.ofAddress(_g_reserved7$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved8)();
     * }
     */
    public interface _g_reserved8 {

        void apply();
        static MemorySegment allocate(_g_reserved8 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1278.const$3, fi, constants$7.const$5, scope);
        }
        static _g_reserved8 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _g_reserved8$VH() {
        return constants$1278.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved8)();
     * }
     */
    public static MemorySegment _g_reserved8$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1278.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved8)();
     * }
     */
    public static void _g_reserved8$set(MemorySegment seg, MemorySegment x) {
        constants$1278.const$4.set(seg, x);
    }
    public static MemorySegment _g_reserved8$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1278.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved8$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1278.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved8 _g_reserved8(MemorySegment segment, Arena scope) {
        return _g_reserved8.ofAddress(_g_reserved8$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved9)();
     * }
     */
    public interface _g_reserved9 {

        void apply();
        static MemorySegment allocate(_g_reserved9 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1278.const$5, fi, constants$7.const$5, scope);
        }
        static _g_reserved9 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _g_reserved9$VH() {
        return constants$1279.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved9)();
     * }
     */
    public static MemorySegment _g_reserved9$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1279.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved9)();
     * }
     */
    public static void _g_reserved9$set(MemorySegment seg, MemorySegment x) {
        constants$1279.const$0.set(seg, x);
    }
    public static MemorySegment _g_reserved9$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1279.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved9$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1279.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved9 _g_reserved9(MemorySegment segment, Arena scope) {
        return _g_reserved9.ofAddress(_g_reserved9$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved10)();
     * }
     */
    public interface _g_reserved10 {

        void apply();
        static MemorySegment allocate(_g_reserved10 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1279.const$1, fi, constants$7.const$5, scope);
        }
        static _g_reserved10 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _g_reserved10$VH() {
        return constants$1279.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved10)();
     * }
     */
    public static MemorySegment _g_reserved10$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1279.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved10)();
     * }
     */
    public static void _g_reserved10$set(MemorySegment seg, MemorySegment x) {
        constants$1279.const$2.set(seg, x);
    }
    public static MemorySegment _g_reserved10$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1279.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved10$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1279.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved10 _g_reserved10(MemorySegment segment, Arena scope) {
        return _g_reserved10.ofAddress(_g_reserved10$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


