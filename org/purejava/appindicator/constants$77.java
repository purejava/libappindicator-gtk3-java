// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$77 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$77() {}
    static final UnionLayout const$0 = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("__size"),
        JAVA_INT.withName("__align")
    ).withName("pthread_mutexattr_t");
    static final VarHandle const$1 = constants$77.const$0.varHandle(MemoryLayout.PathElement.groupElement("__align"));
    static final UnionLayout const$2 = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("__size"),
        JAVA_INT.withName("__align")
    ).withName("pthread_condattr_t");
    static final VarHandle const$3 = constants$77.const$2.varHandle(MemoryLayout.PathElement.groupElement("__align"));
    static final UnionLayout const$4 = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(64, JAVA_BYTE).withName("__size"),
        JAVA_LONG.withName("__align")
    ).withName("pthread_attr_t");
    static final VarHandle const$5 = constants$77.const$4.varHandle(MemoryLayout.PathElement.groupElement("__align"));
}

