// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*hb_paint_color_func_t)(struct hb_paint_funcs_t* funcs,void* paint_data,int is_foreground,unsigned int color,void* user_data);
 * }
 */
public interface hb_paint_color_func_t {

    void apply(java.lang.foreign.MemorySegment funcs, java.lang.foreign.MemorySegment paint_data, int is_foreground, int color, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_paint_color_func_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1461.const$4, fi, constants$1461.const$3, scope);
    }
    static hb_paint_color_func_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _funcs, java.lang.foreign.MemorySegment _paint_data, int _is_foreground, int _color, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$1461.const$5.invokeExact(symbol, _funcs, _paint_data, _is_foreground, _color, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


