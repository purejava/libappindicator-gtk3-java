// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$81 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$81() {}
    static final FunctionDescriptor g_pointer_bit_lock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_pointer_bit_lock$MH = RuntimeHelper.downcallHandle(
        "g_pointer_bit_lock",
        constants$81.g_pointer_bit_lock$FUNC
    );
    static final FunctionDescriptor g_pointer_bit_trylock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_pointer_bit_trylock$MH = RuntimeHelper.downcallHandle(
        "g_pointer_bit_trylock",
        constants$81.g_pointer_bit_trylock$FUNC
    );
    static final FunctionDescriptor g_pointer_bit_unlock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_pointer_bit_unlock$MH = RuntimeHelper.downcallHandle(
        "g_pointer_bit_unlock",
        constants$81.g_pointer_bit_unlock$FUNC
    );
    static final FunctionDescriptor g_time_zone_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_time_zone_new$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_new",
        constants$81.g_time_zone_new$FUNC
    );
    static final FunctionDescriptor g_time_zone_new_identifier$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_time_zone_new_identifier$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_new_identifier",
        constants$81.g_time_zone_new_identifier$FUNC
    );
    static final FunctionDescriptor g_time_zone_new_utc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_time_zone_new_utc$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_new_utc",
        constants$81.g_time_zone_new_utc$FUNC
    );
}

