// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * enum _cairo_status (*cairo_raster_source_pattern_get_copy$return)(struct _cairo_pattern*,void*,struct _cairo_pattern*);
 * }
 */
public interface cairo_raster_source_pattern_get_copy$return {

    int apply(java.lang.foreign.MemorySegment pattern, java.lang.foreign.MemorySegment callback_data, java.lang.foreign.MemorySegment other);
    static MemorySegment allocate(cairo_raster_source_pattern_get_copy$return fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1745.const$1, fi, constants$12.const$2, scope);
    }
    static cairo_raster_source_pattern_get_copy$return ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _pattern, java.lang.foreign.MemorySegment _callback_data, java.lang.foreign.MemorySegment _other) -> {
            try {
                return (int)constants$12.const$4.invokeExact(symbol, _pattern, _callback_data, _other);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


