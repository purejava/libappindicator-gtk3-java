// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*gtk_tree_sortable_set_sort_func$destroy)(void*);
 * }
 */
public interface gtk_tree_sortable_set_sort_func$destroy {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(gtk_tree_sortable_set_sort_func$destroy fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2327.const$1, fi, constants$13.const$1, scope);
    }
    static gtk_tree_sortable_set_sort_func$destroy ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _display) -> {
            try {
                constants$13.const$3.invokeExact(symbol, _display);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


