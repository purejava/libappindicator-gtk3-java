// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * enum _cairo_status (*cairo_user_font_face_set_render_glyph_func$render_glyph_func)(struct _cairo_scaled_font*,unsigned long,struct _cairo*,struct cairo_text_extents_t*);
 * }
 */
public interface cairo_user_font_face_set_render_glyph_func$render_glyph_func {

    int apply(java.lang.foreign.MemorySegment scaled_font, long glyph, java.lang.foreign.MemorySegment cr, java.lang.foreign.MemorySegment extents);
    static MemorySegment allocate(cairo_user_font_face_set_render_glyph_func$render_glyph_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1717.const$2, fi, constants$394.const$4, scope);
    }
    static cairo_user_font_face_set_render_glyph_func$render_glyph_func ofAddress(MemorySegment addr, Arena arena) {
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


