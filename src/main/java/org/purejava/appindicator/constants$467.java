// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$467 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$467() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_thread_pool_new_full$item_free_func.class, "apply", constants$13.const$1);
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_thread_pool_new_full",
        constants$467.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_thread_pool_free",
        constants$467.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_thread_pool_push",
        constants$12.const$2
    );
}


