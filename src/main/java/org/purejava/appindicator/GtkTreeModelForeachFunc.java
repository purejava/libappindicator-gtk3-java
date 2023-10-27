// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*GtkTreeModelForeachFunc)(struct _GtkTreeModel* model,struct _GtkTreePath* path,struct _GtkTreeIter* iter,void* data);
 * }
 */
public interface GtkTreeModelForeachFunc {

    int apply(java.lang.foreign.MemorySegment completion, java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GtkTreeModelForeachFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2292.const$2, fi, constants$34.const$5, scope);
    }
    static GtkTreeModelForeachFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _completion, java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$383.const$0.invokeExact(symbol, _completion, _key, _iter, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


