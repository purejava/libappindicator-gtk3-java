// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1385 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1385() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GUnixCredentialsMessageClass._g_reserved2.class, "apply", constants$7.const$5);
    static final VarHandle const$1 = constants$1384.const$3.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    RuntimeHelper.POINTER.withName("g_class")
                ).withName("g_type_instance"),
                JAVA_INT.withName("ref_count"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("qdata")
            ).withName("parent_instance"),
            RuntimeHelper.POINTER.withName("priv")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GUnixCredentialsMessage");
    static final VarHandle const$3 = constants$1385.const$2.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_unix_credentials_message_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_unix_credentials_message_new",
        constants$35.const$2
    );
}


