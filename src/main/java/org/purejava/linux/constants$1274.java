// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1274 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1274() {}
    static final FunctionDescriptor gtk_widget_set_margin_start$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_set_margin_start$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_margin_start",
        constants$1274.gtk_widget_set_margin_start$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_margin_end$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_margin_end$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_margin_end",
        constants$1274.gtk_widget_get_margin_end$FUNC
    );
    static final FunctionDescriptor gtk_widget_set_margin_end$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_set_margin_end$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_margin_end",
        constants$1274.gtk_widget_set_margin_end$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_margin_top$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_margin_top$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_margin_top",
        constants$1274.gtk_widget_get_margin_top$FUNC
    );
    static final FunctionDescriptor gtk_widget_set_margin_top$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_set_margin_top$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_margin_top",
        constants$1274.gtk_widget_set_margin_top$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_margin_bottom$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_margin_bottom$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_margin_bottom",
        constants$1274.gtk_widget_get_margin_bottom$FUNC
    );
}

