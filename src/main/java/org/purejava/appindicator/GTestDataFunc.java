// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*GTestDataFunc)(void* user_data);
 * }
 */
public interface GTestDataFunc {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(GTestDataFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$449.const$5, fi, constants$13.const$1, scope);
    }
    static GTestDataFunc ofAddress(MemorySegment addr, Arena arena) {
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


