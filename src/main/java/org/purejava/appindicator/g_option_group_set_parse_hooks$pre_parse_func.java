// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*g_option_group_set_parse_hooks$pre_parse_func)(struct _GOptionContext*,struct _GOptionGroup*,void*,struct _GError**);
 * }
 */
public interface g_option_group_set_parse_hooks$pre_parse_func {

    int apply(java.lang.foreign.MemorySegment completion, java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(g_option_group_set_parse_hooks$pre_parse_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$388.const$1, fi, constants$34.const$5, scope);
    }
    static g_option_group_set_parse_hooks$pre_parse_func ofAddress(MemorySegment addr, Arena arena) {
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


