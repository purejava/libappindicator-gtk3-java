// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$665 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$665() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("overridden")
    ).withName("_GParamSpecOverride");
    static final VarHandle const$1 = constants$665.const$0.varHandle(MemoryLayout.PathElement.groupElement("overridden"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
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
        JAVA_LONG.withName("is_a_type")
    ).withName("_GParamSpecGType");
    static final VarHandle const$3 = constants$665.const$2.varHandle(MemoryLayout.PathElement.groupElement("is_a_type"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("type"),
        RuntimeHelper.POINTER.withName("default_value"),
        MemoryLayout.sequenceLayout(4, RuntimeHelper.POINTER).withName("padding")
    ).withName("_GParamSpecVariant");
    static final VarHandle const$5 = constants$665.const$4.varHandle(MemoryLayout.PathElement.groupElement("type"));
}


