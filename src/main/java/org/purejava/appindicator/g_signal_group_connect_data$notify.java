// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*g_signal_group_connect_data$notify)(void*,struct _GClosure*);
 * }
 */
public interface g_signal_group_connect_data$notify {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(g_signal_group_connect_data$notify fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$673.const$1, fi, constants$13.const$4, scope);
    }
    static g_signal_group_connect_data$notify ofAddress(MemorySegment addr, Arena arena) {
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


