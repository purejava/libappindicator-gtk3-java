// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*hb_paint_funcs_set_sweep_gradient_func$func)(struct hb_paint_funcs_t*,void*,struct hb_color_line_t*,float,float,float,float,void*);
 * }
 */
public interface hb_paint_funcs_set_sweep_gradient_func$func {

    void apply(java.lang.foreign.MemorySegment funcs, java.lang.foreign.MemorySegment paint_data, java.lang.foreign.MemorySegment color_line, float x0, float y0, float start_angle, float end_angle, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_paint_funcs_set_sweep_gradient_func$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1472.const$4, fi, constants$1451.const$5, scope);
    }
    static hb_paint_funcs_set_sweep_gradient_func$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _funcs, java.lang.foreign.MemorySegment _paint_data, java.lang.foreign.MemorySegment _color_line, float _x0, float _y0, float _start_angle, float _end_angle, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$1452.const$1.invokeExact(symbol, _funcs, _paint_data, _color_line, _x0, _y0, _start_angle, _end_angle, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


