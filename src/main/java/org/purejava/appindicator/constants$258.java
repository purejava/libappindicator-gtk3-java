// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$258 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$258() {}
    static final VarHandle const$0 = constants$256.const$2.varHandle(MemoryLayout.PathElement.groupElement("prev"));
    static final VarHandle const$1 = constants$256.const$2.varHandle(MemoryLayout.PathElement.groupElement("next"));
    static final VarHandle const$2 = constants$256.const$2.varHandle(MemoryLayout.PathElement.groupElement("name"));
    static final VarHandle const$3 = constants$256.const$2.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("ref"),
        RuntimeHelper.POINTER.withName("unref"),
        RuntimeHelper.POINTER.withName("get")
    ).withName("_GSourceCallbackFuncs");
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GSourceCallbackFuncs.ref.class, "apply", constants$13.const$1);
}


