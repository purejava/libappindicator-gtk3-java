// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * struct _GtkWidget* (*gtk_list_box_bind_model$create_widget_func)(void*,void*);
 * }
 */
public interface gtk_list_box_bind_model$create_widget_func {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment func_data);
    static MemorySegment allocate(gtk_list_box_bind_model$create_widget_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2860.const$0, fi, constants$5.const$5, scope);
    }
    static gtk_list_box_bind_model$create_widget_func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _func_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$15.const$1.invokeExact(symbol, _path, _func_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


