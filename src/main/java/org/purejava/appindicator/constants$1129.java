// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$1129 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1129() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_io_scheduler_job_send_to_mainloop_async",
        constants$42.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_list_model_get_type",
        constants$3.const$5
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("get_item_type"),
        RuntimeHelper.POINTER.withName("get_n_items"),
        RuntimeHelper.POINTER.withName("get_item")
    ).withName("_GListModelInterface");
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GListModelInterface.get_item_type.class, "apply", constants$4.const$0);
    static final VarHandle const$4 = constants$1129.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_item_type"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GListModelInterface.get_n_items.class, "apply", constants$10.const$5);
}

