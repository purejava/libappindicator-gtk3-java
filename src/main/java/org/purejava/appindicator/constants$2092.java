// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$2092 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2092() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_AtkTableCellIface.get_table.class, "apply", constants$5.const$2);
    static final VarHandle const$1 = constants$2089.const$4.varHandle(MemoryLayout.PathElement.groupElement("get_table"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "atk_table_cell_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "atk_table_cell_get_column_span",
        constants$10.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "atk_table_cell_get_column_header_cells",
        constants$5.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "atk_table_cell_get_position",
        constants$12.const$2
    );
}


