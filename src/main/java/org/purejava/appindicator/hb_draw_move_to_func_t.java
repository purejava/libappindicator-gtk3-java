// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*hb_draw_move_to_func_t)(struct hb_draw_funcs_t* dfuncs,void* draw_data,struct hb_draw_state_t* st,float to_x,float to_y,void* user_data);
 * }
 */
public interface hb_draw_move_to_func_t {

    void apply(java.lang.foreign.MemorySegment dfuncs, java.lang.foreign.MemorySegment draw_data, java.lang.foreign.MemorySegment st, float to_x, float to_y, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_draw_move_to_func_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1451.const$2, fi, constants$1451.const$1, scope);
    }
    static hb_draw_move_to_func_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _dfuncs, java.lang.foreign.MemorySegment _draw_data, java.lang.foreign.MemorySegment _st, float _to_x, float _to_y, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$1451.const$3.invokeExact(symbol, _dfuncs, _draw_data, _st, _to_x, _to_y, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


