// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$192 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$192() {}
    static final FunctionDescriptor g_utf8_strlen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_strlen$MH = RuntimeHelper.downcallHandle(
        "g_utf8_strlen",
        constants$192.g_utf8_strlen$FUNC
    );
    static final FunctionDescriptor g_utf8_substring$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_substring$MH = RuntimeHelper.downcallHandle(
        "g_utf8_substring",
        constants$192.g_utf8_substring$FUNC
    );
    static final FunctionDescriptor g_utf8_strncpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_strncpy$MH = RuntimeHelper.downcallHandle(
        "g_utf8_strncpy",
        constants$192.g_utf8_strncpy$FUNC
    );
    static final FunctionDescriptor g_utf8_strchr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_utf8_strchr$MH = RuntimeHelper.downcallHandle(
        "g_utf8_strchr",
        constants$192.g_utf8_strchr$FUNC
    );
    static final FunctionDescriptor g_utf8_strrchr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_utf8_strrchr$MH = RuntimeHelper.downcallHandle(
        "g_utf8_strrchr",
        constants$192.g_utf8_strrchr$FUNC
    );
    static final FunctionDescriptor g_utf8_strreverse$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_strreverse$MH = RuntimeHelper.downcallHandle(
        "g_utf8_strreverse",
        constants$192.g_utf8_strreverse$FUNC
    );
}

