// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$2425 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2425() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_list_store_move_after",
        constants$14.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_list_store_move_before",
        constants$14.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(GtkTreeModelFilterVisibleFunc.class, "apply", constants$12.const$2);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(GtkTreeModelFilterModifyFunc.class, "apply", constants$1127.const$5);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$1127.const$5
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GtkTreeModelFilter");
}


