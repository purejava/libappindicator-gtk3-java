// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
final class constants$541 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$541() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_static_rec_mutex_free",
        constants$13.const$1
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
        ).withName("mutex"),
        RuntimeHelper.POINTER.withName("read_cond"),
        RuntimeHelper.POINTER.withName("write_cond"),
        JAVA_INT.withName("read_counter"),
        JAVA_INT.withName("have_writer"),
        JAVA_INT.withName("want_to_read"),
        JAVA_INT.withName("want_to_write")
    ).withName("_GStaticRWLock");
    static final VarHandle const$2 = constants$541.const$1.varHandle(MemoryLayout.PathElement.groupElement("read_cond"));
    static final VarHandle const$3 = constants$541.const$1.varHandle(MemoryLayout.PathElement.groupElement("write_cond"));
    static final VarHandle const$4 = constants$541.const$1.varHandle(MemoryLayout.PathElement.groupElement("read_counter"));
    static final VarHandle const$5 = constants$541.const$1.varHandle(MemoryLayout.PathElement.groupElement("have_writer"));
}


