// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$680 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$680() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(GTypePluginCompleteTypeInfo.class, "apply", constants$679.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$679.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(GTypePluginCompleteInterfaceInfo.class, "apply", constants$94.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$94.const$1
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("base_iface"),
        RuntimeHelper.POINTER.withName("use_plugin"),
        RuntimeHelper.POINTER.withName("unuse_plugin"),
        RuntimeHelper.POINTER.withName("complete_type_info"),
        RuntimeHelper.POINTER.withName("complete_interface_info")
    ).withName("_GTypePluginClass");
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GTypePluginClass.use_plugin.class, "apply", constants$13.const$1);
}


