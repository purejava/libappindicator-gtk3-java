// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$89 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$89() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "posix_memalign",
        constants$89.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "aligned_alloc",
        constants$87.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "abort",
        constants$7.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(atexit$__func.class, "apply", constants$7.const$5);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "atexit",
        constants$10.const$5
    );
}


