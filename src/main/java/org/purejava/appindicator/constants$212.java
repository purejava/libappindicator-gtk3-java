// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
final class constants$212 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$212() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("data"),
        RuntimeHelper.POINTER.withName("next"),
        RuntimeHelper.POINTER.withName("prev"),
        RuntimeHelper.POINTER.withName("parent"),
        RuntimeHelper.POINTER.withName("children")
    ).withName("_GNode");
    static final VarHandle const$1 = constants$212.const$0.varHandle(MemoryLayout.PathElement.groupElement("data"));
    static final VarHandle const$2 = constants$212.const$0.varHandle(MemoryLayout.PathElement.groupElement("next"));
    static final VarHandle const$3 = constants$212.const$0.varHandle(MemoryLayout.PathElement.groupElement("prev"));
    static final VarHandle const$4 = constants$212.const$0.varHandle(MemoryLayout.PathElement.groupElement("parent"));
    static final VarHandle const$5 = constants$212.const$0.varHandle(MemoryLayout.PathElement.groupElement("children"));
}


