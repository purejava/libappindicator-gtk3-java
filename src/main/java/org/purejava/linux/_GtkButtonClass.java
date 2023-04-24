// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkButtonClass {
 *     GtkBinClass parent_class;
 *     void (*pressed)(GtkButton*);
 *     void (*released)(GtkButton*);
 *     void (*clicked)(GtkButton*);
 *     void (*enter)(GtkButton*);
 *     void (*leave)(GtkButton*);
 *     void (*activate)(GtkButton*);
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 * };
 * }
 */
public class _GtkButtonClass {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        MemoryLayout.structLayout(
                            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type")
                        ).withName("g_type_class"),
                        Constants$root.C_POINTER$LAYOUT.withName("construct_properties"),
                        Constants$root.C_POINTER$LAYOUT.withName("constructor"),
                        Constants$root.C_POINTER$LAYOUT.withName("set_property"),
                        Constants$root.C_POINTER$LAYOUT.withName("get_property"),
                        Constants$root.C_POINTER$LAYOUT.withName("dispose"),
                        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
                        Constants$root.C_POINTER$LAYOUT.withName("dispatch_properties_changed"),
                        Constants$root.C_POINTER$LAYOUT.withName("notify"),
                        Constants$root.C_POINTER$LAYOUT.withName("constructed"),
                        Constants$root.C_LONG_LONG$LAYOUT.withName("flags"),
                        Constants$root.C_LONG_LONG$LAYOUT.withName("n_construct_properties"),
                        Constants$root.C_POINTER$LAYOUT.withName("pspecs"),
                        Constants$root.C_LONG_LONG$LAYOUT.withName("n_pspecs"),
                        MemoryLayout.sequenceLayout(3, Constants$root.C_POINTER$LAYOUT).withName("pdummy")
                    ).withName("parent_class"),
                    Constants$root.C_INT$LAYOUT.withName("activate_signal"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("dispatch_child_properties_changed"),
                    Constants$root.C_POINTER$LAYOUT.withName("destroy"),
                    Constants$root.C_POINTER$LAYOUT.withName("show"),
                    Constants$root.C_POINTER$LAYOUT.withName("show_all"),
                    Constants$root.C_POINTER$LAYOUT.withName("hide"),
                    Constants$root.C_POINTER$LAYOUT.withName("map"),
                    Constants$root.C_POINTER$LAYOUT.withName("unmap"),
                    Constants$root.C_POINTER$LAYOUT.withName("realize"),
                    Constants$root.C_POINTER$LAYOUT.withName("unrealize"),
                    Constants$root.C_POINTER$LAYOUT.withName("size_allocate"),
                    Constants$root.C_POINTER$LAYOUT.withName("state_changed"),
                    Constants$root.C_POINTER$LAYOUT.withName("state_flags_changed"),
                    Constants$root.C_POINTER$LAYOUT.withName("parent_set"),
                    Constants$root.C_POINTER$LAYOUT.withName("hierarchy_changed"),
                    Constants$root.C_POINTER$LAYOUT.withName("style_set"),
                    Constants$root.C_POINTER$LAYOUT.withName("direction_changed"),
                    Constants$root.C_POINTER$LAYOUT.withName("grab_notify"),
                    Constants$root.C_POINTER$LAYOUT.withName("child_notify"),
                    Constants$root.C_POINTER$LAYOUT.withName("draw"),
                    Constants$root.C_POINTER$LAYOUT.withName("get_request_mode"),
                    Constants$root.C_POINTER$LAYOUT.withName("get_preferred_height"),
                    Constants$root.C_POINTER$LAYOUT.withName("get_preferred_width_for_height"),
                    Constants$root.C_POINTER$LAYOUT.withName("get_preferred_width"),
                    Constants$root.C_POINTER$LAYOUT.withName("get_preferred_height_for_width"),
                    Constants$root.C_POINTER$LAYOUT.withName("mnemonic_activate"),
                    Constants$root.C_POINTER$LAYOUT.withName("grab_focus"),
                    Constants$root.C_POINTER$LAYOUT.withName("focus"),
                    Constants$root.C_POINTER$LAYOUT.withName("move_focus"),
                    Constants$root.C_POINTER$LAYOUT.withName("keynav_failed"),
                    Constants$root.C_POINTER$LAYOUT.withName("event"),
                    Constants$root.C_POINTER$LAYOUT.withName("button_press_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("button_release_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("scroll_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("motion_notify_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("delete_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("destroy_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("key_press_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("key_release_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("enter_notify_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("leave_notify_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("configure_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("focus_in_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("focus_out_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("map_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("unmap_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("property_notify_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("selection_clear_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("selection_request_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("selection_notify_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("proximity_in_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("proximity_out_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("visibility_notify_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("window_state_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("damage_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("grab_broken_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("selection_get"),
                    Constants$root.C_POINTER$LAYOUT.withName("selection_received"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_begin"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_end"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_data_get"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_data_delete"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_leave"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_motion"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_drop"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_data_received"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_failed"),
                    Constants$root.C_POINTER$LAYOUT.withName("popup_menu"),
                    Constants$root.C_POINTER$LAYOUT.withName("show_help"),
                    Constants$root.C_POINTER$LAYOUT.withName("get_accessible"),
                    Constants$root.C_POINTER$LAYOUT.withName("screen_changed"),
                    Constants$root.C_POINTER$LAYOUT.withName("can_activate_accel"),
                    Constants$root.C_POINTER$LAYOUT.withName("composited_changed"),
                    Constants$root.C_POINTER$LAYOUT.withName("query_tooltip"),
                    Constants$root.C_POINTER$LAYOUT.withName("compute_expand"),
                    Constants$root.C_POINTER$LAYOUT.withName("adjust_size_request"),
                    Constants$root.C_POINTER$LAYOUT.withName("adjust_size_allocation"),
                    Constants$root.C_POINTER$LAYOUT.withName("style_updated"),
                    Constants$root.C_POINTER$LAYOUT.withName("touch_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("get_preferred_height_and_baseline_for_width"),
                    Constants$root.C_POINTER$LAYOUT.withName("adjust_baseline_request"),
                    Constants$root.C_POINTER$LAYOUT.withName("adjust_baseline_allocation"),
                    Constants$root.C_POINTER$LAYOUT.withName("queue_draw_region"),
                    Constants$root.C_POINTER$LAYOUT.withName("priv"),
                    Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved6"),
                    Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved7")
                ).withName("parent_class"),
                Constants$root.C_POINTER$LAYOUT.withName("add"),
                Constants$root.C_POINTER$LAYOUT.withName("remove"),
                Constants$root.C_POINTER$LAYOUT.withName("check_resize"),
                Constants$root.C_POINTER$LAYOUT.withName("forall"),
                Constants$root.C_POINTER$LAYOUT.withName("set_focus_child"),
                Constants$root.C_POINTER$LAYOUT.withName("child_type"),
                Constants$root.C_POINTER$LAYOUT.withName("composite_name"),
                Constants$root.C_POINTER$LAYOUT.withName("set_child_property"),
                Constants$root.C_POINTER$LAYOUT.withName("get_child_property"),
                Constants$root.C_POINTER$LAYOUT.withName("get_path_for_child"),
                MemoryLayout.paddingLayout(64),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved5"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved6"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved7"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved8")
            ).withName("parent_class"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("pressed"),
        Constants$root.C_POINTER$LAYOUT.withName("released"),
        Constants$root.C_POINTER$LAYOUT.withName("clicked"),
        Constants$root.C_POINTER$LAYOUT.withName("enter"),
        Constants$root.C_POINTER$LAYOUT.withName("leave"),
        Constants$root.C_POINTER$LAYOUT.withName("activate"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
    ).withName("_GtkButtonClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkButtonClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 1008);
    }
    static final FunctionDescriptor pressed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor pressed_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pressed_UP$MH = RuntimeHelper.upcallHandle(pressed.class, "apply", _GtkButtonClass.pressed_UP$FUNC);
    static final FunctionDescriptor pressed_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pressed_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkButtonClass.pressed_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*pressed)(GtkButton*);
     * }
     */
    public interface pressed {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(pressed fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkButtonClass.pressed_UP$MH, fi, _GtkButtonClass.pressed$FUNC, scope);
        }
        static pressed ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    _GtkButtonClass.pressed_DOWN$MH.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle pressed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pressed"));
    public static VarHandle pressed$VH() {
        return _GtkButtonClass.pressed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*pressed)(GtkButton*);
     * }
     */
    public static MemorySegment pressed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass.pressed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*pressed)(GtkButton*);
     * }
     */
    public static void pressed$set(MemorySegment seg, MemorySegment x) {
        _GtkButtonClass.pressed$VH.set(seg, x);
    }
    public static MemorySegment pressed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass.pressed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pressed$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkButtonClass.pressed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static pressed pressed(MemorySegment segment, SegmentScope scope) {
        return pressed.ofAddress(pressed$get(segment), scope);
    }
    static final FunctionDescriptor released$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor released_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle released_UP$MH = RuntimeHelper.upcallHandle(released.class, "apply", _GtkButtonClass.released_UP$FUNC);
    static final FunctionDescriptor released_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle released_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkButtonClass.released_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*released)(GtkButton*);
     * }
     */
    public interface released {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(released fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkButtonClass.released_UP$MH, fi, _GtkButtonClass.released$FUNC, scope);
        }
        static released ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    _GtkButtonClass.released_DOWN$MH.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle released$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("released"));
    public static VarHandle released$VH() {
        return _GtkButtonClass.released$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*released)(GtkButton*);
     * }
     */
    public static MemorySegment released$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass.released$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*released)(GtkButton*);
     * }
     */
    public static void released$set(MemorySegment seg, MemorySegment x) {
        _GtkButtonClass.released$VH.set(seg, x);
    }
    public static MemorySegment released$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass.released$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void released$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkButtonClass.released$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static released released(MemorySegment segment, SegmentScope scope) {
        return released.ofAddress(released$get(segment), scope);
    }
    static final FunctionDescriptor clicked$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor clicked_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clicked_UP$MH = RuntimeHelper.upcallHandle(clicked.class, "apply", _GtkButtonClass.clicked_UP$FUNC);
    static final FunctionDescriptor clicked_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clicked_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkButtonClass.clicked_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*clicked)(GtkButton*);
     * }
     */
    public interface clicked {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(clicked fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkButtonClass.clicked_UP$MH, fi, _GtkButtonClass.clicked$FUNC, scope);
        }
        static clicked ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    _GtkButtonClass.clicked_DOWN$MH.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle clicked$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("clicked"));
    public static VarHandle clicked$VH() {
        return _GtkButtonClass.clicked$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*clicked)(GtkButton*);
     * }
     */
    public static MemorySegment clicked$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass.clicked$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*clicked)(GtkButton*);
     * }
     */
    public static void clicked$set(MemorySegment seg, MemorySegment x) {
        _GtkButtonClass.clicked$VH.set(seg, x);
    }
    public static MemorySegment clicked$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass.clicked$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void clicked$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkButtonClass.clicked$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static clicked clicked(MemorySegment segment, SegmentScope scope) {
        return clicked.ofAddress(clicked$get(segment), scope);
    }
    static final FunctionDescriptor enter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor enter_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle enter_UP$MH = RuntimeHelper.upcallHandle(enter.class, "apply", _GtkButtonClass.enter_UP$FUNC);
    static final FunctionDescriptor enter_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle enter_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkButtonClass.enter_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*enter)(GtkButton*);
     * }
     */
    public interface enter {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(enter fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkButtonClass.enter_UP$MH, fi, _GtkButtonClass.enter$FUNC, scope);
        }
        static enter ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    _GtkButtonClass.enter_DOWN$MH.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle enter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("enter"));
    public static VarHandle enter$VH() {
        return _GtkButtonClass.enter$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*enter)(GtkButton*);
     * }
     */
    public static MemorySegment enter$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass.enter$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*enter)(GtkButton*);
     * }
     */
    public static void enter$set(MemorySegment seg, MemorySegment x) {
        _GtkButtonClass.enter$VH.set(seg, x);
    }
    public static MemorySegment enter$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass.enter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void enter$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkButtonClass.enter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static enter enter(MemorySegment segment, SegmentScope scope) {
        return enter.ofAddress(enter$get(segment), scope);
    }
    static final FunctionDescriptor leave$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor leave_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle leave_UP$MH = RuntimeHelper.upcallHandle(leave.class, "apply", _GtkButtonClass.leave_UP$FUNC);
    static final FunctionDescriptor leave_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle leave_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkButtonClass.leave_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*leave)(GtkButton*);
     * }
     */
    public interface leave {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(leave fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkButtonClass.leave_UP$MH, fi, _GtkButtonClass.leave$FUNC, scope);
        }
        static leave ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    _GtkButtonClass.leave_DOWN$MH.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle leave$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("leave"));
    public static VarHandle leave$VH() {
        return _GtkButtonClass.leave$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*leave)(GtkButton*);
     * }
     */
    public static MemorySegment leave$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass.leave$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*leave)(GtkButton*);
     * }
     */
    public static void leave$set(MemorySegment seg, MemorySegment x) {
        _GtkButtonClass.leave$VH.set(seg, x);
    }
    public static MemorySegment leave$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass.leave$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void leave$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkButtonClass.leave$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static leave leave(MemorySegment segment, SegmentScope scope) {
        return leave.ofAddress(leave$get(segment), scope);
    }
    static final FunctionDescriptor activate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor activate_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle activate_UP$MH = RuntimeHelper.upcallHandle(activate.class, "apply", _GtkButtonClass.activate_UP$FUNC);
    static final FunctionDescriptor activate_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle activate_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkButtonClass.activate_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*activate)(GtkButton*);
     * }
     */
    public interface activate {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(activate fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkButtonClass.activate_UP$MH, fi, _GtkButtonClass.activate$FUNC, scope);
        }
        static activate ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    _GtkButtonClass.activate_DOWN$MH.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle activate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("activate"));
    public static VarHandle activate$VH() {
        return _GtkButtonClass.activate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*activate)(GtkButton*);
     * }
     */
    public static MemorySegment activate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass.activate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*activate)(GtkButton*);
     * }
     */
    public static void activate$set(MemorySegment seg, MemorySegment x) {
        _GtkButtonClass.activate$VH.set(seg, x);
    }
    public static MemorySegment activate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass.activate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void activate$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkButtonClass.activate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate activate(MemorySegment segment, SegmentScope scope) {
        return activate.ofAddress(activate$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved1_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved1.class, "apply", _GtkButtonClass._gtk_reserved1_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved1_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkButtonClass._gtk_reserved1_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkButtonClass._gtk_reserved1_UP$MH, fi, _GtkButtonClass._gtk_reserved1$FUNC, scope);
        }
        static _gtk_reserved1 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkButtonClass._gtk_reserved1_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
    public static VarHandle _gtk_reserved1$VH() {
        return _GtkButtonClass._gtk_reserved1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass._gtk_reserved1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        _GtkButtonClass._gtk_reserved1$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass._gtk_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkButtonClass._gtk_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved2_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved2.class, "apply", _GtkButtonClass._gtk_reserved2_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved2_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkButtonClass._gtk_reserved2_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved2)();
     * }
     */
    public interface _gtk_reserved2 {

        void apply();
        static MemorySegment allocate(_gtk_reserved2 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkButtonClass._gtk_reserved2_UP$MH, fi, _GtkButtonClass._gtk_reserved2$FUNC, scope);
        }
        static _gtk_reserved2 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkButtonClass._gtk_reserved2_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"));
    public static VarHandle _gtk_reserved2$VH() {
        return _GtkButtonClass._gtk_reserved2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass._gtk_reserved2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        _GtkButtonClass._gtk_reserved2$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass._gtk_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkButtonClass._gtk_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved3_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved3.class, "apply", _GtkButtonClass._gtk_reserved3_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved3_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkButtonClass._gtk_reserved3_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved3)();
     * }
     */
    public interface _gtk_reserved3 {

        void apply();
        static MemorySegment allocate(_gtk_reserved3 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkButtonClass._gtk_reserved3_UP$MH, fi, _GtkButtonClass._gtk_reserved3$FUNC, scope);
        }
        static _gtk_reserved3 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkButtonClass._gtk_reserved3_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    public static VarHandle _gtk_reserved3$VH() {
        return _GtkButtonClass._gtk_reserved3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass._gtk_reserved3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        _GtkButtonClass._gtk_reserved3$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass._gtk_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkButtonClass._gtk_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved4_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved4.class, "apply", _GtkButtonClass._gtk_reserved4_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved4_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkButtonClass._gtk_reserved4_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved4)();
     * }
     */
    public interface _gtk_reserved4 {

        void apply();
        static MemorySegment allocate(_gtk_reserved4 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkButtonClass._gtk_reserved4_UP$MH, fi, _GtkButtonClass._gtk_reserved4$FUNC, scope);
        }
        static _gtk_reserved4 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkButtonClass._gtk_reserved4_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    public static VarHandle _gtk_reserved4$VH() {
        return _GtkButtonClass._gtk_reserved4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass._gtk_reserved4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        _GtkButtonClass._gtk_reserved4$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkButtonClass._gtk_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkButtonClass._gtk_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

