// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void* (*g_slist_copy_deep$func)(void*,void*);
 * }
 */
public interface g_slist_copy_deep$func {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment func_data);
    static MemorySegment allocate(g_slist_copy_deep$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$252.const$1, fi, constants$5.const$5, scope);
    }
    static g_slist_copy_deep$func ofAddress(MemorySegment addr, Arena arena) {
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


