// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$512 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$512() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_thread_create_full$func.class, "apply", constants$5.const$2);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_thread_create_full",
        constants$416.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_thread_set_priority",
        constants$40.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_thread_foreach$thread_func.class, "apply", constants$13.const$4);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_thread_foreach",
        constants$13.const$4
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sched_priority")
    ).withName("sched_param");
}


