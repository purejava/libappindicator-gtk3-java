// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$2778 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2778() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandleVariadic(
        "gtk_style_properties_get",
        constants$40.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_style_properties_unset_property",
        constants$164.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_style_properties_clear",
        constants$13.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_style_properties_merge",
        constants$164.const$5
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("get_style"),
        RuntimeHelper.POINTER.withName("get_style_property"),
        RuntimeHelper.POINTER.withName("get_icon_factory")
    ).withName("_GtkStyleProviderIface");
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GtkStyleProviderIface.get_style.class, "apply", constants$5.const$5);
}


