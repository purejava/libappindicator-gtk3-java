// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$885 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$885() {}
    static final VarHandle const$0 = constants$884.const$2.varHandle(MemoryLayout.PathElement.groupElement("signals"));
    static final VarHandle const$1 = constants$884.const$2.varHandle(MemoryLayout.PathElement.groupElement("properties"));
    static final VarHandle const$2 = constants$884.const$2.varHandle(MemoryLayout.PathElement.groupElement("annotations"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("ref_count"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("path"),
        RuntimeHelper.POINTER.withName("interfaces"),
        RuntimeHelper.POINTER.withName("nodes"),
        RuntimeHelper.POINTER.withName("annotations")
    ).withName("_GDBusNodeInfo");
    static final VarHandle const$4 = constants$885.const$3.varHandle(MemoryLayout.PathElement.groupElement("ref_count"));
    static final VarHandle const$5 = constants$885.const$3.varHandle(MemoryLayout.PathElement.groupElement("path"));
}


