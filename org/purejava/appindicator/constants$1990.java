// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1990 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1990() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_AtkUtilClass.get_toolkit_version.class, "apply", constants$35.const$2);
    static final VarHandle const$1 = constants$1987.const$5.varHandle(MemoryLayout.PathElement.groupElement("get_toolkit_version"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "atk_util_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(atk_add_focus_tracker$focus_tracker.class, "apply", constants$13.const$1);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "atk_add_focus_tracker",
        constants$10.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "atk_remove_focus_tracker",
        constants$80.const$1
    );
}

