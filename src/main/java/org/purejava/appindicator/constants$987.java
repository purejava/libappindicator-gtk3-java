// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$987 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$987() {}
    static final VarHandle const$0 = constants$971.const$5.varHandle(MemoryLayout.PathElement.groupElement("read_finish"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GFileIface.append_to.class, "apply", constants$180.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$180.const$0
    );
    static final VarHandle const$3 = constants$971.const$5.varHandle(MemoryLayout.PathElement.groupElement("append_to"));
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GFileIface.append_to_async.class, "apply", constants$987.const$4);
}


