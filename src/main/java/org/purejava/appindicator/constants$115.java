// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$115 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$115() {}
    static final FunctionDescriptor g_date_get_monday_week_of_year$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_get_monday_week_of_year$MH = RuntimeHelper.downcallHandle(
        "g_date_get_monday_week_of_year",
        constants$115.g_date_get_monday_week_of_year$FUNC
    );
    static final FunctionDescriptor g_date_get_sunday_week_of_year$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_get_sunday_week_of_year$MH = RuntimeHelper.downcallHandle(
        "g_date_get_sunday_week_of_year",
        constants$115.g_date_get_sunday_week_of_year$FUNC
    );
    static final FunctionDescriptor g_date_get_iso8601_week_of_year$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_get_iso8601_week_of_year$MH = RuntimeHelper.downcallHandle(
        "g_date_get_iso8601_week_of_year",
        constants$115.g_date_get_iso8601_week_of_year$FUNC
    );
    static final FunctionDescriptor g_date_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_date_clear$MH = RuntimeHelper.downcallHandle(
        "g_date_clear",
        constants$115.g_date_clear$FUNC
    );
    static final FunctionDescriptor g_date_set_parse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_set_parse$MH = RuntimeHelper.downcallHandle(
        "g_date_set_parse",
        constants$115.g_date_set_parse$FUNC
    );
    static final FunctionDescriptor g_date_set_time_t$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_date_set_time_t$MH = RuntimeHelper.downcallHandle(
        "g_date_set_time_t",
        constants$115.g_date_set_time_t$FUNC
    );
}

