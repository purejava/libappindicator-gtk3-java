// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * enum hb_paint_extend_t (*hb_color_line_get_extend_func_t)(struct hb_color_line_t* color_line,void* color_line_data,void* user_data);
 * }
 */
public interface hb_color_line_get_extend_func_t {

    int apply(java.lang.foreign.MemorySegment color_line, java.lang.foreign.MemorySegment color_line_data, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_color_line_get_extend_func_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1459.const$1, fi, constants$12.const$2, scope);
    }
    static hb_color_line_get_extend_func_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _color_line, java.lang.foreign.MemorySegment _color_line_data, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$12.const$4.invokeExact(symbol, _color_line, _color_line_data, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


