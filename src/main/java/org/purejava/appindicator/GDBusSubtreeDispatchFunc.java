// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GDBusInterfaceVTable* (*GDBusSubtreeDispatchFunc)(struct _GDBusConnection* connection,char* sender,char* object_path,char* interface_name,char* node,void** out_user_data,void* user_data);
 * }
 */
public interface GDBusSubtreeDispatchFunc {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment connection, java.lang.foreign.MemorySegment sender, java.lang.foreign.MemorySegment object_path, java.lang.foreign.MemorySegment interface_name, java.lang.foreign.MemorySegment node, java.lang.foreign.MemorySegment out_user_data, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GDBusSubtreeDispatchFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$866.const$2, fi, constants$494.const$3, scope);
    }
    static GDBusSubtreeDispatchFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _connection, java.lang.foreign.MemorySegment _sender, java.lang.foreign.MemorySegment _object_path, java.lang.foreign.MemorySegment _interface_name, java.lang.foreign.MemorySegment _node, java.lang.foreign.MemorySegment _out_user_data, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$863.const$1.invokeExact(symbol, _connection, _sender, _object_path, _interface_name, _node, _out_user_data, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


