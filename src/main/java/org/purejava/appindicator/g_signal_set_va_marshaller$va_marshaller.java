// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*g_signal_set_va_marshaller$va_marshaller)(struct _GClosure*,struct _GValue*,void*,struct __va_list,void*,int,unsigned long*);
 * }
 */
public interface g_signal_set_va_marshaller$va_marshaller {

    void apply(java.lang.foreign.MemorySegment closure, java.lang.foreign.MemorySegment return_value, java.lang.foreign.MemorySegment instance, java.lang.foreign.MemorySegment args, java.lang.foreign.MemorySegment marshal_data, int n_params, java.lang.foreign.MemorySegment param_types);
    static MemorySegment allocate(g_signal_set_va_marshaller$va_marshaller fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$607.const$3, fi, constants$587.const$3, scope);
    }
    static g_signal_set_va_marshaller$va_marshaller ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _closure, java.lang.foreign.MemorySegment _return_value, java.lang.foreign.MemorySegment _instance, java.lang.foreign.MemorySegment _args, java.lang.foreign.MemorySegment _marshal_data, int _n_params, java.lang.foreign.MemorySegment _param_types) -> {
            try {
                constants$587.const$5.invokeExact(symbol, _closure, _return_value, _instance, _args, _marshal_data, _n_params, _param_types);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


