// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GTypeModuleClass {
 *     struct _GObjectClass parent_class;
 *     int (*load)(struct _GTypeModule*);
 *     void (*unload)(struct _GTypeModule*);
 *     void (*reserved1)();
 *     void (*reserved2)();
 *     void (*reserved3)();
 *     void (*reserved4)();
 * };
 * }
 */
public class _GTypeModuleClass {

    public static MemoryLayout $LAYOUT() {
        return constants$678.const$3;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * int (*load)(struct _GTypeModule*);
     * }
     */
    public interface load {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(load fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$678.const$4, fi, constants$10.const$5, scope);
        }
        static load ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle load$VH() {
        return constants$678.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*load)(struct _GTypeModule*);
     * }
     */
    public static MemorySegment load$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$678.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*load)(struct _GTypeModule*);
     * }
     */
    public static void load$set(MemorySegment seg, MemorySegment x) {
        constants$678.const$5.set(seg, x);
    }
    public static MemorySegment load$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$678.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void load$set(MemorySegment seg, long index, MemorySegment x) {
        constants$678.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static load load(MemorySegment segment, Arena scope) {
        return load.ofAddress(load$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*unload)(struct _GTypeModule*);
     * }
     */
    public interface unload {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(unload fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$679.const$0, fi, constants$13.const$1, scope);
        }
        static unload ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle unload$VH() {
        return constants$679.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*unload)(struct _GTypeModule*);
     * }
     */
    public static MemorySegment unload$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$679.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*unload)(struct _GTypeModule*);
     * }
     */
    public static void unload$set(MemorySegment seg, MemorySegment x) {
        constants$679.const$1.set(seg, x);
    }
    public static MemorySegment unload$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$679.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void unload$set(MemorySegment seg, long index, MemorySegment x) {
        constants$679.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static unload unload(MemorySegment segment, Arena scope) {
        return unload.ofAddress(unload$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*reserved1)();
     * }
     */
    public interface reserved1 {

        void apply();
        static MemorySegment allocate(reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$679.const$2, fi, constants$7.const$5, scope);
        }
        static reserved1 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle reserved1$VH() {
        return constants$679.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reserved1)();
     * }
     */
    public static MemorySegment reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$679.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reserved1)();
     * }
     */
    public static void reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$679.const$3.set(seg, x);
    }
    public static MemorySegment reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$679.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$679.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved1 reserved1(MemorySegment segment, Arena scope) {
        return reserved1.ofAddress(reserved1$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*reserved2)();
     * }
     */
    public interface reserved2 {

        void apply();
        static MemorySegment allocate(reserved2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$679.const$4, fi, constants$7.const$5, scope);
        }
        static reserved2 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle reserved2$VH() {
        return constants$679.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reserved2)();
     * }
     */
    public static MemorySegment reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$679.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reserved2)();
     * }
     */
    public static void reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$679.const$5.set(seg, x);
    }
    public static MemorySegment reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$679.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$679.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved2 reserved2(MemorySegment segment, Arena scope) {
        return reserved2.ofAddress(reserved2$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*reserved3)();
     * }
     */
    public interface reserved3 {

        void apply();
        static MemorySegment allocate(reserved3 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$680.const$0, fi, constants$7.const$5, scope);
        }
        static reserved3 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle reserved3$VH() {
        return constants$680.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reserved3)();
     * }
     */
    public static MemorySegment reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$680.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reserved3)();
     * }
     */
    public static void reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$680.const$1.set(seg, x);
    }
    public static MemorySegment reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$680.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$680.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved3 reserved3(MemorySegment segment, Arena scope) {
        return reserved3.ofAddress(reserved3$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*reserved4)();
     * }
     */
    public interface reserved4 {

        void apply();
        static MemorySegment allocate(reserved4 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$680.const$2, fi, constants$7.const$5, scope);
        }
        static reserved4 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle reserved4$VH() {
        return constants$680.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reserved4)();
     * }
     */
    public static MemorySegment reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$680.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reserved4)();
     * }
     */
    public static void reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$680.const$3.set(seg, x);
    }
    public static MemorySegment reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$680.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$680.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved4 reserved4(MemorySegment segment, Arena scope) {
        return reserved4.ofAddress(reserved4$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


