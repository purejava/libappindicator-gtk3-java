// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*GtkClipboardRichTextReceivedFunc)(struct _GtkClipboard* clipboard,struct _GdkAtom* format,unsigned char* text,unsigned long length,void* data);
 * }
 */
public interface GtkClipboardRichTextReceivedFunc {

    void apply(java.lang.foreign.MemorySegment clipboard, java.lang.foreign.MemorySegment format, java.lang.foreign.MemorySegment text, long length, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GtkClipboardRichTextReceivedFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2629.const$3, fi, constants$2629.const$2, scope);
    }
    static GtkClipboardRichTextReceivedFunc ofAddress(MemorySegment addr, Arena arena) {
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


