// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$118 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$118() {}
    static final FunctionDescriptor g_date_subtract_months$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_date_subtract_months$MH = RuntimeHelper.downcallHandle(
        "g_date_subtract_months",
        constants$118.g_date_subtract_months$FUNC
    );
    static final FunctionDescriptor g_date_add_years$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_date_add_years$MH = RuntimeHelper.downcallHandle(
        "g_date_add_years",
        constants$118.g_date_add_years$FUNC
    );
    static final FunctionDescriptor g_date_subtract_years$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_date_subtract_years$MH = RuntimeHelper.downcallHandle(
        "g_date_subtract_years",
        constants$118.g_date_subtract_years$FUNC
    );
    static final FunctionDescriptor g_date_is_leap_year$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle g_date_is_leap_year$MH = RuntimeHelper.downcallHandle(
        "g_date_is_leap_year",
        constants$118.g_date_is_leap_year$FUNC
    );
    static final FunctionDescriptor g_date_get_days_in_month$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle g_date_get_days_in_month$MH = RuntimeHelper.downcallHandle(
        "g_date_get_days_in_month",
        constants$118.g_date_get_days_in_month$FUNC
    );
    static final FunctionDescriptor g_date_get_monday_weeks_in_year$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle g_date_get_monday_weeks_in_year$MH = RuntimeHelper.downcallHandle(
        "g_date_get_monday_weeks_in_year",
        constants$118.g_date_get_monday_weeks_in_year$FUNC
    );
}

