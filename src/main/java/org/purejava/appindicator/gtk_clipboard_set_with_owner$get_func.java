// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*gtk_clipboard_set_with_owner$get_func)(struct _GtkClipboard*,struct _GtkSelectionData*,unsigned int,void*);
 * }
 */
public interface gtk_clipboard_set_with_owner$get_func {

    void apply(java.lang.foreign.MemorySegment clipboard, java.lang.foreign.MemorySegment selection_data, int info, java.lang.foreign.MemorySegment user_data_or_owner);
    static MemorySegment allocate(gtk_clipboard_set_with_owner$get_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2632.const$0, fi, constants$466.const$3, scope);
    }
    static gtk_clipboard_set_with_owner$get_func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _clipboard, java.lang.foreign.MemorySegment _selection_data, int _info, java.lang.foreign.MemorySegment _user_data_or_owner) -> {
            try {
                constants$740.const$3.invokeExact(symbol, _clipboard, _selection_data, _info, _user_data_or_owner);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


