// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$3261 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3261() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_action_get_is_important",
        constants$10.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_action_set_always_show_image",
        constants$40.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_action_get_always_show_image",
        constants$10.const$5
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("update"),
        RuntimeHelper.POINTER.withName("sync_action_properties")
    ).withName("_GtkActivatableIface");
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GtkActivatableIface.update.class, "apply", constants$14.const$3);
    static final VarHandle const$5 = constants$3261.const$3.varHandle(MemoryLayout.PathElement.groupElement("update"));
}


