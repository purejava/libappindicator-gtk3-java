// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1193 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1193() {}
    static final FunctionDescriptor gtk_accelerator_parse_with_keycode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_accelerator_parse_with_keycode$MH = RuntimeHelper.downcallHandle(
        "gtk_accelerator_parse_with_keycode",
        constants$1193.gtk_accelerator_parse_with_keycode$FUNC
    );
    static final FunctionDescriptor gtk_accelerator_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_accelerator_name$MH = RuntimeHelper.downcallHandle(
        "gtk_accelerator_name",
        constants$1193.gtk_accelerator_name$FUNC
    );
    static final FunctionDescriptor gtk_accelerator_name_with_keycode$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_accelerator_name_with_keycode$MH = RuntimeHelper.downcallHandle(
        "gtk_accelerator_name_with_keycode",
        constants$1193.gtk_accelerator_name_with_keycode$FUNC
    );
    static final FunctionDescriptor gtk_accelerator_get_label$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_accelerator_get_label$MH = RuntimeHelper.downcallHandle(
        "gtk_accelerator_get_label",
        constants$1193.gtk_accelerator_get_label$FUNC
    );
    static final FunctionDescriptor gtk_accelerator_get_label_with_keycode$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_accelerator_get_label_with_keycode$MH = RuntimeHelper.downcallHandle(
        "gtk_accelerator_get_label_with_keycode",
        constants$1193.gtk_accelerator_get_label_with_keycode$FUNC
    );
    static final FunctionDescriptor gtk_accelerator_set_default_mod_mask$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_accelerator_set_default_mod_mask$MH = RuntimeHelper.downcallHandle(
        "gtk_accelerator_set_default_mod_mask",
        constants$1193.gtk_accelerator_set_default_mod_mask$FUNC
    );
}

