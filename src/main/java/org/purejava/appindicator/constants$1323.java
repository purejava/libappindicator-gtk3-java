// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
final class constants$1323 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1323() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_subprocess_get_identifier",
        constants$5.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_subprocess_send_signal",
        constants$40.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_subprocess_force_exit",
        constants$13.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_subprocess_wait",
        constants$12.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(g_subprocess_wait_async$callback.class, "apply", constants$14.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_subprocess_wait_async",
        constants$42.const$1
    );
}


