// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1528 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1528() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_DOUBLE,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "pango_units_to_double",
        constants$1528.const$0
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("x"),
        JAVA_INT.withName("y"),
        JAVA_INT.withName("width"),
        JAVA_INT.withName("height")
    ).withName("_PangoRectangle");
    static final VarHandle const$3 = constants$1528.const$2.varHandle(MemoryLayout.PathElement.groupElement("x"));
    static final VarHandle const$4 = constants$1528.const$2.varHandle(MemoryLayout.PathElement.groupElement("y"));
    static final VarHandle const$5 = constants$1528.const$2.varHandle(MemoryLayout.PathElement.groupElement("width"));
}


