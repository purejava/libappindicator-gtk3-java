// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$525 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$525() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("__cancel_routine"),
        RuntimeHelper.POINTER.withName("__cancel_arg"),
        JAVA_INT.withName("__do_it"),
        JAVA_INT.withName("__cancel_type")
    ).withName("__pthread_cleanup_frame");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(__pthread_cleanup_frame.__cancel_routine.class, "apply", constants$13.const$1);
    static final VarHandle const$2 = constants$525.const$0.varHandle(MemoryLayout.PathElement.groupElement("__cancel_routine"));
    static final VarHandle const$3 = constants$525.const$0.varHandle(MemoryLayout.PathElement.groupElement("__cancel_arg"));
    static final VarHandle const$4 = constants$525.const$0.varHandle(MemoryLayout.PathElement.groupElement("__do_it"));
    static final VarHandle const$5 = constants$525.const$0.varHandle(MemoryLayout.PathElement.groupElement("__cancel_type"));
}


