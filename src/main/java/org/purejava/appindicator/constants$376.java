// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$376 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$376() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(GLogWriterFunc.class, "apply", constants$82.const$4);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$82.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandleVariadic(
        "g_log_structured",
        constants$40.const$2
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_log_structured_array",
        constants$376.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_log_variant",
        constants$42.const$4
    );
}


