// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1564 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1564() {}
    static final VarHandle const$0 = constants$1563.const$5.varHandle(MemoryLayout.PathElement.groupElement("value"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("klass"),
            JAVA_INT.withName("start_index"),
            JAVA_INT.withName("end_index")
        ).withName("attr"),
        JAVA_INT.withName("value"),
        MemoryLayout.paddingLayout(4)
    ).withName("_PangoAttrInt");
    static final VarHandle const$2 = constants$1564.const$1.varHandle(MemoryLayout.PathElement.groupElement("value"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("klass"),
            JAVA_INT.withName("start_index"),
            JAVA_INT.withName("end_index")
        ).withName("attr"),
        JAVA_DOUBLE.withName("value")
    ).withName("_PangoAttrFloat");
    static final VarHandle const$4 = constants$1564.const$3.varHandle(MemoryLayout.PathElement.groupElement("value"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("klass"),
            JAVA_INT.withName("start_index"),
            JAVA_INT.withName("end_index")
        ).withName("attr"),
        MemoryLayout.structLayout(
            JAVA_SHORT.withName("red"),
            JAVA_SHORT.withName("green"),
            JAVA_SHORT.withName("blue")
        ).withName("color"),
        MemoryLayout.paddingLayout(2)
    ).withName("_PangoAttrColor");
}


