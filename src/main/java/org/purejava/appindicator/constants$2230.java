// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
final class constants$2230 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2230() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GtkMiscClass._gtk_reserved3.class, "apply", constants$7.const$5);
    static final VarHandle const$1 = constants$2229.const$1.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GtkMiscClass._gtk_reserved4.class, "apply", constants$7.const$5);
    static final VarHandle const$3 = constants$2229.const$1.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_misc_get_type",
        constants$3.const$5
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_FLOAT,
        JAVA_FLOAT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "gtk_misc_set_alignment",
        constants$2230.const$5
    );
}


