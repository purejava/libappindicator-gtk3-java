// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$523 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$523() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(22, JAVA_LONG).withName("__cancel_jmp_buf"),
        JAVA_INT.withName("__mask_was_saved"),
        MemoryLayout.paddingLayout(4)
    ).withName("__cancel_jmp_buf_tag");
    static final VarHandle const$1 = constants$523.const$0.varHandle(MemoryLayout.PathElement.groupElement("__mask_was_saved"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(22, JAVA_LONG).withName("__cancel_jmp_buf"),
            JAVA_INT.withName("__mask_was_saved"),
            MemoryLayout.paddingLayout(4)
        ).withName("__cancel_jmp_buf_tag")).withName("__cancel_jmp_buf"),
        MemoryLayout.sequenceLayout(4, RuntimeHelper.POINTER).withName("__pad")
    ).withName("__pthread_unwind_buf_t");
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("__cancel_routine"),
        RuntimeHelper.POINTER.withName("__cancel_arg"),
        JAVA_INT.withName("__do_it"),
        JAVA_INT.withName("__cancel_type")
    ).withName("__pthread_cleanup_frame");
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(__pthread_cleanup_frame.__cancel_routine.class, "apply", constants$13.const$1);
    static final VarHandle const$5 = constants$523.const$3.varHandle(MemoryLayout.PathElement.groupElement("__cancel_routine"));
}

