// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GBaseFinalizeFunc)(void* g_class);
 * }
 */
public interface GBaseFinalizeFunc {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(GBaseFinalizeFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$384.GBaseFinalizeFunc_UP$MH, fi, constants$384.GBaseFinalizeFunc$FUNC, scope);
    }
    static GBaseFinalizeFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _display) -> {
            try {
                constants$384.GBaseFinalizeFunc_DOWN$MH.invokeExact(symbol, _display);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

