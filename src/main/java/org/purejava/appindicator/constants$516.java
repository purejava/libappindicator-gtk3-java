// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$516 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$516() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "sched_getscheduler",
        constants$8.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "sched_yield",
        constants$83.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "sched_get_priority_max",
        constants$8.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "sched_get_priority_min",
        constants$8.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "sched_rr_get_interval",
        constants$9.const$2
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(22, JAVA_LONG).withName("__jmpbuf"),
        JAVA_INT.withName("__mask_was_saved"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, JAVA_LONG).withName("__val")
        ).withName("__saved_mask")
    ).withName("__jmp_buf_tag");
}


