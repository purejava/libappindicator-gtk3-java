// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$2433 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2433() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GtkTreeModelFilterClass._gtk_reserved4.class, "apply", constants$7.const$5);
    static final VarHandle const$1 = constants$2431.const$1.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_tree_model_filter_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_tree_model_filter_new",
        constants$5.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(gtk_tree_model_filter_set_visible_func$func.class, "apply", constants$12.const$2);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(gtk_tree_model_filter_set_visible_func$destroy.class, "apply", constants$13.const$1);
}


