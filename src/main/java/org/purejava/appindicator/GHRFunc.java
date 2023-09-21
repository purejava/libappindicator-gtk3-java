// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*GHRFunc)(void* key,void* value,void* user_data);
 * }
 */
public interface GHRFunc {

    int apply(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GHRFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$225.const$4, fi, constants$12.const$2, scope);
    }
    static GHRFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _a, java.lang.foreign.MemorySegment _b, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$12.const$4.invokeExact(symbol, _a, _b, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

