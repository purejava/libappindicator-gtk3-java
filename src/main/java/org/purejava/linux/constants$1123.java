// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1123 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1123() {}
    static final FunctionDescriptor gdk_screen_set_font_options$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_screen_set_font_options$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_set_font_options",
        constants$1123.gdk_screen_set_font_options$FUNC
    );
    static final FunctionDescriptor gdk_screen_get_font_options$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_screen_get_font_options$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_get_font_options",
        constants$1123.gdk_screen_get_font_options$FUNC
    );
    static final FunctionDescriptor gdk_screen_set_resolution$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gdk_screen_set_resolution$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_set_resolution",
        constants$1123.gdk_screen_set_resolution$FUNC
    );
    static final FunctionDescriptor gdk_screen_get_resolution$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_screen_get_resolution$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_get_resolution",
        constants$1123.gdk_screen_get_resolution$FUNC
    );
    static final FunctionDescriptor gdk_screen_get_active_window$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_screen_get_active_window$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_get_active_window",
        constants$1123.gdk_screen_get_active_window$FUNC
    );
    static final FunctionDescriptor gdk_screen_get_window_stack$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_screen_get_window_stack$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_get_window_stack",
        constants$1123.gdk_screen_get_window_stack$FUNC
    );
}

