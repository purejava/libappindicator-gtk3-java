// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$2079 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2079() {}
    static final VarHandle const$0 = constants$2067.const$2.varHandle(MemoryLayout.PathElement.groupElement("column_reordered"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_AtkTableIface.model_changed.class, "apply", constants$13.const$1);
    static final VarHandle const$2 = constants$2067.const$2.varHandle(MemoryLayout.PathElement.groupElement("model_changed"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "atk_table_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "atk_table_ref_at",
        constants$33.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "atk_table_get_index_at",
        constants$49.const$0
    );
}


