// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$507 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$507() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GThreadFunctions.cond_signal.class, "apply", constants$13.const$1);
    static final VarHandle const$1 = constants$504.const$4.varHandle(MemoryLayout.PathElement.groupElement("cond_signal"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GThreadFunctions.cond_broadcast.class, "apply", constants$13.const$1);
    static final VarHandle const$3 = constants$504.const$4.varHandle(MemoryLayout.PathElement.groupElement("cond_broadcast"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GThreadFunctions.cond_wait.class, "apply", constants$13.const$4);
    static final VarHandle const$5 = constants$504.const$4.varHandle(MemoryLayout.PathElement.groupElement("cond_wait"));
}


