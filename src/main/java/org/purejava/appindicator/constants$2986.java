// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$2986 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2986() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_progress_bar_set_ellipsize",
        constants$40.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_progress_bar_get_ellipsize",
        constants$10.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_progress_bar_set_show_text",
        constants$40.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_progress_bar_get_show_text",
        constants$10.const$5
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
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
                ).withName("button"),
                RuntimeHelper.POINTER.withName("priv")
            ).withName("toggle_button")
        ).withName("check_button"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GtkRadioButton");
    static final VarHandle const$5 = constants$2986.const$4.varHandle(MemoryLayout.PathElement.groupElement("priv"));
}


