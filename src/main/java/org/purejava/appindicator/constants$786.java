// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$786 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$786() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$769.const$0
    );
    static final VarHandle const$1 = constants$781.const$0.varHandle(MemoryLayout.PathElement.groupElement("writev_fn"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GOutputStreamClass.writev_async.class, "apply", constants$764.const$1);
    static final VarHandle const$3 = constants$781.const$0.varHandle(MemoryLayout.PathElement.groupElement("writev_async"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GOutputStreamClass.writev_finish.class, "apply", constants$34.const$5);
    static final VarHandle const$5 = constants$781.const$0.varHandle(MemoryLayout.PathElement.groupElement("writev_finish"));
}


