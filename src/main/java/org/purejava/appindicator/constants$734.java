// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$734 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$734() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_app_info_launch_default_for_uri_finish",
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
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GAppLaunchContext");
    static final VarHandle const$2 = constants$734.const$1.varHandle(MemoryLayout.PathElement.groupElement("priv"));
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
        ).withName("parent_class"),
        RuntimeHelper.POINTER.withName("get_display"),
        RuntimeHelper.POINTER.withName("get_startup_notify_id"),
        RuntimeHelper.POINTER.withName("launch_failed"),
        RuntimeHelper.POINTER.withName("launched"),
        RuntimeHelper.POINTER.withName("launch_started"),
        RuntimeHelper.POINTER.withName("_g_reserved1"),
        RuntimeHelper.POINTER.withName("_g_reserved2"),
        RuntimeHelper.POINTER.withName("_g_reserved3")
    ).withName("_GAppLaunchContextClass");
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GAppLaunchContextClass.get_display.class, "apply", constants$23.const$0);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$23.const$0
    );
}


