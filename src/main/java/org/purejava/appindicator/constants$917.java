// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$917 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$917() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GDBusObjectManagerIface.interface_added.class, "apply", constants$14.const$3);
    static final VarHandle const$1 = constants$914.const$5.varHandle(MemoryLayout.PathElement.groupElement("interface_added"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GDBusObjectManagerIface.interface_removed.class, "apply", constants$14.const$3);
    static final VarHandle const$3 = constants$914.const$5.varHandle(MemoryLayout.PathElement.groupElement("interface_removed"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_get_object_path",
        constants$5.const$2
    );
}


