// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1138 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1138() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GLoadableIconIface.load.class, "apply", constants$858.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$858.const$5
    );
    static final VarHandle const$2 = constants$1137.const$5.varHandle(MemoryLayout.PathElement.groupElement("load"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GLoadableIconIface.load_async.class, "apply", constants$282.const$1);
    static final VarHandle const$4 = constants$1137.const$5.varHandle(MemoryLayout.PathElement.groupElement("load_async"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GLoadableIconIface.load_finish.class, "apply", constants$39.const$1);
}


