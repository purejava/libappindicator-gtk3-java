// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1268 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1268() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_simple_action_new",
        constants$5.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_simple_action_new_stateful",
        constants$23.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_simple_action_set_enabled",
        constants$40.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_simple_action_set_state",
        constants$13.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_simple_action_set_state_hint",
        constants$13.const$4
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GSimpleActionGroup");
}


