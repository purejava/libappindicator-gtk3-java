// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1572 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1572() {}
    static final FunctionDescriptor gtk_file_chooser_get_current_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_get_current_name$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_get_current_name",
        constants$1572.gtk_file_chooser_get_current_name$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_get_filename$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_get_filename$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_get_filename",
        constants$1572.gtk_file_chooser_get_filename$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_set_filename$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_set_filename$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_set_filename",
        constants$1572.gtk_file_chooser_set_filename$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_select_filename$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_select_filename$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_select_filename",
        constants$1572.gtk_file_chooser_select_filename$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_unselect_filename$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_unselect_filename$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_unselect_filename",
        constants$1572.gtk_file_chooser_unselect_filename$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_select_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_select_all$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_select_all",
        constants$1572.gtk_file_chooser_select_all$FUNC
    );
}

