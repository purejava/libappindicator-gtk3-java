// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$3366 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3366() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_paint_spinner",
        constants$3356.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_style_get_style_property",
        constants$679.const$5
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_LONG,
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
        "gtk_style_get_valist",
        constants$3366.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandleVariadic(
        "gtk_style_get",
        constants$359.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "_gtk_style_new_for_path",
        constants$5.const$5
    );
}

