// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2223 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2223() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_about_dialog_set_logo",
        constants$13.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_about_dialog_get_logo_icon_name",
        constants$5.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_about_dialog_set_logo_icon_name",
        constants$13.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_about_dialog_add_credit_section",
        constants$14.const$3
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
    ).withName("_GtkMisc");
    static final VarHandle const$5 = constants$2223.const$4.varHandle(MemoryLayout.PathElement.groupElement("priv"));
}


