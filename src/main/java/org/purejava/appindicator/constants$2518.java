// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$2518 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2518() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_frame_get_label_widget",
        constants$5.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_frame_set_label_align",
        constants$2230.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_frame_get_label_align",
        constants$14.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_frame_set_shadow_type",
        constants$40.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_frame_get_shadow_type",
        constants$10.const$5
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
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
        ).withName("frame"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GtkAspectFrame");
}


