// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$1219 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1219() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_power_profile_monitor_get_type",
        constants$3.const$5
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface")
    ).withName("_GPowerProfileMonitorInterface");
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_power_profile_monitor_dup_default",
        constants$35.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_power_profile_monitor_get_power_saver_enabled",
        constants$10.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_property_action_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_property_action_new",
        constants$23.const$0
    );
}


