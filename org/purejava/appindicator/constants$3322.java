// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3322 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3322() {}
    static final VarHandle const$0 = constants$3321.const$2.varHandle(MemoryLayout.PathElement.groupElement("ythickness"));
    static final VarHandle const$1 = constants$3321.const$2.varHandle(MemoryLayout.PathElement.groupElement("rc_properties"));
    static final VarHandle const$2 = constants$3321.const$2.varHandle(MemoryLayout.PathElement.groupElement("rc_style_lists"));
    static final VarHandle const$3 = constants$3321.const$2.varHandle(MemoryLayout.PathElement.groupElement("icon_factories"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("create_rc_style"),
        RuntimeHelper.POINTER.withName("parse"),
        RuntimeHelper.POINTER.withName("merge"),
        RuntimeHelper.POINTER.withName("create_style"),
        RuntimeHelper.POINTER.withName("_gtk_reserved1"),
        RuntimeHelper.POINTER.withName("_gtk_reserved2"),
        RuntimeHelper.POINTER.withName("_gtk_reserved3"),
        RuntimeHelper.POINTER.withName("_gtk_reserved4")
    ).withName("_GtkRcStyleClass");
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GtkRcStyleClass.create_rc_style.class, "apply", constants$5.const$2);
}

