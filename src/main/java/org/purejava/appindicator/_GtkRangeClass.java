// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkRangeClass {
 *     struct _GtkWidgetClass parent_class;
 *     char* slider_detail;
 *     char* stepper_detail;
 *     void (*value_changed)(struct _GtkRange*);
 *     void (*adjust_bounds)(struct _GtkRange*,double);
 *     void (*move_slider)(struct _GtkRange*,enum GtkScrollType);
 *     void (*get_range_border)(struct _GtkRange*,struct _GtkBorder*);
 *     int (*change_value)(struct _GtkRange*,enum GtkScrollType,double);
 *     void (*get_range_size_request)(struct _GtkRange*,enum GtkOrientation,int*,int*);
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 * };
 * }
 */
public class _GtkRangeClass {

    public static MemoryLayout $LAYOUT() {
        return constants$3000.const$3;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 824);
    }
    public static VarHandle slider_detail$VH() {
        return constants$3000.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* slider_detail;
     * }
     */
    public static MemorySegment slider_detail$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3000.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* slider_detail;
     * }
     */
    public static void slider_detail$set(MemorySegment seg, MemorySegment x) {
        constants$3000.const$4.set(seg, x);
    }
    public static MemorySegment slider_detail$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3000.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void slider_detail$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3000.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle stepper_detail$VH() {
        return constants$3000.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* stepper_detail;
     * }
     */
    public static MemorySegment stepper_detail$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3000.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* stepper_detail;
     * }
     */
    public static void stepper_detail$set(MemorySegment seg, MemorySegment x) {
        constants$3000.const$5.set(seg, x);
    }
    public static MemorySegment stepper_detail$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3000.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void stepper_detail$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3000.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * void (*value_changed)(struct _GtkRange*);
     * }
     */
    public interface value_changed {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(value_changed fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3001.const$0, fi, constants$13.const$1, scope);
        }
        static value_changed ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle value_changed$VH() {
        return constants$3001.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*value_changed)(struct _GtkRange*);
     * }
     */
    public static MemorySegment value_changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3001.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*value_changed)(struct _GtkRange*);
     * }
     */
    public static void value_changed$set(MemorySegment seg, MemorySegment x) {
        constants$3001.const$1.set(seg, x);
    }
    public static MemorySegment value_changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3001.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void value_changed$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3001.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static value_changed value_changed(MemorySegment segment, Arena scope) {
        return value_changed.ofAddress(value_changed$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*adjust_bounds)(struct _GtkRange*,double);
     * }
     */
    public interface adjust_bounds {

        void apply(java.lang.foreign.MemorySegment _x0, double _x1);
        static MemorySegment allocate(adjust_bounds fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3001.const$2, fi, constants$689.const$5, scope);
        }
        static adjust_bounds ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, double __x1) -> {
                try {
                    constants$2091.const$5.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle adjust_bounds$VH() {
        return constants$3001.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*adjust_bounds)(struct _GtkRange*,double);
     * }
     */
    public static MemorySegment adjust_bounds$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3001.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*adjust_bounds)(struct _GtkRange*,double);
     * }
     */
    public static void adjust_bounds$set(MemorySegment seg, MemorySegment x) {
        constants$3001.const$3.set(seg, x);
    }
    public static MemorySegment adjust_bounds$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3001.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void adjust_bounds$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3001.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static adjust_bounds adjust_bounds(MemorySegment segment, Arena scope) {
        return adjust_bounds.ofAddress(adjust_bounds$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*move_slider)(struct _GtkRange*,enum GtkScrollType);
     * }
     */
    public interface move_slider {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(move_slider fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3001.const$4, fi, constants$40.const$2, scope);
        }
        static move_slider ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    constants$509.const$5.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle move_slider$VH() {
        return constants$3001.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*move_slider)(struct _GtkRange*,enum GtkScrollType);
     * }
     */
    public static MemorySegment move_slider$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3001.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*move_slider)(struct _GtkRange*,enum GtkScrollType);
     * }
     */
    public static void move_slider$set(MemorySegment seg, MemorySegment x) {
        constants$3001.const$5.set(seg, x);
    }
    public static MemorySegment move_slider$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3001.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void move_slider$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3001.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static move_slider move_slider(MemorySegment segment, Arena scope) {
        return move_slider.ofAddress(move_slider$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*get_range_border)(struct _GtkRange*,struct _GtkBorder*);
     * }
     */
    public interface get_range_border {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(get_range_border fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3002.const$0, fi, constants$13.const$4, scope);
        }
        static get_range_border ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$14.const$0.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_range_border$VH() {
        return constants$3002.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*get_range_border)(struct _GtkRange*,struct _GtkBorder*);
     * }
     */
    public static MemorySegment get_range_border$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3002.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*get_range_border)(struct _GtkRange*,struct _GtkBorder*);
     * }
     */
    public static void get_range_border$set(MemorySegment seg, MemorySegment x) {
        constants$3002.const$1.set(seg, x);
    }
    public static MemorySegment get_range_border$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3002.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void get_range_border$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3002.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_range_border get_range_border(MemorySegment segment, Arena scope) {
        return get_range_border.ofAddress(get_range_border$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*change_value)(struct _GtkRange*,enum GtkScrollType,double);
     * }
     */
    public interface change_value {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, double _x2);
        static MemorySegment allocate(change_value fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3002.const$3, fi, constants$3002.const$2, scope);
        }
        static change_value ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, double __x2) -> {
                try {
                    return (int)constants$3002.const$4.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle change_value$VH() {
        return constants$3002.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*change_value)(struct _GtkRange*,enum GtkScrollType,double);
     * }
     */
    public static MemorySegment change_value$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3002.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*change_value)(struct _GtkRange*,enum GtkScrollType,double);
     * }
     */
    public static void change_value$set(MemorySegment seg, MemorySegment x) {
        constants$3002.const$5.set(seg, x);
    }
    public static MemorySegment change_value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3002.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void change_value$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3002.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static change_value change_value(MemorySegment segment, Arena scope) {
        return change_value.ofAddress(change_value$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*get_range_size_request)(struct _GtkRange*,enum GtkOrientation,int*,int*);
     * }
     */
    public interface get_range_size_request {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(get_range_size_request fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3003.const$0, fi, constants$179.const$1, scope);
        }
        static get_range_size_request ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    constants$372.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_range_size_request$VH() {
        return constants$3003.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*get_range_size_request)(struct _GtkRange*,enum GtkOrientation,int*,int*);
     * }
     */
    public static MemorySegment get_range_size_request$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3003.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*get_range_size_request)(struct _GtkRange*,enum GtkOrientation,int*,int*);
     * }
     */
    public static void get_range_size_request$set(MemorySegment seg, MemorySegment x) {
        constants$3003.const$1.set(seg, x);
    }
    public static MemorySegment get_range_size_request$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3003.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void get_range_size_request$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3003.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_range_size_request get_range_size_request(MemorySegment segment, Arena scope) {
        return get_range_size_request.ofAddress(get_range_size_request$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3003.const$2, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved1 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved1$VH() {
        return constants$3003.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3003.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$3003.const$3.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3003.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3003.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1(MemorySegment segment, Arena scope) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved2)();
     * }
     */
    public interface _gtk_reserved2 {

        void apply();
        static MemorySegment allocate(_gtk_reserved2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3003.const$4, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved2 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved2$VH() {
        return constants$3003.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3003.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$3003.const$5.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3003.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3003.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2(MemorySegment segment, Arena scope) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved3)();
     * }
     */
    public interface _gtk_reserved3 {

        void apply();
        static MemorySegment allocate(_gtk_reserved3 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3004.const$0, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved3 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved3$VH() {
        return constants$3004.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3004.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$3004.const$1.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3004.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3004.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3(MemorySegment segment, Arena scope) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

