// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$376 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$376() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_log_set_fatal_mask",
        constants$11.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_log_set_always_fatal",
        constants$8.const$4
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("key"),
        RuntimeHelper.POINTER.withName("value"),
        JAVA_LONG.withName("length")
    ).withName("_GLogField");
    static final VarHandle const$3 = constants$376.const$2.varHandle(MemoryLayout.PathElement.groupElement("key"));
    static final VarHandle const$4 = constants$376.const$2.varHandle(MemoryLayout.PathElement.groupElement("value"));
    static final VarHandle const$5 = constants$376.const$2.varHandle(MemoryLayout.PathElement.groupElement("length"));
}


