// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$923 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$923() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_client_new_for_bus_sync",
        constants$923.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_client_get_connection",
        constants$5.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_client_get_flags",
        constants$10.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_client_get_name",
        constants$5.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_client_get_name_owner",
        constants$5.const$2
    );
}


