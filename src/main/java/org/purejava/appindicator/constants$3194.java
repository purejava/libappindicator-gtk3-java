// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$3194 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3194() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("drag_data_received"),
        RuntimeHelper.POINTER.withName("row_drop_possible")
    ).withName("_GtkTreeDragDestIface");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GtkTreeDragDestIface.drag_data_received.class, "apply", constants$12.const$2);
    static final VarHandle const$2 = constants$3194.const$0.varHandle(MemoryLayout.PathElement.groupElement("drag_data_received"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GtkTreeDragDestIface.row_drop_possible.class, "apply", constants$12.const$2);
    static final VarHandle const$4 = constants$3194.const$0.varHandle(MemoryLayout.PathElement.groupElement("row_drop_possible"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_tree_drag_dest_get_type",
        constants$3.const$5
    );
}


