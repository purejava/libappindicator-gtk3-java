// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*gtk_text_iter_forward_find_char$pred)(unsigned int,void*);
 * }
 */
public interface gtk_text_iter_forward_find_char$pred {

    int apply(int ch, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(gtk_text_iter_forward_find_char$pred fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2382.const$1, fi, constants$9.const$2, scope);
    }
    static gtk_text_iter_forward_find_char$pred ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int _ch, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$2382.const$0.invokeExact(symbol, _ch, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


