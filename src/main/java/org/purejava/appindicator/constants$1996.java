// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1996 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1996() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_AtkComponentIface.get_extents.class, "apply", constants$673.const$2);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$673.const$2
    );
    static final VarHandle const$2 = constants$1994.const$3.varHandle(MemoryLayout.PathElement.groupElement("get_extents"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_AtkComponentIface.get_position.class, "apply", constants$331.const$4);
    static final VarHandle const$4 = constants$1994.const$3.varHandle(MemoryLayout.PathElement.groupElement("get_position"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_AtkComponentIface.get_size.class, "apply", constants$14.const$3);
}


