// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkSwitchClass {
 *     struct _GtkWidgetClass parent_class;
 *     void (*activate)(struct _GtkSwitch*);
 *     int (*state_set)(struct _GtkSwitch*,int);
 *     void (*_switch_padding_1)();
 *     void (*_switch_padding_2)();
 *     void (*_switch_padding_3)();
 *     void (*_switch_padding_4)();
 *     void (*_switch_padding_5)();
 * };
 * }
 */
public class _GtkSwitchClass {

    public static MemoryLayout $LAYOUT() {
        return constants$3112.const$4;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 824);
    }
    /**
     * {@snippet :
 * void (*activate)(struct _GtkSwitch*);
     * }
     */
    public interface activate {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(activate fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3112.const$5, fi, constants$13.const$1, scope);
        }
        static activate ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle activate$VH() {
        return constants$3113.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*activate)(struct _GtkSwitch*);
     * }
     */
    public static MemorySegment activate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3113.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*activate)(struct _GtkSwitch*);
     * }
     */
    public static void activate$set(MemorySegment seg, MemorySegment x) {
        constants$3113.const$0.set(seg, x);
    }
    public static MemorySegment activate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3113.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void activate$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3113.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate activate(MemorySegment segment, Arena scope) {
        return activate.ofAddress(activate$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*state_set)(struct _GtkSwitch*,int);
     * }
     */
    public interface state_set {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(state_set fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3113.const$1, fi, constants$11.const$4, scope);
        }
        static state_set ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)constants$837.const$4.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle state_set$VH() {
        return constants$3113.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*state_set)(struct _GtkSwitch*,int);
     * }
     */
    public static MemorySegment state_set$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3113.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*state_set)(struct _GtkSwitch*,int);
     * }
     */
    public static void state_set$set(MemorySegment seg, MemorySegment x) {
        constants$3113.const$2.set(seg, x);
    }
    public static MemorySegment state_set$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3113.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void state_set$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3113.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static state_set state_set(MemorySegment segment, Arena scope) {
        return state_set.ofAddress(state_set$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_switch_padding_1)();
     * }
     */
    public interface _switch_padding_1 {

        void apply();
        static MemorySegment allocate(_switch_padding_1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3113.const$3, fi, constants$7.const$5, scope);
        }
        static _switch_padding_1 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _switch_padding_1$VH() {
        return constants$3113.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_switch_padding_1)();
     * }
     */
    public static MemorySegment _switch_padding_1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3113.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_switch_padding_1)();
     * }
     */
    public static void _switch_padding_1$set(MemorySegment seg, MemorySegment x) {
        constants$3113.const$4.set(seg, x);
    }
    public static MemorySegment _switch_padding_1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3113.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _switch_padding_1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3113.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static _switch_padding_1 _switch_padding_1(MemorySegment segment, Arena scope) {
        return _switch_padding_1.ofAddress(_switch_padding_1$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_switch_padding_2)();
     * }
     */
    public interface _switch_padding_2 {

        void apply();
        static MemorySegment allocate(_switch_padding_2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3113.const$5, fi, constants$7.const$5, scope);
        }
        static _switch_padding_2 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _switch_padding_2$VH() {
        return constants$3114.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_switch_padding_2)();
     * }
     */
    public static MemorySegment _switch_padding_2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3114.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_switch_padding_2)();
     * }
     */
    public static void _switch_padding_2$set(MemorySegment seg, MemorySegment x) {
        constants$3114.const$0.set(seg, x);
    }
    public static MemorySegment _switch_padding_2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3114.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _switch_padding_2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3114.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static _switch_padding_2 _switch_padding_2(MemorySegment segment, Arena scope) {
        return _switch_padding_2.ofAddress(_switch_padding_2$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_switch_padding_3)();
     * }
     */
    public interface _switch_padding_3 {

        void apply();
        static MemorySegment allocate(_switch_padding_3 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3114.const$1, fi, constants$7.const$5, scope);
        }
        static _switch_padding_3 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _switch_padding_3$VH() {
        return constants$3114.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_switch_padding_3)();
     * }
     */
    public static MemorySegment _switch_padding_3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3114.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_switch_padding_3)();
     * }
     */
    public static void _switch_padding_3$set(MemorySegment seg, MemorySegment x) {
        constants$3114.const$2.set(seg, x);
    }
    public static MemorySegment _switch_padding_3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3114.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _switch_padding_3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3114.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static _switch_padding_3 _switch_padding_3(MemorySegment segment, Arena scope) {
        return _switch_padding_3.ofAddress(_switch_padding_3$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_switch_padding_4)();
     * }
     */
    public interface _switch_padding_4 {

        void apply();
        static MemorySegment allocate(_switch_padding_4 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3114.const$3, fi, constants$7.const$5, scope);
        }
        static _switch_padding_4 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _switch_padding_4$VH() {
        return constants$3114.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_switch_padding_4)();
     * }
     */
    public static MemorySegment _switch_padding_4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3114.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_switch_padding_4)();
     * }
     */
    public static void _switch_padding_4$set(MemorySegment seg, MemorySegment x) {
        constants$3114.const$4.set(seg, x);
    }
    public static MemorySegment _switch_padding_4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3114.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _switch_padding_4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3114.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static _switch_padding_4 _switch_padding_4(MemorySegment segment, Arena scope) {
        return _switch_padding_4.ofAddress(_switch_padding_4$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_switch_padding_5)();
     * }
     */
    public interface _switch_padding_5 {

        void apply();
        static MemorySegment allocate(_switch_padding_5 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3114.const$5, fi, constants$7.const$5, scope);
        }
        static _switch_padding_5 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _switch_padding_5$VH() {
        return constants$3115.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_switch_padding_5)();
     * }
     */
    public static MemorySegment _switch_padding_5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3115.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_switch_padding_5)();
     * }
     */
    public static void _switch_padding_5$set(MemorySegment seg, MemorySegment x) {
        constants$3115.const$0.set(seg, x);
    }
    public static MemorySegment _switch_padding_5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3115.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _switch_padding_5$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3115.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static _switch_padding_5 _switch_padding_5(MemorySegment segment, Arena scope) {
        return _switch_padding_5.ofAddress(_switch_padding_5$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

