// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*hb_font_funcs_set_glyph_h_advances_func$func)(struct hb_font_t*,void*,unsigned int,unsigned int*,unsigned int,int*,unsigned int,void*);
 * }
 */
public interface hb_font_funcs_set_glyph_h_advances_func$func {

    void apply(java.lang.foreign.MemorySegment font, java.lang.foreign.MemorySegment font_data, int count, java.lang.foreign.MemorySegment first_glyph, int glyph_stride, java.lang.foreign.MemorySegment first_advance, int advance_stride, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_font_funcs_set_glyph_h_advances_func$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1490.const$4, fi, constants$1483.const$2, scope);
    }
    static hb_font_funcs_set_glyph_h_advances_func$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _font, java.lang.foreign.MemorySegment _font_data, int _count, java.lang.foreign.MemorySegment _first_glyph, int _glyph_stride, java.lang.foreign.MemorySegment _first_advance, int _advance_stride, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$1483.const$4.invokeExact(symbol, _font, _font_data, _count, _first_glyph, _glyph_stride, _first_advance, _advance_stride, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


