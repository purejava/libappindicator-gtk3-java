// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*gtk_clipboard_request_rich_text$callback)(struct _GtkClipboard*,struct _GdkAtom*,unsigned char*,unsigned long,void*);
 * }
 */
public interface gtk_clipboard_request_rich_text$callback {

    void apply(java.lang.foreign.MemorySegment clipboard, java.lang.foreign.MemorySegment format, java.lang.foreign.MemorySegment text, long length, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(gtk_clipboard_request_rich_text$callback fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2633.const$5, fi, constants$2629.const$2, scope);
    }
    static gtk_clipboard_request_rich_text$callback ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _clipboard, java.lang.foreign.MemorySegment _format, java.lang.foreign.MemorySegment _text, long _length, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$2629.const$4.invokeExact(symbol, _clipboard, _format, _text, _length, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


