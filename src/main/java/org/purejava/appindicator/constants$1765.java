// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1765 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1765() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gdk_device_grab",
        constants$1765.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gdk_device_ungrab",
        constants$40.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gdk_device_warp",
        constants$1046.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gdk_device_grab_info_libgtk_only",
        constants$34.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gdk_device_get_last_event_window",
        constants$5.const$2
    );
}


