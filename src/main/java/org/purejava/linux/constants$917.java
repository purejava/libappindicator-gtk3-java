// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$917 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$917() {}
    static final FunctionDescriptor pango_font_get_glyph_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_get_glyph_extents$MH = RuntimeHelper.downcallHandle(
        "pango_font_get_glyph_extents",
        constants$917.pango_font_get_glyph_extents$FUNC
    );
    static final FunctionDescriptor pango_font_get_font_map$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_get_font_map$MH = RuntimeHelper.downcallHandle(
        "pango_font_get_font_map",
        constants$917.pango_font_get_font_map$FUNC
    );
    static final FunctionDescriptor pango_font_get_face$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_get_face$MH = RuntimeHelper.downcallHandle(
        "pango_font_get_face",
        constants$917.pango_font_get_face$FUNC
    );
    static final FunctionDescriptor pango_font_has_char$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_font_has_char$MH = RuntimeHelper.downcallHandle(
        "pango_font_has_char",
        constants$917.pango_font_has_char$FUNC
    );
    static final FunctionDescriptor pango_font_get_features$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_get_features$MH = RuntimeHelper.downcallHandle(
        "pango_font_get_features",
        constants$917.pango_font_get_features$FUNC
    );
    static final FunctionDescriptor pango_font_get_hb_font$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_get_hb_font$MH = RuntimeHelper.downcallHandle(
        "pango_font_get_hb_font",
        constants$917.pango_font_get_hb_font$FUNC
    );
}

