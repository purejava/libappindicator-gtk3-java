// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*hb_font_get_glyph_advances_func_t)(struct hb_font_t* font,void* font_data,unsigned int count,unsigned int* first_glyph,unsigned int glyph_stride,int* first_advance,unsigned int advance_stride,void* user_data);
 * }
 */
public interface hb_font_get_glyph_advances_func_t {

    void apply(java.lang.foreign.MemorySegment font, java.lang.foreign.MemorySegment font_data, int count, java.lang.foreign.MemorySegment first_glyph, int glyph_stride, java.lang.foreign.MemorySegment first_advance, int advance_stride, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_font_get_glyph_advances_func_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1478.const$2, fi, constants$1478.const$1, scope);
    }
    static hb_font_get_glyph_advances_func_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _font, java.lang.foreign.MemorySegment _font_data, int _count, java.lang.foreign.MemorySegment _first_glyph, int _glyph_stride, java.lang.foreign.MemorySegment _first_advance, int _advance_stride, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$1478.const$3.invokeExact(symbol, _font, _font_data, _count, _first_glyph, _glyph_stride, _first_advance, _advance_stride, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


