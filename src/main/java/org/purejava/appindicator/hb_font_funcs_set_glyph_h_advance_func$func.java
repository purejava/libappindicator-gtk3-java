// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*hb_font_funcs_set_glyph_h_advance_func$func)(struct hb_font_t*,void*,unsigned int,void*);
 * }
 */
public interface hb_font_funcs_set_glyph_h_advance_func$func {

    int apply(java.lang.foreign.MemorySegment font, java.lang.foreign.MemorySegment font_data, int glyph, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_font_funcs_set_glyph_h_advance_func$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1489.const$4, fi, constants$328.const$4, scope);
    }
    static hb_font_funcs_set_glyph_h_advance_func$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _font, java.lang.foreign.MemorySegment _font_data, int _glyph, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$1482.const$5.invokeExact(symbol, _font, _font_data, _glyph, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


