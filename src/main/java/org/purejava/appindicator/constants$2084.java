// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$2084 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2084() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "atk_table_remove_row_selection",
        constants$11.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "atk_table_add_column_selection",
        constants$11.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "atk_table_remove_column_selection",
        constants$11.const$4
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("parent"),
        RuntimeHelper.POINTER.withName("get_column_span"),
        RuntimeHelper.POINTER.withName("get_column_header_cells"),
        RuntimeHelper.POINTER.withName("get_position"),
        RuntimeHelper.POINTER.withName("get_row_span"),
        RuntimeHelper.POINTER.withName("get_row_header_cells"),
        RuntimeHelper.POINTER.withName("get_row_column_span"),
        RuntimeHelper.POINTER.withName("get_table")
    ).withName("_AtkTableCellIface");
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_AtkTableCellIface.get_column_span.class, "apply", constants$10.const$5);
    static final VarHandle const$5 = constants$2084.const$3.varHandle(MemoryLayout.PathElement.groupElement("get_column_span"));
}

