// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$802 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$802() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_cancellable_connect$callback.class, "apply", constants$7.const$5);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(g_cancellable_connect$data_destroy_func.class, "apply", constants$13.const$1);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_cancellable_connect",
        constants$332.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_cancellable_disconnect",
        constants$25.const$3
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_cancellable_cancel",
        constants$13.const$1
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("convert"),
        RuntimeHelper.POINTER.withName("reset")
    ).withName("_GConverterIface");
}


