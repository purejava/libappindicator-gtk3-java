// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$2288 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2288() {}
    static final VarHandle const$0 = constants$2287.const$3.varHandle(MemoryLayout.PathElement.groupElement("user_data2"));
    static final VarHandle const$1 = constants$2287.const$3.varHandle(MemoryLayout.PathElement.groupElement("user_data3"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("row_changed"),
        RuntimeHelper.POINTER.withName("row_inserted"),
        RuntimeHelper.POINTER.withName("row_has_child_toggled"),
        RuntimeHelper.POINTER.withName("row_deleted"),
        RuntimeHelper.POINTER.withName("rows_reordered"),
        RuntimeHelper.POINTER.withName("get_flags"),
        RuntimeHelper.POINTER.withName("get_n_columns"),
        RuntimeHelper.POINTER.withName("get_column_type"),
        RuntimeHelper.POINTER.withName("get_iter"),
        RuntimeHelper.POINTER.withName("get_path"),
        RuntimeHelper.POINTER.withName("get_value"),
        RuntimeHelper.POINTER.withName("iter_next"),
        RuntimeHelper.POINTER.withName("iter_previous"),
        RuntimeHelper.POINTER.withName("iter_children"),
        RuntimeHelper.POINTER.withName("iter_has_child"),
        RuntimeHelper.POINTER.withName("iter_n_children"),
        RuntimeHelper.POINTER.withName("iter_nth_child"),
        RuntimeHelper.POINTER.withName("iter_parent"),
        RuntimeHelper.POINTER.withName("ref_node"),
        RuntimeHelper.POINTER.withName("unref_node")
    ).withName("_GtkTreeModelIface");
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GtkTreeModelIface.row_changed.class, "apply", constants$14.const$3);
    static final VarHandle const$4 = constants$2288.const$2.varHandle(MemoryLayout.PathElement.groupElement("row_changed"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GtkTreeModelIface.row_inserted.class, "apply", constants$14.const$3);
}


