// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$101 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$101() {}
    static final VarHandle const$0 = constants$100.const$3.varHandle(MemoryLayout.PathElement.groupElement("notify"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("status"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("retval")
    ).withName("_GOnce");
    static final VarHandle const$2 = constants$101.const$1.varHandle(MemoryLayout.PathElement.groupElement("status"));
    static final VarHandle const$3 = constants$101.const$1.varHandle(MemoryLayout.PathElement.groupElement("retval"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_thread_ref",
        constants$5.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_thread_unref",
        constants$13.const$1
    );
}


