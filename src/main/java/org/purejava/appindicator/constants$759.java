// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$759 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$759() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_async_initable_newv_async$callback.class, "apply", constants$14.const$3);
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_async_initable_newv_async",
        constants$759.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_async_initable_new_valist_async$callback.class, "apply", constants$14.const$3);
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        JAVA_LONG,
        RuntimeHelper.POINTER,
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("__stack"),
            RuntimeHelper.POINTER.withName("__gr_top"),
            RuntimeHelper.POINTER.withName("__vr_top"),
            JAVA_INT.withName("__gr_offs"),
            JAVA_INT.withName("__vr_offs")
        ).withName("__va_list"),
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_async_initable_new_valist_async",
        constants$759.const$4
    );
}


