// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
final class constants$1697 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1697() {}
    static final VarHandle const$0 = constants$1696.const$2.varHandle(MemoryLayout.PathElement.groupElement("height"));
    static final VarHandle const$1 = constants$1696.const$2.varHandle(MemoryLayout.PathElement.groupElement("x_advance"));
    static final VarHandle const$2 = constants$1696.const$2.varHandle(MemoryLayout.PathElement.groupElement("y_advance"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_DOUBLE.withName("ascent"),
        JAVA_DOUBLE.withName("descent"),
        JAVA_DOUBLE.withName("height"),
        JAVA_DOUBLE.withName("max_x_advance"),
        JAVA_DOUBLE.withName("max_y_advance")
    ).withName("cairo_font_extents_t");
    static final VarHandle const$4 = constants$1697.const$3.varHandle(MemoryLayout.PathElement.groupElement("ascent"));
    static final VarHandle const$5 = constants$1697.const$3.varHandle(MemoryLayout.PathElement.groupElement("descent"));
}

