// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$120 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$120() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("_call_addr"),
        JAVA_INT.withName("_syscall"),
        JAVA_INT.withName("_arch")
    ).withName("");
    static final VarHandle const$1 = constants$120.const$0.varHandle(MemoryLayout.PathElement.groupElement("_call_addr"));
    static final VarHandle const$2 = constants$120.const$0.varHandle(MemoryLayout.PathElement.groupElement("_syscall"));
    static final VarHandle const$3 = constants$120.const$0.varHandle(MemoryLayout.PathElement.groupElement("_arch"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            JAVA_INT.withName("sival_int"),
            RuntimeHelper.POINTER.withName("sival_ptr")
        ).withName("sigev_value"),
        JAVA_INT.withName("sigev_signo"),
        JAVA_INT.withName("sigev_notify"),
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(12, JAVA_INT).withName("_pad"),
            JAVA_INT.withName("_tid"),
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("_function"),
                RuntimeHelper.POINTER.withName("_attribute")
            ).withName("_sigev_thread")
        ).withName("_sigev_un")
    ).withName("sigevent");
    static final VarHandle const$5 = constants$120.const$4.varHandle(MemoryLayout.PathElement.groupElement("sigev_signo"));
}


