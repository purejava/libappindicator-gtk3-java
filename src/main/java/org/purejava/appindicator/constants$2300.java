// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$2300 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2300() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GtkTreeModelIface.unref_node.class, "apply", constants$13.const$4);
    static final VarHandle const$1 = constants$2293.const$2.varHandle(MemoryLayout.PathElement.groupElement("unref_node"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_tree_path_new",
        constants$35.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_tree_path_new_from_string",
        constants$5.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandleVariadic(
        "gtk_tree_path_new_from_indices",
        constants$24.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_tree_path_new_from_indicesv",
        constants$21.const$1
    );
}


