// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*gtk_menu_attach_to_widget$detacher)(struct _GtkWidget*,struct _GtkMenu*);
 * }
 */
public interface gtk_menu_attach_to_widget$detacher {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(gtk_menu_attach_to_widget$detacher fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2244.const$3, fi, constants$13.const$4, scope);
    }
    static gtk_menu_attach_to_widget$detacher ofAddress(MemorySegment addr, Arena arena) {
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


