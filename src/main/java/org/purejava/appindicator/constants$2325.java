// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$2325 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2325() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GtkCellAreaClass.foreach_alloc.class, "apply", constants$868.const$1);
    static final VarHandle const$1 = constants$2323.const$5.varHandle(MemoryLayout.PathElement.groupElement("foreach_alloc"));
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GtkCellAreaClass.event.class, "apply", constants$2325.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$2325.const$2
    );
    static final VarHandle const$5 = constants$2323.const$5.varHandle(MemoryLayout.PathElement.groupElement("event"));
}

