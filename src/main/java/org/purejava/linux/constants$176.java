// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$176 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$176() {}
    static final FunctionDescriptor g_source_get_id$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_get_id$MH = RuntimeHelper.downcallHandle(
        "g_source_get_id",
        constants$176.g_source_get_id$FUNC
    );
    static final FunctionDescriptor g_source_get_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_get_context$MH = RuntimeHelper.downcallHandle(
        "g_source_get_context",
        constants$176.g_source_get_context$FUNC
    );
    static final FunctionDescriptor g_source_set_callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_set_callback$MH = RuntimeHelper.downcallHandle(
        "g_source_set_callback",
        constants$176.g_source_set_callback$FUNC
    );
    static final FunctionDescriptor g_source_set_funcs$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_set_funcs$MH = RuntimeHelper.downcallHandle(
        "g_source_set_funcs",
        constants$176.g_source_set_funcs$FUNC
    );
    static final FunctionDescriptor g_source_is_destroyed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_is_destroyed$MH = RuntimeHelper.downcallHandle(
        "g_source_is_destroyed",
        constants$176.g_source_is_destroyed$FUNC
    );
    static final FunctionDescriptor g_source_set_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_set_name$MH = RuntimeHelper.downcallHandle(
        "g_source_set_name",
        constants$176.g_source_set_name$FUNC
    );
}

