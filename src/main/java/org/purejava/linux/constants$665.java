// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$665 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$665() {}
    static final FunctionDescriptor g_inet_address_mask_get_family$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_mask_get_family$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_get_family",
        constants$665.g_inet_address_mask_get_family$FUNC
    );
    static final FunctionDescriptor g_inet_address_mask_get_address$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_mask_get_address$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_get_address",
        constants$665.g_inet_address_mask_get_address$FUNC
    );
    static final FunctionDescriptor g_inet_address_mask_get_length$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_mask_get_length$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_get_length",
        constants$665.g_inet_address_mask_get_length$FUNC
    );
    static final FunctionDescriptor g_inet_address_mask_matches$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_mask_matches$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_matches",
        constants$665.g_inet_address_mask_matches$FUNC
    );
    static final FunctionDescriptor g_inet_address_mask_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_mask_equal$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_equal",
        constants$665.g_inet_address_mask_equal$FUNC
    );
    static final FunctionDescriptor g_socket_address_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_socket_address_get_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_address_get_type",
        constants$665.g_socket_address_get_type$FUNC
    );
}

