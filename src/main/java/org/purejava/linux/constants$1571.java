// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1571 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1571() {}
    static final FunctionDescriptor gtk_file_chooser_get_show_hidden$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_get_show_hidden$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_get_show_hidden",
        constants$1571.gtk_file_chooser_get_show_hidden$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_set_do_overwrite_confirmation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_set_do_overwrite_confirmation$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_set_do_overwrite_confirmation",
        constants$1571.gtk_file_chooser_set_do_overwrite_confirmation$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_get_do_overwrite_confirmation$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_get_do_overwrite_confirmation$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_get_do_overwrite_confirmation",
        constants$1571.gtk_file_chooser_get_do_overwrite_confirmation$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_set_create_folders$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_set_create_folders$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_set_create_folders",
        constants$1571.gtk_file_chooser_set_create_folders$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_get_create_folders$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_get_create_folders$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_get_create_folders",
        constants$1571.gtk_file_chooser_get_create_folders$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_set_current_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_set_current_name$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_set_current_name",
        constants$1571.gtk_file_chooser_set_current_name$FUNC
    );
}

