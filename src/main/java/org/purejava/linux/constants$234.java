// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$234 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$234() {}
    static final FunctionDescriptor g_variant_type_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_hash$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_hash",
        constants$234.g_variant_type_hash$FUNC
    );
    static final FunctionDescriptor g_variant_type_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_equal$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_equal",
        constants$234.g_variant_type_equal$FUNC
    );
    static final FunctionDescriptor g_variant_type_is_subtype_of$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_is_subtype_of$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_is_subtype_of",
        constants$234.g_variant_type_is_subtype_of$FUNC
    );
    static final FunctionDescriptor g_variant_type_element$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_element$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_element",
        constants$234.g_variant_type_element$FUNC
    );
    static final FunctionDescriptor g_variant_type_first$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_first$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_first",
        constants$234.g_variant_type_first$FUNC
    );
    static final FunctionDescriptor g_variant_type_next$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_next$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_next",
        constants$234.g_variant_type_next$FUNC
    );
}

