// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*gtk_clipboard_set_with_data$clear_func)(struct _GtkClipboard*,void*);
 * }
 */
public interface gtk_clipboard_set_with_data$clear_func {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(gtk_clipboard_set_with_data$clear_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2626.const$4, fi, constants$13.const$4, scope);
    }
    static gtk_clipboard_set_with_data$clear_func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$14.const$0.invokeExact(symbol, _tag, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

