// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*GTypeValueCopyFunc)(struct _GValue* src_value,struct _GValue* dest_value);
 * }
 */
public interface GTypeValueCopyFunc {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GTypeValueCopyFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$559.const$1, fi, constants$13.const$4, scope);
    }
    static GTypeValueCopyFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$14.const$0.invokeExact(symbol, _tag, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


