// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$979 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$979() {}
    static final FunctionDescriptor fflush$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fflush$MH = RuntimeHelper.downcallHandle(
        "fflush",
        constants$979.fflush$FUNC
    );
    static final FunctionDescriptor fflush_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fflush_unlocked$MH = RuntimeHelper.downcallHandle(
        "fflush_unlocked",
        constants$979.fflush_unlocked$FUNC
    );
    static final FunctionDescriptor fopen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fopen$MH = RuntimeHelper.downcallHandle(
        "fopen",
        constants$979.fopen$FUNC
    );
    static final FunctionDescriptor freopen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle freopen$MH = RuntimeHelper.downcallHandle(
        "freopen",
        constants$979.freopen$FUNC
    );
    static final FunctionDescriptor fdopen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fdopen$MH = RuntimeHelper.downcallHandle(
        "fdopen",
        constants$979.fdopen$FUNC
    );
    static final FunctionDescriptor fmemopen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fmemopen$MH = RuntimeHelper.downcallHandle(
        "fmemopen",
        constants$979.fmemopen$FUNC
    );
}

