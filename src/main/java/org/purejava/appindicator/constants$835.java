// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$835 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$835() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_credentials_set_native",
        constants$42.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_credentials_is_same_user",
        constants$12.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_credentials_get_unix_pid",
        constants$9.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_credentials_get_unix_user",
        constants$9.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_credentials_set_unix_user",
        constants$150.const$0
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("receive_messages"),
        RuntimeHelper.POINTER.withName("send_messages"),
        RuntimeHelper.POINTER.withName("create_source"),
        RuntimeHelper.POINTER.withName("condition_check"),
        RuntimeHelper.POINTER.withName("condition_wait")
    ).withName("_GDatagramBasedInterface");
}

