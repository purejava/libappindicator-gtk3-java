// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$252 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$252() {}
    static final FunctionDescriptor g_variant_builder_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_clear$MH = RuntimeHelper.downcallHandle(
        "g_variant_builder_clear",
        constants$252.g_variant_builder_clear$FUNC
    );
    static final FunctionDescriptor g_variant_builder_open$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_open$MH = RuntimeHelper.downcallHandle(
        "g_variant_builder_open",
        constants$252.g_variant_builder_open$FUNC
    );
    static final FunctionDescriptor g_variant_builder_close$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_close$MH = RuntimeHelper.downcallHandle(
        "g_variant_builder_close",
        constants$252.g_variant_builder_close$FUNC
    );
    static final FunctionDescriptor g_variant_builder_add_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_add_value$MH = RuntimeHelper.downcallHandle(
        "g_variant_builder_add_value",
        constants$252.g_variant_builder_add_value$FUNC
    );
    static final FunctionDescriptor g_variant_builder_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_add$MH = RuntimeHelper.downcallHandleVariadic(
        "g_variant_builder_add",
        constants$252.g_variant_builder_add$FUNC
    );
    static final FunctionDescriptor g_variant_builder_add_parsed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_add_parsed$MH = RuntimeHelper.downcallHandleVariadic(
        "g_variant_builder_add_parsed",
        constants$252.g_variant_builder_add_parsed$FUNC
    );
}

