// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$327 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$327() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_key_file_ref",
        constants$5.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_key_file_unref",
        constants$13.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_key_file_free",
        constants$13.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_key_file_set_list_separator",
        constants$188.const$5
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_key_file_load_from_file",
        constants$327.const$4
    );
}


