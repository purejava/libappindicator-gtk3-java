// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*gtk_cell_layout_set_cell_data_func$func)(struct _GtkCellLayout*,struct _GtkCellRenderer*,struct _GtkTreeModel*,struct _GtkTreeIter*,void*);
 * }
 */
public interface gtk_cell_layout_set_cell_data_func$func {

    void apply(java.lang.foreign.MemorySegment cell_layout, java.lang.foreign.MemorySegment cell, java.lang.foreign.MemorySegment tree_model, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(gtk_cell_layout_set_cell_data_func$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2583.const$3, fi, constants$332.const$1, scope);
    }
    static gtk_cell_layout_set_cell_data_func$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _cell_layout, java.lang.foreign.MemorySegment _cell, java.lang.foreign.MemorySegment _tree_model, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$919.const$3.invokeExact(symbol, _cell_layout, _cell, _tree_model, _iter, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


