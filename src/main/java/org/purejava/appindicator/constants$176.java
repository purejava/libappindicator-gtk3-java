// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$176 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$176() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_convert_with_iconv",
        constants$176.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_convert_with_fallback",
        constants$176.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_locale_to_utf8",
        constants$36.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_locale_from_utf8",
        constants$36.const$5
    );
}


