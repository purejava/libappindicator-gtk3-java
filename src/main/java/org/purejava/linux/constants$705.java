// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$705 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$705() {}
    static final FunctionDescriptor g_mount_get_icon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_get_icon$MH = RuntimeHelper.downcallHandle(
        "g_mount_get_icon",
        constants$705.g_mount_get_icon$FUNC
    );
    static final FunctionDescriptor g_mount_get_symbolic_icon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_get_symbolic_icon$MH = RuntimeHelper.downcallHandle(
        "g_mount_get_symbolic_icon",
        constants$705.g_mount_get_symbolic_icon$FUNC
    );
    static final FunctionDescriptor g_mount_get_uuid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_get_uuid$MH = RuntimeHelper.downcallHandle(
        "g_mount_get_uuid",
        constants$705.g_mount_get_uuid$FUNC
    );
    static final FunctionDescriptor g_mount_get_volume$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_get_volume$MH = RuntimeHelper.downcallHandle(
        "g_mount_get_volume",
        constants$705.g_mount_get_volume$FUNC
    );
    static final FunctionDescriptor g_mount_get_drive$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_get_drive$MH = RuntimeHelper.downcallHandle(
        "g_mount_get_drive",
        constants$705.g_mount_get_drive$FUNC
    );
    static final FunctionDescriptor g_mount_can_unmount$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_can_unmount$MH = RuntimeHelper.downcallHandle(
        "g_mount_can_unmount",
        constants$705.g_mount_can_unmount$FUNC
    );
}

