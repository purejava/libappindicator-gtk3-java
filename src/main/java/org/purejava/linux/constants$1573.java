// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1573 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1573() {}
    static final FunctionDescriptor gtk_file_chooser_unselect_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_unselect_all$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_unselect_all",
        constants$1573.gtk_file_chooser_unselect_all$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_get_filenames$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_get_filenames$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_get_filenames",
        constants$1573.gtk_file_chooser_get_filenames$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_set_current_folder$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_set_current_folder$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_set_current_folder",
        constants$1573.gtk_file_chooser_set_current_folder$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_get_current_folder$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_get_current_folder$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_get_current_folder",
        constants$1573.gtk_file_chooser_get_current_folder$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_get_uri$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_get_uri$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_get_uri",
        constants$1573.gtk_file_chooser_get_uri$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_set_uri$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_set_uri$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_set_uri",
        constants$1573.gtk_file_chooser_set_uri$FUNC
    );
}

