// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;
final class constants$330 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$330() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_key_file_has_key",
        constants$34.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_key_file_get_value",
        constants$39.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_key_file_set_value",
        constants$42.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_key_file_get_string",
        constants$39.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_key_file_set_string",
        constants$42.const$1
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "g_key_file_get_locale_string",
        constants$330.const$5
    );
}

