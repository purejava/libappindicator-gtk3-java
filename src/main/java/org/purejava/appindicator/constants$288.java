// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$288 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$288() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_unichar_validate",
        constants$8.const$4
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_unichar_compose",
        constants$288.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_unichar_decompose",
        constants$10.const$3
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_unichar_fully_decompose",
        constants$288.const$4
    );
}


