// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2056 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2056() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("parent"),
        RuntimeHelper.POINTER.withName("add_selection"),
        RuntimeHelper.POINTER.withName("clear_selection"),
        RuntimeHelper.POINTER.withName("ref_selection"),
        RuntimeHelper.POINTER.withName("get_selection_count"),
        RuntimeHelper.POINTER.withName("is_child_selected"),
        RuntimeHelper.POINTER.withName("remove_selection"),
        RuntimeHelper.POINTER.withName("select_all_selection"),
        RuntimeHelper.POINTER.withName("selection_changed")
    ).withName("_AtkSelectionIface");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_AtkSelectionIface.add_selection.class, "apply", constants$11.const$4);
    static final VarHandle const$2 = constants$2056.const$0.varHandle(MemoryLayout.PathElement.groupElement("add_selection"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_AtkSelectionIface.clear_selection.class, "apply", constants$10.const$5);
    static final VarHandle const$4 = constants$2056.const$0.varHandle(MemoryLayout.PathElement.groupElement("clear_selection"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_AtkSelectionIface.ref_selection.class, "apply", constants$21.const$3);
}

