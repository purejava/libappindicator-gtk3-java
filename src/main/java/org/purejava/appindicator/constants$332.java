// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$332 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$332() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_key_file_get_integer",
        constants$34.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_key_file_set_integer",
        constants$331.const$4
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_key_file_get_int64",
        constants$332.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_key_file_set_int64",
        constants$162.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_key_file_get_uint64",
        constants$332.const$2
    );
}


