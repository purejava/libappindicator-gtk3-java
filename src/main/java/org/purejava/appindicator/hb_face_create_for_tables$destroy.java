// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*hb_face_create_for_tables$destroy)(void*);
 * }
 */
public interface hb_face_create_for_tables$destroy {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(hb_face_create_for_tables$destroy fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1441.const$4, fi, constants$13.const$1, scope);
    }
    static hb_face_create_for_tables$destroy ofAddress(MemorySegment addr, Arena arena) {
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


