// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*g_file_copy_async$progress_callback)(long,long,void*);
 * }
 */
public interface g_file_copy_async$progress_callback {

    void apply(long current_num_bytes, long total_num_bytes, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(g_file_copy_async$progress_callback fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1024.const$5, fi, constants$561.const$3, scope);
    }
    static g_file_copy_async$progress_callback ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (long _current_num_bytes, long _total_num_bytes, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$693.const$3.invokeExact(symbol, _current_num_bytes, _total_num_bytes, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


