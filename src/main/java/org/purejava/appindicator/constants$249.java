// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$249 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$249() {}
    static final FunctionDescriptor g_variant_byteswap$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_byteswap$MH = RuntimeHelper.downcallHandle(
        "g_variant_byteswap",
        constants$249.g_variant_byteswap$FUNC
    );
    static final FunctionDescriptor g_variant_new_from_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_variant_new_from_bytes$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_from_bytes",
        constants$249.g_variant_new_from_bytes$FUNC
    );
    static final FunctionDescriptor g_variant_new_from_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new_from_data$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_from_data",
        constants$249.g_variant_new_from_data$FUNC
    );
    static final FunctionDescriptor g_variant_iter_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_new$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_new",
        constants$249.g_variant_iter_new$FUNC
    );
    static final FunctionDescriptor g_variant_iter_init$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_init$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_init",
        constants$249.g_variant_iter_init$FUNC
    );
    static final FunctionDescriptor g_variant_iter_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_copy$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_copy",
        constants$249.g_variant_iter_copy$FUNC
    );
}

