// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*GBoxedFreeFunc)(void* boxed);
 * }
 */
public interface GBoxedFreeFunc {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(GBoxedFreeFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$619.const$2, fi, constants$13.const$1, scope);
    }
    static GBoxedFreeFunc ofAddress(MemorySegment addr, Arena arena) {
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

