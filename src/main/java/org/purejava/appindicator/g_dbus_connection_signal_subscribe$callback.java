// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*g_dbus_connection_signal_subscribe$callback)(struct _GDBusConnection*,char*,char*,char*,char*,struct _GVariant*,void*);
 * }
 */
public interface g_dbus_connection_signal_subscribe$callback {

    void apply(java.lang.foreign.MemorySegment connection, java.lang.foreign.MemorySegment sender_name, java.lang.foreign.MemorySegment object_path, java.lang.foreign.MemorySegment interface_name, java.lang.foreign.MemorySegment signal_name, java.lang.foreign.MemorySegment parameters, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(g_dbus_connection_signal_subscribe$callback fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$871.const$4, fi, constants$871.const$1, scope);
    }
    static g_dbus_connection_signal_subscribe$callback ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _connection, java.lang.foreign.MemorySegment _sender_name, java.lang.foreign.MemorySegment _object_path, java.lang.foreign.MemorySegment _interface_name, java.lang.foreign.MemorySegment _signal_name, java.lang.foreign.MemorySegment _parameters, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$871.const$3.invokeExact(symbol, _connection, _sender_name, _object_path, _interface_name, _signal_name, _parameters, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


