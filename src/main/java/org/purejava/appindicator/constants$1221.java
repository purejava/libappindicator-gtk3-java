// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$1221 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1221() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_proxy_address_get_uri",
        constants$5.const$2
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent_instance")
    ).withName("_GSocketAddressEnumerator");
    static final StructLayout const$2 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("next"),
        RuntimeHelper.POINTER.withName("next_async"),
        RuntimeHelper.POINTER.withName("next_finish")
    ).withName("_GSocketAddressEnumeratorClass");
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GSocketAddressEnumeratorClass.next.class, "apply", constants$23.const$0);
    static final VarHandle const$4 = constants$1221.const$2.varHandle(MemoryLayout.PathElement.groupElement("next"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GSocketAddressEnumeratorClass.next_async.class, "apply", constants$42.const$1);
}


