// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1280 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1280() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_socket_new",
        constants$1280.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_socket_new_from_fd",
        constants$24.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_socket_get_fd",
        constants$10.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_socket_get_family",
        constants$10.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_socket_get_socket_type",
        constants$10.const$5
    );
}


