// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GCallback)();
 * }
 */
public interface GCallback {

    void apply();
    static MemorySegment allocate(GCallback fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$0.const$3, fi, constants$0.const$2, scope);
    }
    static GCallback ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return () -> {
            try {
                constants$0.const$4.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


