// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$1361 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1361() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_protocol_version",
        constants$10.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_ciphersuite_name",
        constants$5.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_tls_error_quark",
        constants$83.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_tls_channel_binding_error_quark",
        constants$83.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_tls_connection_emit_accept_certificate",
        constants$62.const$0
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("copy_session_state")
    ).withName("_GTlsClientConnectionInterface");
}


