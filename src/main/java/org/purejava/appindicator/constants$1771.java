// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
final class constants$1771 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1771() {}
    static final VarHandle const$0 = constants$1769.const$4.varHandle(MemoryLayout.PathElement.groupElement("state"));
    static final VarHandle const$1 = constants$1769.const$4.varHandle(MemoryLayout.PathElement.groupElement("is_hint"));
    static final VarHandle const$2 = constants$1769.const$4.varHandle(MemoryLayout.PathElement.groupElement("device"));
    static final VarHandle const$3 = constants$1769.const$4.varHandle(MemoryLayout.PathElement.groupElement("x_root"));
    static final VarHandle const$4 = constants$1769.const$4.varHandle(MemoryLayout.PathElement.groupElement("y_root"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("window"),
        JAVA_BYTE.withName("send_event"),
        MemoryLayout.paddingLayout(3),
        JAVA_INT.withName("time"),
        JAVA_DOUBLE.withName("x"),
        JAVA_DOUBLE.withName("y"),
        RuntimeHelper.POINTER.withName("axes"),
        JAVA_INT.withName("state"),
        JAVA_INT.withName("button"),
        RuntimeHelper.POINTER.withName("device"),
        JAVA_DOUBLE.withName("x_root"),
        JAVA_DOUBLE.withName("y_root")
    ).withName("_GdkEventButton");
}


