// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1236 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1236() {}
    static final VarHandle const$0 = constants$1230.const$4.varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_with_flags"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_resolver_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_resolver_get_default",
        constants$35.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_resolver_set_default",
        constants$13.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_resolver_lookup_by_name",
        constants$39.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(g_resolver_lookup_by_name_async$callback.class, "apply", constants$14.const$3);
}


