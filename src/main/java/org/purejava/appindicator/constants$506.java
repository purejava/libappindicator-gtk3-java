// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$506 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$506() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GThreadFunctions.cond_wait.class, "apply", constants$13.const$4);
    static final VarHandle const$1 = constants$503.const$0.varHandle(MemoryLayout.PathElement.groupElement("cond_wait"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GThreadFunctions.cond_timed_wait.class, "apply", constants$12.const$2);
    static final VarHandle const$3 = constants$503.const$0.varHandle(MemoryLayout.PathElement.groupElement("cond_timed_wait"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GThreadFunctions.cond_free.class, "apply", constants$13.const$1);
    static final VarHandle const$5 = constants$503.const$0.varHandle(MemoryLayout.PathElement.groupElement("cond_free"));
}


