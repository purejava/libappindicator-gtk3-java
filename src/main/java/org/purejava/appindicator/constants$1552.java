// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$1552 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1552() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent_instance")
    ).withName("_PangoFontFamily");
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                JAVA_LONG.withName("g_type")
            ).withName("g_type_class"),
            RuntimeHelper.POINTER.withName("construct_properties"),
            RuntimeHelper.POINTER.withName("constructor"),
            RuntimeHelper.POINTER.withName("set_property"),
            RuntimeHelper.POINTER.withName("get_property"),
            RuntimeHelper.POINTER.withName("dispose"),
            RuntimeHelper.POINTER.withName("finalize"),
            RuntimeHelper.POINTER.withName("dispatch_properties_changed"),
            RuntimeHelper.POINTER.withName("notify"),
            RuntimeHelper.POINTER.withName("constructed"),
            JAVA_LONG.withName("flags"),
            JAVA_LONG.withName("n_construct_properties"),
            RuntimeHelper.POINTER.withName("pspecs"),
            JAVA_LONG.withName("n_pspecs"),
            MemoryLayout.sequenceLayout(3, RuntimeHelper.POINTER).withName("pdummy")
        ).withName("parent_class"),
        RuntimeHelper.POINTER.withName("list_faces"),
        RuntimeHelper.POINTER.withName("get_name"),
        RuntimeHelper.POINTER.withName("is_monospace"),
        RuntimeHelper.POINTER.withName("is_variable"),
        RuntimeHelper.POINTER.withName("get_face"),
        RuntimeHelper.POINTER.withName("_pango_reserved2")
    ).withName("_PangoFontFamilyClass");
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_PangoFontFamilyClass.list_faces.class, "apply", constants$14.const$3);
    static final VarHandle const$3 = constants$1552.const$1.varHandle(MemoryLayout.PathElement.groupElement("list_faces"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_PangoFontFamilyClass.get_name.class, "apply", constants$5.const$2);
    static final VarHandle const$5 = constants$1552.const$1.varHandle(MemoryLayout.PathElement.groupElement("get_name"));
}


