// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1() {}
    static final FunctionDescriptor gtk_widget_destroyed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_destroyed$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_destroyed",
        constants$1.gtk_widget_destroyed$FUNC
    );
    static final FunctionDescriptor gtk_widget_show$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_show$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_show",
        constants$1.gtk_widget_show$FUNC
    );
    static final FunctionDescriptor gtk_widget_show_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_show_all$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_show_all",
        constants$1.gtk_widget_show_all$FUNC
    );
    static final FunctionDescriptor gtk_widget_grab_focus$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_grab_focus$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_grab_focus",
        constants$1.gtk_widget_grab_focus$FUNC
    );
    static final FunctionDescriptor gtk_container_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_container_add$MH = RuntimeHelper.downcallHandle(
        "gtk_container_add",
        constants$1.gtk_container_add$FUNC
    );
    static final FunctionDescriptor gtk_window_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_new$MH = RuntimeHelper.downcallHandle(
        "gtk_window_new",
        constants$1.gtk_window_new$FUNC
    );
}

