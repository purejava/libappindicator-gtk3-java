// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
final class constants$2536 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2536() {}
    static final VarHandle const$0 = constants$2535.const$5.varHandle(MemoryLayout.PathElement.groupElement("arg_type"));
    static final UnionLayout const$1 = MemoryLayout.unionLayout(
        JAVA_LONG.withName("long_data"),
        JAVA_DOUBLE.withName("double_data"),
        RuntimeHelper.POINTER.withName("string_data")
    ).withName("");
    static final VarHandle const$2 = constants$2536.const$1.varHandle(MemoryLayout.PathElement.groupElement("long_data"));
    static final VarHandle const$3 = constants$2536.const$1.varHandle(MemoryLayout.PathElement.groupElement("double_data"));
    static final VarHandle const$4 = constants$2536.const$1.varHandle(MemoryLayout.PathElement.groupElement("string_data"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("next"),
        RuntimeHelper.POINTER.withName("signal_name"),
        JAVA_INT.withName("n_args"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("args")
    ).withName("_GtkBindingSignal");
}


