// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$3258 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3258() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_activatable_set_use_action_appearance",
        constants$40.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_activatable_get_use_action_appearance",
        constants$10.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_activatable_do_set_related_action",
        constants$13.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(GtkTranslateFunc.class, "apply", constants$5.const$5);
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("stock_id"),
        RuntimeHelper.POINTER.withName("label"),
        JAVA_INT.withName("modifier"),
        JAVA_INT.withName("keyval"),
        RuntimeHelper.POINTER.withName("translation_domain")
    ).withName("_GtkStockItem");
    static final VarHandle const$5 = constants$3258.const$4.varHandle(MemoryLayout.PathElement.groupElement("stock_id"));
}


