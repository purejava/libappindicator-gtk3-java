// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * enum _cairo_status (*cairo_user_scaled_font_render_glyph_func_t)(struct _cairo_scaled_font* scaled_font,unsigned long glyph,struct _cairo* cr,struct cairo_text_extents_t* extents);
 * }
 */
public interface cairo_user_scaled_font_render_glyph_func_t {

    int apply(java.lang.foreign.MemorySegment scaled_font, long glyph, java.lang.foreign.MemorySegment cr, java.lang.foreign.MemorySegment extents);
    static MemorySegment allocate(cairo_user_scaled_font_render_glyph_func_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1716.const$1, fi, constants$394.const$4, scope);
    }
    static cairo_user_scaled_font_render_glyph_func_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _scaled_font, long _glyph, java.lang.foreign.MemorySegment _cr, java.lang.foreign.MemorySegment _extents) -> {
            try {
                return (int)constants$1084.const$0.invokeExact(symbol, _scaled_font, _glyph, _cr, _extents);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


