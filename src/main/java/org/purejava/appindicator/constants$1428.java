// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1428 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1428() {}
    static final FunctionDescriptor gtk_editable_insert_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_insert_text$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_insert_text",
        constants$1428.gtk_editable_insert_text$FUNC
    );
    static final FunctionDescriptor gtk_editable_delete_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_editable_delete_text$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_delete_text",
        constants$1428.gtk_editable_delete_text$FUNC
    );
    static final FunctionDescriptor gtk_editable_get_chars$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_editable_get_chars$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_get_chars",
        constants$1428.gtk_editable_get_chars$FUNC
    );
    static final FunctionDescriptor gtk_editable_cut_clipboard$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_cut_clipboard$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_cut_clipboard",
        constants$1428.gtk_editable_cut_clipboard$FUNC
    );
    static final FunctionDescriptor gtk_editable_copy_clipboard$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_copy_clipboard$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_copy_clipboard",
        constants$1428.gtk_editable_copy_clipboard$FUNC
    );
    static final FunctionDescriptor gtk_editable_paste_clipboard$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_paste_clipboard$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_paste_clipboard",
        constants$1428.gtk_editable_paste_clipboard$FUNC
    );
}

