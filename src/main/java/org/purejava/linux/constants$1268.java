// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1268 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1268() {}
    static final FunctionDescriptor gtk_widget_get_toplevel$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_toplevel$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_toplevel",
        constants$1268.gtk_widget_get_toplevel$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_ancestor$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gtk_widget_get_ancestor$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_ancestor",
        constants$1268.gtk_widget_get_ancestor$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_visual$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_visual$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_visual",
        constants$1268.gtk_widget_get_visual$FUNC
    );
    static final FunctionDescriptor gtk_widget_set_visual$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_set_visual$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_visual",
        constants$1268.gtk_widget_set_visual$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_screen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_screen$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_screen",
        constants$1268.gtk_widget_get_screen$FUNC
    );
    static final FunctionDescriptor gtk_widget_has_screen$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_has_screen$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_has_screen",
        constants$1268.gtk_widget_has_screen$FUNC
    );
}

