// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$207 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$207() {}
    static final FunctionDescriptor g_string_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_equal$MH = RuntimeHelper.downcallHandle(
        "g_string_equal",
        constants$207.g_string_equal$FUNC
    );
    static final FunctionDescriptor g_string_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_hash$MH = RuntimeHelper.downcallHandle(
        "g_string_hash",
        constants$207.g_string_hash$FUNC
    );
    static final FunctionDescriptor g_string_assign$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_assign$MH = RuntimeHelper.downcallHandle(
        "g_string_assign",
        constants$207.g_string_assign$FUNC
    );
    static final FunctionDescriptor g_string_truncate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_truncate$MH = RuntimeHelper.downcallHandle(
        "g_string_truncate",
        constants$207.g_string_truncate$FUNC
    );
    static final FunctionDescriptor g_string_set_size$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_set_size$MH = RuntimeHelper.downcallHandle(
        "g_string_set_size",
        constants$207.g_string_set_size$FUNC
    );
    static final FunctionDescriptor g_string_insert_len$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_insert_len$MH = RuntimeHelper.downcallHandle(
        "g_string_insert_len",
        constants$207.g_string_insert_len$FUNC
    );
}

