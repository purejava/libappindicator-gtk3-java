// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1544 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1544() {}
    static final FunctionDescriptor gtk_clipboard_wait_is_text_available$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_clipboard_wait_is_text_available$MH = RuntimeHelper.downcallHandle(
        "gtk_clipboard_wait_is_text_available",
        constants$1544.gtk_clipboard_wait_is_text_available$FUNC
    );
    static final FunctionDescriptor gtk_clipboard_wait_is_rich_text_available$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_clipboard_wait_is_rich_text_available$MH = RuntimeHelper.downcallHandle(
        "gtk_clipboard_wait_is_rich_text_available",
        constants$1544.gtk_clipboard_wait_is_rich_text_available$FUNC
    );
    static final FunctionDescriptor gtk_clipboard_wait_is_image_available$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_clipboard_wait_is_image_available$MH = RuntimeHelper.downcallHandle(
        "gtk_clipboard_wait_is_image_available",
        constants$1544.gtk_clipboard_wait_is_image_available$FUNC
    );
    static final FunctionDescriptor gtk_clipboard_wait_is_uris_available$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_clipboard_wait_is_uris_available$MH = RuntimeHelper.downcallHandle(
        "gtk_clipboard_wait_is_uris_available",
        constants$1544.gtk_clipboard_wait_is_uris_available$FUNC
    );
    static final FunctionDescriptor gtk_clipboard_wait_is_target_available$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_clipboard_wait_is_target_available$MH = RuntimeHelper.downcallHandle(
        "gtk_clipboard_wait_is_target_available",
        constants$1544.gtk_clipboard_wait_is_target_available$FUNC
    );
    static final FunctionDescriptor gtk_clipboard_set_can_store$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_clipboard_set_can_store$MH = RuntimeHelper.downcallHandle(
        "gtk_clipboard_set_can_store",
        constants$1544.gtk_clipboard_set_can_store$FUNC
    );
}

