// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * enum _cairo_status (*cairo_raster_source_snapshot_func_t)(struct _cairo_pattern* pattern,void* callback_data);
 * }
 */
public interface cairo_raster_source_snapshot_func_t {

    int apply(java.lang.foreign.MemorySegment pattern, java.lang.foreign.MemorySegment callback_data);
    static MemorySegment allocate(cairo_raster_source_snapshot_func_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1742.const$1, fi, constants$9.const$0, scope);
    }
    static cairo_raster_source_snapshot_func_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _pattern, java.lang.foreign.MemorySegment _callback_data) -> {
            try {
                return (int)constants$12.const$1.invokeExact(symbol, _pattern, _callback_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


