// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$638 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$638() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_object_replace_data$old_destroy.class, "apply", constants$13.const$1);
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_object_replace_data",
        constants$638.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_object_watch_closure",
        constants$13.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(g_cclosure_new_object$callback_func.class, "apply", constants$7.const$5);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_cclosure_new_object",
        constants$5.const$5
    );
}


