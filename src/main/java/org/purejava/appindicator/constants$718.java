// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$718 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$718() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_action_map_remove_action_entries",
        constants$164.const$5
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("dup"),
        RuntimeHelper.POINTER.withName("equal"),
        RuntimeHelper.POINTER.withName("get_id"),
        RuntimeHelper.POINTER.withName("get_name"),
        RuntimeHelper.POINTER.withName("get_description"),
        RuntimeHelper.POINTER.withName("get_executable"),
        RuntimeHelper.POINTER.withName("get_icon"),
        RuntimeHelper.POINTER.withName("launch"),
        RuntimeHelper.POINTER.withName("supports_uris"),
        RuntimeHelper.POINTER.withName("supports_files"),
        RuntimeHelper.POINTER.withName("launch_uris"),
        RuntimeHelper.POINTER.withName("should_show"),
        RuntimeHelper.POINTER.withName("set_as_default_for_type"),
        RuntimeHelper.POINTER.withName("set_as_default_for_extension"),
        RuntimeHelper.POINTER.withName("add_supports_type"),
        RuntimeHelper.POINTER.withName("can_remove_supports_type"),
        RuntimeHelper.POINTER.withName("remove_supports_type"),
        RuntimeHelper.POINTER.withName("can_delete"),
        RuntimeHelper.POINTER.withName("do_delete"),
        RuntimeHelper.POINTER.withName("get_commandline"),
        RuntimeHelper.POINTER.withName("get_display_name"),
        RuntimeHelper.POINTER.withName("set_as_last_used_for_type"),
        RuntimeHelper.POINTER.withName("get_supported_types"),
        RuntimeHelper.POINTER.withName("launch_uris_async"),
        RuntimeHelper.POINTER.withName("launch_uris_finish")
    ).withName("_GAppInfoIface");
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GAppInfoIface.dup.class, "apply", constants$5.const$2);
    static final VarHandle const$3 = constants$718.const$1.varHandle(MemoryLayout.PathElement.groupElement("dup"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GAppInfoIface.equal.class, "apply", constants$9.const$0);
    static final VarHandle const$5 = constants$718.const$1.varHandle(MemoryLayout.PathElement.groupElement("equal"));
}


