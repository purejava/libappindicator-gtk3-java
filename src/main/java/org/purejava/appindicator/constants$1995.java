// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1995 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1995() {}
    static final VarHandle const$0 = constants$1993.const$0.varHandle(MemoryLayout.PathElement.groupElement("get_toolkit_name"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_AtkUtilClass.get_toolkit_version.class, "apply", constants$35.const$2);
    static final VarHandle const$2 = constants$1993.const$0.varHandle(MemoryLayout.PathElement.groupElement("get_toolkit_version"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "atk_util_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(atk_add_focus_tracker$focus_tracker.class, "apply", constants$13.const$1);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "atk_add_focus_tracker",
        constants$10.const$5
    );
}


