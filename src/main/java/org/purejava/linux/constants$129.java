// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$129 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$129() {}
    static final FunctionDescriptor g_canonicalize_filename$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_canonicalize_filename$MH = RuntimeHelper.downcallHandle(
        "g_canonicalize_filename",
        constants$129.g_canonicalize_filename$FUNC
    );
    static final FunctionDescriptor g_strip_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strip_context$MH = RuntimeHelper.downcallHandle(
        "g_strip_context",
        constants$129.g_strip_context$FUNC
    );
    static final FunctionDescriptor g_dgettext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dgettext$MH = RuntimeHelper.downcallHandle(
        "g_dgettext",
        constants$129.g_dgettext$FUNC
    );
    static final FunctionDescriptor g_dcgettext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dcgettext$MH = RuntimeHelper.downcallHandle(
        "g_dcgettext",
        constants$129.g_dcgettext$FUNC
    );
    static final FunctionDescriptor g_dngettext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_dngettext$MH = RuntimeHelper.downcallHandle(
        "g_dngettext",
        constants$129.g_dngettext$FUNC
    );
    static final FunctionDescriptor g_dpgettext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_dpgettext$MH = RuntimeHelper.downcallHandle(
        "g_dpgettext",
        constants$129.g_dpgettext$FUNC
    );
}

