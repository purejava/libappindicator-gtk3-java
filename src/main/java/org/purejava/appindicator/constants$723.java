// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$723 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$723() {}
    static final VarHandle const$0 = constants$715.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_supported_types"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GAppInfoIface.launch_uris_async.class, "apply", constants$338.const$3);
    static final VarHandle const$2 = constants$715.const$2.varHandle(MemoryLayout.PathElement.groupElement("launch_uris_async"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GAppInfoIface.launch_uris_finish.class, "apply", constants$12.const$2);
    static final VarHandle const$4 = constants$715.const$2.varHandle(MemoryLayout.PathElement.groupElement("launch_uris_finish"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_app_info_get_type",
        constants$3.const$5
    );
}


