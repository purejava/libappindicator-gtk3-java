// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*gtk_tree_sortable_set_default_sort_func$sort_func)(struct _GtkTreeModel*,struct _GtkTreeIter*,struct _GtkTreeIter*,void*);
 * }
 */
public interface gtk_tree_sortable_set_default_sort_func$sort_func {

    int apply(java.lang.foreign.MemorySegment completion, java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(gtk_tree_sortable_set_default_sort_func$sort_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2322.const$3, fi, constants$34.const$5, scope);
    }
    static gtk_tree_sortable_set_default_sort_func$sort_func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _completion, java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$382.const$0.invokeExact(symbol, _completion, _key, _iter, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


