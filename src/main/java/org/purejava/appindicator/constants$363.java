// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$363 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$363() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_variant_is_normal_form",
        constants$10.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_variant_byteswap",
        constants$5.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_variant_new_from_bytes",
        constants$32.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_variant_new_from_data$notify.class, "apply", constants$13.const$1);
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_variant_new_from_data",
        constants$363.const$4
    );
}


