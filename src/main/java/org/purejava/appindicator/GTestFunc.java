// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GTestFunc)();
 * }
 */
public interface GTestFunc {

    void apply();
    static MemorySegment allocate(GTestFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$448.const$4, fi, constants$7.const$5, scope);
    }
    static GTestFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return () -> {
            try {
                constants$64.const$1.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


