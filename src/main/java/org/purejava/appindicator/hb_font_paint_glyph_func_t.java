// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*hb_font_paint_glyph_func_t)(struct hb_font_t* font,void* font_data,unsigned int glyph,struct hb_paint_funcs_t* paint_funcs,void* paint_data,unsigned int palette_index,unsigned int foreground,void* user_data);
 * }
 */
public interface hb_font_paint_glyph_func_t {

    void apply(java.lang.foreign.MemorySegment font, java.lang.foreign.MemorySegment font_data, int glyph, java.lang.foreign.MemorySegment paint_funcs, java.lang.foreign.MemorySegment paint_data, int palette_index, int foreground, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_font_paint_glyph_func_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1481.const$4, fi, constants$1481.const$3, scope);
    }
    static hb_font_paint_glyph_func_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _font, java.lang.foreign.MemorySegment _font_data, int _glyph, java.lang.foreign.MemorySegment _paint_funcs, java.lang.foreign.MemorySegment _paint_data, int _palette_index, int _foreground, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$1481.const$5.invokeExact(symbol, _font, _font_data, _glyph, _paint_funcs, _paint_data, _palette_index, _foreground, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


