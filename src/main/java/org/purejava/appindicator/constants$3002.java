// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$3002 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3002() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GtkRangeClass.get_range_border.class, "apply", constants$13.const$4);
    static final VarHandle const$1 = constants$3000.const$3.varHandle(MemoryLayout.PathElement.groupElement("get_range_border"));
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_DOUBLE
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GtkRangeClass.change_value.class, "apply", constants$3002.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$3002.const$2
    );
    static final VarHandle const$5 = constants$3000.const$3.varHandle(MemoryLayout.PathElement.groupElement("change_value"));
}


