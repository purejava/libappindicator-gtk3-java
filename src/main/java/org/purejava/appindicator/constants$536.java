// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
final class constants$536 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$536() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "pthread_getcpuclockid",
        constants$87.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(pthread_atfork$__prepare.class, "apply", constants$7.const$5);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(pthread_atfork$__parent.class, "apply", constants$7.const$5);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(pthread_atfork$__child.class, "apply", constants$7.const$5);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "pthread_atfork",
        constants$12.const$2
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("mutex"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("__lock"),
                JAVA_INT.withName("__count"),
                JAVA_INT.withName("__owner"),
                JAVA_INT.withName("__nusers"),
                JAVA_INT.withName("__kind"),
                JAVA_INT.withName("__spins"),
                MemoryLayout.structLayout(
                    RuntimeHelper.POINTER.withName("__prev"),
                    RuntimeHelper.POINTER.withName("__next")
                ).withName("__list")
            ).withName("__data"),
            MemoryLayout.sequenceLayout(48, JAVA_BYTE).withName("__size"),
            JAVA_LONG.withName("__align")
        ).withName("unused")
    ).withName("GStaticMutex");
}


