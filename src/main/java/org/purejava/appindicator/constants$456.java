// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$456 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$456() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_test_create_case$data_setup.class, "apply", constants$13.const$4);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(g_test_create_case$data_test.class, "apply", constants$13.const$4);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(g_test_create_case$data_teardown.class, "apply", constants$13.const$4);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_test_create_case",
        constants$176.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_test_create_suite",
        constants$5.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_test_get_root",
        constants$35.const$2
    );
}


