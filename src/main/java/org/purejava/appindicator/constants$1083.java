// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1083 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1083() {}
    static final VarHandle const$0 = constants$1082.const$2.varHandle(MemoryLayout.PathElement.groupElement("can_seek"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GFileIOStreamClass.seek.class, "apply", constants$1069.const$3);
    static final VarHandle const$2 = constants$1082.const$2.varHandle(MemoryLayout.PathElement.groupElement("seek"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GFileIOStreamClass.can_truncate.class, "apply", constants$10.const$5);
    static final VarHandle const$4 = constants$1082.const$2.varHandle(MemoryLayout.PathElement.groupElement("can_truncate"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GFileIOStreamClass.truncate_fn.class, "apply", constants$394.const$4);
}


