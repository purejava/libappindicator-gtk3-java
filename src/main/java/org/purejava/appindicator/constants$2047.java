// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2047 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2047() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "atk_plug_get_type",
        constants$3.const$5
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("get_object_id")
    ).withName("_AtkPlugClass");
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_AtkPlugClass.get_object_id.class, "apply", constants$5.const$2);
    static final VarHandle const$3 = constants$2047.const$1.varHandle(MemoryLayout.PathElement.groupElement("get_object_id"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "atk_plug_new",
        constants$35.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "atk_plug_set_child",
        constants$13.const$4
    );
}


