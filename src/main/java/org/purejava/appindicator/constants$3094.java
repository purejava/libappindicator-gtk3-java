// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3094 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3094() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_stack_sidebar_new",
        constants$35.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_stack_sidebar_set_stack",
        constants$13.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_stack_sidebar_get_stack",
        constants$5.const$2
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("data"),
        JAVA_INT.withName("minimum_size"),
        JAVA_INT.withName("natural_size")
    ).withName("_GtkRequestedSize");
    static final VarHandle const$4 = constants$3094.const$3.varHandle(MemoryLayout.PathElement.groupElement("data"));
    static final VarHandle const$5 = constants$3094.const$3.varHandle(MemoryLayout.PathElement.groupElement("minimum_size"));
}


