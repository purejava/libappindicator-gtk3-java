// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1139 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1139() {}
    static final VarHandle const$0 = constants$1137.const$5.varHandle(MemoryLayout.PathElement.groupElement("load_finish"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_loadable_icon_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_loadable_icon_load",
        constants$858.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_loadable_icon_load_async$callback.class, "apply", constants$14.const$3);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_loadable_icon_load_async",
        constants$282.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_loadable_icon_load_finish",
        constants$39.const$1
    );
}


