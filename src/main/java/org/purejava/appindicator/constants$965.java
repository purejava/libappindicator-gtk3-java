// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$965 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$965() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_get_validation_flags",
        constants$10.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_set_validation_flags",
        constants$40.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_get_server_identity",
        constants$5.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_set_server_identity",
        constants$13.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_get_accepted_cas",
        constants$5.const$2
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface")
    ).withName("_GDtlsServerConnectionInterface");
}

