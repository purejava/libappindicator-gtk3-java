// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$802 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$802() {}
    static final FunctionDescriptor g_tls_backend_get_default_database$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_backend_get_default_database$MH = RuntimeHelper.downcallHandle(
        "g_tls_backend_get_default_database",
        constants$802.g_tls_backend_get_default_database$FUNC
    );
    static final FunctionDescriptor g_tls_backend_set_default_database$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_backend_set_default_database$MH = RuntimeHelper.downcallHandle(
        "g_tls_backend_set_default_database",
        constants$802.g_tls_backend_set_default_database$FUNC
    );
    static final FunctionDescriptor g_tls_backend_supports_tls$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_backend_supports_tls$MH = RuntimeHelper.downcallHandle(
        "g_tls_backend_supports_tls",
        constants$802.g_tls_backend_supports_tls$FUNC
    );
    static final FunctionDescriptor g_tls_backend_supports_dtls$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_backend_supports_dtls$MH = RuntimeHelper.downcallHandle(
        "g_tls_backend_supports_dtls",
        constants$802.g_tls_backend_supports_dtls$FUNC
    );
    static final FunctionDescriptor g_tls_backend_get_certificate_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_backend_get_certificate_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_backend_get_certificate_type",
        constants$802.g_tls_backend_get_certificate_type$FUNC
    );
    static final FunctionDescriptor g_tls_backend_get_client_connection_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_backend_get_client_connection_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_backend_get_client_connection_type",
        constants$802.g_tls_backend_get_client_connection_type$FUNC
    );
}

