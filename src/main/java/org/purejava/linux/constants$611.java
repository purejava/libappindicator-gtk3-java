// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$611 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$611() {}
    static final FunctionDescriptor g_icon_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_icon_hash$MH = RuntimeHelper.downcallHandle(
        "g_icon_hash",
        constants$611.g_icon_hash$FUNC
    );
    static final FunctionDescriptor g_icon_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_icon_equal$MH = RuntimeHelper.downcallHandle(
        "g_icon_equal",
        constants$611.g_icon_equal$FUNC
    );
    static final FunctionDescriptor g_icon_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_icon_to_string$MH = RuntimeHelper.downcallHandle(
        "g_icon_to_string",
        constants$611.g_icon_to_string$FUNC
    );
    static final FunctionDescriptor g_icon_new_for_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_icon_new_for_string$MH = RuntimeHelper.downcallHandle(
        "g_icon_new_for_string",
        constants$611.g_icon_new_for_string$FUNC
    );
    static final FunctionDescriptor g_icon_serialize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_icon_serialize$MH = RuntimeHelper.downcallHandle(
        "g_icon_serialize",
        constants$611.g_icon_serialize$FUNC
    );
    static final FunctionDescriptor g_icon_deserialize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_icon_deserialize$MH = RuntimeHelper.downcallHandle(
        "g_icon_deserialize",
        constants$611.g_icon_deserialize$FUNC
    );
}

