// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*g_object_remove_toggle_ref$notify)(void*,struct _GObject*,int);
 * }
 */
public interface g_object_remove_toggle_ref$notify {

    void apply(java.lang.foreign.MemorySegment screen, java.lang.foreign.MemorySegment colors, int n_colors);
    static MemorySegment allocate(g_object_remove_toggle_ref$notify fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$634.const$4, fi, constants$164.const$5, scope);
    }
    static g_object_remove_toggle_ref$notify ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _screen, java.lang.foreign.MemorySegment _colors, int _n_colors) -> {
            try {
                constants$420.const$2.invokeExact(symbol, _screen, _colors, _n_colors);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


