// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$713 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$713() {}
    static final VarHandle const$0 = constants$712.const$0.varHandle(MemoryLayout.PathElement.groupElement("remove_action"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("name"),
        RuntimeHelper.POINTER.withName("activate"),
        RuntimeHelper.POINTER.withName("parameter_type"),
        RuntimeHelper.POINTER.withName("state"),
        RuntimeHelper.POINTER.withName("change_state"),
        MemoryLayout.sequenceLayout(3, JAVA_LONG).withName("padding")
    ).withName("_GActionEntry");
    static final VarHandle const$2 = constants$713.const$1.varHandle(MemoryLayout.PathElement.groupElement("name"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GActionEntry.activate.class, "apply", constants$14.const$3);
    static final VarHandle const$4 = constants$713.const$1.varHandle(MemoryLayout.PathElement.groupElement("activate"));
    static final VarHandle const$5 = constants$713.const$1.varHandle(MemoryLayout.PathElement.groupElement("parameter_type"));
}

