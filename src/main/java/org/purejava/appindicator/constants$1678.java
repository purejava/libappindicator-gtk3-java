// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1678 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1678() {}
    static final VarHandle const$0 = constants$1677.const$1.varHandle(MemoryLayout.PathElement.groupElement("x0"));
    static final VarHandle const$1 = constants$1677.const$1.varHandle(MemoryLayout.PathElement.groupElement("y0"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(cairo_destroy_func_t.class, "apply", constants$13.const$1);
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("unused")
    ).withName("_cairo_user_data_key");
    static final VarHandle const$4 = constants$1678.const$3.varHandle(MemoryLayout.PathElement.groupElement("unused"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(cairo_write_func_t.class, "apply", constants$62.const$0);
}


