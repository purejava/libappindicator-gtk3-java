// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$2041 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2041() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "atk_hyperlink_impl_get_hyperlink",
        constants$5.const$2
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("parent"),
        RuntimeHelper.POINTER.withName("get_link"),
        RuntimeHelper.POINTER.withName("get_n_links"),
        RuntimeHelper.POINTER.withName("get_link_index"),
        RuntimeHelper.POINTER.withName("link_selected")
    ).withName("_AtkHypertextIface");
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_AtkHypertextIface.get_link.class, "apply", constants$21.const$3);
    static final VarHandle const$3 = constants$2041.const$1.varHandle(MemoryLayout.PathElement.groupElement("get_link"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_AtkHypertextIface.get_n_links.class, "apply", constants$10.const$5);
    static final VarHandle const$5 = constants$2041.const$1.varHandle(MemoryLayout.PathElement.groupElement("get_n_links"));
}


