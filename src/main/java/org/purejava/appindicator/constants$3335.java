// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
final class constants$3335 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3335() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("type_name"),
        JAVA_INT.withName("property_name"),
        RuntimeHelper.POINTER.withName("origin"),
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            MemoryLayout.sequenceLayout(2, MemoryLayout.unionLayout(
                JAVA_INT.withName("v_int"),
                JAVA_INT.withName("v_uint"),
                JAVA_LONG.withName("v_long"),
                JAVA_LONG.withName("v_ulong"),
                JAVA_LONG.withName("v_int64"),
                JAVA_LONG.withName("v_uint64"),
                JAVA_FLOAT.withName("v_float"),
                JAVA_DOUBLE.withName("v_double"),
                RuntimeHelper.POINTER.withName("v_pointer")
            ).withName("")).withName("data")
        ).withName("value")
    ).withName("_GtkRcProperty");
    static final VarHandle const$1 = constants$3335.const$0.varHandle(MemoryLayout.PathElement.groupElement("type_name"));
    static final VarHandle const$2 = constants$3335.const$0.varHandle(MemoryLayout.PathElement.groupElement("property_name"));
    static final VarHandle const$3 = constants$3335.const$0.varHandle(MemoryLayout.PathElement.groupElement("origin"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_binding_set_add_path",
        constants$1501.const$3
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    RuntimeHelper.POINTER.withName("g_class")
                ).withName("g_type_instance"),
                JAVA_INT.withName("ref_count"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("qdata")
            ).withName("object"),
            RuntimeHelper.POINTER.withName("private_data")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GtkRecentAction");
}


