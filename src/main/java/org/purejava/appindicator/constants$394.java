// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$394 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$394() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_pattern_spec_new",
        constants$5.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_pattern_spec_free",
        constants$13.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_pattern_spec_copy",
        constants$5.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_pattern_spec_equal",
        constants$9.const$0
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_pattern_spec_match",
        constants$394.const$4
    );
}


