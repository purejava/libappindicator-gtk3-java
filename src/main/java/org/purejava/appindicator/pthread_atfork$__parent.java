// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*pthread_atfork$__parent)();
 * }
 */
public interface pthread_atfork$__parent {

    void apply();
    static MemorySegment allocate(pthread_atfork$__parent fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$373.pthread_atfork$__parent_UP$MH, fi, constants$373.pthread_atfork$__parent$FUNC, scope);
    }
    static pthread_atfork$__parent ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return () -> {
            try {
                constants$373.pthread_atfork$__parent_DOWN$MH.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

