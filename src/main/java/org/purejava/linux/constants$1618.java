// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1618 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1618() {}
    static final FunctionDescriptor gtk_header_bar_get_show_close_button$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_header_bar_get_show_close_button$MH = RuntimeHelper.downcallHandle(
        "gtk_header_bar_get_show_close_button",
        constants$1618.gtk_header_bar_get_show_close_button$FUNC
    );
    static final FunctionDescriptor gtk_header_bar_set_show_close_button$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_header_bar_set_show_close_button$MH = RuntimeHelper.downcallHandle(
        "gtk_header_bar_set_show_close_button",
        constants$1618.gtk_header_bar_set_show_close_button$FUNC
    );
    static final FunctionDescriptor gtk_header_bar_set_has_subtitle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_header_bar_set_has_subtitle$MH = RuntimeHelper.downcallHandle(
        "gtk_header_bar_set_has_subtitle",
        constants$1618.gtk_header_bar_set_has_subtitle$FUNC
    );
    static final FunctionDescriptor gtk_header_bar_get_has_subtitle$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_header_bar_get_has_subtitle$MH = RuntimeHelper.downcallHandle(
        "gtk_header_bar_get_has_subtitle",
        constants$1618.gtk_header_bar_get_has_subtitle$FUNC
    );
    static final FunctionDescriptor gtk_header_bar_set_decoration_layout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_header_bar_set_decoration_layout$MH = RuntimeHelper.downcallHandle(
        "gtk_header_bar_set_decoration_layout",
        constants$1618.gtk_header_bar_set_decoration_layout$FUNC
    );
    static final FunctionDescriptor gtk_header_bar_get_decoration_layout$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_header_bar_get_decoration_layout$MH = RuntimeHelper.downcallHandle(
        "gtk_header_bar_get_decoration_layout",
        constants$1618.gtk_header_bar_get_decoration_layout$FUNC
    );
}

