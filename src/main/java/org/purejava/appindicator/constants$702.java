// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$702 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$702() {}
    static final VarHandle const$0 = constants$699.const$2.varHandle(MemoryLayout.PathElement.groupElement("activate"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_action_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_action_get_name",
        constants$5.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_action_get_parameter_type",
        constants$5.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_action_get_state_type",
        constants$5.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_action_get_state_hint",
        constants$5.const$2
    );
}


