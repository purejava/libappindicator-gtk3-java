// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$502 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$502() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("func"),
        RuntimeHelper.POINTER.withName("data"),
        JAVA_INT.withName("joinable"),
        JAVA_INT.withName("priority")
    ).withName("_GThread");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GThread.func.class, "apply", constants$5.const$2);
    static final VarHandle const$2 = constants$502.const$0.varHandle(MemoryLayout.PathElement.groupElement("func"));
    static final VarHandle const$3 = constants$502.const$0.varHandle(MemoryLayout.PathElement.groupElement("data"));
    static final VarHandle const$4 = constants$502.const$0.varHandle(MemoryLayout.PathElement.groupElement("joinable"));
    static final VarHandle const$5 = constants$502.const$0.varHandle(MemoryLayout.PathElement.groupElement("priority"));
}


