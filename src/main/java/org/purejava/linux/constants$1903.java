// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1903 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1903() {}
    static final FunctionDescriptor gtk_widget_path_iter_get_state$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_path_iter_get_state$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_path_iter_get_state",
        constants$1903.gtk_widget_path_iter_get_state$FUNC
    );
    static final FunctionDescriptor gtk_widget_path_iter_set_state$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_path_iter_set_state$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_path_iter_set_state",
        constants$1903.gtk_widget_path_iter_set_state$FUNC
    );
    static final FunctionDescriptor gtk_widget_path_iter_add_class$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_path_iter_add_class$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_path_iter_add_class",
        constants$1903.gtk_widget_path_iter_add_class$FUNC
    );
    static final FunctionDescriptor gtk_widget_path_iter_remove_class$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_path_iter_remove_class$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_path_iter_remove_class",
        constants$1903.gtk_widget_path_iter_remove_class$FUNC
    );
    static final FunctionDescriptor gtk_widget_path_iter_clear_classes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_path_iter_clear_classes$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_path_iter_clear_classes",
        constants$1903.gtk_widget_path_iter_clear_classes$FUNC
    );
    static final FunctionDescriptor gtk_widget_path_iter_list_classes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_path_iter_list_classes$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_path_iter_list_classes",
        constants$1903.gtk_widget_path_iter_list_classes$FUNC
    );
}

