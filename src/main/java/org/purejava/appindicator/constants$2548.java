// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$2548 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2548() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_builder_set_application",
        constants$13.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_builder_get_application",
        constants$5.const$2
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_builder_extend_with_template",
        constants$2548.const$2
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("set_name"),
        RuntimeHelper.POINTER.withName("get_name"),
        RuntimeHelper.POINTER.withName("add_child"),
        RuntimeHelper.POINTER.withName("set_buildable_property"),
        RuntimeHelper.POINTER.withName("construct_child"),
        RuntimeHelper.POINTER.withName("custom_tag_start"),
        RuntimeHelper.POINTER.withName("custom_tag_end"),
        RuntimeHelper.POINTER.withName("custom_finished"),
        RuntimeHelper.POINTER.withName("parser_finished"),
        RuntimeHelper.POINTER.withName("get_internal_child")
    ).withName("_GtkBuildableIface");
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GtkBuildableIface.set_name.class, "apply", constants$13.const$4);
}


