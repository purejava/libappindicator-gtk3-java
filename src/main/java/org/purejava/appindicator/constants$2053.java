// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$2053 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2053() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "atk_relation_remove_target",
        constants$9.const$0
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent"),
        RuntimeHelper.POINTER.withName("relations")
    ).withName("_AtkRelationSet");
    static final VarHandle const$2 = constants$2053.const$1.varHandle(MemoryLayout.PathElement.groupElement("relations"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                JAVA_LONG.withName("g_type")
            ).withName("g_type_class"),
            RuntimeHelper.POINTER.withName("construct_properties"),
            RuntimeHelper.POINTER.withName("constructor"),
            RuntimeHelper.POINTER.withName("set_property"),
            RuntimeHelper.POINTER.withName("get_property"),
            RuntimeHelper.POINTER.withName("dispose"),
            RuntimeHelper.POINTER.withName("finalize"),
            RuntimeHelper.POINTER.withName("dispatch_properties_changed"),
            RuntimeHelper.POINTER.withName("notify"),
            RuntimeHelper.POINTER.withName("constructed"),
            JAVA_LONG.withName("flags"),
            JAVA_LONG.withName("n_construct_properties"),
            RuntimeHelper.POINTER.withName("pspecs"),
            JAVA_LONG.withName("n_pspecs"),
            MemoryLayout.sequenceLayout(3, RuntimeHelper.POINTER).withName("pdummy")
        ).withName("parent"),
        RuntimeHelper.POINTER.withName("pad1"),
        RuntimeHelper.POINTER.withName("pad2")
    ).withName("_AtkRelationSetClass");
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_AtkRelationSetClass.pad1.class, "apply", constants$10.const$5);
    static final VarHandle const$5 = constants$2053.const$3.varHandle(MemoryLayout.PathElement.groupElement("pad1"));
}


