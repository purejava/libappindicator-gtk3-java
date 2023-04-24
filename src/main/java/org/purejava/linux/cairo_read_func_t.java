// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum _cairo_status (*cairo_read_func_t)(void* closure,unsigned char* data,unsigned int length);
 * }
 */
public interface cairo_read_func_t {

    int apply(java.lang.foreign.MemorySegment closure, java.lang.foreign.MemorySegment data, int length);
    static MemorySegment allocate(cairo_read_func_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$995.cairo_read_func_t_UP$MH, fi, constants$995.cairo_read_func_t$FUNC, scope);
    }
    static cairo_read_func_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _closure, java.lang.foreign.MemorySegment _data, int _length) -> {
            try {
                return (int)constants$996.cairo_read_func_t_DOWN$MH.invokeExact(symbol, _closure, _data, _length);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

