// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
final class constants$857 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$857() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_get_last_serial",
        constants$10.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_get_exit_on_close",
        constants$10.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_set_exit_on_close",
        constants$40.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_get_capabilities",
        constants$10.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_get_flags",
        constants$10.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(g_dbus_connection_close$callback.class, "apply", constants$14.const$3);
}

