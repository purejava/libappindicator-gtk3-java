// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$31 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$31() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_array_new_take_zero_terminated",
        constants$18.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_array_steal",
        constants$5.const$5
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_array_sized_new",
        constants$31.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_array_copy",
        constants$5.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_array_free",
        constants$21.const$3
    );
}

