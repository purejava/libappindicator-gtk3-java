// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$876 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$876() {}
    static final FunctionDescriptor hb_font_get_scale$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_scale$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_scale",
        constants$876.hb_font_get_scale$FUNC
    );
    static final FunctionDescriptor hb_font_set_ppem$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_font_set_ppem$MH = RuntimeHelper.downcallHandle(
        "hb_font_set_ppem",
        constants$876.hb_font_set_ppem$FUNC
    );
    static final FunctionDescriptor hb_font_get_ppem$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_ppem$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_ppem",
        constants$876.hb_font_get_ppem$FUNC
    );
    static final FunctionDescriptor hb_font_set_ptem$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle hb_font_set_ptem$MH = RuntimeHelper.downcallHandle(
        "hb_font_set_ptem",
        constants$876.hb_font_set_ptem$FUNC
    );
    static final FunctionDescriptor hb_font_get_ptem$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_ptem$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_ptem",
        constants$876.hb_font_get_ptem$FUNC
    );
    static final FunctionDescriptor hb_font_set_synthetic_slant$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle hb_font_set_synthetic_slant$MH = RuntimeHelper.downcallHandle(
        "hb_font_set_synthetic_slant",
        constants$876.hb_font_set_synthetic_slant$FUNC
    );
}

