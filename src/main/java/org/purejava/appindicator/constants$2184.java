// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$2184 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2184() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_container_child_notify_by_pspec",
        constants$14.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(gtk_container_forall$callback.class, "apply", constants$13.const$4);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_container_forall",
        constants$14.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_container_class_handle_border_width",
        constants$13.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_container_get_path_for_child",
        constants$5.const$5
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        RuntimeHelper.POINTER.withName("g_class")
                    ).withName("g_type_instance"),
                    JAVA_INT.withName("ref_count"),
                    MemoryLayout.paddingLayout(4),
                    RuntimeHelper.POINTER.withName("qdata")
                ).withName("parent_instance"),
                RuntimeHelper.POINTER.withName("priv")
            ).withName("widget"),
            RuntimeHelper.POINTER.withName("priv")
        ).withName("container"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GtkBin");
}


