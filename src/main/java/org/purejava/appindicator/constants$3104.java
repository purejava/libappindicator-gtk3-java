// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$3104 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3104() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_spin_button_configure",
        constants$2959.const$5
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_DOUBLE,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_spin_button_new",
        constants$3104.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_spin_button_new_with_range",
        constants$1746.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_spin_button_set_adjustment",
        constants$13.const$4
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_spin_button_get_adjustment",
        constants$5.const$2
    );
}


