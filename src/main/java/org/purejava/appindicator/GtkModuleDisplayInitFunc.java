// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*GtkModuleDisplayInitFunc)(struct _GdkDisplay* display);
 * }
 */
public interface GtkModuleDisplayInitFunc {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(GtkModuleDisplayInitFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2900.const$2, fi, constants$13.const$1, scope);
    }
    static GtkModuleDisplayInitFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _display) -> {
            try {
                constants$13.const$3.invokeExact(symbol, _display);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


