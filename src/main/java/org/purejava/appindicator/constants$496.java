// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$496 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$496() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(GCompletionFunc.class, "apply", constants$5.const$2);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(GCompletionStrncmpFunc.class, "apply", constants$18.const$2);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$18.const$2
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("items"),
        RuntimeHelper.POINTER.withName("func"),
        RuntimeHelper.POINTER.withName("prefix"),
        RuntimeHelper.POINTER.withName("cache"),
        RuntimeHelper.POINTER.withName("strncmp_func")
    ).withName("_GCompletion");
    static final VarHandle const$4 = constants$496.const$3.varHandle(MemoryLayout.PathElement.groupElement("items"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GCompletion.func.class, "apply", constants$5.const$2);
}

