// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$3020 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3020() {}
    static final VarHandle const$0 = constants$3019.const$2.varHandle(MemoryLayout.PathElement.groupElement("mime_type"));
    static final VarHandle const$1 = constants$3019.const$2.varHandle(MemoryLayout.PathElement.groupElement("applications"));
    static final VarHandle const$2 = constants$3019.const$2.varHandle(MemoryLayout.PathElement.groupElement("groups"));
    static final VarHandle const$3 = constants$3019.const$2.varHandle(MemoryLayout.PathElement.groupElement("age"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_recent_filter_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_recent_filter_new",
        constants$35.const$2
    );
}


