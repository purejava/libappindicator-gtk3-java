// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
final class constants$397 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$397() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_queue_new",
        constants$35.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_queue_free",
        constants$13.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(g_queue_free_full$free_func.class, "apply", constants$13.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_queue_free_full",
        constants$13.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_queue_init",
        constants$13.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_queue_clear",
        constants$13.const$1
    );
}


