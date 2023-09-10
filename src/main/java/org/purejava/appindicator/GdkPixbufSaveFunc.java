// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GdkPixbufSaveFunc)(char* buf,unsigned long count,struct _GError** error,void* data);
 * }
 */
public interface GdkPixbufSaveFunc {

    int apply(java.lang.foreign.MemorySegment buf, long count, java.lang.foreign.MemorySegment error, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GdkPixbufSaveFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1886.const$0, fi, constants$393.const$4, scope);
    }
    static GdkPixbufSaveFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _buf, long _count, java.lang.foreign.MemorySegment _error, java.lang.foreign.MemorySegment _data) -> {
            try {
                return (int)constants$1080.const$4.invokeExact(symbol, _buf, _count, _error, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


