// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$2091 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2091() {}
    static final VarHandle const$0 = constants$2089.const$4.varHandle(MemoryLayout.PathElement.groupElement("get_row_span"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_AtkTableCellIface.get_row_header_cells.class, "apply", constants$5.const$2);
    static final VarHandle const$2 = constants$2089.const$4.varHandle(MemoryLayout.PathElement.groupElement("get_row_header_cells"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_AtkTableCellIface.get_row_column_span.class, "apply", constants$165.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$165.const$2
    );
    static final VarHandle const$5 = constants$2089.const$4.varHandle(MemoryLayout.PathElement.groupElement("get_row_column_span"));
}


