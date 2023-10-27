// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkFlowBoxClass {
 *     struct _GtkContainerClass parent_class;
 *     void (*child_activated)(struct _GtkFlowBox*,struct _GtkFlowBoxChild*);
 *     void (*selected_children_changed)(struct _GtkFlowBox*);
 *     void (*activate_cursor_child)(struct _GtkFlowBox*);
 *     void (*toggle_cursor_child)(struct _GtkFlowBox*);
 *     int (*move_cursor)(struct _GtkFlowBox*,enum GtkMovementStep,int);
 *     void (*select_all)(struct _GtkFlowBox*);
 *     void (*unselect_all)(struct _GtkFlowBox*);
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 *     void (*_gtk_reserved5)();
 *     void (*_gtk_reserved6)();
 * };
 * }
 */
public class _GtkFlowBoxClass {

    public static MemoryLayout $LAYOUT() {
        return constants$2708.const$3;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 976);
    }
    /**
     * {@snippet :
 * void (*child_activated)(struct _GtkFlowBox*,struct _GtkFlowBoxChild*);
     * }
     */
    public interface child_activated {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(child_activated fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2708.const$4, fi, constants$13.const$4, scope);
        }
        static child_activated ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle child_activated$VH() {
        return constants$2708.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*child_activated)(struct _GtkFlowBox*,struct _GtkFlowBoxChild*);
     * }
     */
    public static MemorySegment child_activated$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2708.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*child_activated)(struct _GtkFlowBox*,struct _GtkFlowBoxChild*);
     * }
     */
    public static void child_activated$set(MemorySegment seg, MemorySegment x) {
        constants$2708.const$5.set(seg, x);
    }
    public static MemorySegment child_activated$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2708.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void child_activated$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2708.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static child_activated child_activated(MemorySegment segment, Arena scope) {
        return child_activated.ofAddress(child_activated$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*selected_children_changed)(struct _GtkFlowBox*);
     * }
     */
    public interface selected_children_changed {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(selected_children_changed fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2709.const$0, fi, constants$13.const$1, scope);
        }
        static selected_children_changed ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle selected_children_changed$VH() {
        return constants$2709.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*selected_children_changed)(struct _GtkFlowBox*);
     * }
     */
    public static MemorySegment selected_children_changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2709.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*selected_children_changed)(struct _GtkFlowBox*);
     * }
     */
    public static void selected_children_changed$set(MemorySegment seg, MemorySegment x) {
        constants$2709.const$1.set(seg, x);
    }
    public static MemorySegment selected_children_changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2709.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void selected_children_changed$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2709.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static selected_children_changed selected_children_changed(MemorySegment segment, Arena scope) {
        return selected_children_changed.ofAddress(selected_children_changed$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*activate_cursor_child)(struct _GtkFlowBox*);
     * }
     */
    public interface activate_cursor_child {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(activate_cursor_child fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2709.const$2, fi, constants$13.const$1, scope);
        }
        static activate_cursor_child ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle activate_cursor_child$VH() {
        return constants$2709.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*activate_cursor_child)(struct _GtkFlowBox*);
     * }
     */
    public static MemorySegment activate_cursor_child$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2709.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*activate_cursor_child)(struct _GtkFlowBox*);
     * }
     */
    public static void activate_cursor_child$set(MemorySegment seg, MemorySegment x) {
        constants$2709.const$3.set(seg, x);
    }
    public static MemorySegment activate_cursor_child$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2709.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void activate_cursor_child$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2709.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate_cursor_child activate_cursor_child(MemorySegment segment, Arena scope) {
        return activate_cursor_child.ofAddress(activate_cursor_child$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*toggle_cursor_child)(struct _GtkFlowBox*);
     * }
     */
    public interface toggle_cursor_child {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(toggle_cursor_child fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2709.const$4, fi, constants$13.const$1, scope);
        }
        static toggle_cursor_child ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle toggle_cursor_child$VH() {
        return constants$2709.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*toggle_cursor_child)(struct _GtkFlowBox*);
     * }
     */
    public static MemorySegment toggle_cursor_child$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2709.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*toggle_cursor_child)(struct _GtkFlowBox*);
     * }
     */
    public static void toggle_cursor_child$set(MemorySegment seg, MemorySegment x) {
        constants$2709.const$5.set(seg, x);
    }
    public static MemorySegment toggle_cursor_child$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2709.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void toggle_cursor_child$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2709.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static toggle_cursor_child toggle_cursor_child(MemorySegment segment, Arena scope) {
        return toggle_cursor_child.ofAddress(toggle_cursor_child$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*move_cursor)(struct _GtkFlowBox*,enum GtkMovementStep,int);
     * }
     */
    public interface move_cursor {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
        static MemorySegment allocate(move_cursor fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2710.const$0, fi, constants$49.const$0, scope);
        }
        static move_cursor ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle move_cursor$VH() {
        return constants$2710.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*move_cursor)(struct _GtkFlowBox*,enum GtkMovementStep,int);
     * }
     */
    public static MemorySegment move_cursor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2710.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*move_cursor)(struct _GtkFlowBox*,enum GtkMovementStep,int);
     * }
     */
    public static void move_cursor$set(MemorySegment seg, MemorySegment x) {
        constants$2710.const$1.set(seg, x);
    }
    public static MemorySegment move_cursor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2710.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void move_cursor$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2710.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static move_cursor move_cursor(MemorySegment segment, Arena scope) {
        return move_cursor.ofAddress(move_cursor$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*select_all)(struct _GtkFlowBox*);
     * }
     */
    public interface select_all {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(select_all fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2710.const$2, fi, constants$13.const$1, scope);
        }
        static select_all ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle select_all$VH() {
        return constants$2710.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*select_all)(struct _GtkFlowBox*);
     * }
     */
    public static MemorySegment select_all$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2710.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*select_all)(struct _GtkFlowBox*);
     * }
     */
    public static void select_all$set(MemorySegment seg, MemorySegment x) {
        constants$2710.const$3.set(seg, x);
    }
    public static MemorySegment select_all$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2710.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void select_all$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2710.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static select_all select_all(MemorySegment segment, Arena scope) {
        return select_all.ofAddress(select_all$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*unselect_all)(struct _GtkFlowBox*);
     * }
     */
    public interface unselect_all {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(unselect_all fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2710.const$4, fi, constants$13.const$1, scope);
        }
        static unselect_all ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle unselect_all$VH() {
        return constants$2710.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*unselect_all)(struct _GtkFlowBox*);
     * }
     */
    public static MemorySegment unselect_all$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2710.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*unselect_all)(struct _GtkFlowBox*);
     * }
     */
    public static void unselect_all$set(MemorySegment seg, MemorySegment x) {
        constants$2710.const$5.set(seg, x);
    }
    public static MemorySegment unselect_all$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2710.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void unselect_all$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2710.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static unselect_all unselect_all(MemorySegment segment, Arena scope) {
        return unselect_all.ofAddress(unselect_all$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2711.const$0, fi, constants$7.const$5, scope);
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
        return constants$2711.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2711.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$2711.const$1.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2711.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2711.const$1.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2711.const$2, fi, constants$7.const$5, scope);
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
        return constants$2711.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2711.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$2711.const$3.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2711.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2711.const$3.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2711.const$4, fi, constants$7.const$5, scope);
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
        return constants$2711.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2711.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$2711.const$5.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2711.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2711.const$5.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2712.const$0, fi, constants$7.const$5, scope);
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
        return constants$2712.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2712.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$2712.const$1.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2712.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2712.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4(MemorySegment segment, Arena scope) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved5)();
     * }
     */
    public interface _gtk_reserved5 {

        void apply();
        static MemorySegment allocate(_gtk_reserved5 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2712.const$2, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved5 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved5$VH() {
        return constants$2712.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved5)();
     * }
     */
    public static MemorySegment _gtk_reserved5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2712.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved5)();
     * }
     */
    public static void _gtk_reserved5$set(MemorySegment seg, MemorySegment x) {
        constants$2712.const$3.set(seg, x);
    }
    public static MemorySegment _gtk_reserved5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2712.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved5$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2712.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved5 _gtk_reserved5(MemorySegment segment, Arena scope) {
        return _gtk_reserved5.ofAddress(_gtk_reserved5$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved6)();
     * }
     */
    public interface _gtk_reserved6 {

        void apply();
        static MemorySegment allocate(_gtk_reserved6 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2712.const$4, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved6 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved6$VH() {
        return constants$2712.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved6)();
     * }
     */
    public static MemorySegment _gtk_reserved6$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2712.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved6)();
     * }
     */
    public static void _gtk_reserved6$set(MemorySegment seg, MemorySegment x) {
        constants$2712.const$5.set(seg, x);
    }
    public static MemorySegment _gtk_reserved6$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2712.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved6$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2712.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved6 _gtk_reserved6(MemorySegment segment, Arena scope) {
        return _gtk_reserved6.ofAddress(_gtk_reserved6$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


