// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$755 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$755() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_async_initable_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(g_async_initable_init_async$callback.class, "apply", constants$14.const$3);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_async_initable_init_async",
        constants$281.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_async_initable_init_finish",
        constants$12.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(g_async_initable_new_async$callback.class, "apply", constants$14.const$3);
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandleVariadic(
        "g_async_initable_new_async",
        constants$755.const$5
    );
}


