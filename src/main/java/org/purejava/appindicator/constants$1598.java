// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1598 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1598() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "pango_context_get_round_glyph_positions",
        constants$10.const$5
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("width"),
        JAVA_INT.withName("x_offset"),
        JAVA_INT.withName("y_offset")
    ).withName("_PangoGlyphGeometry");
    static final VarHandle const$2 = constants$1598.const$1.varHandle(MemoryLayout.PathElement.groupElement("width"));
    static final VarHandle const$3 = constants$1598.const$1.varHandle(MemoryLayout.PathElement.groupElement("x_offset"));
    static final VarHandle const$4 = constants$1598.const$1.varHandle(MemoryLayout.PathElement.groupElement("y_offset"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(4)
    ).withName("_PangoGlyphVisAttr");
}


