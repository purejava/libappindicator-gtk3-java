// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*g_settings_bind_with_mapping$destroy)(void*);
 * }
 */
public interface g_settings_bind_with_mapping$destroy {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(g_settings_bind_with_mapping$destroy fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1262.const$4, fi, constants$13.const$1, scope);
    }
    static g_settings_bind_with_mapping$destroy ofAddress(MemorySegment addr, Arena arena) {
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


