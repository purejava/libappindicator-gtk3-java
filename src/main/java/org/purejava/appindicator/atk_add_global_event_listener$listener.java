// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*atk_add_global_event_listener$listener)(struct _GSignalInvocationHint*,unsigned int,struct _GValue*,void*);
 * }
 */
public interface atk_add_global_event_listener$listener {

    int apply(java.lang.foreign.MemorySegment ihint, int n_param_values, java.lang.foreign.MemorySegment param_values, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(atk_add_global_event_listener$listener fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1991.const$3, fi, constants$11.const$0, scope);
    }
    static atk_add_global_event_listener$listener ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _ihint, int _n_param_values, java.lang.foreign.MemorySegment _param_values, java.lang.foreign.MemorySegment _data) -> {
            try {
                return (int)constants$464.const$0.invokeExact(symbol, _ihint, _n_param_values, _param_values, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


