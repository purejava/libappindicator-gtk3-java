// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$869 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$869() {}
    static final FunctionDescriptor hb_font_get_glyph_h_advance$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_h_advance$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_h_advance",
        constants$869.hb_font_get_glyph_h_advance$FUNC
    );
    static final FunctionDescriptor hb_font_get_glyph_v_advance$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_v_advance$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_v_advance",
        constants$869.hb_font_get_glyph_v_advance$FUNC
    );
    static final FunctionDescriptor hb_font_get_glyph_h_advances$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_h_advances$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_h_advances",
        constants$869.hb_font_get_glyph_h_advances$FUNC
    );
    static final FunctionDescriptor hb_font_get_glyph_v_advances$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_v_advances$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_v_advances",
        constants$869.hb_font_get_glyph_v_advances$FUNC
    );
    static final FunctionDescriptor hb_font_get_glyph_h_origin$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_h_origin$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_h_origin",
        constants$869.hb_font_get_glyph_h_origin$FUNC
    );
    static final FunctionDescriptor hb_font_get_glyph_v_origin$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_v_origin$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_v_origin",
        constants$869.hb_font_get_glyph_v_origin$FUNC
    );
}

