// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$1201 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1201() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("network_changed"),
        RuntimeHelper.POINTER.withName("can_reach"),
        RuntimeHelper.POINTER.withName("can_reach_async"),
        RuntimeHelper.POINTER.withName("can_reach_finish")
    ).withName("_GNetworkMonitorInterface");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GNetworkMonitorInterface.network_changed.class, "apply", constants$40.const$2);
    static final VarHandle const$2 = constants$1201.const$0.varHandle(MemoryLayout.PathElement.groupElement("network_changed"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GNetworkMonitorInterface.can_reach.class, "apply", constants$34.const$5);
    static final VarHandle const$4 = constants$1201.const$0.varHandle(MemoryLayout.PathElement.groupElement("can_reach"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GNetworkMonitorInterface.can_reach_async.class, "apply", constants$332.const$1);
}


