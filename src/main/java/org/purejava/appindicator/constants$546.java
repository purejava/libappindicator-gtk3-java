// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$546 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$546() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_LONG.withName("g_type"),
        JAVA_LONG.withName("g_instance_type")
    ).withName("_GTypeInterface");
    static final VarHandle const$1 = constants$546.const$0.varHandle(MemoryLayout.PathElement.groupElement("g_type"));
    static final VarHandle const$2 = constants$546.const$0.varHandle(MemoryLayout.PathElement.groupElement("g_instance_type"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_LONG.withName("type"),
        RuntimeHelper.POINTER.withName("type_name"),
        JAVA_INT.withName("class_size"),
        JAVA_INT.withName("instance_size")
    ).withName("_GTypeQuery");
    static final VarHandle const$4 = constants$546.const$3.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$5 = constants$546.const$3.varHandle(MemoryLayout.PathElement.groupElement("type_name"));
}

