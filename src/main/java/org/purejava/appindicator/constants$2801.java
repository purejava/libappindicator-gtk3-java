// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$2801 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2801() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_tooltip_set_icon_from_gicon",
        constants$164.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_tooltip_set_custom",
        constants$13.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_tooltip_set_tip_area",
        constants$13.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_tooltip_trigger_tooltip_query",
        constants$13.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(GtkIconViewForeachFunc.class, "apply", constants$14.const$3);
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
        ).withName("parent"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GtkIconView");
}


