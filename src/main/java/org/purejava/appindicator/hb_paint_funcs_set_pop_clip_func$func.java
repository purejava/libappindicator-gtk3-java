// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*hb_paint_funcs_set_pop_clip_func$func)(struct hb_paint_funcs_t*,void*,void*);
 * }
 */
public interface hb_paint_funcs_set_pop_clip_func$func {

    void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_paint_funcs_set_pop_clip_func$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1470.const$1, fi, constants$14.const$3, scope);
    }
    static hb_paint_funcs_set_pop_clip_func$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$14.const$5.invokeExact(symbol, _key, _value, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


