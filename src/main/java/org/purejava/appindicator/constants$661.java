// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$661 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$661() {}
    static final VarHandle const$0 = constants$660.const$5.varHandle(MemoryLayout.PathElement.groupElement("minimum"));
    static final VarHandle const$1 = constants$660.const$5.varHandle(MemoryLayout.PathElement.groupElement("maximum"));
    static final VarHandle const$2 = constants$660.const$5.varHandle(MemoryLayout.PathElement.groupElement("default_value"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            RuntimeHelper.POINTER.withName("name"),
            JAVA_INT.withName("flags"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("value_type"),
            JAVA_LONG.withName("owner_type"),
            RuntimeHelper.POINTER.withName("_nick"),
            RuntimeHelper.POINTER.withName("_blurb"),
            RuntimeHelper.POINTER.withName("qdata"),
            JAVA_INT.withName("ref_count"),
            JAVA_INT.withName("param_id")
        ).withName("parent_instance"),
        JAVA_LONG.withName("minimum"),
        JAVA_LONG.withName("maximum"),
        JAVA_LONG.withName("default_value")
    ).withName("_GParamSpecInt64");
    static final VarHandle const$4 = constants$661.const$3.varHandle(MemoryLayout.PathElement.groupElement("minimum"));
    static final VarHandle const$5 = constants$661.const$3.varHandle(MemoryLayout.PathElement.groupElement("maximum"));
}


