// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1922 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1922() {}
    static final FunctionDescriptor _gtk_action_group_emit_disconnect_proxy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _gtk_action_group_emit_disconnect_proxy$MH = RuntimeHelper.downcallHandle(
        "_gtk_action_group_emit_disconnect_proxy",
        constants$1922._gtk_action_group_emit_disconnect_proxy$FUNC
    );
    static final FunctionDescriptor _gtk_action_group_emit_pre_activate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _gtk_action_group_emit_pre_activate$MH = RuntimeHelper.downcallHandle(
        "_gtk_action_group_emit_pre_activate",
        constants$1922._gtk_action_group_emit_pre_activate$FUNC
    );
    static final FunctionDescriptor _gtk_action_group_emit_post_activate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _gtk_action_group_emit_post_activate$MH = RuntimeHelper.downcallHandle(
        "_gtk_action_group_emit_post_activate",
        constants$1922._gtk_action_group_emit_post_activate$FUNC
    );
    static final FunctionDescriptor gtk_alignment_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_alignment_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_alignment_get_type",
        constants$1922.gtk_alignment_get_type$FUNC
    );
    static final FunctionDescriptor gtk_alignment_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle gtk_alignment_new$MH = RuntimeHelper.downcallHandle(
        "gtk_alignment_new",
        constants$1922.gtk_alignment_new$FUNC
    );
    static final FunctionDescriptor gtk_alignment_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle gtk_alignment_set$MH = RuntimeHelper.downcallHandle(
        "gtk_alignment_set",
        constants$1922.gtk_alignment_set$FUNC
    );
}

