// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1140 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1140() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_add_bytes",
        constants$13.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_memory_monitor_get_type",
        constants$3.const$5
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("low_memory_warning")
    ).withName("_GMemoryMonitorInterface");
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GMemoryMonitorInterface.low_memory_warning.class, "apply", constants$40.const$2);
    static final VarHandle const$4 = constants$1140.const$2.varHandle(MemoryLayout.PathElement.groupElement("low_memory_warning"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_memory_monitor_dup_default",
        constants$35.const$2
    );
}


