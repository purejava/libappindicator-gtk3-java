// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3190 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3190() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_tree_drag_dest_drag_data_received",
        constants$12.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_tree_drag_dest_row_drop_possible",
        constants$12.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_tree_set_row_drag_data",
        constants$12.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_tree_get_row_drag_data",
        constants$12.const$2
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GtkTreeModelSort");
    static final VarHandle const$5 = constants$3190.const$4.varHandle(MemoryLayout.PathElement.groupElement("priv"));
}


