// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
final class constants$1529 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1529() {}
    static final VarHandle const$0 = constants$1528.const$2.varHandle(MemoryLayout.PathElement.groupElement("height"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "pango_extents_to_pixels",
        constants$13.const$4
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_DOUBLE.withName("xx"),
        JAVA_DOUBLE.withName("xy"),
        JAVA_DOUBLE.withName("yx"),
        JAVA_DOUBLE.withName("yy"),
        JAVA_DOUBLE.withName("x0"),
        JAVA_DOUBLE.withName("y0")
    ).withName("_PangoMatrix");
    static final VarHandle const$3 = constants$1529.const$2.varHandle(MemoryLayout.PathElement.groupElement("xx"));
    static final VarHandle const$4 = constants$1529.const$2.varHandle(MemoryLayout.PathElement.groupElement("xy"));
    static final VarHandle const$5 = constants$1529.const$2.varHandle(MemoryLayout.PathElement.groupElement("yx"));
}


