// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1386 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1386() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_unix_credentials_message_new_with_credentials",
        constants$5.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_unix_credentials_message_get_credentials",
        constants$5.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_unix_credentials_message_is_supported",
        constants$83.const$1
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("_g_reserved1"),
        RuntimeHelper.POINTER.withName("_g_reserved2"),
        RuntimeHelper.POINTER.withName("_g_reserved3"),
        RuntimeHelper.POINTER.withName("_g_reserved4"),
        RuntimeHelper.POINTER.withName("_g_reserved5")
    ).withName("_GUnixFDListClass");
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GUnixFDListClass._g_reserved1.class, "apply", constants$7.const$5);
    static final VarHandle const$5 = constants$1386.const$3.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"));
}


