// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*g_io_scheduler_job_send_to_mainloop_async$func)(void*);
 * }
 */
public interface g_io_scheduler_job_send_to_mainloop_async$func {

    int apply(java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(g_io_scheduler_job_send_to_mainloop_async$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1128.const$4, fi, constants$10.const$5, scope);
    }
    static g_io_scheduler_job_send_to_mainloop_async$func ofAddress(MemorySegment addr, Arena arena) {
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


