// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$747 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$747() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_application_get_default",
        constants$35.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_application_set_default",
        constants$13.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_application_mark_busy",
        constants$13.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_application_unmark_busy",
        constants$13.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_application_get_is_busy",
        constants$10.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_application_send_notification",
        constants$14.const$3
    );
}

