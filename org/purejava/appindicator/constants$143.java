// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$143 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$143() {}
    static final VarHandle const$0 = constants$142.const$5.varHandle(MemoryLayout.PathElement.groupElement("fault_address"));
    static final VarHandle const$1 = constants$142.const$5.varHandle(MemoryLayout.PathElement.groupElement("sp"));
    static final VarHandle const$2 = constants$142.const$5.varHandle(MemoryLayout.PathElement.groupElement("pc"));
    static final VarHandle const$3 = constants$142.const$5.varHandle(MemoryLayout.PathElement.groupElement("pstate"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_LONG.withName("uc_flags"),
        RuntimeHelper.POINTER.withName("uc_link"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("ss_sp"),
            JAVA_INT.withName("ss_flags"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("ss_size")
        ).withName("uc_stack"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, JAVA_LONG).withName("__val")
        ).withName("uc_sigmask"),
        MemoryLayout.paddingLayout(8),
        MemoryLayout.structLayout(
            JAVA_LONG.withName("fault_address"),
            MemoryLayout.sequenceLayout(31, JAVA_LONG).withName("regs"),
            JAVA_LONG.withName("sp"),
            JAVA_LONG.withName("pc"),
            JAVA_LONG.withName("pstate"),
            MemoryLayout.paddingLayout(8),
            MemoryLayout.sequenceLayout(4096, JAVA_BYTE).withName("__reserved")
        ).withName("uc_mcontext")
    ).withName("ucontext_t");
    static final VarHandle const$5 = constants$143.const$4.varHandle(MemoryLayout.PathElement.groupElement("uc_flags"));
}

