// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$544 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$544() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_thread_init_with_errorcheck_mutexes",
        constants$13.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_thread_get_initialized",
        constants$83.const$1
    );
    static final MemorySegment const$2 = RuntimeHelper.lookupGlobalVariable("g_threads_got_initialized", JAVA_INT);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_mutex_new",
        constants$35.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_mutex_free",
        constants$13.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_cond_new",
        constants$35.const$2
    );
}

