// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$1276 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1276() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
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
        ).withName("parent_class"),
        RuntimeHelper.POINTER.withName("_g_reserved1"),
        RuntimeHelper.POINTER.withName("_g_reserved2"),
        RuntimeHelper.POINTER.withName("_g_reserved3"),
        RuntimeHelper.POINTER.withName("_g_reserved4"),
        RuntimeHelper.POINTER.withName("_g_reserved5"),
        RuntimeHelper.POINTER.withName("_g_reserved6"),
        RuntimeHelper.POINTER.withName("_g_reserved7"),
        RuntimeHelper.POINTER.withName("_g_reserved8"),
        RuntimeHelper.POINTER.withName("_g_reserved9"),
        RuntimeHelper.POINTER.withName("_g_reserved10")
    ).withName("_GSocketClass");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GSocketClass._g_reserved1.class, "apply", constants$7.const$5);
    static final VarHandle const$2 = constants$1276.const$0.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GSocketClass._g_reserved2.class, "apply", constants$7.const$5);
    static final VarHandle const$4 = constants$1276.const$0.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GSocketClass._g_reserved3.class, "apply", constants$7.const$5);
}


