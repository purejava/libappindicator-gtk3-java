// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*g_signal_connect_data$c_handler)();
 * }
 */
public interface g_signal_connect_data$c_handler {

    void apply();
    static MemorySegment allocate(g_signal_connect_data$c_handler fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$609.const$4, fi, constants$7.const$5, scope);
    }
    static g_signal_connect_data$c_handler ofAddress(MemorySegment addr, Arena arena) {
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


