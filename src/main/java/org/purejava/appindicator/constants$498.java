// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$498 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$498() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$18.const$2
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("items"),
        RuntimeHelper.POINTER.withName("func"),
        RuntimeHelper.POINTER.withName("prefix"),
        RuntimeHelper.POINTER.withName("cache"),
        RuntimeHelper.POINTER.withName("strncmp_func")
    ).withName("_GCompletion");
    static final VarHandle const$2 = constants$498.const$1.varHandle(MemoryLayout.PathElement.groupElement("items"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GCompletion.func.class, "apply", constants$5.const$2);
    static final VarHandle const$4 = constants$498.const$1.varHandle(MemoryLayout.PathElement.groupElement("func"));
    static final VarHandle const$5 = constants$498.const$1.varHandle(MemoryLayout.PathElement.groupElement("prefix"));
}


