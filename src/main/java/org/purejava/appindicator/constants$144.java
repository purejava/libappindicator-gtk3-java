// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$144 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$144() {}
    static final VarHandle const$0 = constants$143.const$4.varHandle(MemoryLayout.PathElement.groupElement("uc_link"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "siginterrupt",
        constants$123.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "sigaltstack",
        constants$9.const$0
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("ss_sp"),
        JAVA_INT.withName("ss_onstack"),
        MemoryLayout.paddingLayout(4)
    ).withName("sigstack");
    static final VarHandle const$4 = constants$144.const$3.varHandle(MemoryLayout.PathElement.groupElement("ss_sp"));
    static final VarHandle const$5 = constants$144.const$3.varHandle(MemoryLayout.PathElement.groupElement("ss_onstack"));
}


