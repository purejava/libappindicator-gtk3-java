// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1571 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1571() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_PangoAttrShape.destroy_func.class, "apply", constants$13.const$1);
    static final VarHandle const$1 = constants$1570.const$2.varHandle(MemoryLayout.PathElement.groupElement("destroy_func"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("klass"),
            JAVA_INT.withName("start_index"),
            JAVA_INT.withName("end_index")
        ).withName("attr"),
        RuntimeHelper.POINTER.withName("desc")
    ).withName("_PangoAttrFontDesc");
    static final VarHandle const$3 = constants$1571.const$2.varHandle(MemoryLayout.PathElement.groupElement("desc"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("klass"),
            JAVA_INT.withName("start_index"),
            JAVA_INT.withName("end_index")
        ).withName("attr"),
        RuntimeHelper.POINTER.withName("features")
    ).withName("_PangoAttrFontFeatures");
    static final VarHandle const$5 = constants$1571.const$4.varHandle(MemoryLayout.PathElement.groupElement("features"));
}


