// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*g_static_private_set$notify)(void*);
 * }
 */
public interface g_static_private_set$notify {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(g_static_private_set$notify fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$543.const$1, fi, constants$13.const$1, scope);
    }
    static g_static_private_set$notify ofAddress(MemorySegment addr, Arena arena) {
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

