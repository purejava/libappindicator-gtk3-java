// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$488 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$488() {}
    static final FunctionDescriptor g_application_get_inactivity_timeout$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_get_inactivity_timeout$MH = RuntimeHelper.downcallHandle(
        "g_application_get_inactivity_timeout",
        constants$488.g_application_get_inactivity_timeout$FUNC
    );
    static final FunctionDescriptor g_application_set_inactivity_timeout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_application_set_inactivity_timeout$MH = RuntimeHelper.downcallHandle(
        "g_application_set_inactivity_timeout",
        constants$488.g_application_set_inactivity_timeout$FUNC
    );
    static final FunctionDescriptor g_application_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_get_flags$MH = RuntimeHelper.downcallHandle(
        "g_application_get_flags",
        constants$488.g_application_get_flags$FUNC
    );
    static final FunctionDescriptor g_application_set_flags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_application_set_flags$MH = RuntimeHelper.downcallHandle(
        "g_application_set_flags",
        constants$488.g_application_set_flags$FUNC
    );
    static final FunctionDescriptor g_application_get_resource_base_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_get_resource_base_path$MH = RuntimeHelper.downcallHandle(
        "g_application_get_resource_base_path",
        constants$488.g_application_get_resource_base_path$FUNC
    );
    static final FunctionDescriptor g_application_set_resource_base_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_set_resource_base_path$MH = RuntimeHelper.downcallHandle(
        "g_application_set_resource_base_path",
        constants$488.g_application_set_resource_base_path$FUNC
    );
}

