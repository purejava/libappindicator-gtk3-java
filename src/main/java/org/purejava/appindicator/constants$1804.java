// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1804 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1804() {}
    static final VarHandle const$0 = constants$1802.const$0.varHandle(MemoryLayout.PathElement.groupElement("scale"));
    static final VarHandle const$1 = constants$1802.const$0.varHandle(MemoryLayout.PathElement.groupElement("x_root"));
    static final VarHandle const$2 = constants$1802.const$0.varHandle(MemoryLayout.PathElement.groupElement("y_root"));
    static final VarHandle const$3 = constants$1802.const$0.varHandle(MemoryLayout.PathElement.groupElement("state"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("window"),
        JAVA_BYTE.withName("send_event"),
        MemoryLayout.paddingLayout(3),
        JAVA_INT.withName("time"),
        JAVA_INT.withName("group"),
        JAVA_INT.withName("button"),
        JAVA_INT.withName("mode"),
        MemoryLayout.paddingLayout(4)
    ).withName("_GdkEventPadButton");
    static final VarHandle const$5 = constants$1804.const$4.varHandle(MemoryLayout.PathElement.groupElement("type"));
}


