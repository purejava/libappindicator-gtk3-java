// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$681 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$681() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_type_module_unuse",
        constants$13.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_type_module_set_name",
        constants$13.const$4
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_type_module_register_type",
        constants$681.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_type_module_add_interface",
        constants$94.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_type_module_register_enum",
        constants$166.const$0
    );
}


