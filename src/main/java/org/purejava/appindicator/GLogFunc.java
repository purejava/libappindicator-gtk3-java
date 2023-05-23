// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GLogFunc)(char* log_domain,enum  log_level,char* message,void* user_data);
 * }
 */
public interface GLogFunc {

    void apply(java.lang.foreign.MemorySegment log_domain, int log_level, java.lang.foreign.MemorySegment message, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GLogFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$256.GLogFunc_UP$MH, fi, constants$256.GLogFunc$FUNC, scope);
    }
    static GLogFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _log_domain, int _log_level, java.lang.foreign.MemorySegment _message, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$257.GLogFunc_DOWN$MH.invokeExact(symbol, _log_domain, _log_level, _message, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

