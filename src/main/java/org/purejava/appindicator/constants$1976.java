// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$1976 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1976() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("parent"),
        RuntimeHelper.POINTER.withName("ref_accessible")
    ).withName("_AtkImplementorIface");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_AtkImplementorIface.ref_accessible.class, "apply", constants$5.const$2);
    static final VarHandle const$2 = constants$1976.const$0.varHandle(MemoryLayout.PathElement.groupElement("ref_accessible"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "atk_implementor_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "atk_implementor_ref_accessible",
        constants$5.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "atk_object_get_name",
        constants$5.const$2
    );
}


