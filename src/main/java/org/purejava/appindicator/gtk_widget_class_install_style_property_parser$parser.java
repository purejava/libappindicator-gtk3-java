// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*gtk_widget_class_install_style_property_parser$parser)(struct _GParamSpec*,struct _GString*,struct _GValue*);
 * }
 */
public interface gtk_widget_class_install_style_property_parser$parser {

    int apply(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(gtk_widget_class_install_style_property_parser$parser fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2156.const$5, fi, constants$12.const$2, scope);
    }
    static gtk_widget_class_install_style_property_parser$parser ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _a, java.lang.foreign.MemorySegment _b, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$12.const$4.invokeExact(symbol, _a, _b, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


