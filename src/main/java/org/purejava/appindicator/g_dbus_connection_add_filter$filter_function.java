// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * struct _GDBusMessage* (*g_dbus_connection_add_filter$filter_function)(struct _GDBusConnection*,struct _GDBusMessage*,int,void*);
 * }
 */
public interface g_dbus_connection_add_filter$filter_function {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment connection, java.lang.foreign.MemorySegment message, int incoming, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(g_dbus_connection_add_filter$filter_function fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$869.const$5, fi, constants$482.const$3, scope);
    }
    static g_dbus_connection_add_filter$filter_function ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _connection, java.lang.foreign.MemorySegment _message, int _incoming, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$869.const$4.invokeExact(symbol, _connection, _message, _incoming, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


