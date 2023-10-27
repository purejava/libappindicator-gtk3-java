// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkCellLayoutIface {
 *     struct _GTypeInterface g_iface;
 *     void (*pack_start)(struct _GtkCellLayout*,struct _GtkCellRenderer*,int);
 *     void (*pack_end)(struct _GtkCellLayout*,struct _GtkCellRenderer*,int);
 *     void (*clear)(struct _GtkCellLayout*);
 *     void (*add_attribute)(struct _GtkCellLayout*,struct _GtkCellRenderer*,char*,int);
 *     void (*set_cell_data_func)(struct _GtkCellLayout*,struct _GtkCellRenderer*,void (*)(struct _GtkCellLayout*,struct _GtkCellRenderer*,struct _GtkTreeModel*,struct _GtkTreeIter*,void*),void*,void (*)(void*));
 *     void (*clear_attributes)(struct _GtkCellLayout*,struct _GtkCellRenderer*);
 *     void (*reorder)(struct _GtkCellLayout*,struct _GtkCellRenderer*,int);
 *     struct _GList* (*get_cells)(struct _GtkCellLayout*);
 *     struct _GtkCellArea* (*get_area)(struct _GtkCellLayout*);
 * };
 * }
 */
public class _GtkCellLayoutIface {

    public static MemoryLayout $LAYOUT() {
        return constants$2579.const$1;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
 * void (*pack_start)(struct _GtkCellLayout*,struct _GtkCellRenderer*,int);
     * }
     */
    public interface pack_start {

        void apply(java.lang.foreign.MemorySegment screen, java.lang.foreign.MemorySegment colors, int n_colors);
        static MemorySegment allocate(pack_start fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2579.const$2, fi, constants$164.const$5, scope);
        }
        static pack_start ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _screen, java.lang.foreign.MemorySegment _colors, int _n_colors) -> {
                try {
                    constants$421.const$2.invokeExact(symbol, _screen, _colors, _n_colors);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle pack_start$VH() {
        return constants$2579.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*pack_start)(struct _GtkCellLayout*,struct _GtkCellRenderer*,int);
     * }
     */
    public static MemorySegment pack_start$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2579.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*pack_start)(struct _GtkCellLayout*,struct _GtkCellRenderer*,int);
     * }
     */
    public static void pack_start$set(MemorySegment seg, MemorySegment x) {
        constants$2579.const$3.set(seg, x);
    }
    public static MemorySegment pack_start$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2579.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pack_start$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2579.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static pack_start pack_start(MemorySegment segment, Arena scope) {
        return pack_start.ofAddress(pack_start$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*pack_end)(struct _GtkCellLayout*,struct _GtkCellRenderer*,int);
     * }
     */
    public interface pack_end {

        void apply(java.lang.foreign.MemorySegment screen, java.lang.foreign.MemorySegment colors, int n_colors);
        static MemorySegment allocate(pack_end fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2579.const$4, fi, constants$164.const$5, scope);
        }
        static pack_end ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _screen, java.lang.foreign.MemorySegment _colors, int _n_colors) -> {
                try {
                    constants$421.const$2.invokeExact(symbol, _screen, _colors, _n_colors);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle pack_end$VH() {
        return constants$2579.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*pack_end)(struct _GtkCellLayout*,struct _GtkCellRenderer*,int);
     * }
     */
    public static MemorySegment pack_end$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2579.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*pack_end)(struct _GtkCellLayout*,struct _GtkCellRenderer*,int);
     * }
     */
    public static void pack_end$set(MemorySegment seg, MemorySegment x) {
        constants$2579.const$5.set(seg, x);
    }
    public static MemorySegment pack_end$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2579.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pack_end$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2579.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static pack_end pack_end(MemorySegment segment, Arena scope) {
        return pack_end.ofAddress(pack_end$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*clear)(struct _GtkCellLayout*);
     * }
     */
    public interface clear {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(clear fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2580.const$0, fi, constants$13.const$1, scope);
        }
        static clear ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle clear$VH() {
        return constants$2580.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*clear)(struct _GtkCellLayout*);
     * }
     */
    public static MemorySegment clear$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2580.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*clear)(struct _GtkCellLayout*);
     * }
     */
    public static void clear$set(MemorySegment seg, MemorySegment x) {
        constants$2580.const$1.set(seg, x);
    }
    public static MemorySegment clear$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2580.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void clear$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2580.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static clear clear(MemorySegment segment, Arena scope) {
        return clear.ofAddress(clear$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*add_attribute)(struct _GtkCellLayout*,struct _GtkCellRenderer*,char*,int);
     * }
     */
    public interface add_attribute {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3);
        static MemorySegment allocate(add_attribute fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2580.const$2, fi, constants$332.const$4, scope);
        }
        static add_attribute ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3) -> {
                try {
                    constants$1089.const$0.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle add_attribute$VH() {
        return constants$2580.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*add_attribute)(struct _GtkCellLayout*,struct _GtkCellRenderer*,char*,int);
     * }
     */
    public static MemorySegment add_attribute$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2580.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*add_attribute)(struct _GtkCellLayout*,struct _GtkCellRenderer*,char*,int);
     * }
     */
    public static void add_attribute$set(MemorySegment seg, MemorySegment x) {
        constants$2580.const$3.set(seg, x);
    }
    public static MemorySegment add_attribute$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2580.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void add_attribute$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2580.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static add_attribute add_attribute(MemorySegment segment, Arena scope) {
        return add_attribute.ofAddress(add_attribute$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*set_cell_data_func)(struct _GtkCellLayout*,struct _GtkCellRenderer*,void (*)(struct _GtkCellLayout*,struct _GtkCellRenderer*,struct _GtkTreeModel*,struct _GtkTreeIter*,void*),void*,void (*)(void*));
     * }
     */
    public interface set_cell_data_func {

        void apply(java.lang.foreign.MemorySegment cell_layout, java.lang.foreign.MemorySegment cell, java.lang.foreign.MemorySegment tree_model, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(set_cell_data_func fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2580.const$4, fi, constants$332.const$1, scope);
        }
        static set_cell_data_func ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle set_cell_data_func$VH() {
        return constants$2580.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*set_cell_data_func)(struct _GtkCellLayout*,struct _GtkCellRenderer*,void (*)(struct _GtkCellLayout*,struct _GtkCellRenderer*,struct _GtkTreeModel*,struct _GtkTreeIter*,void*),void*,void (*)(void*));
     * }
     */
    public static MemorySegment set_cell_data_func$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2580.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*set_cell_data_func)(struct _GtkCellLayout*,struct _GtkCellRenderer*,void (*)(struct _GtkCellLayout*,struct _GtkCellRenderer*,struct _GtkTreeModel*,struct _GtkTreeIter*,void*),void*,void (*)(void*));
     * }
     */
    public static void set_cell_data_func$set(MemorySegment seg, MemorySegment x) {
        constants$2580.const$5.set(seg, x);
    }
    public static MemorySegment set_cell_data_func$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2580.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void set_cell_data_func$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2580.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_cell_data_func set_cell_data_func(MemorySegment segment, Arena scope) {
        return set_cell_data_func.ofAddress(set_cell_data_func$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*clear_attributes)(struct _GtkCellLayout*,struct _GtkCellRenderer*);
     * }
     */
    public interface clear_attributes {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(clear_attributes fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2581.const$0, fi, constants$13.const$4, scope);
        }
        static clear_attributes ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle clear_attributes$VH() {
        return constants$2581.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*clear_attributes)(struct _GtkCellLayout*,struct _GtkCellRenderer*);
     * }
     */
    public static MemorySegment clear_attributes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2581.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*clear_attributes)(struct _GtkCellLayout*,struct _GtkCellRenderer*);
     * }
     */
    public static void clear_attributes$set(MemorySegment seg, MemorySegment x) {
        constants$2581.const$1.set(seg, x);
    }
    public static MemorySegment clear_attributes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2581.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void clear_attributes$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2581.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static clear_attributes clear_attributes(MemorySegment segment, Arena scope) {
        return clear_attributes.ofAddress(clear_attributes$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*reorder)(struct _GtkCellLayout*,struct _GtkCellRenderer*,int);
     * }
     */
    public interface reorder {

        void apply(java.lang.foreign.MemorySegment screen, java.lang.foreign.MemorySegment colors, int n_colors);
        static MemorySegment allocate(reorder fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2581.const$2, fi, constants$164.const$5, scope);
        }
        static reorder ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _screen, java.lang.foreign.MemorySegment _colors, int _n_colors) -> {
                try {
                    constants$421.const$2.invokeExact(symbol, _screen, _colors, _n_colors);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle reorder$VH() {
        return constants$2581.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reorder)(struct _GtkCellLayout*,struct _GtkCellRenderer*,int);
     * }
     */
    public static MemorySegment reorder$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2581.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reorder)(struct _GtkCellLayout*,struct _GtkCellRenderer*,int);
     * }
     */
    public static void reorder$set(MemorySegment seg, MemorySegment x) {
        constants$2581.const$3.set(seg, x);
    }
    public static MemorySegment reorder$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2581.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void reorder$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2581.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static reorder reorder(MemorySegment segment, Arena scope) {
        return reorder.ofAddress(reorder$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GList* (*get_cells)(struct _GtkCellLayout*);
     * }
     */
    public interface get_cells {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_cells fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2581.const$4, fi, constants$5.const$2, scope);
        }
        static get_cells ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$99.const$0.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_cells$VH() {
        return constants$2581.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GList* (*get_cells)(struct _GtkCellLayout*);
     * }
     */
    public static MemorySegment get_cells$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2581.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GList* (*get_cells)(struct _GtkCellLayout*);
     * }
     */
    public static void get_cells$set(MemorySegment seg, MemorySegment x) {
        constants$2581.const$5.set(seg, x);
    }
    public static MemorySegment get_cells$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2581.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void get_cells$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2581.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_cells get_cells(MemorySegment segment, Arena scope) {
        return get_cells.ofAddress(get_cells$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GtkCellArea* (*get_area)(struct _GtkCellLayout*);
     * }
     */
    public interface get_area {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_area fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2582.const$0, fi, constants$5.const$2, scope);
        }
        static get_area ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$99.const$0.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_area$VH() {
        return constants$2582.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkCellArea* (*get_area)(struct _GtkCellLayout*);
     * }
     */
    public static MemorySegment get_area$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2582.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkCellArea* (*get_area)(struct _GtkCellLayout*);
     * }
     */
    public static void get_area$set(MemorySegment seg, MemorySegment x) {
        constants$2582.const$1.set(seg, x);
    }
    public static MemorySegment get_area$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2582.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void get_area$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2582.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_area get_area(MemorySegment segment, Arena scope) {
        return get_area.ofAddress(get_area$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


