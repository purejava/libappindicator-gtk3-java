// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$896 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$896() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("__stack"),
            RuntimeHelper.POINTER.withName("__gr_top"),
            RuntimeHelper.POINTER.withName("__vr_top"),
            JAVA_INT.withName("__gr_offs"),
            JAVA_INT.withName("__vr_offs")
        ).withName("__va_list")
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_dbus_message_new_method_error_valist",
        constants$896.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_dbus_message_new_method_error_literal",
        constants$23.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_dbus_message_print",
        constants$21.const$3
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_locked",
        constants$10.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_dbus_message_lock",
        constants$13.const$1
    );
}


