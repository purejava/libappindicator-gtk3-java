// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*atk_focus_tracker_init$init)();
 * }
 */
public interface atk_focus_tracker_init$init {

    void apply();
    static MemorySegment allocate(atk_focus_tracker_init$init fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1996.const$1, fi, constants$7.const$5, scope);
    }
    static atk_focus_tracker_init$init ofAddress(MemorySegment addr, Arena arena) {
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


