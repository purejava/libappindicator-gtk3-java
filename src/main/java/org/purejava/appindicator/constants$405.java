// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
final class constants$405 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$405() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_rand_set_seed",
        constants$40.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_rand_set_seed_array",
        constants$164.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_rand_int",
        constants$10.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_rand_int_range",
        constants$49.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_rand_double",
        constants$67.const$0
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_DOUBLE,
        RuntimeHelper.POINTER,
        JAVA_DOUBLE,
        JAVA_DOUBLE
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "g_rand_double_range",
        constants$405.const$5
    );
}


