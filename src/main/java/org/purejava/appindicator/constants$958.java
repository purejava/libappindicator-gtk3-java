// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$958 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$958() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("accept_certificate"),
        RuntimeHelper.POINTER.withName("handshake"),
        RuntimeHelper.POINTER.withName("handshake_async"),
        RuntimeHelper.POINTER.withName("handshake_finish"),
        RuntimeHelper.POINTER.withName("shutdown"),
        RuntimeHelper.POINTER.withName("shutdown_async"),
        RuntimeHelper.POINTER.withName("shutdown_finish"),
        RuntimeHelper.POINTER.withName("set_advertised_protocols"),
        RuntimeHelper.POINTER.withName("get_negotiated_protocol"),
        RuntimeHelper.POINTER.withName("get_binding_data")
    ).withName("_GDtlsConnectionInterface");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GDtlsConnectionInterface.accept_certificate.class, "apply", constants$62.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$62.const$0
    );
    static final VarHandle const$3 = constants$958.const$0.varHandle(MemoryLayout.PathElement.groupElement("accept_certificate"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GDtlsConnectionInterface.handshake.class, "apply", constants$12.const$2);
    static final VarHandle const$5 = constants$958.const$0.varHandle(MemoryLayout.PathElement.groupElement("handshake"));
}


