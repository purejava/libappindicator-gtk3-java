// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*gdk_threads_add_timeout_seconds_full$function)(void*);
 * }
 */
public interface gdk_threads_add_timeout_seconds_full$function {

    int apply(java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(gdk_threads_add_timeout_seconds_full$function fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1945.const$4, fi, constants$10.const$5, scope);
    }
    static gdk_threads_add_timeout_seconds_full$function ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$14.const$2.invokeExact(symbol, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


