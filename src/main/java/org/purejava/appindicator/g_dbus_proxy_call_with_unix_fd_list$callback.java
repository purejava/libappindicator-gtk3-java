// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*g_dbus_proxy_call_with_unix_fd_list$callback)(struct _GObject*,struct _GAsyncResult*,void*);
 * }
 */
public interface g_dbus_proxy_call_with_unix_fd_list$callback {

    void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(g_dbus_proxy_call_with_unix_fd_list$callback fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$935.const$0, fi, constants$14.const$3, scope);
    }
    static g_dbus_proxy_call_with_unix_fd_list$callback ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$14.const$5.invokeExact(symbol, _key, _value, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


