// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1764 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1764() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gdk_drag_begin",
        constants$5.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gdk_drag_begin_for_device",
        constants$23.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gdk_drag_begin_from_point",
        constants$666.const$4
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gdk_drag_find_window_for_screen",
        constants$1764.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "gdk_drag_motion",
        constants$1764.const$5
    );
}


