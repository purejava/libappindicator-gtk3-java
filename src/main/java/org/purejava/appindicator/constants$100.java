// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$100 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$100() {}
    static final VarHandle const$0 = constants$99.const$5.varHandle(MemoryLayout.PathElement.groupElement("p"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("p"),
        MemoryLayout.sequenceLayout(2, JAVA_INT).withName("i")
    ).withName("_GRecMutex");
    static final VarHandle const$2 = constants$100.const$1.varHandle(MemoryLayout.PathElement.groupElement("p"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("p"),
        RuntimeHelper.POINTER.withName("notify"),
        MemoryLayout.sequenceLayout(2, RuntimeHelper.POINTER).withName("future")
    ).withName("_GPrivate");
    static final VarHandle const$4 = constants$100.const$3.varHandle(MemoryLayout.PathElement.groupElement("p"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GPrivate.notify.class, "apply", constants$13.const$1);
}


