// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$2660 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2660() {}
    static final VarHandle const$0 = constants$2659.const$0.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GtkDrawingAreaClass._gtk_reserved4.class, "apply", constants$7.const$5);
    static final VarHandle const$2 = constants$2659.const$0.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_drawing_area_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_drawing_area_new",
        constants$35.const$2
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
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
    ).withName("_GtkEventBox");
}


