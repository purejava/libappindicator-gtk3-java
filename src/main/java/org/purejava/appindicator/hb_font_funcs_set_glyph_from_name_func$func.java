// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*hb_font_funcs_set_glyph_from_name_func$func)(struct hb_font_t*,void*,char*,int,unsigned int*,void*);
 * }
 */
public interface hb_font_funcs_set_glyph_from_name_func$func {

    int apply(java.lang.foreign.MemorySegment font, java.lang.foreign.MemorySegment font_data, java.lang.foreign.MemorySegment name, int len, java.lang.foreign.MemorySegment glyph, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_font_funcs_set_glyph_from_name_func$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1494.const$4, fi, constants$1032.const$2, scope);
    }
    static hb_font_funcs_set_glyph_from_name_func$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _font, java.lang.foreign.MemorySegment _font_data, java.lang.foreign.MemorySegment _name, int _len, java.lang.foreign.MemorySegment _glyph, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$1399.const$3.invokeExact(symbol, _font, _font_data, _name, _len, _glyph, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


