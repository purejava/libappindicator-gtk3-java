// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*g_error_domain_register_static$error_type_copy)(struct _GError*,struct _GError*);
 * }
 */
public interface g_error_domain_register_static$error_type_copy {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(g_error_domain_register_static$error_type_copy fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$54.const$3, fi, constants$13.const$4, scope);
    }
    static g_error_domain_register_static$error_type_copy ofAddress(MemorySegment addr, Arena arena) {
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

