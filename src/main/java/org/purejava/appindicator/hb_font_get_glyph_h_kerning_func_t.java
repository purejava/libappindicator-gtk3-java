// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*hb_font_get_glyph_h_kerning_func_t)(struct hb_font_t*,void*,unsigned int,unsigned int,void*);
 * }
 */
public interface hb_font_get_glyph_h_kerning_func_t {

    int apply(java.lang.foreign.MemorySegment font, java.lang.foreign.MemorySegment font_data, int first_glyph, int second_glyph, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_font_get_glyph_h_kerning_func_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1480.const$0, fi, constants$1479.const$3, scope);
    }
    static hb_font_get_glyph_h_kerning_func_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _font, java.lang.foreign.MemorySegment _font_data, int _first_glyph, int _second_glyph, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$1479.const$5.invokeExact(symbol, _font, _font_data, _first_glyph, _second_glyph, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


