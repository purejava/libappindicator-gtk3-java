// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*GtkAssistantPageFunc)(int current_page,void* data);
 * }
 */
public interface GtkAssistantPageFunc {

    int apply(int current_page, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GtkAssistantPageFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2524.const$5, fi, constants$9.const$2, scope);
    }
    static GtkAssistantPageFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int _current_page, java.lang.foreign.MemorySegment _data) -> {
            try {
                return (int)constants$2387.const$0.invokeExact(symbol, _current_page, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


