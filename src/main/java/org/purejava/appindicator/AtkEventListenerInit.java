// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*AtkEventListenerInit)();
 * }
 */
public interface AtkEventListenerInit {

    void apply();
    static MemorySegment allocate(AtkEventListenerInit fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1207.AtkEventListenerInit_UP$MH, fi, constants$1207.AtkEventListenerInit$FUNC, scope);
    }
    static AtkEventListenerInit ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return () -> {
            try {
                constants$1207.AtkEventListenerInit_DOWN$MH.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

