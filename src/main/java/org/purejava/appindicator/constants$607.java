// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$607 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$607() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_signal_is_valid_name",
        constants$10.const$5
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_signal_parse_name",
        constants$607.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_signal_get_invocation_hint",
        constants$5.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_signal_stop_emission",
        constants$467.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_signal_stop_emission_by_name",
        constants$13.const$4
    );
}


