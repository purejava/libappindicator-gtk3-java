// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2515 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2515() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GtkAspectFrameClass._gtk_reserved3.class, "apply", constants$7.const$5);
    static final VarHandle const$1 = constants$2514.const$1.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GtkAspectFrameClass._gtk_reserved4.class, "apply", constants$7.const$5);
    static final VarHandle const$3 = constants$2514.const$1.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_aspect_frame_get_type",
        constants$3.const$5
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_FLOAT,
        JAVA_FLOAT,
        JAVA_FLOAT,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "gtk_aspect_frame_new",
        constants$2515.const$5
    );
}


