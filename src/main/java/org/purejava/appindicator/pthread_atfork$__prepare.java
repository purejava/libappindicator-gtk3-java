// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*pthread_atfork$__prepare)();
 * }
 */
public interface pthread_atfork$__prepare {

    void apply();
    static MemorySegment allocate(pthread_atfork$__prepare fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$536.const$1, fi, constants$7.const$5, scope);
    }
    static pthread_atfork$__prepare ofAddress(MemorySegment addr, Arena arena) {
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


