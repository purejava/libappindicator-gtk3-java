// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$2125 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2125() {}
    static final VarHandle const$0 = constants$2095.const$5.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved7"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_widget_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandleVariadic(
        "gtk_widget_new",
        constants$407.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_widget_destroy",
        constants$13.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_widget_destroyed",
        constants$13.const$4
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_widget_unparent",
        constants$13.const$1
    );
}


