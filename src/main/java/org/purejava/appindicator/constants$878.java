// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$878 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$878() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_dbus_interface_set_object",
        constants$13.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_dbus_interface_dup_object",
        constants$5.const$2
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GDBusInterfaceSkeleton");
    static final VarHandle const$3 = constants$878.const$2.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("get_info"),
        RuntimeHelper.POINTER.withName("get_vtable"),
        RuntimeHelper.POINTER.withName("get_properties"),
        RuntimeHelper.POINTER.withName("flush"),
        MemoryLayout.sequenceLayout(8, RuntimeHelper.POINTER).withName("vfunc_padding"),
        RuntimeHelper.POINTER.withName("g_authorize_method"),
        MemoryLayout.sequenceLayout(8, RuntimeHelper.POINTER).withName("signal_padding")
    ).withName("_GDBusInterfaceSkeletonClass");
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GDBusInterfaceSkeletonClass.get_info.class, "apply", constants$5.const$2);
}


