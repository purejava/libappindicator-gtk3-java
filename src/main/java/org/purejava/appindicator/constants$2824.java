// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$2824 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2824() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_im_context_simple_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_im_context_simple_new",
        constants$35.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_im_context_simple_add_table",
        constants$1046.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_im_context_simple_add_compose_file",
        constants$13.const$4
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    RuntimeHelper.POINTER.withName("g_class")
                ).withName("g_type_instance"),
                JAVA_INT.withName("ref_count"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("qdata")
            ).withName("parent_instance")
        ).withName("object"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GtkIMMulticontext");
    static final VarHandle const$5 = constants$2824.const$4.varHandle(MemoryLayout.PathElement.groupElement("priv"));
}


