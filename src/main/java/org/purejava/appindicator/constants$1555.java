// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1555 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1555() {}
    static final FunctionDescriptor gtk_get_debug_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gtk_get_debug_flags$MH = RuntimeHelper.downcallHandle(
        "gtk_get_debug_flags",
        constants$1555.gtk_get_debug_flags$FUNC
    );
    static final FunctionDescriptor gtk_set_debug_flags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_set_debug_flags$MH = RuntimeHelper.downcallHandle(
        "gtk_set_debug_flags",
        constants$1555.gtk_set_debug_flags$FUNC
    );
    static final FunctionDescriptor gtk_drag_dest_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_set$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_set",
        constants$1555.gtk_drag_dest_set$FUNC
    );
    static final FunctionDescriptor gtk_drag_dest_set_proxy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_set_proxy$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_set_proxy",
        constants$1555.gtk_drag_dest_set_proxy$FUNC
    );
    static final FunctionDescriptor gtk_drag_dest_unset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_unset$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_unset",
        constants$1555.gtk_drag_dest_unset$FUNC
    );
    static final FunctionDescriptor gtk_drag_dest_find_target$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_find_target$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_find_target",
        constants$1555.gtk_drag_dest_find_target$FUNC
    );
}

