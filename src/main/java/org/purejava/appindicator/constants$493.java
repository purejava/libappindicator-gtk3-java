// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$493 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$493() {}
    static final FunctionDescriptor g_application_unbind_busy_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_unbind_busy_property$MH = RuntimeHelper.downcallHandle(
        "g_application_unbind_busy_property",
        constants$493.g_application_unbind_busy_property$FUNC
    );
    static final FunctionDescriptor g_application_command_line_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_application_command_line_get_type$MH = RuntimeHelper.downcallHandle(
        "g_application_command_line_get_type",
        constants$493.g_application_command_line_get_type$FUNC
    );
    static final FunctionDescriptor g_application_command_line_get_arguments$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_command_line_get_arguments$MH = RuntimeHelper.downcallHandle(
        "g_application_command_line_get_arguments",
        constants$493.g_application_command_line_get_arguments$FUNC
    );
    static final FunctionDescriptor g_application_command_line_get_options_dict$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_command_line_get_options_dict$MH = RuntimeHelper.downcallHandle(
        "g_application_command_line_get_options_dict",
        constants$493.g_application_command_line_get_options_dict$FUNC
    );
    static final FunctionDescriptor g_application_command_line_get_stdin$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_command_line_get_stdin$MH = RuntimeHelper.downcallHandle(
        "g_application_command_line_get_stdin",
        constants$493.g_application_command_line_get_stdin$FUNC
    );
    static final FunctionDescriptor g_application_command_line_get_environ$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_command_line_get_environ$MH = RuntimeHelper.downcallHandle(
        "g_application_command_line_get_environ",
        constants$493.g_application_command_line_get_environ$FUNC
    );
}

