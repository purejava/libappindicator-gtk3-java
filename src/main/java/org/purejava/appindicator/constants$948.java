// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$948 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$948() {}
    static final VarHandle const$0 = constants$941.const$2.varHandle(MemoryLayout.PathElement.groupElement("can_start"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GDriveIface.can_start_degraded.class, "apply", constants$10.const$5);
    static final VarHandle const$2 = constants$941.const$2.varHandle(MemoryLayout.PathElement.groupElement("can_start_degraded"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GDriveIface.start.class, "apply", constants$381.const$0);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$381.const$0
    );
    static final VarHandle const$5 = constants$941.const$2.varHandle(MemoryLayout.PathElement.groupElement("start"));
}


