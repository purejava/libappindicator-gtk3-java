// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*GSignalEmissionHook)(struct _GSignalInvocationHint* ihint,unsigned int n_param_values,struct _GValue* param_values,void* data);
 * }
 */
public interface GSignalEmissionHook {

    int apply(java.lang.foreign.MemorySegment ihint, int n_param_values, java.lang.foreign.MemorySegment param_values, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GSignalEmissionHook fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$602.const$3, fi, constants$11.const$0, scope);
    }
    static GSignalEmissionHook ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _ihint, int _n_param_values, java.lang.foreign.MemorySegment _param_values, java.lang.foreign.MemorySegment _data) -> {
            try {
                return (int)constants$465.const$5.invokeExact(symbol, _ihint, _n_param_values, _param_values, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


