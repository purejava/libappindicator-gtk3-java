// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1916 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1916() {}
    static final FunctionDescriptor gtk_activatable_set_use_action_appearance$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_activatable_set_use_action_appearance$MH = RuntimeHelper.downcallHandle(
        "gtk_activatable_set_use_action_appearance",
        constants$1916.gtk_activatable_set_use_action_appearance$FUNC
    );
    static final FunctionDescriptor gtk_activatable_get_use_action_appearance$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_activatable_get_use_action_appearance$MH = RuntimeHelper.downcallHandle(
        "gtk_activatable_get_use_action_appearance",
        constants$1916.gtk_activatable_get_use_action_appearance$FUNC
    );
    static final FunctionDescriptor gtk_activatable_do_set_related_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_activatable_do_set_related_action$MH = RuntimeHelper.downcallHandle(
        "gtk_activatable_do_set_related_action",
        constants$1916.gtk_activatable_do_set_related_action$FUNC
    );
    static final FunctionDescriptor GtkTranslateFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkTranslateFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTranslateFunc_UP$MH = RuntimeHelper.upcallHandle(GtkTranslateFunc.class, "apply", constants$1916.GtkTranslateFunc_UP$FUNC);
    static final FunctionDescriptor GtkTranslateFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTranslateFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1916.GtkTranslateFunc_DOWN$FUNC
    );
    static final FunctionDescriptor gtk_stock_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_stock_add$MH = RuntimeHelper.downcallHandle(
        "gtk_stock_add",
        constants$1916.gtk_stock_add$FUNC
    );
}

