// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*__sighandler_t)(int);
 * }
 */
public interface __sighandler_t {

    void apply(int _x0);
    static MemorySegment allocate(__sighandler_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$122.const$3, fi, constants$80.const$1, scope);
    }
    static __sighandler_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int __x0) -> {
            try {
                constants$122.const$4.invokeExact(symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


