// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$305 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$305() {}
    static final FunctionDescriptor g_sequence_iter_get_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_iter_get_position$MH = RuntimeHelper.downcallHandle(
        "g_sequence_iter_get_position",
        constants$305.g_sequence_iter_get_position$FUNC
    );
    static final FunctionDescriptor g_sequence_iter_move$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_sequence_iter_move$MH = RuntimeHelper.downcallHandle(
        "g_sequence_iter_move",
        constants$305.g_sequence_iter_move$FUNC
    );
    static final FunctionDescriptor g_sequence_iter_get_sequence$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_iter_get_sequence$MH = RuntimeHelper.downcallHandle(
        "g_sequence_iter_get_sequence",
        constants$305.g_sequence_iter_get_sequence$FUNC
    );
    static final FunctionDescriptor g_sequence_iter_compare$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_iter_compare$MH = RuntimeHelper.downcallHandle(
        "g_sequence_iter_compare",
        constants$305.g_sequence_iter_compare$FUNC
    );
    static final FunctionDescriptor g_sequence_range_get_midpoint$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_range_get_midpoint$MH = RuntimeHelper.downcallHandle(
        "g_sequence_range_get_midpoint",
        constants$305.g_sequence_range_get_midpoint$FUNC
    );
    static final FunctionDescriptor g_shell_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_shell_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_shell_error_quark",
        constants$305.g_shell_error_quark$FUNC
    );
}

