// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$601 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$601() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("signal_id"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("signal_name"),
        JAVA_LONG.withName("itype"),
        JAVA_INT.withName("signal_flags"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("return_type"),
        JAVA_INT.withName("n_params"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("param_types")
    ).withName("_GSignalQuery");
    static final VarHandle const$1 = constants$601.const$0.varHandle(MemoryLayout.PathElement.groupElement("signal_id"));
    static final VarHandle const$2 = constants$601.const$0.varHandle(MemoryLayout.PathElement.groupElement("signal_name"));
    static final VarHandle const$3 = constants$601.const$0.varHandle(MemoryLayout.PathElement.groupElement("itype"));
    static final VarHandle const$4 = constants$601.const$0.varHandle(MemoryLayout.PathElement.groupElement("signal_flags"));
    static final VarHandle const$5 = constants$601.const$0.varHandle(MemoryLayout.PathElement.groupElement("return_type"));
}


