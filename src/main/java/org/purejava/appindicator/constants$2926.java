// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$2926 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2926() {}
    static final VarHandle const$0 = constants$2925.const$5.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$1 = constants$2925.const$5.varHandle(MemoryLayout.PathElement.groupElement("index"));
    static final VarHandle const$2 = constants$2925.const$5.varHandle(MemoryLayout.PathElement.groupElement("mode"));
    static final VarHandle const$3 = constants$2925.const$5.varHandle(MemoryLayout.PathElement.groupElement("label"));
    static final VarHandle const$4 = constants$2925.const$5.varHandle(MemoryLayout.PathElement.groupElement("action_name"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_pad_controller_get_type",
        constants$3.const$5
    );
}


