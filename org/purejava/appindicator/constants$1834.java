// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1834 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1834() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gdk_window_is_shaped",
        constants$10.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gdk_window_get_state",
        constants$10.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gdk_window_set_static_gravities",
        constants$11.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(GdkWindowInvalidateHandlerFunc.class, "apply", constants$13.const$4);
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(gdk_window_set_invalidate_handler$handler.class, "apply", constants$13.const$4);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gdk_window_set_invalidate_handler",
        constants$13.const$4
    );
}

