// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$468 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$468() {}
    static final FunctionDescriptor g_value_get_variant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_get_variant$MH = RuntimeHelper.downcallHandle(
        "g_value_get_variant",
        constants$468.g_value_get_variant$FUNC
    );
    static final FunctionDescriptor g_value_dup_variant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_dup_variant$MH = RuntimeHelper.downcallHandle(
        "g_value_dup_variant",
        constants$468.g_value_dup_variant$FUNC
    );
    static final FunctionDescriptor g_pointer_type_register_static$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pointer_type_register_static$MH = RuntimeHelper.downcallHandle(
        "g_pointer_type_register_static",
        constants$468.g_pointer_type_register_static$FUNC
    );
    static final FunctionDescriptor g_strdup_value_contents$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strdup_value_contents$MH = RuntimeHelper.downcallHandle(
        "g_strdup_value_contents",
        constants$468.g_strdup_value_contents$FUNC
    );
    static final FunctionDescriptor g_value_take_string$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_take_string$MH = RuntimeHelper.downcallHandle(
        "g_value_take_string",
        constants$468.g_value_take_string$FUNC
    );
    static final FunctionDescriptor g_value_set_string_take_ownership$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_set_string_take_ownership$MH = RuntimeHelper.downcallHandle(
        "g_value_set_string_take_ownership",
        constants$468.g_value_set_string_take_ownership$FUNC
    );
}

