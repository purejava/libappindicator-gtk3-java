// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*g_list_foreach$func)(void*,void*);
 * }
 */
public interface g_list_foreach$func {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(g_list_foreach$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$224.const$1, fi, constants$13.const$4, scope);
    }
    static g_list_foreach$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$14.const$0.invokeExact(symbol, _tag, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


