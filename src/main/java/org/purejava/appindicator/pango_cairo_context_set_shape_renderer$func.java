// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*pango_cairo_context_set_shape_renderer$func)(struct _cairo*,struct _PangoAttrShape*,int,void*);
 * }
 */
public interface pango_cairo_context_set_shape_renderer$func {

    void apply(java.lang.foreign.MemorySegment clipboard, java.lang.foreign.MemorySegment atoms, int n_atoms, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(pango_cairo_context_set_shape_renderer$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1913.const$3, fi, constants$466.const$3, scope);
    }
    static pango_cairo_context_set_shape_renderer$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _clipboard, java.lang.foreign.MemorySegment _atoms, int _n_atoms, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$740.const$3.invokeExact(symbol, _clipboard, _atoms, _n_atoms, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


