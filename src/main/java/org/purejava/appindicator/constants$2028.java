// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$2028 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2028() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "atk_editable_text_cut_text",
        constants$467.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "atk_editable_text_delete_text",
        constants$467.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "atk_editable_text_paste_text",
        constants$40.const$2
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    RuntimeHelper.POINTER.withName("g_class")
                ).withName("g_type_instance"),
                JAVA_INT.withName("ref_count"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("qdata")
            ).withName("parent"),
            RuntimeHelper.POINTER.withName("description"),
            RuntimeHelper.POINTER.withName("name"),
            RuntimeHelper.POINTER.withName("accessible_parent"),
            JAVA_INT.withName("role"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("relation_set"),
            JAVA_INT.withName("layer"),
            MemoryLayout.paddingLayout(4)
        ).withName("parent")
    ).withName("_AtkGObjectAccessible");
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "atk_gobject_accessible_get_type",
        constants$3.const$5
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
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
            ).withName("parent"),
            RuntimeHelper.POINTER.withName("get_name"),
            RuntimeHelper.POINTER.withName("get_description"),
            RuntimeHelper.POINTER.withName("get_parent"),
            RuntimeHelper.POINTER.withName("get_n_children"),
            RuntimeHelper.POINTER.withName("ref_child"),
            RuntimeHelper.POINTER.withName("get_index_in_parent"),
            RuntimeHelper.POINTER.withName("ref_relation_set"),
            RuntimeHelper.POINTER.withName("get_role"),
            RuntimeHelper.POINTER.withName("get_layer"),
            RuntimeHelper.POINTER.withName("get_mdi_zorder"),
            RuntimeHelper.POINTER.withName("ref_state_set"),
            RuntimeHelper.POINTER.withName("set_name"),
            RuntimeHelper.POINTER.withName("set_description"),
            RuntimeHelper.POINTER.withName("set_parent"),
            RuntimeHelper.POINTER.withName("set_role"),
            RuntimeHelper.POINTER.withName("connect_property_change_handler"),
            RuntimeHelper.POINTER.withName("remove_property_change_handler"),
            RuntimeHelper.POINTER.withName("initialize"),
            RuntimeHelper.POINTER.withName("children_changed"),
            RuntimeHelper.POINTER.withName("focus_event"),
            RuntimeHelper.POINTER.withName("property_change"),
            RuntimeHelper.POINTER.withName("state_change"),
            RuntimeHelper.POINTER.withName("visible_data_changed"),
            RuntimeHelper.POINTER.withName("active_descendant_changed"),
            RuntimeHelper.POINTER.withName("get_attributes"),
            RuntimeHelper.POINTER.withName("get_object_locale"),
            RuntimeHelper.POINTER.withName("pad1")
        ).withName("parent_class"),
        RuntimeHelper.POINTER.withName("pad1"),
        RuntimeHelper.POINTER.withName("pad2")
    ).withName("_AtkGObjectAccessibleClass");
}


