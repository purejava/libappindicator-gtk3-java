// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$711 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$711() {}
    static final FunctionDescriptor g_mount_operation_get_choice$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_operation_get_choice$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_get_choice",
        constants$711.g_mount_operation_get_choice$FUNC
    );
    static final FunctionDescriptor g_mount_operation_set_choice$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_mount_operation_set_choice$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_set_choice",
        constants$711.g_mount_operation_set_choice$FUNC
    );
    static final FunctionDescriptor g_mount_operation_reply$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_mount_operation_reply$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_reply",
        constants$711.g_mount_operation_reply$FUNC
    );
    static final FunctionDescriptor g_mount_operation_get_is_tcrypt_hidden_volume$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_operation_get_is_tcrypt_hidden_volume$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_get_is_tcrypt_hidden_volume",
        constants$711.g_mount_operation_get_is_tcrypt_hidden_volume$FUNC
    );
    static final FunctionDescriptor g_mount_operation_set_is_tcrypt_hidden_volume$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_mount_operation_set_is_tcrypt_hidden_volume$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_set_is_tcrypt_hidden_volume",
        constants$711.g_mount_operation_set_is_tcrypt_hidden_volume$FUNC
    );
    static final FunctionDescriptor g_mount_operation_get_is_tcrypt_system_volume$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_operation_get_is_tcrypt_system_volume$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_get_is_tcrypt_system_volume",
        constants$711.g_mount_operation_get_is_tcrypt_system_volume$FUNC
    );
}

