// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*g_private_new$notify)(void*);
 * }
 */
public interface g_private_new$notify {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(g_private_new$notify fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$542.const$1, fi, constants$13.const$1, scope);
    }
    static g_private_new$notify ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _display) -> {
            try {
                constants$13.const$3.invokeExact(symbol, _display);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


