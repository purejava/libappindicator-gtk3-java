// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1089 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1089() {}
    static final FunctionDescriptor gdk_window_begin_draw_frame$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_begin_draw_frame$MH = RuntimeHelper.downcallHandle(
        "gdk_window_begin_draw_frame",
        constants$1089.gdk_window_begin_draw_frame$FUNC
    );
    static final FunctionDescriptor gdk_window_end_draw_frame$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_end_draw_frame$MH = RuntimeHelper.downcallHandle(
        "gdk_window_end_draw_frame",
        constants$1089.gdk_window_end_draw_frame$FUNC
    );
    static final FunctionDescriptor gdk_window_flush$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_flush$MH = RuntimeHelper.downcallHandle(
        "gdk_window_flush",
        constants$1089.gdk_window_flush$FUNC
    );
    static final FunctionDescriptor gdk_window_set_title$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_set_title$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_title",
        constants$1089.gdk_window_set_title$FUNC
    );
    static final FunctionDescriptor gdk_window_set_role$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_set_role$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_role",
        constants$1089.gdk_window_set_role$FUNC
    );
    static final FunctionDescriptor gdk_window_set_startup_id$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_set_startup_id$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_startup_id",
        constants$1089.gdk_window_set_startup_id$FUNC
    );
}

