// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2534 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2534() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_binding_entry_add_signall",
        constants$1494.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_binding_entry_add_signal_from_string",
        constants$9.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_binding_entry_remove",
        constants$467.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_builder_error_quark",
        constants$83.const$1
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GtkBuilder");
    static final VarHandle const$5 = constants$2534.const$4.varHandle(MemoryLayout.PathElement.groupElement("priv"));
}


