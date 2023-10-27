// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*GtkTextCharPredicate)(unsigned int ch,void* user_data);
 * }
 */
public interface GtkTextCharPredicate {

    int apply(int ch, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GtkTextCharPredicate fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2386.const$5, fi, constants$9.const$2, scope);
    }
    static GtkTextCharPredicate ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int _ch, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$2387.const$0.invokeExact(symbol, _ch, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


