// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1041 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1041() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_file_load_bytes_finish",
        constants$39.const$1
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("name"),
        JAVA_INT.withName("type"),
        JAVA_INT.withName("flags")
    ).withName("_GFileAttributeInfo");
    static final VarHandle const$2 = constants$1041.const$1.varHandle(MemoryLayout.PathElement.groupElement("name"));
    static final VarHandle const$3 = constants$1041.const$1.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$4 = constants$1041.const$1.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("infos"),
        JAVA_INT.withName("n_infos"),
        MemoryLayout.paddingLayout(4)
    ).withName("_GFileAttributeInfoList");
}


