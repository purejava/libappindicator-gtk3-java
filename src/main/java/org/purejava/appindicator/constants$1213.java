// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1213 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1213() {}
    static final VarHandle const$0 = constants$1212.const$4.varHandle(MemoryLayout.PathElement.groupElement("can_poll"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GPollableInputStreamInterface.is_readable.class, "apply", constants$10.const$5);
    static final VarHandle const$2 = constants$1212.const$4.varHandle(MemoryLayout.PathElement.groupElement("is_readable"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GPollableInputStreamInterface.create_source.class, "apply", constants$5.const$5);
    static final VarHandle const$4 = constants$1212.const$4.varHandle(MemoryLayout.PathElement.groupElement("create_source"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GPollableInputStreamInterface.read_nonblocking.class, "apply", constants$20.const$4);
}


