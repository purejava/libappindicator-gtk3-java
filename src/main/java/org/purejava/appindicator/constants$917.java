// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$917 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$917() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_dbus_object_manager_client_new$get_proxy_type_func.class, "apply", constants$332.const$2);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(g_dbus_object_manager_client_new$get_proxy_type_destroy_notify.class, "apply", constants$13.const$1);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(g_dbus_object_manager_client_new$callback.class, "apply", constants$14.const$3);
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_client_new",
        constants$917.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_client_new_finish",
        constants$5.const$5
    );
}


