// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1009 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1009() {}
    static final FunctionDescriptor cairo_font_options_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_options_destroy$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_destroy",
        constants$1009.cairo_font_options_destroy$FUNC
    );
    static final FunctionDescriptor cairo_font_options_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_options_status$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_status",
        constants$1009.cairo_font_options_status$FUNC
    );
    static final FunctionDescriptor cairo_font_options_merge$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_options_merge$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_merge",
        constants$1009.cairo_font_options_merge$FUNC
    );
    static final FunctionDescriptor cairo_font_options_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_options_equal$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_equal",
        constants$1009.cairo_font_options_equal$FUNC
    );
    static final FunctionDescriptor cairo_font_options_hash$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_options_hash$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_hash",
        constants$1009.cairo_font_options_hash$FUNC
    );
    static final FunctionDescriptor cairo_font_options_set_antialias$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_font_options_set_antialias$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_set_antialias",
        constants$1009.cairo_font_options_set_antialias$FUNC
    );
}

