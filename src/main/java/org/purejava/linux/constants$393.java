// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$393 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$393() {}
    static final FunctionDescriptor g_type_check_class_is_a$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_check_class_is_a$MH = RuntimeHelper.downcallHandle(
        "g_type_check_class_is_a",
        constants$393.g_type_check_class_is_a$FUNC
    );
    static final FunctionDescriptor g_type_check_is_value_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_check_is_value_type$MH = RuntimeHelper.downcallHandle(
        "g_type_check_is_value_type",
        constants$393.g_type_check_is_value_type$FUNC
    );
    static final FunctionDescriptor g_type_check_value$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_check_value$MH = RuntimeHelper.downcallHandle(
        "g_type_check_value",
        constants$393.g_type_check_value$FUNC
    );
    static final FunctionDescriptor g_type_check_value_holds$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_check_value_holds$MH = RuntimeHelper.downcallHandle(
        "g_type_check_value_holds",
        constants$393.g_type_check_value_holds$FUNC
    );
    static final FunctionDescriptor g_type_test_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_type_test_flags$MH = RuntimeHelper.downcallHandle(
        "g_type_test_flags",
        constants$393.g_type_test_flags$FUNC
    );
    static final FunctionDescriptor g_type_name_from_instance$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_name_from_instance$MH = RuntimeHelper.downcallHandle(
        "g_type_name_from_instance",
        constants$393.g_type_name_from_instance$FUNC
    );
}

