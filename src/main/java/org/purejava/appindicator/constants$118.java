// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_SHORT;
final class constants$118 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$118() {}
    static final VarHandle const$0 = constants$117.const$1.varHandle(MemoryLayout.PathElement.groupElement("si_stime"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("si_addr"),
        JAVA_SHORT.withName("si_addr_lsb"),
        MemoryLayout.paddingLayout(6),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("_lower"),
                RuntimeHelper.POINTER.withName("_upper")
            ).withName("_addr_bnd"),
            JAVA_INT.withName("_pkey")
        ).withName("_bounds")
    ).withName("");
    static final VarHandle const$2 = constants$118.const$1.varHandle(MemoryLayout.PathElement.groupElement("si_addr"));
    static final VarHandle const$3 = constants$118.const$1.varHandle(MemoryLayout.PathElement.groupElement("si_addr_lsb"));
    static final UnionLayout const$4 = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("_lower"),
            RuntimeHelper.POINTER.withName("_upper")
        ).withName("_addr_bnd"),
        JAVA_INT.withName("_pkey")
    ).withName("");
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("_lower"),
        RuntimeHelper.POINTER.withName("_upper")
    ).withName("");
}


