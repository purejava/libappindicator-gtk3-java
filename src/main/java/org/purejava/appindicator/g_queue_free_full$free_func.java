// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*g_queue_free_full$free_func)(void*);
 * }
 */
public interface g_queue_free_full$free_func {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(g_queue_free_full$free_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$397.const$2, fi, constants$13.const$1, scope);
    }
    static g_queue_free_full$free_func ofAddress(MemorySegment addr, Arena arena) {
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


