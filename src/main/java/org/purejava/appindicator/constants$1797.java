// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
final class constants$1797 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1797() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("window"),
        JAVA_BYTE.withName("send_event"),
        JAVA_BYTE.withName("phase"),
        JAVA_BYTE.withName("n_fingers"),
        MemoryLayout.paddingLayout(1),
        JAVA_INT.withName("time"),
        JAVA_DOUBLE.withName("x"),
        JAVA_DOUBLE.withName("y"),
        JAVA_DOUBLE.withName("dx"),
        JAVA_DOUBLE.withName("dy"),
        JAVA_DOUBLE.withName("angle_delta"),
        JAVA_DOUBLE.withName("scale"),
        JAVA_DOUBLE.withName("x_root"),
        JAVA_DOUBLE.withName("y_root"),
        JAVA_INT.withName("state"),
        MemoryLayout.paddingLayout(4)
    ).withName("_GdkEventTouchpadPinch");
    static final VarHandle const$1 = constants$1797.const$0.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$2 = constants$1797.const$0.varHandle(MemoryLayout.PathElement.groupElement("window"));
    static final VarHandle const$3 = constants$1797.const$0.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    static final VarHandle const$4 = constants$1797.const$0.varHandle(MemoryLayout.PathElement.groupElement("phase"));
    static final VarHandle const$5 = constants$1797.const$0.varHandle(MemoryLayout.PathElement.groupElement("n_fingers"));
}


