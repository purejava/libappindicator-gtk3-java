// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$95 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$95() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "llabs",
        constants$94.const$4
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(MemoryLayout.structLayout(
        JAVA_INT.withName("quot"),
        JAVA_INT.withName("rem")
    ).withName("div_t"),
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "div",
        constants$95.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(MemoryLayout.structLayout(
        JAVA_LONG.withName("quot"),
        JAVA_LONG.withName("rem")
    ).withName("ldiv_t"),
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "ldiv",
        constants$95.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(MemoryLayout.structLayout(
        JAVA_LONG.withName("quot"),
        JAVA_LONG.withName("rem")
    ).withName("lldiv_t"),
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "lldiv",
        constants$95.const$5
    );
}


