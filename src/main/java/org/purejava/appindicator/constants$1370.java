// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1370 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1370() {}
    static final VarHandle const$0 = constants$1364.const$2.varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by_finish"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_tls_database_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_tls_database_verify_chain",
        constants$1364.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_tls_database_verify_chain_async$callback.class, "apply", constants$14.const$3);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_tls_database_verify_chain_async",
        constants$1365.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_tls_database_verify_chain_finish",
        constants$12.const$2
    );
}

