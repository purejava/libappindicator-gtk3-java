// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$304 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$304() {}
    static final FunctionDescriptor g_sequence_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_get$MH = RuntimeHelper.downcallHandle(
        "g_sequence_get",
        constants$304.g_sequence_get$FUNC
    );
    static final FunctionDescriptor g_sequence_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_set$MH = RuntimeHelper.downcallHandle(
        "g_sequence_set",
        constants$304.g_sequence_set$FUNC
    );
    static final FunctionDescriptor g_sequence_iter_is_begin$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_iter_is_begin$MH = RuntimeHelper.downcallHandle(
        "g_sequence_iter_is_begin",
        constants$304.g_sequence_iter_is_begin$FUNC
    );
    static final FunctionDescriptor g_sequence_iter_is_end$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_iter_is_end$MH = RuntimeHelper.downcallHandle(
        "g_sequence_iter_is_end",
        constants$304.g_sequence_iter_is_end$FUNC
    );
    static final FunctionDescriptor g_sequence_iter_next$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_iter_next$MH = RuntimeHelper.downcallHandle(
        "g_sequence_iter_next",
        constants$304.g_sequence_iter_next$FUNC
    );
    static final FunctionDescriptor g_sequence_iter_prev$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_iter_prev$MH = RuntimeHelper.downcallHandle(
        "g_sequence_iter_prev",
        constants$304.g_sequence_iter_prev$FUNC
    );
}

