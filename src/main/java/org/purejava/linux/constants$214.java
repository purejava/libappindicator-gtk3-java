// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$214 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$214() {}
    static final FunctionDescriptor g_io_add_watch$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_add_watch$MH = RuntimeHelper.downcallHandle(
        "g_io_add_watch",
        constants$214.g_io_add_watch$FUNC
    );
    static final FunctionDescriptor g_io_channel_set_buffer_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_io_channel_set_buffer_size$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_set_buffer_size",
        constants$214.g_io_channel_set_buffer_size$FUNC
    );
    static final FunctionDescriptor g_io_channel_get_buffer_size$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_get_buffer_size$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_get_buffer_size",
        constants$214.g_io_channel_get_buffer_size$FUNC
    );
    static final FunctionDescriptor g_io_channel_get_buffer_condition$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_get_buffer_condition$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_get_buffer_condition",
        constants$214.g_io_channel_get_buffer_condition$FUNC
    );
    static final FunctionDescriptor g_io_channel_set_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_set_flags$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_set_flags",
        constants$214.g_io_channel_set_flags$FUNC
    );
    static final FunctionDescriptor g_io_channel_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_get_flags$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_get_flags",
        constants$214.g_io_channel_get_flags$FUNC
    );
}

