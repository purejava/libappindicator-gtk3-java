// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$629 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$629() {}
    static final VarHandle const$0 = constants$625.const$1.varHandle(MemoryLayout.PathElement.groupElement("pspecs"));
    static final VarHandle const$1 = constants$625.const$1.varHandle(MemoryLayout.PathElement.groupElement("n_pspecs"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pspec"),
        RuntimeHelper.POINTER.withName("value")
    ).withName("_GObjectConstructParam");
    static final VarHandle const$3 = constants$629.const$2.varHandle(MemoryLayout.PathElement.groupElement("pspec"));
    static final VarHandle const$4 = constants$629.const$2.varHandle(MemoryLayout.PathElement.groupElement("value"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_initially_unowned_get_type",
        constants$3.const$5
    );
}


