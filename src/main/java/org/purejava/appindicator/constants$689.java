// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
final class constants$689 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$689() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_value_get_uint64",
        constants$4.const$0
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_FLOAT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_value_set_float",
        constants$689.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_FLOAT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_value_get_float",
        constants$689.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_DOUBLE
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "g_value_set_double",
        constants$689.const$5
    );
}


