// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1376 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1376() {}
    static final VarHandle const$0 = constants$1374.const$0.varHandle(MemoryLayout.PathElement.groupElement("request_certificate_finish"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_tls_interaction_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_tls_interaction_invoke_ask_password",
        constants$34.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_tls_interaction_ask_password",
        constants$34.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(g_tls_interaction_ask_password_async$callback.class, "apply", constants$14.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_tls_interaction_ask_password_async",
        constants$331.const$1
    );
}


