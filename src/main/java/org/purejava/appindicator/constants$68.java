// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
final class constants$68 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$68() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_FLOAT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "strtof",
        constants$68.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "strtol",
        constants$68.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "strtoul",
        constants$68.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "strtoq",
        constants$68.const$2
    );
}


