// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * unsigned long (*g_dbus_object_manager_client_new$get_proxy_type_func)(struct _GDBusObjectManagerClient*,char*,char*,void*);
 * }
 */
public interface g_dbus_object_manager_client_new$get_proxy_type_func {

    long apply(java.lang.foreign.MemorySegment manager, java.lang.foreign.MemorySegment object_path, java.lang.foreign.MemorySegment interface_name, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(g_dbus_object_manager_client_new$get_proxy_type_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$917.const$0, fi, constants$332.const$2, scope);
    }
    static g_dbus_object_manager_client_new$get_proxy_type_func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _manager, java.lang.foreign.MemorySegment _object_path, java.lang.foreign.MemorySegment _interface_name, java.lang.foreign.MemorySegment _data) -> {
            try {
                return (long)constants$699.const$1.invokeExact(symbol, _manager, _object_path, _interface_name, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


