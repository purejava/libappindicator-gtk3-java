// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_SHORT;
final class constants$1301 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1301() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_socket_client_connect_async",
        constants$332.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_socket_client_connect_finish",
        constants$23.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(g_socket_client_connect_to_host_async$callback.class, "apply", constants$14.const$3);
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_SHORT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_socket_client_connect_to_host_async",
        constants$1301.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_socket_client_connect_to_host_finish",
        constants$23.const$0
    );
}


