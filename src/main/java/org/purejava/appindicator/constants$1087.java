// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1087 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1087() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GFileIOStreamClass._g_reserved5.class, "apply", constants$7.const$5);
    static final VarHandle const$1 = constants$1082.const$2.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_file_io_stream_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_file_io_stream_query_info",
        constants$39.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(g_file_io_stream_query_info_async$callback.class, "apply", constants$14.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_file_io_stream_query_info_async",
        constants$587.const$0
    );
}


