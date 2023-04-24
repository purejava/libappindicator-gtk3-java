// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GSignalCVaMarshaller)(struct _GClosure*,struct _GValue*,void*,struct __va_list_tag*,void*,int,unsigned long*);
 * }
 */
public interface GSignalCVaMarshaller {

    void apply(java.lang.foreign.MemorySegment closure, java.lang.foreign.MemorySegment return_value, java.lang.foreign.MemorySegment instance, java.lang.foreign.MemorySegment args, java.lang.foreign.MemorySegment marshal_data, int n_params, java.lang.foreign.MemorySegment param_types);
    static MemorySegment allocate(GSignalCVaMarshaller fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$414.GSignalCVaMarshaller_UP$MH, fi, constants$414.GSignalCVaMarshaller$FUNC, scope);
    }
    static GSignalCVaMarshaller ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _closure, java.lang.foreign.MemorySegment _return_value, java.lang.foreign.MemorySegment _instance, java.lang.foreign.MemorySegment _args, java.lang.foreign.MemorySegment _marshal_data, int _n_params, java.lang.foreign.MemorySegment _param_types) -> {
            try {
                constants$414.GSignalCVaMarshaller_DOWN$MH.invokeExact(symbol, _closure, _return_value, _instance, _args, _marshal_data, _n_params, _param_types);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

