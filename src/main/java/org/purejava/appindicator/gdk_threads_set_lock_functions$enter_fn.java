// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*gdk_threads_set_lock_functions$enter_fn)();
 * }
 */
public interface gdk_threads_set_lock_functions$enter_fn {

    void apply();
    static MemorySegment allocate(gdk_threads_set_lock_functions$enter_fn fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1943.const$3, fi, constants$7.const$5, scope);
    }
    static gdk_threads_set_lock_functions$enter_fn ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return () -> {
            try {
                constants$64.const$1.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

