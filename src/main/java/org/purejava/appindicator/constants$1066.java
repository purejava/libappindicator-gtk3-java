// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$1066 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1066() {}
    static final VarHandle const$0 = constants$1065.const$1.varHandle(MemoryLayout.PathElement.groupElement("can_seek"));
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GFileInputStreamClass.seek.class, "apply", constants$1066.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$1066.const$1
    );
    static final VarHandle const$4 = constants$1065.const$1.varHandle(MemoryLayout.PathElement.groupElement("seek"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GFileInputStreamClass.query_info.class, "apply", constants$39.const$1);
}

