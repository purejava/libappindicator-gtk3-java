// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*gdk_pixbuf_save_to_callbackv$save_func)(char*,unsigned long,struct _GError**,void*);
 * }
 */
public interface gdk_pixbuf_save_to_callbackv$save_func {

    int apply(java.lang.foreign.MemorySegment buf, long count, java.lang.foreign.MemorySegment error, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(gdk_pixbuf_save_to_callbackv$save_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1891.const$3, fi, constants$394.const$4, scope);
    }
    static gdk_pixbuf_save_to_callbackv$save_func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _buf, long _count, java.lang.foreign.MemorySegment _error, java.lang.foreign.MemorySegment _data) -> {
            try {
                return (int)constants$1084.const$0.invokeExact(symbol, _buf, _count, _error, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


