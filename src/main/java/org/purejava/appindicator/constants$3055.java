// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$3055 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3055() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_scale_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_scale_new",
        constants$24.const$4
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_DOUBLE,
        JAVA_DOUBLE,
        JAVA_DOUBLE
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_scale_new_with_range",
        constants$3055.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_scale_set_digits",
        constants$40.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_scale_get_digits",
        constants$10.const$5
    );
}


