// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
final class constants$1970 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1970() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("property_name"),
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
        ).withName("old_value"),
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
        ).withName("new_value")
    ).withName("_AtkPropertyValues");
    static final VarHandle const$1 = constants$1970.const$0.varHandle(MemoryLayout.PathElement.groupElement("property_name"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(AtkFunction.class, "apply", constants$10.const$5);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(AtkPropertyChangeHandler.class, "apply", constants$13.const$4);
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent"),
        RuntimeHelper.POINTER.withName("description"),
        RuntimeHelper.POINTER.withName("name"),
        RuntimeHelper.POINTER.withName("accessible_parent"),
        JAVA_INT.withName("role"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("relation_set"),
        JAVA_INT.withName("layer"),
        MemoryLayout.paddingLayout(4)
    ).withName("_AtkObject");
    static final VarHandle const$5 = constants$1970.const$4.varHandle(MemoryLayout.PathElement.groupElement("description"));
}


