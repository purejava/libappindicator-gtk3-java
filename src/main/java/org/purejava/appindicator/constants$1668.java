// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1668 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1668() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "vsprintf",
        constants$1667.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandleVariadic(
        "snprintf",
        constants$62.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vsnprintf",
        constants$62.const$4
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("__stack"),
            RuntimeHelper.POINTER.withName("__gr_top"),
            RuntimeHelper.POINTER.withName("__vr_top"),
            JAVA_INT.withName("__gr_offs"),
            JAVA_INT.withName("__vr_offs")
        ).withName("__va_list")
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vdprintf",
        constants$1668.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandleVariadic(
        "dprintf",
        constants$9.const$2
    );
}


