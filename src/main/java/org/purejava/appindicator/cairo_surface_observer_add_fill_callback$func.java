// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*cairo_surface_observer_add_fill_callback$func)(struct _cairo_surface*,struct _cairo_surface*,void*);
 * }
 */
public interface cairo_surface_observer_add_fill_callback$func {

    void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(cairo_surface_observer_add_fill_callback$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1725.const$3, fi, constants$14.const$3, scope);
    }
    static cairo_surface_observer_add_fill_callback$func ofAddress(MemorySegment addr, Arena arena) {
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


