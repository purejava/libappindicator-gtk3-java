// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$794 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$794() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_filter_output_stream_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_filter_output_stream_get_base_stream",
        constants$5.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_filter_output_stream_get_close_base_stream",
        constants$10.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_filter_output_stream_set_close_base_stream",
        constants$40.const$2
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        RuntimeHelper.POINTER.withName("g_class")
                    ).withName("g_type_instance"),
                    JAVA_INT.withName("ref_count"),
                    MemoryLayout.paddingLayout(4),
                    RuntimeHelper.POINTER.withName("qdata")
                ).withName("parent_instance"),
                RuntimeHelper.POINTER.withName("priv")
            ).withName("parent_instance"),
            RuntimeHelper.POINTER.withName("base_stream")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GBufferedOutputStream");
    static final VarHandle const$5 = constants$794.const$4.varHandle(MemoryLayout.PathElement.groupElement("priv"));
}


