// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$927 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$927() {}
    static final VarHandle const$0 = constants$926.const$5.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("authorize_method"),
        MemoryLayout.sequenceLayout(8, RuntimeHelper.POINTER).withName("padding")
    ).withName("_GDBusObjectSkeletonClass");
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GDBusObjectSkeletonClass.authorize_method.class, "apply", constants$12.const$2);
    static final VarHandle const$3 = constants$927.const$1.varHandle(MemoryLayout.PathElement.groupElement("authorize_method"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_dbus_object_skeleton_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_dbus_object_skeleton_new",
        constants$5.const$2
    );
}


