// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1684 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1684() {}
    static final FunctionDescriptor gtk_get_locale_direction$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gtk_get_locale_direction$MH = RuntimeHelper.downcallHandle(
        "gtk_get_locale_direction",
        constants$1684.gtk_get_locale_direction$FUNC
    );
    static final FunctionDescriptor gtk_events_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gtk_events_pending$MH = RuntimeHelper.downcallHandle(
        "gtk_events_pending",
        constants$1684.gtk_events_pending$FUNC
    );
    static final FunctionDescriptor gtk_main_do_event$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_main_do_event$MH = RuntimeHelper.downcallHandle(
        "gtk_main_do_event",
        constants$1684.gtk_main_do_event$FUNC
    );
    static final FunctionDescriptor gtk_main$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gtk_main$MH = RuntimeHelper.downcallHandle(
        "gtk_main",
        constants$1684.gtk_main$FUNC
    );
    static final FunctionDescriptor gtk_main_level$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gtk_main_level$MH = RuntimeHelper.downcallHandle(
        "gtk_main_level",
        constants$1684.gtk_main_level$FUNC
    );
    static final FunctionDescriptor gtk_main_quit$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gtk_main_quit$MH = RuntimeHelper.downcallHandle(
        "gtk_main_quit",
        constants$1684.gtk_main_quit$FUNC
    );
}

