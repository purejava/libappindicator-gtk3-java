// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$57 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$57() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandleVariadic(
        "g_set_error",
        constants$57.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_set_error_literal",
        constants$57.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_propagate_error",
        constants$13.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_clear_error",
        constants$13.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandleVariadic(
        "g_prefix_error",
        constants$13.const$4
    );
}


