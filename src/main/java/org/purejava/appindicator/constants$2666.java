// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$2666 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2666() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_event_controller_scroll_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_event_controller_scroll_new",
        constants$21.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_event_controller_scroll_set_flags",
        constants$40.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_event_controller_scroll_get_flags",
        constants$10.const$5
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
        ).withName("bin"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GtkExpander");
    static final VarHandle const$5 = constants$2666.const$4.varHandle(MemoryLayout.PathElement.groupElement("priv"));
}


