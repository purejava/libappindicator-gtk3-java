// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct hb_blob_t* (*hb_reference_table_func_t)(struct hb_face_t* face,unsigned int tag,void* user_data);
 * }
 */
public interface hb_reference_table_func_t {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment face, int tag, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_reference_table_func_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1441.const$2, fi, constants$196.const$3, scope);
    }
    static hb_reference_table_func_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _face, int _tag, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$837.const$1.invokeExact(symbol, _face, _tag, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

