// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * struct _GVariant* (*g_settings_bind_with_mapping$set_mapping)(struct _GValue*,struct _GVariantType*,void*);
 * }
 */
public interface g_settings_bind_with_mapping$set_mapping {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment vfs, java.lang.foreign.MemorySegment identifier, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(g_settings_bind_with_mapping$set_mapping fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1266.const$3, fi, constants$23.const$0, scope);
    }
    static g_settings_bind_with_mapping$set_mapping ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _vfs, java.lang.foreign.MemorySegment _identifier, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$734.const$5.invokeExact(symbol, _vfs, _identifier, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


