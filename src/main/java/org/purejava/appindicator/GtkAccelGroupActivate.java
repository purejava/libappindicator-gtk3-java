// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*GtkAccelGroupActivate)(struct _GtkAccelGroup* accel_group,struct _GObject* acceleratable,unsigned int keyval,enum GdkModifierType modifier);
 * }
 */
public interface GtkAccelGroupActivate {

    int apply(java.lang.foreign.MemorySegment accel_group, java.lang.foreign.MemorySegment acceleratable, int keyval, int modifier);
    static MemorySegment allocate(GtkAccelGroupActivate fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1954.const$5, fi, constants$415.const$4, scope);
    }
    static GtkAccelGroupActivate ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _accel_group, java.lang.foreign.MemorySegment _acceleratable, int _keyval, int _modifier) -> {
            try {
                return (int)constants$1955.const$0.invokeExact(symbol, _accel_group, _acceleratable, _keyval, _modifier);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


