// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*hb_unicode_funcs_set_user_data$destroy)(void*);
 * }
 */
public interface hb_unicode_funcs_set_user_data$destroy {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(hb_unicode_funcs_set_user_data$destroy fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1425.const$2, fi, constants$13.const$1, scope);
    }
    static hb_unicode_funcs_set_user_data$destroy ofAddress(MemorySegment addr, Arena arena) {
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


