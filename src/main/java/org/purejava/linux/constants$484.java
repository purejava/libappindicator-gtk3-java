// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$484 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$484() {}
    static final FunctionDescriptor g_app_info_get_default_for_type_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_get_default_for_type_finish$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_default_for_type_finish",
        constants$484.g_app_info_get_default_for_type_finish$FUNC
    );
    static final FunctionDescriptor g_app_info_get_default_for_uri_scheme$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_get_default_for_uri_scheme$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_default_for_uri_scheme",
        constants$484.g_app_info_get_default_for_uri_scheme$FUNC
    );
    static final FunctionDescriptor g_app_info_get_default_for_uri_scheme_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_get_default_for_uri_scheme_async$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_default_for_uri_scheme_async",
        constants$484.g_app_info_get_default_for_uri_scheme_async$FUNC
    );
    static final FunctionDescriptor g_app_info_get_default_for_uri_scheme_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_get_default_for_uri_scheme_finish$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_default_for_uri_scheme_finish",
        constants$484.g_app_info_get_default_for_uri_scheme_finish$FUNC
    );
    static final FunctionDescriptor g_app_info_launch_default_for_uri$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_launch_default_for_uri$MH = RuntimeHelper.downcallHandle(
        "g_app_info_launch_default_for_uri",
        constants$484.g_app_info_launch_default_for_uri$FUNC
    );
    static final FunctionDescriptor g_app_info_launch_default_for_uri_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_launch_default_for_uri_async$MH = RuntimeHelper.downcallHandle(
        "g_app_info_launch_default_for_uri_async",
        constants$484.g_app_info_launch_default_for_uri_async$FUNC
    );
}

