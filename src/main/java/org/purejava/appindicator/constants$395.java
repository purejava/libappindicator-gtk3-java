// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$395 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$395() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_qsort_with_data",
        constants$395.const$0
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("head"),
        RuntimeHelper.POINTER.withName("tail"),
        JAVA_INT.withName("length"),
        MemoryLayout.paddingLayout(4)
    ).withName("_GQueue");
    static final VarHandle const$3 = constants$395.const$2.varHandle(MemoryLayout.PathElement.groupElement("head"));
    static final VarHandle const$4 = constants$395.const$2.varHandle(MemoryLayout.PathElement.groupElement("tail"));
    static final VarHandle const$5 = constants$395.const$2.varHandle(MemoryLayout.PathElement.groupElement("length"));
}


