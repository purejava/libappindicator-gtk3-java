// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$862 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$862() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_flush_sync",
        constants$12.const$2
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_send_message",
        constants$862.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_dbus_connection_send_message_with_reply$callback.class, "apply", constants$14.const$3);
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_send_message_with_reply",
        constants$862.const$4
    );
}


