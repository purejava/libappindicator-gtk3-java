// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*hb_paint_color_glyph_func_t)(struct hb_paint_funcs_t* funcs,void* paint_data,unsigned int glyph,struct hb_font_t* font,void* user_data);
 * }
 */
public interface hb_paint_color_glyph_func_t {

    int apply(java.lang.foreign.MemorySegment font, java.lang.foreign.MemorySegment font_data, int glyph, java.lang.foreign.MemorySegment extents, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_paint_color_glyph_func_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1460.const$2, fi, constants$862.const$1, scope);
    }
    static hb_paint_color_glyph_func_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _font, java.lang.foreign.MemorySegment _font_data, int _glyph, java.lang.foreign.MemorySegment _extents, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$988.const$1.invokeExact(symbol, _font, _font_data, _glyph, _extents, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


