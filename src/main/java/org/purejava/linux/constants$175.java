// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$175 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$175() {}
    static final FunctionDescriptor g_source_attach$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_attach$MH = RuntimeHelper.downcallHandle(
        "g_source_attach",
        constants$175.g_source_attach$FUNC
    );
    static final FunctionDescriptor g_source_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_destroy$MH = RuntimeHelper.downcallHandle(
        "g_source_destroy",
        constants$175.g_source_destroy$FUNC
    );
    static final FunctionDescriptor g_source_set_priority$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_source_set_priority$MH = RuntimeHelper.downcallHandle(
        "g_source_set_priority",
        constants$175.g_source_set_priority$FUNC
    );
    static final FunctionDescriptor g_source_get_priority$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_get_priority$MH = RuntimeHelper.downcallHandle(
        "g_source_get_priority",
        constants$175.g_source_get_priority$FUNC
    );
    static final FunctionDescriptor g_source_set_can_recurse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_source_set_can_recurse$MH = RuntimeHelper.downcallHandle(
        "g_source_set_can_recurse",
        constants$175.g_source_set_can_recurse$FUNC
    );
    static final FunctionDescriptor g_source_get_can_recurse$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_get_can_recurse$MH = RuntimeHelper.downcallHandle(
        "g_source_get_can_recurse",
        constants$175.g_source_get_can_recurse$FUNC
    );
}

