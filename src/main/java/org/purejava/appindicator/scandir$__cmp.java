// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*scandir$__cmp)(struct dirent**,struct dirent**);
 * }
 */
public interface scandir$__cmp {

    int apply(java.lang.foreign.MemorySegment filter_info, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(scandir$__cmp fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$195.const$4, fi, constants$9.const$0, scope);
    }
    static scandir$__cmp ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _filter_info, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$12.const$1.invokeExact(symbol, _filter_info, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


