// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1768 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1768() {}
    static final VarHandle const$0 = constants$1767.const$5.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$1 = constants$1767.const$5.varHandle(MemoryLayout.PathElement.groupElement("window"));
    static final VarHandle const$2 = constants$1767.const$5.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    static final VarHandle const$3 = constants$1767.const$5.varHandle(MemoryLayout.PathElement.groupElement("region"));
    static final VarHandle const$4 = constants$1767.const$5.varHandle(MemoryLayout.PathElement.groupElement("count"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("window"),
        JAVA_BYTE.withName("send_event"),
        MemoryLayout.paddingLayout(3),
        JAVA_INT.withName("state")
    ).withName("_GdkEventVisibility");
}

