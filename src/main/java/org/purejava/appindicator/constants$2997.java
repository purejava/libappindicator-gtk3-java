// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2997 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2997() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_toggle_tool_button_set_active",
        constants$40.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_toggle_tool_button_get_active",
        constants$10.const$5
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        MemoryLayout.structLayout(
                            MemoryLayout.structLayout(
                                MemoryLayout.structLayout(
                                    MemoryLayout.structLayout(
                                        RuntimeHelper.POINTER.withName("g_class")
                                    ).withName("g_type_instance"),
                                    JAVA_INT.withName("ref_count"),
                                    MemoryLayout.paddingLayout(4),
                                    RuntimeHelper.POINTER.withName("qdata")
                                ).withName("parent_instance"),
                                RuntimeHelper.POINTER.withName("priv")
                            ).withName("widget"),
                            RuntimeHelper.POINTER.withName("priv")
                        ).withName("container"),
                        RuntimeHelper.POINTER.withName("priv")
                    ).withName("parent"),
                    RuntimeHelper.POINTER.withName("priv")
                ).withName("parent"),
                RuntimeHelper.POINTER.withName("priv")
            ).withName("parent"),
            RuntimeHelper.POINTER.withName("priv")
        ).withName("parent")
    ).withName("_GtkRadioToolButton");
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        MemoryLayout.structLayout(
                            MemoryLayout.structLayout(
                                MemoryLayout.structLayout(
                                    MemoryLayout.structLayout(
                                        JAVA_LONG.withName("g_type")
                                    ).withName("g_type_class"),
                                    RuntimeHelper.POINTER.withName("construct_properties"),
                                    RuntimeHelper.POINTER.withName("constructor"),
                                    RuntimeHelper.POINTER.withName("set_property"),
                                    RuntimeHelper.POINTER.withName("get_property"),
                                    RuntimeHelper.POINTER.withName("dispose"),
                                    RuntimeHelper.POINTER.withName("finalize"),
                                    RuntimeHelper.POINTER.withName("dispatch_properties_changed"),
                                    RuntimeHelper.POINTER.withName("notify"),
                                    RuntimeHelper.POINTER.withName("constructed"),
                                    JAVA_LONG.withName("flags"),
                                    JAVA_LONG.withName("n_construct_properties"),
                                    RuntimeHelper.POINTER.withName("pspecs"),
                                    JAVA_LONG.withName("n_pspecs"),
                                    MemoryLayout.sequenceLayout(3, RuntimeHelper.POINTER).withName("pdummy")
                                ).withName("parent_class"),
                                JAVA_INT.withName("activate_signal"),
                                MemoryLayout.paddingLayout(4),
                                RuntimeHelper.POINTER.withName("dispatch_child_properties_changed"),
                                RuntimeHelper.POINTER.withName("destroy"),
                                RuntimeHelper.POINTER.withName("show"),
                                RuntimeHelper.POINTER.withName("show_all"),
                                RuntimeHelper.POINTER.withName("hide"),
                                RuntimeHelper.POINTER.withName("map"),
                                RuntimeHelper.POINTER.withName("unmap"),
                                RuntimeHelper.POINTER.withName("realize"),
                                RuntimeHelper.POINTER.withName("unrealize"),
                                RuntimeHelper.POINTER.withName("size_allocate"),
                                RuntimeHelper.POINTER.withName("state_changed"),
                                RuntimeHelper.POINTER.withName("state_flags_changed"),
                                RuntimeHelper.POINTER.withName("parent_set"),
                                RuntimeHelper.POINTER.withName("hierarchy_changed"),
                                RuntimeHelper.POINTER.withName("style_set"),
                                RuntimeHelper.POINTER.withName("direction_changed"),
                                RuntimeHelper.POINTER.withName("grab_notify"),
                                RuntimeHelper.POINTER.withName("child_notify"),
                                RuntimeHelper.POINTER.withName("draw"),
                                RuntimeHelper.POINTER.withName("get_request_mode"),
                                RuntimeHelper.POINTER.withName("get_preferred_height"),
                                RuntimeHelper.POINTER.withName("get_preferred_width_for_height"),
                                RuntimeHelper.POINTER.withName("get_preferred_width"),
                                RuntimeHelper.POINTER.withName("get_preferred_height_for_width"),
                                RuntimeHelper.POINTER.withName("mnemonic_activate"),
                                RuntimeHelper.POINTER.withName("grab_focus"),
                                RuntimeHelper.POINTER.withName("focus"),
                                RuntimeHelper.POINTER.withName("move_focus"),
                                RuntimeHelper.POINTER.withName("keynav_failed"),
                                RuntimeHelper.POINTER.withName("event"),
                                RuntimeHelper.POINTER.withName("button_press_event"),
                                RuntimeHelper.POINTER.withName("button_release_event"),
                                RuntimeHelper.POINTER.withName("scroll_event"),
                                RuntimeHelper.POINTER.withName("motion_notify_event"),
                                RuntimeHelper.POINTER.withName("delete_event"),
                                RuntimeHelper.POINTER.withName("destroy_event"),
                                RuntimeHelper.POINTER.withName("key_press_event"),
                                RuntimeHelper.POINTER.withName("key_release_event"),
                                RuntimeHelper.POINTER.withName("enter_notify_event"),
                                RuntimeHelper.POINTER.withName("leave_notify_event"),
                                RuntimeHelper.POINTER.withName("configure_event"),
                                RuntimeHelper.POINTER.withName("focus_in_event"),
                                RuntimeHelper.POINTER.withName("focus_out_event"),
                                RuntimeHelper.POINTER.withName("map_event"),
                                RuntimeHelper.POINTER.withName("unmap_event"),
                                RuntimeHelper.POINTER.withName("property_notify_event"),
                                RuntimeHelper.POINTER.withName("selection_clear_event"),
                                RuntimeHelper.POINTER.withName("selection_request_event"),
                                RuntimeHelper.POINTER.withName("selection_notify_event"),
                                RuntimeHelper.POINTER.withName("proximity_in_event"),
                                RuntimeHelper.POINTER.withName("proximity_out_event"),
                                RuntimeHelper.POINTER.withName("visibility_notify_event"),
                                RuntimeHelper.POINTER.withName("window_state_event"),
                                RuntimeHelper.POINTER.withName("damage_event"),
                                RuntimeHelper.POINTER.withName("grab_broken_event"),
                                RuntimeHelper.POINTER.withName("selection_get"),
                                RuntimeHelper.POINTER.withName("selection_received"),
                                RuntimeHelper.POINTER.withName("drag_begin"),
                                RuntimeHelper.POINTER.withName("drag_end"),
                                RuntimeHelper.POINTER.withName("drag_data_get"),
                                RuntimeHelper.POINTER.withName("drag_data_delete"),
                                RuntimeHelper.POINTER.withName("drag_leave"),
                                RuntimeHelper.POINTER.withName("drag_motion"),
                                RuntimeHelper.POINTER.withName("drag_drop"),
                                RuntimeHelper.POINTER.withName("drag_data_received"),
                                RuntimeHelper.POINTER.withName("drag_failed"),
                                RuntimeHelper.POINTER.withName("popup_menu"),
                                RuntimeHelper.POINTER.withName("show_help"),
                                RuntimeHelper.POINTER.withName("get_accessible"),
                                RuntimeHelper.POINTER.withName("screen_changed"),
                                RuntimeHelper.POINTER.withName("can_activate_accel"),
                                RuntimeHelper.POINTER.withName("composited_changed"),
                                RuntimeHelper.POINTER.withName("query_tooltip"),
                                RuntimeHelper.POINTER.withName("compute_expand"),
                                RuntimeHelper.POINTER.withName("adjust_size_request"),
                                RuntimeHelper.POINTER.withName("adjust_size_allocation"),
                                RuntimeHelper.POINTER.withName("style_updated"),
                                RuntimeHelper.POINTER.withName("touch_event"),
                                RuntimeHelper.POINTER.withName("get_preferred_height_and_baseline_for_width"),
                                RuntimeHelper.POINTER.withName("adjust_baseline_request"),
                                RuntimeHelper.POINTER.withName("adjust_baseline_allocation"),
                                RuntimeHelper.POINTER.withName("queue_draw_region"),
                                RuntimeHelper.POINTER.withName("priv"),
                                RuntimeHelper.POINTER.withName("_gtk_reserved6"),
                                RuntimeHelper.POINTER.withName("_gtk_reserved7")
                            ).withName("parent_class"),
                            RuntimeHelper.POINTER.withName("add"),
                            RuntimeHelper.POINTER.withName("remove"),
                            RuntimeHelper.POINTER.withName("check_resize"),
                            RuntimeHelper.POINTER.withName("forall"),
                            RuntimeHelper.POINTER.withName("set_focus_child"),
                            RuntimeHelper.POINTER.withName("child_type"),
                            RuntimeHelper.POINTER.withName("composite_name"),
                            RuntimeHelper.POINTER.withName("set_child_property"),
                            RuntimeHelper.POINTER.withName("get_child_property"),
                            RuntimeHelper.POINTER.withName("get_path_for_child"),
                            MemoryLayout.paddingLayout(8),
                            RuntimeHelper.POINTER.withName("_gtk_reserved1"),
                            RuntimeHelper.POINTER.withName("_gtk_reserved2"),
                            RuntimeHelper.POINTER.withName("_gtk_reserved3"),
                            RuntimeHelper.POINTER.withName("_gtk_reserved4"),
                            RuntimeHelper.POINTER.withName("_gtk_reserved5"),
                            RuntimeHelper.POINTER.withName("_gtk_reserved6"),
                            RuntimeHelper.POINTER.withName("_gtk_reserved7"),
                            RuntimeHelper.POINTER.withName("_gtk_reserved8")
                        ).withName("parent_class"),
                        RuntimeHelper.POINTER.withName("_gtk_reserved1"),
                        RuntimeHelper.POINTER.withName("_gtk_reserved2"),
                        RuntimeHelper.POINTER.withName("_gtk_reserved3"),
                        RuntimeHelper.POINTER.withName("_gtk_reserved4")
                    ).withName("parent_class"),
                    RuntimeHelper.POINTER.withName("create_menu_proxy"),
                    RuntimeHelper.POINTER.withName("toolbar_reconfigured"),
                    RuntimeHelper.POINTER.withName("_gtk_reserved1"),
                    RuntimeHelper.POINTER.withName("_gtk_reserved2"),
                    RuntimeHelper.POINTER.withName("_gtk_reserved3"),
                    RuntimeHelper.POINTER.withName("_gtk_reserved4")
                ).withName("parent_class"),
                JAVA_LONG.withName("button_type"),
                RuntimeHelper.POINTER.withName("clicked"),
                RuntimeHelper.POINTER.withName("_gtk_reserved1"),
                RuntimeHelper.POINTER.withName("_gtk_reserved2"),
                RuntimeHelper.POINTER.withName("_gtk_reserved3"),
                RuntimeHelper.POINTER.withName("_gtk_reserved4")
            ).withName("parent_class"),
            RuntimeHelper.POINTER.withName("toggled"),
            RuntimeHelper.POINTER.withName("_gtk_reserved1"),
            RuntimeHelper.POINTER.withName("_gtk_reserved2"),
            RuntimeHelper.POINTER.withName("_gtk_reserved3"),
            RuntimeHelper.POINTER.withName("_gtk_reserved4")
        ).withName("parent_class"),
        RuntimeHelper.POINTER.withName("_gtk_reserved1"),
        RuntimeHelper.POINTER.withName("_gtk_reserved2"),
        RuntimeHelper.POINTER.withName("_gtk_reserved3"),
        RuntimeHelper.POINTER.withName("_gtk_reserved4")
    ).withName("_GtkRadioToolButtonClass");
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GtkRadioToolButtonClass._gtk_reserved1.class, "apply", constants$7.const$5);
    static final VarHandle const$5 = constants$2997.const$3.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
}


