// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum GLogWriterOutput (*GLogWriterFunc)(enum GLogLevelFlags log_level,struct _GLogField* fields,unsigned long n_fields,void* user_data);
 * }
 */
public interface GLogWriterFunc {

    int apply(int log_level, java.lang.foreign.MemorySegment fields, long n_fields, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GLogWriterFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$376.const$0, fi, constants$82.const$4, scope);
    }
    static GLogWriterFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int _log_level, java.lang.foreign.MemorySegment _fields, long _n_fields, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$376.const$1.invokeExact(symbol, _log_level, _fields, _n_fields, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


