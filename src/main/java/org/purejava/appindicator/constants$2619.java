// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2619 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2619() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_menu_item_set_use_underline",
        constants$40.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_menu_item_get_use_underline",
        constants$10.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_menu_item_set_reserve_indicator",
        constants$40.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_menu_item_get_reserve_indicator",
        constants$10.const$5
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        MemoryLayout.structLayout(
                            MemoryLayout.structLayout(
                                RuntimeHelper.POINTER.withName("g_class")
                            ).withName("g_type_instance"),
                            JAVA_INT.withName("ref_count"),
                            MemoryLayout.paddingLayout(4),
                            RuntimeHelper.POINTER.withName("qdata")
                        ).withName("parent_instance"),
                        RuntimeHelper.POINTER.withName("priv")
                    ).withName("widget"),
                    RuntimeHelper.POINTER.withName("priv")
                ).withName("container"),
                RuntimeHelper.POINTER.withName("priv")
            ).withName("bin"),
            RuntimeHelper.POINTER.withName("priv")
        ).withName("menu_item"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GtkCheckMenuItem");
    static final VarHandle const$5 = constants$2619.const$4.varHandle(MemoryLayout.PathElement.groupElement("priv"));
}


