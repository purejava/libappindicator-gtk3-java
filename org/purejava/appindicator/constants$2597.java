// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2597 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2597() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
            RuntimeHelper.POINTER.withName("get_request_mode"),
            RuntimeHelper.POINTER.withName("get_preferred_width"),
            RuntimeHelper.POINTER.withName("get_preferred_height_for_width"),
            RuntimeHelper.POINTER.withName("get_preferred_height"),
            RuntimeHelper.POINTER.withName("get_preferred_width_for_height"),
            RuntimeHelper.POINTER.withName("get_aligned_area"),
            RuntimeHelper.POINTER.withName("get_size"),
            RuntimeHelper.POINTER.withName("render"),
            RuntimeHelper.POINTER.withName("activate"),
            RuntimeHelper.POINTER.withName("start_editing"),
            RuntimeHelper.POINTER.withName("editing_canceled"),
            RuntimeHelper.POINTER.withName("editing_started"),
            RuntimeHelper.POINTER.withName("priv"),
            RuntimeHelper.POINTER.withName("_gtk_reserved2"),
            RuntimeHelper.POINTER.withName("_gtk_reserved3"),
            RuntimeHelper.POINTER.withName("_gtk_reserved4")
        ).withName("parent_class"),
        RuntimeHelper.POINTER.withName("toggled"),
        RuntimeHelper.POINTER.withName("_gtk_reserved1"),
        RuntimeHelper.POINTER.withName("_gtk_reserved2"),
        RuntimeHelper.POINTER.withName("_gtk_reserved3"),
        RuntimeHelper.POINTER.withName("_gtk_reserved4")
    ).withName("_GtkCellRendererToggleClass");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GtkCellRendererToggleClass.toggled.class, "apply", constants$13.const$4);
    static final VarHandle const$2 = constants$2597.const$0.varHandle(MemoryLayout.PathElement.groupElement("toggled"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GtkCellRendererToggleClass._gtk_reserved1.class, "apply", constants$7.const$5);
    static final VarHandle const$4 = constants$2597.const$0.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GtkCellRendererToggleClass._gtk_reserved2.class, "apply", constants$7.const$5);
}

