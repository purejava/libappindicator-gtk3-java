// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$316 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$316() {}
    static final VarHandle const$0 = constants$314.const$0.varHandle(MemoryLayout.PathElement.groupElement("reserved1"));
    static final VarHandle const$1 = constants$314.const$0.varHandle(MemoryLayout.PathElement.groupElement("reserved2"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(GIOFunc.class, "apply", constants$150.const$0);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$150.const$0
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("io_read"),
        RuntimeHelper.POINTER.withName("io_write"),
        RuntimeHelper.POINTER.withName("io_seek"),
        RuntimeHelper.POINTER.withName("io_close"),
        RuntimeHelper.POINTER.withName("io_create_watch"),
        RuntimeHelper.POINTER.withName("io_free"),
        RuntimeHelper.POINTER.withName("io_set_flags"),
        RuntimeHelper.POINTER.withName("io_get_flags")
    ).withName("_GIOFuncs");
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
}


