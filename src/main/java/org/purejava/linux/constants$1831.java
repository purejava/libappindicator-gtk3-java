// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1831 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1831() {}
    static final FunctionDescriptor gtk_text_buffer_delete_mark_by_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_delete_mark_by_name$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_delete_mark_by_name",
        constants$1831.gtk_text_buffer_delete_mark_by_name$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_get_insert$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_get_insert$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_insert",
        constants$1831.gtk_text_buffer_get_insert$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_get_selection_bound$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_get_selection_bound$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_selection_bound",
        constants$1831.gtk_text_buffer_get_selection_bound$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_place_cursor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_place_cursor$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_place_cursor",
        constants$1831.gtk_text_buffer_place_cursor$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_select_range$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_select_range$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_select_range",
        constants$1831.gtk_text_buffer_select_range$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_apply_tag$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_apply_tag$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_apply_tag",
        constants$1831.gtk_text_buffer_apply_tag$FUNC
    );
}

