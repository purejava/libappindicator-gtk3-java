// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void* (*g_datalist_id_dup_data$dup_func)(void*,void*);
 * }
 */
public interface g_datalist_id_dup_data$dup_func {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment func_data);
    static MemorySegment allocate(g_datalist_id_dup_data$dup_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$179.const$5, fi, constants$5.const$5, scope);
    }
    static g_datalist_id_dup_data$dup_func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _func_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$15.const$1.invokeExact(symbol, _path, _func_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


