// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;
final class constants$295 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$295() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_BYTE,
        JAVA_BYTE
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_ascii_tolower",
        constants$295.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_ascii_toupper",
        constants$295.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_ascii_digit_value",
        constants$184.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_ascii_xdigit_value",
        constants$184.const$4
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_BYTE
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "g_strdelimit",
        constants$295.const$5
    );
}


