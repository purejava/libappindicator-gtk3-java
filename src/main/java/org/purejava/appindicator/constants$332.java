// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$332 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$332() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_key_file_get_locale_for_key",
        constants$39.const$1
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_key_file_set_locale_string",
        constants$332.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_key_file_get_boolean",
        constants$34.const$5
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_key_file_set_boolean",
        constants$332.const$4
    );
}


