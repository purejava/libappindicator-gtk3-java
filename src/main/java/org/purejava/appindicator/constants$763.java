// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$763 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$763() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$762.const$4
    );
    static final VarHandle const$1 = constants$762.const$3.varHandle(MemoryLayout.PathElement.groupElement("read_fn"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GInputStreamClass.skip.class, "apply", constants$4.const$5);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$4.const$5
    );
    static final VarHandle const$4 = constants$762.const$3.varHandle(MemoryLayout.PathElement.groupElement("skip"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GInputStreamClass.close_fn.class, "apply", constants$12.const$2);
}


