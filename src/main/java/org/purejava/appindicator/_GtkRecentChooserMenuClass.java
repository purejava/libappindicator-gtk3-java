// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GtkRecentChooserMenuClass {
 *     GtkMenuClass parent_class;
 *     void (*gtk_recent1)();
 *     void (*gtk_recent2)();
 *     void (*gtk_recent3)();
 *     void (*gtk_recent4)();
 * };
 * }
 */
public class _GtkRecentChooserMenuClass {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
                MemoryLayout.paddingLayout(64),
                Constants$root.C_POINTER$LAYOUT.withName("deactivate"),
                Constants$root.C_POINTER$LAYOUT.withName("selection_done"),
                Constants$root.C_POINTER$LAYOUT.withName("move_current"),
                Constants$root.C_POINTER$LAYOUT.withName("activate_current"),
                Constants$root.C_POINTER$LAYOUT.withName("cancel"),
                Constants$root.C_POINTER$LAYOUT.withName("select_item"),
                Constants$root.C_POINTER$LAYOUT.withName("insert"),
                Constants$root.C_POINTER$LAYOUT.withName("get_popup_delay"),
                Constants$root.C_POINTER$LAYOUT.withName("move_selected"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
            ).withName("parent_class"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("gtk_recent1"),
        Constants$root.C_POINTER$LAYOUT.withName("gtk_recent2"),
        Constants$root.C_POINTER$LAYOUT.withName("gtk_recent3"),
        Constants$root.C_POINTER$LAYOUT.withName("gtk_recent4")
    ).withName("_GtkRecentChooserMenuClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkRecentChooserMenuClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 1120);
    }
    static final FunctionDescriptor gtk_recent1$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor gtk_recent1_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gtk_recent1_UP$MH = RuntimeHelper.upcallHandle(gtk_recent1.class, "apply", _GtkRecentChooserMenuClass.gtk_recent1_UP$FUNC);
    static final FunctionDescriptor gtk_recent1_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gtk_recent1_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkRecentChooserMenuClass.gtk_recent1_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*gtk_recent1)();
     * }
     */
    public interface gtk_recent1 {

        void apply();
        static MemorySegment allocate(gtk_recent1 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkRecentChooserMenuClass.gtk_recent1_UP$MH, fi, _GtkRecentChooserMenuClass.gtk_recent1$FUNC, scope);
        }
        static gtk_recent1 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkRecentChooserMenuClass.gtk_recent1_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle gtk_recent1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gtk_recent1"));
    public static VarHandle gtk_recent1$VH() {
        return _GtkRecentChooserMenuClass.gtk_recent1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*gtk_recent1)();
     * }
     */
    public static MemorySegment gtk_recent1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkRecentChooserMenuClass.gtk_recent1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*gtk_recent1)();
     * }
     */
    public static void gtk_recent1$set(MemorySegment seg, MemorySegment x) {
        _GtkRecentChooserMenuClass.gtk_recent1$VH.set(seg, x);
    }
    public static MemorySegment gtk_recent1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkRecentChooserMenuClass.gtk_recent1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gtk_recent1$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkRecentChooserMenuClass.gtk_recent1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static gtk_recent1 gtk_recent1(MemorySegment segment, SegmentScope scope) {
        return gtk_recent1.ofAddress(gtk_recent1$get(segment), scope);
    }
    static final FunctionDescriptor gtk_recent2$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor gtk_recent2_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gtk_recent2_UP$MH = RuntimeHelper.upcallHandle(gtk_recent2.class, "apply", _GtkRecentChooserMenuClass.gtk_recent2_UP$FUNC);
    static final FunctionDescriptor gtk_recent2_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gtk_recent2_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkRecentChooserMenuClass.gtk_recent2_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*gtk_recent2)();
     * }
     */
    public interface gtk_recent2 {

        void apply();
        static MemorySegment allocate(gtk_recent2 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkRecentChooserMenuClass.gtk_recent2_UP$MH, fi, _GtkRecentChooserMenuClass.gtk_recent2$FUNC, scope);
        }
        static gtk_recent2 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkRecentChooserMenuClass.gtk_recent2_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle gtk_recent2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gtk_recent2"));
    public static VarHandle gtk_recent2$VH() {
        return _GtkRecentChooserMenuClass.gtk_recent2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*gtk_recent2)();
     * }
     */
    public static MemorySegment gtk_recent2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkRecentChooserMenuClass.gtk_recent2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*gtk_recent2)();
     * }
     */
    public static void gtk_recent2$set(MemorySegment seg, MemorySegment x) {
        _GtkRecentChooserMenuClass.gtk_recent2$VH.set(seg, x);
    }
    public static MemorySegment gtk_recent2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkRecentChooserMenuClass.gtk_recent2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gtk_recent2$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkRecentChooserMenuClass.gtk_recent2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static gtk_recent2 gtk_recent2(MemorySegment segment, SegmentScope scope) {
        return gtk_recent2.ofAddress(gtk_recent2$get(segment), scope);
    }
    static final FunctionDescriptor gtk_recent3$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor gtk_recent3_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gtk_recent3_UP$MH = RuntimeHelper.upcallHandle(gtk_recent3.class, "apply", _GtkRecentChooserMenuClass.gtk_recent3_UP$FUNC);
    static final FunctionDescriptor gtk_recent3_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gtk_recent3_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkRecentChooserMenuClass.gtk_recent3_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*gtk_recent3)();
     * }
     */
    public interface gtk_recent3 {

        void apply();
        static MemorySegment allocate(gtk_recent3 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkRecentChooserMenuClass.gtk_recent3_UP$MH, fi, _GtkRecentChooserMenuClass.gtk_recent3$FUNC, scope);
        }
        static gtk_recent3 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkRecentChooserMenuClass.gtk_recent3_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle gtk_recent3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gtk_recent3"));
    public static VarHandle gtk_recent3$VH() {
        return _GtkRecentChooserMenuClass.gtk_recent3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*gtk_recent3)();
     * }
     */
    public static MemorySegment gtk_recent3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkRecentChooserMenuClass.gtk_recent3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*gtk_recent3)();
     * }
     */
    public static void gtk_recent3$set(MemorySegment seg, MemorySegment x) {
        _GtkRecentChooserMenuClass.gtk_recent3$VH.set(seg, x);
    }
    public static MemorySegment gtk_recent3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkRecentChooserMenuClass.gtk_recent3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gtk_recent3$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkRecentChooserMenuClass.gtk_recent3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static gtk_recent3 gtk_recent3(MemorySegment segment, SegmentScope scope) {
        return gtk_recent3.ofAddress(gtk_recent3$get(segment), scope);
    }
    static final FunctionDescriptor gtk_recent4$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor gtk_recent4_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gtk_recent4_UP$MH = RuntimeHelper.upcallHandle(gtk_recent4.class, "apply", _GtkRecentChooserMenuClass.gtk_recent4_UP$FUNC);
    static final FunctionDescriptor gtk_recent4_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gtk_recent4_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkRecentChooserMenuClass.gtk_recent4_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*gtk_recent4)();
     * }
     */
    public interface gtk_recent4 {

        void apply();
        static MemorySegment allocate(gtk_recent4 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkRecentChooserMenuClass.gtk_recent4_UP$MH, fi, _GtkRecentChooserMenuClass.gtk_recent4$FUNC, scope);
        }
        static gtk_recent4 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkRecentChooserMenuClass.gtk_recent4_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle gtk_recent4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gtk_recent4"));
    public static VarHandle gtk_recent4$VH() {
        return _GtkRecentChooserMenuClass.gtk_recent4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*gtk_recent4)();
     * }
     */
    public static MemorySegment gtk_recent4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkRecentChooserMenuClass.gtk_recent4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*gtk_recent4)();
     * }
     */
    public static void gtk_recent4$set(MemorySegment seg, MemorySegment x) {
        _GtkRecentChooserMenuClass.gtk_recent4$VH.set(seg, x);
    }
    public static MemorySegment gtk_recent4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkRecentChooserMenuClass.gtk_recent4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gtk_recent4$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkRecentChooserMenuClass.gtk_recent4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static gtk_recent4 gtk_recent4(MemorySegment segment, SegmentScope scope) {
        return gtk_recent4.ofAddress(gtk_recent4$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

