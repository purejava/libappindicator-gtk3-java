// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$941 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$941() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_debug_controller_dbus_new",
        constants$23.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_debug_controller_dbus_stop",
        constants$13.const$1
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("changed"),
        RuntimeHelper.POINTER.withName("disconnected"),
        RuntimeHelper.POINTER.withName("eject_button"),
        RuntimeHelper.POINTER.withName("get_name"),
        RuntimeHelper.POINTER.withName("get_icon"),
        RuntimeHelper.POINTER.withName("has_volumes"),
        RuntimeHelper.POINTER.withName("get_volumes"),
        RuntimeHelper.POINTER.withName("is_media_removable"),
        RuntimeHelper.POINTER.withName("has_media"),
        RuntimeHelper.POINTER.withName("is_media_check_automatic"),
        RuntimeHelper.POINTER.withName("can_eject"),
        RuntimeHelper.POINTER.withName("can_poll_for_media"),
        RuntimeHelper.POINTER.withName("eject"),
        RuntimeHelper.POINTER.withName("eject_finish"),
        RuntimeHelper.POINTER.withName("poll_for_media"),
        RuntimeHelper.POINTER.withName("poll_for_media_finish"),
        RuntimeHelper.POINTER.withName("get_identifier"),
        RuntimeHelper.POINTER.withName("enumerate_identifiers"),
        RuntimeHelper.POINTER.withName("get_start_stop_type"),
        RuntimeHelper.POINTER.withName("can_start"),
        RuntimeHelper.POINTER.withName("can_start_degraded"),
        RuntimeHelper.POINTER.withName("start"),
        RuntimeHelper.POINTER.withName("start_finish"),
        RuntimeHelper.POINTER.withName("can_stop"),
        RuntimeHelper.POINTER.withName("stop"),
        RuntimeHelper.POINTER.withName("stop_finish"),
        RuntimeHelper.POINTER.withName("stop_button"),
        RuntimeHelper.POINTER.withName("eject_with_operation"),
        RuntimeHelper.POINTER.withName("eject_with_operation_finish"),
        RuntimeHelper.POINTER.withName("get_sort_key"),
        RuntimeHelper.POINTER.withName("get_symbolic_icon"),
        RuntimeHelper.POINTER.withName("is_removable")
    ).withName("_GDriveIface");
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GDriveIface.changed.class, "apply", constants$13.const$1);
    static final VarHandle const$4 = constants$941.const$2.varHandle(MemoryLayout.PathElement.groupElement("changed"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GDriveIface.disconnected.class, "apply", constants$13.const$1);
}


