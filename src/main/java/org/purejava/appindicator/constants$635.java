// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$635 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$635() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_object_get_qdata",
        constants$21.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_object_set_qdata",
        constants$42.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(g_object_set_qdata_full$destroy.class, "apply", constants$13.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_object_set_qdata_full",
        constants$179.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_object_steal_qdata",
        constants$21.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(g_object_dup_qdata$dup_func.class, "apply", constants$5.const$5);
}


