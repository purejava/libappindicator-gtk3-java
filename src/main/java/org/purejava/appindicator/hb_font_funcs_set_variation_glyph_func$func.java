// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*hb_font_funcs_set_variation_glyph_func$func)(struct hb_font_t*,void*,unsigned int,unsigned int,unsigned int*,void*);
 * }
 */
public interface hb_font_funcs_set_variation_glyph_func$func {

    int apply(java.lang.foreign.MemorySegment font, java.lang.foreign.MemorySegment font_data, int unicode, int variation_selector, java.lang.foreign.MemorySegment glyph, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_font_funcs_set_variation_glyph_func$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1489.const$1, fi, constants$1032.const$5, scope);
    }
    static hb_font_funcs_set_variation_glyph_func$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _font, java.lang.foreign.MemorySegment _font_data, int _unicode, int _variation_selector, java.lang.foreign.MemorySegment _glyph, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$1482.const$0.invokeExact(symbol, _font, _font_data, _unicode, _variation_selector, _glyph, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


