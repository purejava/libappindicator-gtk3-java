// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*g_sequence_sort_changed_iter$iter_cmp)(struct _GSequenceNode*,struct _GSequenceNode*,void*);
 * }
 */
public interface g_sequence_sort_changed_iter$iter_cmp {

    int apply(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(g_sequence_sort_changed_iter$iter_cmp fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$436.const$5, fi, constants$12.const$2, scope);
    }
    static g_sequence_sort_changed_iter$iter_cmp ofAddress(MemorySegment addr, Arena arena) {
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


