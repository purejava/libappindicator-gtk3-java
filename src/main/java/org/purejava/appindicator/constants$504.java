// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$504 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$504() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GThreadFunctions.mutex_trylock.class, "apply", constants$10.const$5);
    static final VarHandle const$1 = constants$503.const$0.varHandle(MemoryLayout.PathElement.groupElement("mutex_trylock"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GThreadFunctions.mutex_unlock.class, "apply", constants$13.const$1);
    static final VarHandle const$3 = constants$503.const$0.varHandle(MemoryLayout.PathElement.groupElement("mutex_unlock"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GThreadFunctions.mutex_free.class, "apply", constants$13.const$1);
    static final VarHandle const$5 = constants$503.const$0.varHandle(MemoryLayout.PathElement.groupElement("mutex_free"));
}


