// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void* (*GCacheNewFunc)(void* key);
 * }
 */
public interface GCacheNewFunc {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GCacheNewFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$494.const$3, fi, constants$5.const$2, scope);
    }
    static GCacheNewFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$99.const$0.invokeExact(symbol, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


