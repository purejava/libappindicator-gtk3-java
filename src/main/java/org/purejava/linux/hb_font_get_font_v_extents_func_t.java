// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*hb_font_get_font_v_extents_func_t)(struct hb_font_t*,void*,struct hb_font_extents_t*,void*);
 * }
 */
public interface hb_font_get_font_v_extents_func_t {

    int apply(java.lang.foreign.MemorySegment completion, java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_font_get_font_v_extents_func_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$858.hb_font_get_font_v_extents_func_t_UP$MH, fi, constants$858.hb_font_get_font_v_extents_func_t$FUNC, scope);
    }
    static hb_font_get_font_v_extents_func_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _completion, java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$858.hb_font_get_font_v_extents_func_t_DOWN$MH.invokeExact(symbol, _completion, _key, _iter, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

