// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$864 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$864() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_call_finish",
        constants$23.const$0
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_call_sync",
        constants$864.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_dbus_connection_call_with_unix_fd_list$callback.class, "apply", constants$14.const$3);
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
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
        "g_dbus_connection_call_with_unix_fd_list",
        constants$864.const$4
    );
}


