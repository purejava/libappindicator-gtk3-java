// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$1374 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1374() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("ask_password"),
        RuntimeHelper.POINTER.withName("ask_password_async"),
        RuntimeHelper.POINTER.withName("ask_password_finish"),
        RuntimeHelper.POINTER.withName("request_certificate"),
        RuntimeHelper.POINTER.withName("request_certificate_async"),
        RuntimeHelper.POINTER.withName("request_certificate_finish"),
        MemoryLayout.sequenceLayout(21, RuntimeHelper.POINTER).withName("padding")
    ).withName("_GTlsInteractionClass");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GTlsInteractionClass.ask_password.class, "apply", constants$34.const$5);
    static final VarHandle const$2 = constants$1374.const$0.varHandle(MemoryLayout.PathElement.groupElement("ask_password"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GTlsInteractionClass.ask_password_async.class, "apply", constants$331.const$1);
    static final VarHandle const$4 = constants$1374.const$0.varHandle(MemoryLayout.PathElement.groupElement("ask_password_async"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GTlsInteractionClass.ask_password_finish.class, "apply", constants$12.const$2);
}


