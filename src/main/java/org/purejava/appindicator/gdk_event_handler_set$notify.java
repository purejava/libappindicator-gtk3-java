// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*gdk_event_handler_set$notify)(void*);
 * }
 */
public interface gdk_event_handler_set$notify {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(gdk_event_handler_set$notify fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1809.const$2, fi, constants$13.const$1, scope);
    }
    static gdk_event_handler_set$notify ofAddress(MemorySegment addr, Arena arena) {
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


