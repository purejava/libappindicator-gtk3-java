// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$254 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$254() {}
    static final FunctionDescriptor g_variant_new_parsed$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new_parsed$MH = RuntimeHelper.downcallHandleVariadic(
        "g_variant_new_parsed",
        constants$254.g_variant_new_parsed$FUNC
    );
    static final FunctionDescriptor g_variant_new_parsed_va$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new_parsed_va$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_parsed_va",
        constants$254.g_variant_new_parsed_va$FUNC
    );
    static final FunctionDescriptor g_variant_parse_error_print_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_parse_error_print_context$MH = RuntimeHelper.downcallHandle(
        "g_variant_parse_error_print_context",
        constants$254.g_variant_parse_error_print_context$FUNC
    );
    static final FunctionDescriptor g_variant_compare$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_compare$MH = RuntimeHelper.downcallHandle(
        "g_variant_compare",
        constants$254.g_variant_compare$FUNC
    );
    static final FunctionDescriptor g_variant_dict_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dict_new$MH = RuntimeHelper.downcallHandle(
        "g_variant_dict_new",
        constants$254.g_variant_dict_new$FUNC
    );
    static final FunctionDescriptor g_variant_dict_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dict_init$MH = RuntimeHelper.downcallHandle(
        "g_variant_dict_init",
        constants$254.g_variant_dict_init$FUNC
    );
}

