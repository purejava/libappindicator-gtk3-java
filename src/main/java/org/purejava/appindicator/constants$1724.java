// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1724 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1724() {}
    static final VarHandle const$0 = constants$1723.const$4.varHandle(MemoryLayout.PathElement.groupElement("length"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_DOUBLE.withName("x"),
        JAVA_DOUBLE.withName("y")
    ).withName("");
    static final VarHandle const$2 = constants$1724.const$1.varHandle(MemoryLayout.PathElement.groupElement("x"));
    static final VarHandle const$3 = constants$1724.const$1.varHandle(MemoryLayout.PathElement.groupElement("y"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("status"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("data"),
        JAVA_INT.withName("num_data"),
        MemoryLayout.paddingLayout(4)
    ).withName("cairo_path");
    static final VarHandle const$5 = constants$1724.const$4.varHandle(MemoryLayout.PathElement.groupElement("status"));
}


