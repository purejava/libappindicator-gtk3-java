// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*hb_paint_funcs_set_pop_group_func$func)(struct hb_paint_funcs_t*,void*,enum hb_paint_composite_mode_t,void*);
 * }
 */
public interface hb_paint_funcs_set_pop_group_func$func {

    void apply(java.lang.foreign.MemorySegment funcs, java.lang.foreign.MemorySegment paint_data, int mode, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_paint_funcs_set_pop_group_func$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1473.const$4, fi, constants$466.const$3, scope);
    }
    static hb_paint_funcs_set_pop_group_func$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _funcs, java.lang.foreign.MemorySegment _paint_data, int _mode, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$740.const$3.invokeExact(symbol, _funcs, _paint_data, _mode, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


