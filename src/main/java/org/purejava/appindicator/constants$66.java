// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$66 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$66() {}
    static final VarHandle const$0 = constants$65.const$5.varHandle(MemoryLayout.PathElement.groupElement("quot"));
    static final VarHandle const$1 = constants$65.const$5.varHandle(MemoryLayout.PathElement.groupElement("rem"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_LONG.withName("quot"),
        JAVA_LONG.withName("rem")
    ).withName("lldiv_t");
    static final VarHandle const$3 = constants$66.const$2.varHandle(MemoryLayout.PathElement.groupElement("quot"));
    static final VarHandle const$4 = constants$66.const$2.varHandle(MemoryLayout.PathElement.groupElement("rem"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "__ctype_get_mb_cur_max",
        constants$3.const$5
    );
}


