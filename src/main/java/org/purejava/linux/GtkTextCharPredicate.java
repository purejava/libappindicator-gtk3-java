// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GtkTextCharPredicate)(unsigned int ch,void* user_data);
 * }
 */
public interface GtkTextCharPredicate {

    int apply(int ch, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GtkTextCharPredicate fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1414.GtkTextCharPredicate_UP$MH, fi, constants$1414.GtkTextCharPredicate$FUNC, scope);
    }
    static GtkTextCharPredicate ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (int _ch, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$1414.GtkTextCharPredicate_DOWN$MH.invokeExact(symbol, _ch, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

