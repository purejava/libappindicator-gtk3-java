// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$627 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$627() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pspec"),
        RuntimeHelper.POINTER.withName("value")
    ).withName("_GObjectConstructParam");
    static final VarHandle const$1 = constants$627.const$0.varHandle(MemoryLayout.PathElement.groupElement("pspec"));
    static final VarHandle const$2 = constants$627.const$0.varHandle(MemoryLayout.PathElement.groupElement("value"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_initially_unowned_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_object_class_install_property",
        constants$42.const$4
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_object_class_find_property",
        constants$5.const$5
    );
}


