// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*g_sequence_new$data_destroy)(void*);
 * }
 */
public interface g_sequence_new$data_destroy {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(g_sequence_new$data_destroy fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$432.const$2, fi, constants$13.const$1, scope);
    }
    static g_sequence_new$data_destroy ofAddress(MemorySegment addr, Arena arena) {
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


