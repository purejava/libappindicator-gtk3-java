// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1240 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1240() {}
    static final FunctionDescriptor atk_table_get_row_description$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_table_get_row_description$MH = RuntimeHelper.downcallHandle(
        "atk_table_get_row_description",
        constants$1240.atk_table_get_row_description$FUNC
    );
    static final FunctionDescriptor atk_table_get_row_header$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_table_get_row_header$MH = RuntimeHelper.downcallHandle(
        "atk_table_get_row_header",
        constants$1240.atk_table_get_row_header$FUNC
    );
    static final FunctionDescriptor atk_table_get_summary$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_get_summary$MH = RuntimeHelper.downcallHandle(
        "atk_table_get_summary",
        constants$1240.atk_table_get_summary$FUNC
    );
    static final FunctionDescriptor atk_table_set_caption$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_set_caption$MH = RuntimeHelper.downcallHandle(
        "atk_table_set_caption",
        constants$1240.atk_table_set_caption$FUNC
    );
    static final FunctionDescriptor atk_table_set_column_description$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_set_column_description$MH = RuntimeHelper.downcallHandle(
        "atk_table_set_column_description",
        constants$1240.atk_table_set_column_description$FUNC
    );
    static final FunctionDescriptor atk_table_set_column_header$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_set_column_header$MH = RuntimeHelper.downcallHandle(
        "atk_table_set_column_header",
        constants$1240.atk_table_set_column_header$FUNC
    );
}

