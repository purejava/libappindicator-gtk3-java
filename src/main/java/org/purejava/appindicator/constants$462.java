// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$462 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$462() {}
    static final VarHandle const$0 = constants$461.const$2.varHandle(MemoryLayout.PathElement.groupElement("n_nums"));
    static final VarHandle const$1 = constants$461.const$2.varHandle(MemoryLayout.PathElement.groupElement("nums"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("data"),
        RuntimeHelper.POINTER.withName("msgs")
    ).withName("GTestLogBuffer");
    static final VarHandle const$3 = constants$462.const$2.varHandle(MemoryLayout.PathElement.groupElement("data"));
    static final VarHandle const$4 = constants$462.const$2.varHandle(MemoryLayout.PathElement.groupElement("msgs"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_test_log_type_name",
        constants$24.const$0
    );
}


