// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$373 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$373() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_log_set_handler_full$log_func.class, "apply", constants$179.const$1);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(g_log_set_handler_full$destroy.class, "apply", constants$13.const$1);
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_log_set_handler_full",
        constants$373.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_log_remove_handler",
        constants$40.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_log_default_handler",
        constants$179.const$1
    );
}


