// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$406 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$406() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_random_set_seed",
        constants$80.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_random_int",
        constants$83.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_random_int_range",
        constants$123.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_random_double",
        constants$83.const$5
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_DOUBLE,
        JAVA_DOUBLE,
        JAVA_DOUBLE
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_random_double_range",
        constants$406.const$4
    );
}

