// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$506 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$506() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GThreadFunctions.mutex_unlock.class, "apply", constants$13.const$1);
    static final VarHandle const$1 = constants$504.const$4.varHandle(MemoryLayout.PathElement.groupElement("mutex_unlock"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GThreadFunctions.mutex_free.class, "apply", constants$13.const$1);
    static final VarHandle const$3 = constants$504.const$4.varHandle(MemoryLayout.PathElement.groupElement("mutex_free"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GThreadFunctions.cond_new.class, "apply", constants$35.const$2);
    static final VarHandle const$5 = constants$504.const$4.varHandle(MemoryLayout.PathElement.groupElement("cond_new"));
}


