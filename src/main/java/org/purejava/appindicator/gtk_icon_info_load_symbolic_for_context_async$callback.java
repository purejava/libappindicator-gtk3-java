// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*gtk_icon_info_load_symbolic_for_context_async$callback)(struct _GObject*,struct _GAsyncResult*,void*);
 * }
 */
public interface gtk_icon_info_load_symbolic_for_context_async$callback {

    void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(gtk_icon_info_load_symbolic_for_context_async$callback fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2798.const$4, fi, constants$14.const$3, scope);
    }
    static gtk_icon_info_load_symbolic_for_context_async$callback ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$14.const$5.invokeExact(symbol, _key, _value, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


