// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$977 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$977() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GFileIface.enumerate_children.class, "apply", constants$977.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$977.const$0
    );
    static final VarHandle const$3 = constants$971.const$5.varHandle(MemoryLayout.PathElement.groupElement("enumerate_children"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GFileIface.enumerate_children_async.class, "apply", constants$780.const$3);
    static final VarHandle const$5 = constants$971.const$5.varHandle(MemoryLayout.PathElement.groupElement("enumerate_children_async"));
}


