// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1966 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1966() {}
    static final FunctionDescriptor gtk_widget_modify_cursor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_modify_cursor$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_modify_cursor",
        constants$1966.gtk_widget_modify_cursor$FUNC
    );
    static final FunctionDescriptor gtk_widget_modify_font$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_modify_font$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_modify_font",
        constants$1966.gtk_widget_modify_font$FUNC
    );
    static final FunctionDescriptor gtk_widget_reset_rc_styles$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_reset_rc_styles$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_reset_rc_styles",
        constants$1966.gtk_widget_reset_rc_styles$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_default_style$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_widget_get_default_style$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_default_style",
        constants$1966.gtk_widget_get_default_style$FUNC
    );
    static final FunctionDescriptor gtk_widget_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_path$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_path",
        constants$1966.gtk_widget_path$FUNC
    );
    static final FunctionDescriptor gtk_widget_class_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_class_path$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_class_path",
        constants$1966.gtk_widget_class_path$FUNC
    );
}

