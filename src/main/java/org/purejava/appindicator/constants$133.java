// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
final class constants$133 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$133() {}
    static final VarHandle const$0 = constants$132.const$4.varHandle(MemoryLayout.PathElement.groupElement("size"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("magic"),
            JAVA_INT.withName("size")
        ).withName("head"),
        JAVA_SHORT.withName("vl"),
        JAVA_SHORT.withName("flags"),
        MemoryLayout.sequenceLayout(2, JAVA_SHORT).withName("__reserved")
    ).withName("sve_context");
    static final VarHandle const$2 = constants$133.const$1.varHandle(MemoryLayout.PathElement.groupElement("vl"));
    static final VarHandle const$3 = constants$133.const$1.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("magic"),
            JAVA_INT.withName("size")
        ).withName("head"),
        JAVA_LONG.withName("tpidr2")
    ).withName("tpidr2_context");
    static final VarHandle const$5 = constants$133.const$4.varHandle(MemoryLayout.PathElement.groupElement("tpidr2"));
}


