// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1960 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1960() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_accel_group_activate",
        constants$1960.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "_gtk_accel_group_attach",
        constants$13.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "_gtk_accel_group_detach",
        constants$13.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_accel_groups_activate",
        constants$49.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_accel_groups_from_object",
        constants$5.const$2
    );
}


