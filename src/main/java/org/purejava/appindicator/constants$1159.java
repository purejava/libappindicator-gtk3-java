// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1159 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1159() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_unexport_menu_model",
        constants$40.const$2
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("changed"),
        RuntimeHelper.POINTER.withName("unmounted"),
        RuntimeHelper.POINTER.withName("get_root"),
        RuntimeHelper.POINTER.withName("get_name"),
        RuntimeHelper.POINTER.withName("get_icon"),
        RuntimeHelper.POINTER.withName("get_uuid"),
        RuntimeHelper.POINTER.withName("get_volume"),
        RuntimeHelper.POINTER.withName("get_drive"),
        RuntimeHelper.POINTER.withName("can_unmount"),
        RuntimeHelper.POINTER.withName("can_eject"),
        RuntimeHelper.POINTER.withName("unmount"),
        RuntimeHelper.POINTER.withName("unmount_finish"),
        RuntimeHelper.POINTER.withName("eject"),
        RuntimeHelper.POINTER.withName("eject_finish"),
        RuntimeHelper.POINTER.withName("remount"),
        RuntimeHelper.POINTER.withName("remount_finish"),
        RuntimeHelper.POINTER.withName("guess_content_type"),
        RuntimeHelper.POINTER.withName("guess_content_type_finish"),
        RuntimeHelper.POINTER.withName("guess_content_type_sync"),
        RuntimeHelper.POINTER.withName("pre_unmount"),
        RuntimeHelper.POINTER.withName("unmount_with_operation"),
        RuntimeHelper.POINTER.withName("unmount_with_operation_finish"),
        RuntimeHelper.POINTER.withName("eject_with_operation"),
        RuntimeHelper.POINTER.withName("eject_with_operation_finish"),
        RuntimeHelper.POINTER.withName("get_default_location"),
        RuntimeHelper.POINTER.withName("get_sort_key"),
        RuntimeHelper.POINTER.withName("get_symbolic_icon")
    ).withName("_GMountIface");
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GMountIface.changed.class, "apply", constants$13.const$1);
    static final VarHandle const$3 = constants$1159.const$1.varHandle(MemoryLayout.PathElement.groupElement("changed"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GMountIface.unmounted.class, "apply", constants$13.const$1);
    static final VarHandle const$5 = constants$1159.const$1.varHandle(MemoryLayout.PathElement.groupElement("unmounted"));
}


