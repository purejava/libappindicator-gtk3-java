// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$2727 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2727() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(GtkFontFilterFunc.class, "apply", constants$12.const$2);
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("base_iface"),
        RuntimeHelper.POINTER.withName("get_font_family"),
        RuntimeHelper.POINTER.withName("get_font_face"),
        RuntimeHelper.POINTER.withName("get_font_size"),
        RuntimeHelper.POINTER.withName("set_filter_func"),
        RuntimeHelper.POINTER.withName("font_activated"),
        RuntimeHelper.POINTER.withName("set_font_map"),
        RuntimeHelper.POINTER.withName("get_font_map"),
        MemoryLayout.sequenceLayout(10, RuntimeHelper.POINTER).withName("padding")
    ).withName("_GtkFontChooserIface");
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GtkFontChooserIface.get_font_family.class, "apply", constants$5.const$2);
    static final VarHandle const$3 = constants$2727.const$1.varHandle(MemoryLayout.PathElement.groupElement("get_font_family"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GtkFontChooserIface.get_font_face.class, "apply", constants$5.const$2);
    static final VarHandle const$5 = constants$2727.const$1.varHandle(MemoryLayout.PathElement.groupElement("get_font_face"));
}


