// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*g_cclosure_new_swap$callback_func)();
 * }
 */
public interface g_cclosure_new_swap$callback_func {

    void apply();
    static MemorySegment allocate(g_cclosure_new_swap$callback_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$587.const$5, fi, constants$7.const$5, scope);
    }
    static g_cclosure_new_swap$callback_func ofAddress(MemorySegment addr, Arena arena) {
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


