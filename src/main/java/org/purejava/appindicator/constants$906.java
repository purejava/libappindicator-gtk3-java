// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$906 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$906() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_bus_own_name_on_connection",
        constants$906.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_bus_own_name_with_closures",
        constants$906.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_bus_own_name_on_connection_with_closures",
        constants$859.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_bus_unown_name",
        constants$80.const$1
    );
}


