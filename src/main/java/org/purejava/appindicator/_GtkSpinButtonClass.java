// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkSpinButtonClass {
 *     struct _GtkEntryClass parent_class;
 *     int (*input)(struct _GtkSpinButton*,double*);
 *     int (*output)(struct _GtkSpinButton*);
 *     void (*value_changed)(struct _GtkSpinButton*);
 *     void (*change_value)(struct _GtkSpinButton*,enum GtkScrollType);
 *     void (*wrapped)(struct _GtkSpinButton*);
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 * };
 * }
 */
public class _GtkSpinButtonClass {

    public static MemoryLayout $LAYOUT() {
        return constants$3095.const$4;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 976);
    }
    /**
     * {@snippet :
 * int (*input)(struct _GtkSpinButton*,double*);
     * }
     */
    public interface input {

        int apply(java.lang.foreign.MemorySegment filter_info, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(input fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3095.const$5, fi, constants$9.const$0, scope);
        }
        static input ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _filter_info, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$12.const$1.invokeExact(symbol, _filter_info, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle input$VH() {
        return constants$3096.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*input)(struct _GtkSpinButton*,double*);
     * }
     */
    public static MemorySegment input$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3096.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*input)(struct _GtkSpinButton*,double*);
     * }
     */
    public static void input$set(MemorySegment seg, MemorySegment x) {
        constants$3096.const$0.set(seg, x);
    }
    public static MemorySegment input$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3096.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void input$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3096.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static input input(MemorySegment segment, Arena scope) {
        return input.ofAddress(input$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*output)(struct _GtkSpinButton*);
     * }
     */
    public interface output {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(output fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3096.const$1, fi, constants$10.const$5, scope);
        }
        static output ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle output$VH() {
        return constants$3096.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*output)(struct _GtkSpinButton*);
     * }
     */
    public static MemorySegment output$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3096.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*output)(struct _GtkSpinButton*);
     * }
     */
    public static void output$set(MemorySegment seg, MemorySegment x) {
        constants$3096.const$2.set(seg, x);
    }
    public static MemorySegment output$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3096.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void output$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3096.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static output output(MemorySegment segment, Arena scope) {
        return output.ofAddress(output$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*value_changed)(struct _GtkSpinButton*);
     * }
     */
    public interface value_changed {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(value_changed fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3096.const$3, fi, constants$13.const$1, scope);
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
        return constants$3096.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*value_changed)(struct _GtkSpinButton*);
     * }
     */
    public static MemorySegment value_changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3096.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*value_changed)(struct _GtkSpinButton*);
     * }
     */
    public static void value_changed$set(MemorySegment seg, MemorySegment x) {
        constants$3096.const$4.set(seg, x);
    }
    public static MemorySegment value_changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3096.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void value_changed$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3096.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static value_changed value_changed(MemorySegment segment, Arena scope) {
        return value_changed.ofAddress(value_changed$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*change_value)(struct _GtkSpinButton*,enum GtkScrollType);
     * }
     */
    public interface change_value {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(change_value fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3096.const$5, fi, constants$40.const$2, scope);
        }
        static change_value ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle change_value$VH() {
        return constants$3097.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*change_value)(struct _GtkSpinButton*,enum GtkScrollType);
     * }
     */
    public static MemorySegment change_value$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3097.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*change_value)(struct _GtkSpinButton*,enum GtkScrollType);
     * }
     */
    public static void change_value$set(MemorySegment seg, MemorySegment x) {
        constants$3097.const$0.set(seg, x);
    }
    public static MemorySegment change_value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3097.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void change_value$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3097.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static change_value change_value(MemorySegment segment, Arena scope) {
        return change_value.ofAddress(change_value$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*wrapped)(struct _GtkSpinButton*);
     * }
     */
    public interface wrapped {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(wrapped fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3097.const$1, fi, constants$13.const$1, scope);
        }
        static wrapped ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle wrapped$VH() {
        return constants$3097.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*wrapped)(struct _GtkSpinButton*);
     * }
     */
    public static MemorySegment wrapped$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3097.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*wrapped)(struct _GtkSpinButton*);
     * }
     */
    public static void wrapped$set(MemorySegment seg, MemorySegment x) {
        constants$3097.const$2.set(seg, x);
    }
    public static MemorySegment wrapped$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3097.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void wrapped$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3097.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static wrapped wrapped(MemorySegment segment, Arena scope) {
        return wrapped.ofAddress(wrapped$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3097.const$3, fi, constants$7.const$5, scope);
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
        return constants$3097.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3097.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$3097.const$4.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3097.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3097.const$4.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$3097.const$5, fi, constants$7.const$5, scope);
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
        return constants$3098.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3098.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$3098.const$0.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3098.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3098.const$0.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$3098.const$1, fi, constants$7.const$5, scope);
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
        return constants$3098.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3098.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$3098.const$2.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3098.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3098.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3(MemorySegment segment, Arena scope) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved4)();
     * }
     */
    public interface _gtk_reserved4 {

        void apply();
        static MemorySegment allocate(_gtk_reserved4 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3098.const$3, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved4 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved4$VH() {
        return constants$3098.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3098.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$3098.const$4.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3098.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3098.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4(MemorySegment segment, Arena scope) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

