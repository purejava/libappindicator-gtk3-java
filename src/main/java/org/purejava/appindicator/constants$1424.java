// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1424 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1424() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "hb_color_get_green",
        constants$1423.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "hb_color_get_blue",
        constants$1423.const$3
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("x_bearing"),
        JAVA_INT.withName("y_bearing"),
        JAVA_INT.withName("width"),
        JAVA_INT.withName("height")
    ).withName("hb_glyph_extents_t");
    static final VarHandle const$3 = constants$1424.const$2.varHandle(MemoryLayout.PathElement.groupElement("x_bearing"));
    static final VarHandle const$4 = constants$1424.const$2.varHandle(MemoryLayout.PathElement.groupElement("y_bearing"));
    static final VarHandle const$5 = constants$1424.const$2.varHandle(MemoryLayout.PathElement.groupElement("width"));
}


