// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$3356 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3356() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$3355.const$4
    );
    static final VarHandle const$1 = constants$3345.const$2.varHandle(MemoryLayout.PathElement.groupElement("draw_layout"));
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GtkStyleClass.draw_resize_grip.class, "apply", constants$3356.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$3356.const$2
    );
    static final VarHandle const$5 = constants$3345.const$2.varHandle(MemoryLayout.PathElement.groupElement("draw_resize_grip"));
}


