// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$2041 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2041() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent")
    ).withName("_AtkMisc");
    static final MemorySegment const$1 = RuntimeHelper.lookupGlobalVariable("atk_misc_instance", RuntimeHelper.POINTER);
    static final StructLayout const$2 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("threads_enter"),
        RuntimeHelper.POINTER.withName("threads_leave"),
        MemoryLayout.sequenceLayout(32, RuntimeHelper.POINTER).withName("vfuncs")
    ).withName("_AtkMiscClass");
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_AtkMiscClass.threads_enter.class, "apply", constants$13.const$1);
    static final VarHandle const$4 = constants$2041.const$2.varHandle(MemoryLayout.PathElement.groupElement("threads_enter"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_AtkMiscClass.threads_leave.class, "apply", constants$13.const$1);
}


