// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$868 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$868() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_unregister_subtree",
        constants$11.const$4
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(GDBusSignalCallback.class, "apply", constants$868.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$868.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(g_dbus_connection_signal_subscribe$callback.class, "apply", constants$868.const$1);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(g_dbus_connection_signal_subscribe$user_data_free_func.class, "apply", constants$13.const$1);
}


