// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1414 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1414() {}
    static final VarHandle const$0 = constants$1413.const$4.varHandle(MemoryLayout.PathElement.groupElement("i32"));
    static final UnionLayout const$1 = MemoryLayout.unionLayout(
        JAVA_FLOAT.withName("f"),
        JAVA_INT.withName("u32"),
        JAVA_INT.withName("i32"),
        MemoryLayout.sequenceLayout(2, JAVA_SHORT).withName("u16"),
        MemoryLayout.sequenceLayout(2, JAVA_SHORT).withName("i16"),
        MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("u8"),
        MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("i8")
    ).withName("_hb_var_num_t");
    static final VarHandle const$2 = constants$1414.const$1.varHandle(MemoryLayout.PathElement.groupElement("f"));
    static final VarHandle const$3 = constants$1414.const$1.varHandle(MemoryLayout.PathElement.groupElement("u32"));
    static final VarHandle const$4 = constants$1414.const$1.varHandle(MemoryLayout.PathElement.groupElement("i32"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "hb_tag_from_string",
        constants$11.const$4
    );
}

