// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$578 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$578() {}
    static final FunctionDescriptor g_dbus_message_to_blob$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_to_blob$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_to_blob",
        constants$578.g_dbus_message_to_blob$FUNC
    );
    static final FunctionDescriptor g_dbus_message_to_gerror$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_to_gerror$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_to_gerror",
        constants$578.g_dbus_message_to_gerror$FUNC
    );
    static final FunctionDescriptor g_dbus_method_invocation_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dbus_method_invocation_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_get_type",
        constants$578.g_dbus_method_invocation_get_type$FUNC
    );
    static final FunctionDescriptor g_dbus_method_invocation_get_sender$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_get_sender$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_get_sender",
        constants$578.g_dbus_method_invocation_get_sender$FUNC
    );
    static final FunctionDescriptor g_dbus_method_invocation_get_object_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_get_object_path$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_get_object_path",
        constants$578.g_dbus_method_invocation_get_object_path$FUNC
    );
    static final FunctionDescriptor g_dbus_method_invocation_get_interface_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_get_interface_name$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_get_interface_name",
        constants$578.g_dbus_method_invocation_get_interface_name$FUNC
    );
}

