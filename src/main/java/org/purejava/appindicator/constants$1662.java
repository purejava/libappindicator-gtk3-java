// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1662 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1662() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandleVariadic(
        "printf",
        constants$10.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandleVariadic(
        "sprintf",
        constants$9.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("__stack"),
            RuntimeHelper.POINTER.withName("__gr_top"),
            RuntimeHelper.POINTER.withName("__vr_top"),
            JAVA_INT.withName("__gr_offs"),
            JAVA_INT.withName("__vr_offs")
        ).withName("__va_list")
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "vfprintf",
        constants$1662.const$2
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("__stack"),
            RuntimeHelper.POINTER.withName("__gr_top"),
            RuntimeHelper.POINTER.withName("__vr_top"),
            JAVA_INT.withName("__gr_offs"),
            JAVA_INT.withName("__vr_offs")
        ).withName("__va_list")
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "vprintf",
        constants$1662.const$4
    );
}


