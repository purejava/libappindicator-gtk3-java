// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1627 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1627() {}
    static final VarHandle const$0 = constants$1626.const$5.varHandle(MemoryLayout.PathElement.groupElement("layout"));
    static final VarHandle const$1 = constants$1626.const$5.varHandle(MemoryLayout.PathElement.groupElement("start_index"));
    static final VarHandle const$2 = constants$1626.const$5.varHandle(MemoryLayout.PathElement.groupElement("length"));
    static final VarHandle const$3 = constants$1626.const$5.varHandle(MemoryLayout.PathElement.groupElement("runs"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "pango_layout_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "pango_layout_new",
        constants$5.const$2
    );
}


