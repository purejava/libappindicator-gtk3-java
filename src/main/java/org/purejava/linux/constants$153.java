// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$153 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$153() {}
    static final FunctionDescriptor g_hmac_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hmac_unref$MH = RuntimeHelper.downcallHandle(
        "g_hmac_unref",
        constants$153.g_hmac_unref$FUNC
    );
    static final FunctionDescriptor g_hmac_update$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_hmac_update$MH = RuntimeHelper.downcallHandle(
        "g_hmac_update",
        constants$153.g_hmac_update$FUNC
    );
    static final FunctionDescriptor g_hmac_get_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hmac_get_string$MH = RuntimeHelper.downcallHandle(
        "g_hmac_get_string",
        constants$153.g_hmac_get_string$FUNC
    );
    static final FunctionDescriptor g_hmac_get_digest$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hmac_get_digest$MH = RuntimeHelper.downcallHandle(
        "g_hmac_get_digest",
        constants$153.g_hmac_get_digest$FUNC
    );
    static final FunctionDescriptor g_compute_hmac_for_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_compute_hmac_for_data$MH = RuntimeHelper.downcallHandle(
        "g_compute_hmac_for_data",
        constants$153.g_compute_hmac_for_data$FUNC
    );
    static final FunctionDescriptor g_compute_hmac_for_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_compute_hmac_for_string$MH = RuntimeHelper.downcallHandle(
        "g_compute_hmac_for_string",
        constants$153.g_compute_hmac_for_string$FUNC
    );
}

