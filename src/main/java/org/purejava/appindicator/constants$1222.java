// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1222 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1222() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_proxy_connect_async$callback.class, "apply", constants$14.const$3);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_proxy_connect_async",
        constants$339.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_proxy_connect_finish",
        constants$23.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_proxy_supports_hostname",
        constants$10.const$5
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        RuntimeHelper.POINTER.withName("g_class")
                    ).withName("g_type_instance"),
                    JAVA_INT.withName("ref_count"),
                    MemoryLayout.paddingLayout(4),
                    RuntimeHelper.POINTER.withName("qdata")
                ).withName("parent_instance")
            ).withName("parent_instance"),
            RuntimeHelper.POINTER.withName("priv")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GProxyAddress");
    static final VarHandle const$5 = constants$1222.const$4.varHandle(MemoryLayout.PathElement.groupElement("priv"));
}


