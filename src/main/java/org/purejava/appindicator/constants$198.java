// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$198 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$198() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_get_environ",
        constants$35.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_environ_getenv",
        constants$5.const$5
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_environ_setenv",
        constants$198.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_environ_unsetenv",
        constants$5.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_file_error_quark",
        constants$83.const$1
    );
}

