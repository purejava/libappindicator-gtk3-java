// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*gdk_threads_add_timeout_full$notify)(void*);
 * }
 */
public interface gdk_threads_add_timeout_full$notify {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(gdk_threads_add_timeout_full$notify fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1950.const$0, fi, constants$13.const$1, scope);
    }
    static gdk_threads_add_timeout_full$notify ofAddress(MemorySegment addr, Arena arena) {
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


