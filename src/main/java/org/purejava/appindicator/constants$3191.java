// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$3191 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3191() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("_gtk_reserved1"),
        RuntimeHelper.POINTER.withName("_gtk_reserved2"),
        RuntimeHelper.POINTER.withName("_gtk_reserved3"),
        RuntimeHelper.POINTER.withName("_gtk_reserved4")
    ).withName("_GtkTreeModelSortClass");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GtkTreeModelSortClass._gtk_reserved1.class, "apply", constants$7.const$5);
    static final VarHandle const$2 = constants$3191.const$0.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GtkTreeModelSortClass._gtk_reserved2.class, "apply", constants$7.const$5);
    static final VarHandle const$4 = constants$3191.const$0.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GtkTreeModelSortClass._gtk_reserved3.class, "apply", constants$7.const$5);
}


