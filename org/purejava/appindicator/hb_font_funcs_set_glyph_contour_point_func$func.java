// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*hb_font_funcs_set_glyph_contour_point_func$func)(struct hb_font_t*,void*,unsigned int,unsigned int,int*,int*,void*);
 * }
 */
public interface hb_font_funcs_set_glyph_contour_point_func$func {

    int apply(java.lang.foreign.MemorySegment font, java.lang.foreign.MemorySegment font_data, int glyph, int point_index, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_font_funcs_set_glyph_contour_point_func$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1488.const$3, fi, constants$1314.const$3, scope);
    }
    static hb_font_funcs_set_glyph_contour_point_func$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _font, java.lang.foreign.MemorySegment _font_data, int _glyph, int _point_index, java.lang.foreign.MemorySegment _x, java.lang.foreign.MemorySegment _y, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$1480.const$3.invokeExact(symbol, _font, _font_data, _glyph, _point_index, _x, _y, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

