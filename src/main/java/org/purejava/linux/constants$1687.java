// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1687 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1687() {}
    static final FunctionDescriptor gtk_get_current_event_time$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gtk_get_current_event_time$MH = RuntimeHelper.downcallHandle(
        "gtk_get_current_event_time",
        constants$1687.gtk_get_current_event_time$FUNC
    );
    static final FunctionDescriptor gtk_get_current_event_state$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_get_current_event_state$MH = RuntimeHelper.downcallHandle(
        "gtk_get_current_event_state",
        constants$1687.gtk_get_current_event_state$FUNC
    );
    static final FunctionDescriptor gtk_get_current_event_device$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_get_current_event_device$MH = RuntimeHelper.downcallHandle(
        "gtk_get_current_event_device",
        constants$1687.gtk_get_current_event_device$FUNC
    );
    static final FunctionDescriptor gtk_get_event_widget$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_get_event_widget$MH = RuntimeHelper.downcallHandle(
        "gtk_get_event_widget",
        constants$1687.gtk_get_event_widget$FUNC
    );
    static final FunctionDescriptor gtk_propagate_event$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_propagate_event$MH = RuntimeHelper.downcallHandle(
        "gtk_propagate_event",
        constants$1687.gtk_propagate_event$FUNC
    );
    static final FunctionDescriptor gtk_menu_bar_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_menu_bar_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_bar_get_type",
        constants$1687.gtk_menu_bar_get_type$FUNC
    );
}

