// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*atk_add_key_event_listener$listener)(struct _AtkKeyEventStruct*,void*);
 * }
 */
public interface atk_add_key_event_listener$listener {

    int apply(java.lang.foreign.MemorySegment filter_info, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(atk_add_key_event_listener$listener fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1992.const$0, fi, constants$9.const$0, scope);
    }
    static atk_add_key_event_listener$listener ofAddress(MemorySegment addr, Arena arena) {
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


