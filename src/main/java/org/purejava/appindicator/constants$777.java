// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$777 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$777() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_buffered_input_stream_fill_async$callback.class, "apply", constants$14.const$3);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_buffered_input_stream_fill_async",
        constants$762.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_buffered_input_stream_fill_finish",
        constants$166.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_buffered_input_stream_read_byte",
        constants$12.const$2
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GOutputStream");
    static final VarHandle const$5 = constants$777.const$4.varHandle(MemoryLayout.PathElement.groupElement("priv"));
}


