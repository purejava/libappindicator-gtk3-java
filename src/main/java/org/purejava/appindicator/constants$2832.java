// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$2832 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2832() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_info_bar_set_show_close_button",
        constants$40.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_info_bar_get_show_close_button",
        constants$10.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_info_bar_set_revealed",
        constants$40.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_info_bar_get_revealed",
        constants$10.const$5
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
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
    ).withName("_GtkInvisible");
    static final VarHandle const$5 = constants$2832.const$4.varHandle(MemoryLayout.PathElement.groupElement("priv"));
}


