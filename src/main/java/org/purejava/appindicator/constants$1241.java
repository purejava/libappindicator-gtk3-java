// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1241 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1241() {}
    static final VarHandle const$0 = constants$1240.const$4.varHandle(MemoryLayout.PathElement.groupElement("data_len"));
    static final VarHandle const$1 = constants$1240.const$4.varHandle(MemoryLayout.PathElement.groupElement("resource"));
    static final VarHandle const$2 = constants$1240.const$4.varHandle(MemoryLayout.PathElement.groupElement("next"));
    static final VarHandle const$3 = constants$1240.const$4.varHandle(MemoryLayout.PathElement.groupElement("padding"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_resource_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_resource_new_from_data",
        constants$5.const$5
    );
}


