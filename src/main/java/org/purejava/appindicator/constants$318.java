// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$318 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$318() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GIOFuncs.io_seek.class, "apply", constants$317.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$317.const$5
    );
    static final VarHandle const$2 = constants$316.const$4.varHandle(MemoryLayout.PathElement.groupElement("io_seek"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GIOFuncs.io_close.class, "apply", constants$9.const$0);
    static final VarHandle const$4 = constants$316.const$4.varHandle(MemoryLayout.PathElement.groupElement("io_close"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GIOFuncs.io_create_watch.class, "apply", constants$21.const$3);
}


