// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*gdk_pixbuf_animation_new_from_stream_async$callback)(struct _GObject*,struct _GAsyncResult*,void*);
 * }
 */
public interface gdk_pixbuf_animation_new_from_stream_async$callback {

    void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(gdk_pixbuf_animation_new_from_stream_async$callback fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1898.const$4, fi, constants$14.const$3, scope);
    }
    static gdk_pixbuf_animation_new_from_stream_async$callback ofAddress(MemorySegment addr, Arena arena) {
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


