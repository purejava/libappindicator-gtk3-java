// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*gtk_tree_model_foreach$func)(struct _GtkTreeModel*,struct _GtkTreePath*,struct _GtkTreeIter*,void*);
 * }
 */
public interface gtk_tree_model_foreach$func {

    int apply(java.lang.foreign.MemorySegment completion, java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(gtk_tree_model_foreach$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2304.const$4, fi, constants$34.const$5, scope);
    }
    static gtk_tree_model_foreach$func ofAddress(MemorySegment addr, Arena arena) {
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


