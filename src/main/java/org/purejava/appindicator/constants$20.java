// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$20 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$20() {}
    static final FunctionDescriptor g_array_append_vals$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_append_vals$MH = RuntimeHelper.downcallHandle(
        "g_array_append_vals",
        constants$20.g_array_append_vals$FUNC
    );
    static final FunctionDescriptor g_array_prepend_vals$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_prepend_vals$MH = RuntimeHelper.downcallHandle(
        "g_array_prepend_vals",
        constants$20.g_array_prepend_vals$FUNC
    );
    static final FunctionDescriptor g_array_insert_vals$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_insert_vals$MH = RuntimeHelper.downcallHandle(
        "g_array_insert_vals",
        constants$20.g_array_insert_vals$FUNC
    );
    static final FunctionDescriptor g_array_set_size$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_set_size$MH = RuntimeHelper.downcallHandle(
        "g_array_set_size",
        constants$20.g_array_set_size$FUNC
    );
    static final FunctionDescriptor g_array_remove_index$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_remove_index$MH = RuntimeHelper.downcallHandle(
        "g_array_remove_index",
        constants$20.g_array_remove_index$FUNC
    );
    static final FunctionDescriptor g_array_remove_index_fast$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_remove_index_fast$MH = RuntimeHelper.downcallHandle(
        "g_array_remove_index_fast",
        constants$20.g_array_remove_index_fast$FUNC
    );
}

