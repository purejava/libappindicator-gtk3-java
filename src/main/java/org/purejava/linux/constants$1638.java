// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1638 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1638() {}
    static final FunctionDescriptor gtk_style_context_get_color$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_get_color$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_get_color",
        constants$1638.gtk_style_context_get_color$FUNC
    );
    static final FunctionDescriptor gtk_style_context_get_background_color$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_get_background_color$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_get_background_color",
        constants$1638.gtk_style_context_get_background_color$FUNC
    );
    static final FunctionDescriptor gtk_style_context_get_border_color$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_get_border_color$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_get_border_color",
        constants$1638.gtk_style_context_get_border_color$FUNC
    );
    static final FunctionDescriptor gtk_style_context_get_font$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_style_context_get_font$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_get_font",
        constants$1638.gtk_style_context_get_font$FUNC
    );
    static final FunctionDescriptor gtk_style_context_get_border$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_get_border$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_get_border",
        constants$1638.gtk_style_context_get_border$FUNC
    );
    static final FunctionDescriptor gtk_style_context_get_padding$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_get_padding$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_get_padding",
        constants$1638.gtk_style_context_get_padding$FUNC
    );
}

