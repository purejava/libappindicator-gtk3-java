// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$2010 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2010() {}
    static final VarHandle const$0 = constants$2009.const$3.varHandle(MemoryLayout.PathElement.groupElement("content"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "atk_text_range_get_type",
        constants$3.const$5
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("parent"),
        RuntimeHelper.POINTER.withName("get_text"),
        RuntimeHelper.POINTER.withName("get_text_after_offset"),
        RuntimeHelper.POINTER.withName("get_text_at_offset"),
        RuntimeHelper.POINTER.withName("get_character_at_offset"),
        RuntimeHelper.POINTER.withName("get_text_before_offset"),
        RuntimeHelper.POINTER.withName("get_caret_offset"),
        RuntimeHelper.POINTER.withName("get_run_attributes"),
        RuntimeHelper.POINTER.withName("get_default_attributes"),
        RuntimeHelper.POINTER.withName("get_character_extents"),
        RuntimeHelper.POINTER.withName("get_character_count"),
        RuntimeHelper.POINTER.withName("get_offset_at_point"),
        RuntimeHelper.POINTER.withName("get_n_selections"),
        RuntimeHelper.POINTER.withName("get_selection"),
        RuntimeHelper.POINTER.withName("add_selection"),
        RuntimeHelper.POINTER.withName("remove_selection"),
        RuntimeHelper.POINTER.withName("set_selection"),
        RuntimeHelper.POINTER.withName("set_caret_offset"),
        RuntimeHelper.POINTER.withName("text_changed"),
        RuntimeHelper.POINTER.withName("text_caret_moved"),
        RuntimeHelper.POINTER.withName("text_selection_changed"),
        RuntimeHelper.POINTER.withName("text_attributes_changed"),
        RuntimeHelper.POINTER.withName("get_range_extents"),
        RuntimeHelper.POINTER.withName("get_bounded_ranges"),
        RuntimeHelper.POINTER.withName("get_string_at_offset"),
        RuntimeHelper.POINTER.withName("scroll_substring_to"),
        RuntimeHelper.POINTER.withName("scroll_substring_to_point")
    ).withName("_AtkTextIface");
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_AtkTextIface.get_text.class, "apply", constants$33.const$5);
    static final VarHandle const$4 = constants$2010.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_text"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_AtkTextIface.get_text_after_offset.class, "apply", constants$1421.const$1);
}

