// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1998 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1998() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$1942.const$3
    );
    static final VarHandle const$1 = constants$1994.const$3.varHandle(MemoryLayout.PathElement.groupElement("set_extents"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_AtkComponentIface.set_position.class, "apply", constants$608.const$5);
    static final VarHandle const$3 = constants$1994.const$3.varHandle(MemoryLayout.PathElement.groupElement("set_position"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_AtkComponentIface.set_size.class, "apply", constants$49.const$0);
    static final VarHandle const$5 = constants$1994.const$3.varHandle(MemoryLayout.PathElement.groupElement("set_size"));
}


