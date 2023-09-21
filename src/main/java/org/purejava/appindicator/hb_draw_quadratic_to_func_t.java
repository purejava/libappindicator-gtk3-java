// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*hb_draw_quadratic_to_func_t)(struct hb_draw_funcs_t* dfuncs,void* draw_data,struct hb_draw_state_t* st,float control_x,float control_y,float to_x,float to_y,void* user_data);
 * }
 */
public interface hb_draw_quadratic_to_func_t {

    void apply(java.lang.foreign.MemorySegment funcs, java.lang.foreign.MemorySegment paint_data, java.lang.foreign.MemorySegment color_line, float x0, float y0, float start_angle, float end_angle, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_draw_quadratic_to_func_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1447.const$5, fi, constants$1447.const$4, scope);
    }
    static hb_draw_quadratic_to_func_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _funcs, java.lang.foreign.MemorySegment _paint_data, java.lang.foreign.MemorySegment _color_line, float _x0, float _y0, float _start_angle, float _end_angle, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$1448.const$0.invokeExact(symbol, _funcs, _paint_data, _color_line, _x0, _y0, _start_angle, _end_angle, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

