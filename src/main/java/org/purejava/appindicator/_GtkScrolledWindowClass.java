// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkScrolledWindowClass {
 *     struct _GtkBinClass parent_class;
 *     int scrollbar_spacing;
 *     int (*scroll_child)(struct _GtkScrolledWindow*,enum GtkScrollType,int);
 *     void (*move_focus_out)(struct _GtkScrolledWindow*,enum GtkDirectionType);
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 * };
 * }
 */
public class _GtkScrolledWindowClass {

    public static MemoryLayout $LAYOUT() {
        return constants$3061.const$2;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 1008);
    }
    public static VarHandle scrollbar_spacing$VH() {
        return constants$3061.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int scrollbar_spacing;
     * }
     */
    public static int scrollbar_spacing$get(MemorySegment seg) {
        return (int)constants$3061.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int scrollbar_spacing;
     * }
     */
    public static void scrollbar_spacing$set(MemorySegment seg, int x) {
        constants$3061.const$3.set(seg, x);
    }
    public static int scrollbar_spacing$get(MemorySegment seg, long index) {
        return (int)constants$3061.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void scrollbar_spacing$set(MemorySegment seg, long index, int x) {
        constants$3061.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * int (*scroll_child)(struct _GtkScrolledWindow*,enum GtkScrollType,int);
     * }
     */
    public interface scroll_child {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
        static MemorySegment allocate(scroll_child fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3061.const$4, fi, constants$49.const$0, scope);
        }
        static scroll_child ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2) -> {
                try {
                    return (int)constants$247.const$2.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle scroll_child$VH() {
        return constants$3061.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*scroll_child)(struct _GtkScrolledWindow*,enum GtkScrollType,int);
     * }
     */
    public static MemorySegment scroll_child$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3061.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*scroll_child)(struct _GtkScrolledWindow*,enum GtkScrollType,int);
     * }
     */
    public static void scroll_child$set(MemorySegment seg, MemorySegment x) {
        constants$3061.const$5.set(seg, x);
    }
    public static MemorySegment scroll_child$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3061.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void scroll_child$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3061.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static scroll_child scroll_child(MemorySegment segment, Arena scope) {
        return scroll_child.ofAddress(scroll_child$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*move_focus_out)(struct _GtkScrolledWindow*,enum GtkDirectionType);
     * }
     */
    public interface move_focus_out {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(move_focus_out fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3062.const$0, fi, constants$40.const$2, scope);
        }
        static move_focus_out ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle move_focus_out$VH() {
        return constants$3062.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*move_focus_out)(struct _GtkScrolledWindow*,enum GtkDirectionType);
     * }
     */
    public static MemorySegment move_focus_out$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3062.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*move_focus_out)(struct _GtkScrolledWindow*,enum GtkDirectionType);
     * }
     */
    public static void move_focus_out$set(MemorySegment seg, MemorySegment x) {
        constants$3062.const$1.set(seg, x);
    }
    public static MemorySegment move_focus_out$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3062.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void move_focus_out$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3062.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static move_focus_out move_focus_out(MemorySegment segment, Arena scope) {
        return move_focus_out.ofAddress(move_focus_out$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3062.const$2, fi, constants$7.const$5, scope);
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
        return constants$3062.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3062.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$3062.const$3.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3062.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3062.const$3.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$3062.const$4, fi, constants$7.const$5, scope);
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
        return constants$3062.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3062.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$3062.const$5.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3062.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3062.const$5.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$3063.const$0, fi, constants$7.const$5, scope);
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
        return constants$3063.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3063.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$3063.const$1.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3063.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3063.const$1.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$3063.const$2, fi, constants$7.const$5, scope);
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
        return constants$3063.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3063.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$3063.const$3.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3063.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3063.const$3.set(seg.asSlice(index*sizeof()), x);
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

