// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkCellRendererClass {
 *     struct _GObjectClass parent_class;
 *     enum GtkSizeRequestMode (*get_request_mode)(struct _GtkCellRenderer*);
 *     void (*get_preferred_width)(struct _GtkCellRenderer*,struct _GtkWidget*,int*,int*);
 *     void (*get_preferred_height_for_width)(struct _GtkCellRenderer*,struct _GtkWidget*,int,int*,int*);
 *     void (*get_preferred_height)(struct _GtkCellRenderer*,struct _GtkWidget*,int*,int*);
 *     void (*get_preferred_width_for_height)(struct _GtkCellRenderer*,struct _GtkWidget*,int,int*,int*);
 *     void (*get_aligned_area)(struct _GtkCellRenderer*,struct _GtkWidget*,enum GtkCellRendererState,struct _cairo_rectangle_int*,struct _cairo_rectangle_int*);
 *     void (*get_size)(struct _GtkCellRenderer*,struct _GtkWidget*,struct _cairo_rectangle_int*,int*,int*,int*,int*);
 *     void (*render)(struct _GtkCellRenderer*,struct _cairo*,struct _GtkWidget*,struct _cairo_rectangle_int*,struct _cairo_rectangle_int*,enum GtkCellRendererState);
 *     int (*activate)(struct _GtkCellRenderer*,union _GdkEvent*,struct _GtkWidget*,char*,struct _cairo_rectangle_int*,struct _cairo_rectangle_int*,enum GtkCellRendererState);
 *     struct _GtkCellEditable* (*start_editing)(struct _GtkCellRenderer*,union _GdkEvent*,struct _GtkWidget*,char*,struct _cairo_rectangle_int*,struct _cairo_rectangle_int*,enum GtkCellRendererState);
 *     void (*editing_canceled)(struct _GtkCellRenderer*);
 *     void (*editing_started)(struct _GtkCellRenderer*,struct _GtkCellEditable*,char*);
 *     struct _GtkCellRendererClassPrivate* priv;
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 * };
 * }
 */
public class _GtkCellRendererClass {

    public static MemoryLayout $LAYOUT() {
        return constants$2313.const$1;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * enum GtkSizeRequestMode (*get_request_mode)(struct _GtkCellRenderer*);
     * }
     */
    public interface get_request_mode {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(get_request_mode fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2313.const$2, fi, constants$10.const$5, scope);
        }
        static get_request_mode ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)constants$14.const$2.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_request_mode$VH() {
        return constants$2313.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GtkSizeRequestMode (*get_request_mode)(struct _GtkCellRenderer*);
     * }
     */
    public static MemorySegment get_request_mode$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2313.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GtkSizeRequestMode (*get_request_mode)(struct _GtkCellRenderer*);
     * }
     */
    public static void get_request_mode$set(MemorySegment seg, MemorySegment x) {
        constants$2313.const$3.set(seg, x);
    }
    public static MemorySegment get_request_mode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2313.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void get_request_mode$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2313.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_request_mode get_request_mode(MemorySegment segment, Arena scope) {
        return get_request_mode.ofAddress(get_request_mode$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*get_preferred_width)(struct _GtkCellRenderer*,struct _GtkWidget*,int*,int*);
     * }
     */
    public interface get_preferred_width {

        void apply(java.lang.foreign.MemorySegment model, java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(get_preferred_width fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2313.const$4, fi, constants$42.const$1, scope);
        }
        static get_preferred_width ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _model, java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$259.const$4.invokeExact(symbol, _model, _path, _iter, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_preferred_width$VH() {
        return constants$2313.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*get_preferred_width)(struct _GtkCellRenderer*,struct _GtkWidget*,int*,int*);
     * }
     */
    public static MemorySegment get_preferred_width$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2313.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*get_preferred_width)(struct _GtkCellRenderer*,struct _GtkWidget*,int*,int*);
     * }
     */
    public static void get_preferred_width$set(MemorySegment seg, MemorySegment x) {
        constants$2313.const$5.set(seg, x);
    }
    public static MemorySegment get_preferred_width$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2313.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void get_preferred_width$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2313.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_preferred_width get_preferred_width(MemorySegment segment, Arena scope) {
        return get_preferred_width.ofAddress(get_preferred_width$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*get_preferred_height_for_width)(struct _GtkCellRenderer*,struct _GtkWidget*,int,int*,int*);
     * }
     */
    public interface get_preferred_height_for_width {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(get_preferred_height_for_width fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2314.const$0, fi, constants$380.const$3, scope);
        }
        static get_preferred_height_for_width ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    constants$1460.const$4.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_preferred_height_for_width$VH() {
        return constants$2314.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*get_preferred_height_for_width)(struct _GtkCellRenderer*,struct _GtkWidget*,int,int*,int*);
     * }
     */
    public static MemorySegment get_preferred_height_for_width$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2314.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*get_preferred_height_for_width)(struct _GtkCellRenderer*,struct _GtkWidget*,int,int*,int*);
     * }
     */
    public static void get_preferred_height_for_width$set(MemorySegment seg, MemorySegment x) {
        constants$2314.const$1.set(seg, x);
    }
    public static MemorySegment get_preferred_height_for_width$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2314.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void get_preferred_height_for_width$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2314.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_preferred_height_for_width get_preferred_height_for_width(MemorySegment segment, Arena scope) {
        return get_preferred_height_for_width.ofAddress(get_preferred_height_for_width$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*get_preferred_height)(struct _GtkCellRenderer*,struct _GtkWidget*,int*,int*);
     * }
     */
    public interface get_preferred_height {

        void apply(java.lang.foreign.MemorySegment model, java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(get_preferred_height fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2314.const$2, fi, constants$42.const$1, scope);
        }
        static get_preferred_height ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _model, java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$259.const$4.invokeExact(symbol, _model, _path, _iter, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_preferred_height$VH() {
        return constants$2314.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*get_preferred_height)(struct _GtkCellRenderer*,struct _GtkWidget*,int*,int*);
     * }
     */
    public static MemorySegment get_preferred_height$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2314.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*get_preferred_height)(struct _GtkCellRenderer*,struct _GtkWidget*,int*,int*);
     * }
     */
    public static void get_preferred_height$set(MemorySegment seg, MemorySegment x) {
        constants$2314.const$3.set(seg, x);
    }
    public static MemorySegment get_preferred_height$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2314.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void get_preferred_height$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2314.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_preferred_height get_preferred_height(MemorySegment segment, Arena scope) {
        return get_preferred_height.ofAddress(get_preferred_height$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*get_preferred_width_for_height)(struct _GtkCellRenderer*,struct _GtkWidget*,int,int*,int*);
     * }
     */
    public interface get_preferred_width_for_height {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(get_preferred_width_for_height fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2314.const$4, fi, constants$380.const$3, scope);
        }
        static get_preferred_width_for_height ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    constants$1460.const$4.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_preferred_width_for_height$VH() {
        return constants$2314.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*get_preferred_width_for_height)(struct _GtkCellRenderer*,struct _GtkWidget*,int,int*,int*);
     * }
     */
    public static MemorySegment get_preferred_width_for_height$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2314.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*get_preferred_width_for_height)(struct _GtkCellRenderer*,struct _GtkWidget*,int,int*,int*);
     * }
     */
    public static void get_preferred_width_for_height$set(MemorySegment seg, MemorySegment x) {
        constants$2314.const$5.set(seg, x);
    }
    public static MemorySegment get_preferred_width_for_height$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2314.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void get_preferred_width_for_height$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2314.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_preferred_width_for_height get_preferred_width_for_height(MemorySegment segment, Arena scope) {
        return get_preferred_width_for_height.ofAddress(get_preferred_width_for_height$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*get_aligned_area)(struct _GtkCellRenderer*,struct _GtkWidget*,enum GtkCellRendererState,struct _cairo_rectangle_int*,struct _cairo_rectangle_int*);
     * }
     */
    public interface get_aligned_area {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(get_aligned_area fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2315.const$0, fi, constants$380.const$3, scope);
        }
        static get_aligned_area ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    constants$1460.const$4.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_aligned_area$VH() {
        return constants$2315.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*get_aligned_area)(struct _GtkCellRenderer*,struct _GtkWidget*,enum GtkCellRendererState,struct _cairo_rectangle_int*,struct _cairo_rectangle_int*);
     * }
     */
    public static MemorySegment get_aligned_area$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2315.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*get_aligned_area)(struct _GtkCellRenderer*,struct _GtkWidget*,enum GtkCellRendererState,struct _cairo_rectangle_int*,struct _cairo_rectangle_int*);
     * }
     */
    public static void get_aligned_area$set(MemorySegment seg, MemorySegment x) {
        constants$2315.const$1.set(seg, x);
    }
    public static MemorySegment get_aligned_area$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2315.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void get_aligned_area$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2315.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_aligned_area get_aligned_area(MemorySegment segment, Arena scope) {
        return get_aligned_area.ofAddress(get_aligned_area$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*get_size)(struct _GtkCellRenderer*,struct _GtkWidget*,struct _cairo_rectangle_int*,int*,int*,int*,int*);
     * }
     */
    public interface get_size {

        void apply(java.lang.foreign.MemorySegment connection, java.lang.foreign.MemorySegment sender_name, java.lang.foreign.MemorySegment object_path, java.lang.foreign.MemorySegment interface_name, java.lang.foreign.MemorySegment signal_name, java.lang.foreign.MemorySegment parameters, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_size fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2315.const$2, fi, constants$871.const$1, scope);
        }
        static get_size ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _connection, java.lang.foreign.MemorySegment _sender_name, java.lang.foreign.MemorySegment _object_path, java.lang.foreign.MemorySegment _interface_name, java.lang.foreign.MemorySegment _signal_name, java.lang.foreign.MemorySegment _parameters, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    constants$871.const$3.invokeExact(symbol, _connection, _sender_name, _object_path, _interface_name, _signal_name, _parameters, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_size$VH() {
        return constants$2315.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*get_size)(struct _GtkCellRenderer*,struct _GtkWidget*,struct _cairo_rectangle_int*,int*,int*,int*,int*);
     * }
     */
    public static MemorySegment get_size$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2315.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*get_size)(struct _GtkCellRenderer*,struct _GtkWidget*,struct _cairo_rectangle_int*,int*,int*,int*,int*);
     * }
     */
    public static void get_size$set(MemorySegment seg, MemorySegment x) {
        constants$2315.const$3.set(seg, x);
    }
    public static MemorySegment get_size$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2315.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void get_size$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2315.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_size get_size(MemorySegment segment, Arena scope) {
        return get_size.ofAddress(get_size$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*render)(struct _GtkCellRenderer*,struct _cairo*,struct _GtkWidget*,struct _cairo_rectangle_int*,struct _cairo_rectangle_int*,enum GtkCellRendererState);
     * }
     */
    public interface render {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, int _x5);
        static MemorySegment allocate(render fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2315.const$4, fi, constants$676.const$0, scope);
        }
        static render ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, int __x5) -> {
                try {
                    constants$2001.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle render$VH() {
        return constants$2315.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*render)(struct _GtkCellRenderer*,struct _cairo*,struct _GtkWidget*,struct _cairo_rectangle_int*,struct _cairo_rectangle_int*,enum GtkCellRendererState);
     * }
     */
    public static MemorySegment render$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2315.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*render)(struct _GtkCellRenderer*,struct _cairo*,struct _GtkWidget*,struct _cairo_rectangle_int*,struct _cairo_rectangle_int*,enum GtkCellRendererState);
     * }
     */
    public static void render$set(MemorySegment seg, MemorySegment x) {
        constants$2315.const$5.set(seg, x);
    }
    public static MemorySegment render$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2315.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void render$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2315.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static render render(MemorySegment segment, Arena scope) {
        return render.ofAddress(render$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*activate)(struct _GtkCellRenderer*,union _GdkEvent*,struct _GtkWidget*,char*,struct _cairo_rectangle_int*,struct _cairo_rectangle_int*,enum GtkCellRendererState);
     * }
     */
    public interface activate {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5, int _x6);
        static MemorySegment allocate(activate fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2316.const$1, fi, constants$2316.const$0, scope);
        }
        static activate ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5, int __x6) -> {
                try {
                    return (int)constants$2316.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle activate$VH() {
        return constants$2316.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*activate)(struct _GtkCellRenderer*,union _GdkEvent*,struct _GtkWidget*,char*,struct _cairo_rectangle_int*,struct _cairo_rectangle_int*,enum GtkCellRendererState);
     * }
     */
    public static MemorySegment activate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2316.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*activate)(struct _GtkCellRenderer*,union _GdkEvent*,struct _GtkWidget*,char*,struct _cairo_rectangle_int*,struct _cairo_rectangle_int*,enum GtkCellRendererState);
     * }
     */
    public static void activate$set(MemorySegment seg, MemorySegment x) {
        constants$2316.const$3.set(seg, x);
    }
    public static MemorySegment activate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2316.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void activate$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2316.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate activate(MemorySegment segment, Arena scope) {
        return activate.ofAddress(activate$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GtkCellEditable* (*start_editing)(struct _GtkCellRenderer*,union _GdkEvent*,struct _GtkWidget*,char*,struct _cairo_rectangle_int*,struct _cairo_rectangle_int*,enum GtkCellRendererState);
     * }
     */
    public interface start_editing {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5, int _x6);
        static MemorySegment allocate(start_editing fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2316.const$5, fi, constants$2316.const$4, scope);
        }
        static start_editing ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5, int __x6) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$2317.const$0.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle start_editing$VH() {
        return constants$2317.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkCellEditable* (*start_editing)(struct _GtkCellRenderer*,union _GdkEvent*,struct _GtkWidget*,char*,struct _cairo_rectangle_int*,struct _cairo_rectangle_int*,enum GtkCellRendererState);
     * }
     */
    public static MemorySegment start_editing$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2317.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkCellEditable* (*start_editing)(struct _GtkCellRenderer*,union _GdkEvent*,struct _GtkWidget*,char*,struct _cairo_rectangle_int*,struct _cairo_rectangle_int*,enum GtkCellRendererState);
     * }
     */
    public static void start_editing$set(MemorySegment seg, MemorySegment x) {
        constants$2317.const$1.set(seg, x);
    }
    public static MemorySegment start_editing$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2317.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void start_editing$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2317.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static start_editing start_editing(MemorySegment segment, Arena scope) {
        return start_editing.ofAddress(start_editing$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*editing_canceled)(struct _GtkCellRenderer*);
     * }
     */
    public interface editing_canceled {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(editing_canceled fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2317.const$2, fi, constants$13.const$1, scope);
        }
        static editing_canceled ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle editing_canceled$VH() {
        return constants$2317.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*editing_canceled)(struct _GtkCellRenderer*);
     * }
     */
    public static MemorySegment editing_canceled$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2317.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*editing_canceled)(struct _GtkCellRenderer*);
     * }
     */
    public static void editing_canceled$set(MemorySegment seg, MemorySegment x) {
        constants$2317.const$3.set(seg, x);
    }
    public static MemorySegment editing_canceled$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2317.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void editing_canceled$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2317.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static editing_canceled editing_canceled(MemorySegment segment, Arena scope) {
        return editing_canceled.ofAddress(editing_canceled$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*editing_started)(struct _GtkCellRenderer*,struct _GtkCellEditable*,char*);
     * }
     */
    public interface editing_started {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(editing_started fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2317.const$4, fi, constants$14.const$3, scope);
        }
        static editing_started ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    constants$14.const$5.invokeExact(symbol, _key, _value, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle editing_started$VH() {
        return constants$2317.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*editing_started)(struct _GtkCellRenderer*,struct _GtkCellEditable*,char*);
     * }
     */
    public static MemorySegment editing_started$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2317.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*editing_started)(struct _GtkCellRenderer*,struct _GtkCellEditable*,char*);
     * }
     */
    public static void editing_started$set(MemorySegment seg, MemorySegment x) {
        constants$2317.const$5.set(seg, x);
    }
    public static MemorySegment editing_started$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2317.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void editing_started$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2317.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static editing_started editing_started(MemorySegment segment, Arena scope) {
        return editing_started.ofAddress(editing_started$get(segment), scope);
    }
    public static VarHandle priv$VH() {
        return constants$2318.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkCellRendererClassPrivate* priv;
     * }
     */
    public static MemorySegment priv$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2318.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkCellRendererClassPrivate* priv;
     * }
     */
    public static void priv$set(MemorySegment seg, MemorySegment x) {
        constants$2318.const$0.set(seg, x);
    }
    public static MemorySegment priv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2318.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2318.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved2)();
     * }
     */
    public interface _gtk_reserved2 {

        void apply();
        static MemorySegment allocate(_gtk_reserved2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2318.const$1, fi, constants$7.const$5, scope);
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
        return constants$2318.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2318.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$2318.const$2.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2318.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2318.const$2.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2318.const$3, fi, constants$7.const$5, scope);
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
        return constants$2318.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2318.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$2318.const$4.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2318.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2318.const$4.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2318.const$5, fi, constants$7.const$5, scope);
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
        return constants$2319.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2319.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$2319.const$0.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2319.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2319.const$0.set(seg.asSlice(index*sizeof()), x);
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


