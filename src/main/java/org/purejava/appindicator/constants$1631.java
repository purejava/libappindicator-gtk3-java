// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1631 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1631() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "pango_layout_get_caret_pos",
        constants$179.const$1
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "pango_layout_move_cursor_visually",
        constants$1631.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "pango_layout_xy_to_index",
        constants$956.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "pango_layout_get_extents",
        constants$14.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "pango_layout_get_pixel_extents",
        constants$14.const$3
    );
}


