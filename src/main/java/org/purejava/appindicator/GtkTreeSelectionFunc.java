// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*GtkTreeSelectionFunc)(struct _GtkTreeSelection* selection,struct _GtkTreeModel* model,struct _GtkTreePath* path,int path_currently_selected,void* data);
 * }
 */
public interface GtkTreeSelectionFunc {

    int apply(java.lang.foreign.MemorySegment selection, java.lang.foreign.MemorySegment model, java.lang.foreign.MemorySegment path, int path_currently_selected, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GtkTreeSelectionFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$3199.const$1, fi, constants$329.const$5, scope);
    }
    static GtkTreeSelectionFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _selection, java.lang.foreign.MemorySegment _model, java.lang.foreign.MemorySegment _path, int _path_currently_selected, java.lang.foreign.MemorySegment _data) -> {
            try {
                return (int)constants$3199.const$2.invokeExact(symbol, _selection, _model, _path, _path_currently_selected, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


