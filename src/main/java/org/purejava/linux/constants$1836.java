// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1836 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1836() {}
    static final FunctionDescriptor gtk_text_buffer_begin_user_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_begin_user_action$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_begin_user_action",
        constants$1836.gtk_text_buffer_begin_user_action$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_end_user_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_end_user_action$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_end_user_action",
        constants$1836.gtk_text_buffer_end_user_action$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_get_copy_target_list$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_get_copy_target_list$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_copy_target_list",
        constants$1836.gtk_text_buffer_get_copy_target_list$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_get_paste_target_list$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_get_paste_target_list$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_paste_target_list",
        constants$1836.gtk_text_buffer_get_paste_target_list$FUNC
    );
    static final FunctionDescriptor GtkTextBufferSerializeFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkTextBufferSerializeFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTextBufferSerializeFunc_UP$MH = RuntimeHelper.upcallHandle(GtkTextBufferSerializeFunc.class, "apply", constants$1836.GtkTextBufferSerializeFunc_UP$FUNC);
    static final FunctionDescriptor GtkTextBufferSerializeFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTextBufferSerializeFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1836.GtkTextBufferSerializeFunc_DOWN$FUNC
    );
}

