// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1958 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1958() {}
    static final VarHandle const$0 = constants$1957.const$4.varHandle(MemoryLayout.PathElement.groupElement("accel_mods"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_accel_group_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_accel_group_new",
        constants$35.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_accel_group_get_is_locked",
        constants$10.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_accel_group_get_modifier_mask",
        constants$10.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_accel_group_lock",
        constants$13.const$1
    );
}


