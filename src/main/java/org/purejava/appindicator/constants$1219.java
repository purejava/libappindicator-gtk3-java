// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
final class constants$1219 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1219() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_proxy_supports_hostname",
        constants$10.const$5
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
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
    static final VarHandle const$2 = constants$1219.const$1.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        JAVA_LONG.withName("g_type")
                    ).withName("g_type_class"),
                    RuntimeHelper.POINTER.withName("construct_properties"),
                    RuntimeHelper.POINTER.withName("constructor"),
                    RuntimeHelper.POINTER.withName("set_property"),
                    RuntimeHelper.POINTER.withName("get_property"),
                    RuntimeHelper.POINTER.withName("dispose"),
                    RuntimeHelper.POINTER.withName("finalize"),
                    RuntimeHelper.POINTER.withName("dispatch_properties_changed"),
                    RuntimeHelper.POINTER.withName("notify"),
                    RuntimeHelper.POINTER.withName("constructed"),
                    JAVA_LONG.withName("flags"),
                    JAVA_LONG.withName("n_construct_properties"),
                    RuntimeHelper.POINTER.withName("pspecs"),
                    JAVA_LONG.withName("n_pspecs"),
                    MemoryLayout.sequenceLayout(3, RuntimeHelper.POINTER).withName("pdummy")
                ).withName("parent_class"),
                RuntimeHelper.POINTER.withName("get_family"),
                RuntimeHelper.POINTER.withName("get_native_size"),
                RuntimeHelper.POINTER.withName("to_native")
            ).withName("parent_class")
        ).withName("parent_class")
    ).withName("_GProxyAddressClass");
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_proxy_address_get_type",
        constants$3.const$5
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_SHORT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_SHORT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "g_proxy_address_new",
        constants$1219.const$5
    );
}


