// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*gtk_builder_add_callback_symbols$first_callback_symbol)();
 * }
 */
public interface gtk_builder_add_callback_symbols$first_callback_symbol {

    void apply();
    static MemorySegment allocate(gtk_builder_add_callback_symbols$first_callback_symbol fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2542.const$2, fi, constants$7.const$5, scope);
    }
    static gtk_builder_add_callback_symbols$first_callback_symbol ofAddress(MemorySegment addr, Arena arena) {
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


