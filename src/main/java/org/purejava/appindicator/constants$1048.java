// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1048 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1048() {}
    static final VarHandle const$0 = constants$1044.const$0.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved6"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GFileEnumeratorClass._g_reserved7.class, "apply", constants$7.const$5);
    static final VarHandle const$2 = constants$1044.const$0.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved7"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_file_enumerator_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_file_enumerator_next_file",
        constants$23.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_file_enumerator_close",
        constants$12.const$2
    );
}


