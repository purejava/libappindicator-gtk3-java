// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$509 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$509() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GThreadFunctions.private_get.class, "apply", constants$5.const$2);
    static final VarHandle const$1 = constants$504.const$4.varHandle(MemoryLayout.PathElement.groupElement("private_get"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GThreadFunctions.private_set.class, "apply", constants$13.const$4);
    static final VarHandle const$3 = constants$504.const$4.varHandle(MemoryLayout.PathElement.groupElement("private_set"));
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GThreadFunctions.thread_create.class, "apply", constants$509.const$4);
}


