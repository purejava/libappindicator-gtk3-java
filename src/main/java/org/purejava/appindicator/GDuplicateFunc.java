// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void* (*GDuplicateFunc)(void* data,void* user_data);
 * }
 */
public interface GDuplicateFunc {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment func_data);
    static MemorySegment allocate(GDuplicateFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$179.const$4, fi, constants$5.const$5, scope);
    }
    static GDuplicateFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _func_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$15.const$1.invokeExact(symbol, _path, _func_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


