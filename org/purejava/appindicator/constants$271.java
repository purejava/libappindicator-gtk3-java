// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$271 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$271() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_source_get_context",
        constants$5.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(g_source_set_callback$func.class, "apply", constants$10.const$5);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(g_source_set_callback$notify.class, "apply", constants$13.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_source_set_callback",
        constants$42.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_source_set_funcs",
        constants$13.const$4
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_source_is_destroyed",
        constants$10.const$5
    );
}

