// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$316 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$316() {}
    static final FunctionDescriptor g_test_skip_printf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_skip_printf$MH = RuntimeHelper.downcallHandleVariadic(
        "g_test_skip_printf",
        constants$316.g_test_skip_printf$FUNC
    );
    static final FunctionDescriptor g_test_failed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_test_failed$MH = RuntimeHelper.downcallHandle(
        "g_test_failed",
        constants$316.g_test_failed$FUNC
    );
    static final FunctionDescriptor g_test_set_nonfatal_assertions$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle g_test_set_nonfatal_assertions$MH = RuntimeHelper.downcallHandle(
        "g_test_set_nonfatal_assertions",
        constants$316.g_test_set_nonfatal_assertions$FUNC
    );
    static final FunctionDescriptor g_test_message$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_message$MH = RuntimeHelper.downcallHandleVariadic(
        "g_test_message",
        constants$316.g_test_message$FUNC
    );
    static final FunctionDescriptor g_test_bug_base$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_bug_base$MH = RuntimeHelper.downcallHandle(
        "g_test_bug_base",
        constants$316.g_test_bug_base$FUNC
    );
    static final FunctionDescriptor g_test_bug$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_bug$MH = RuntimeHelper.downcallHandle(
        "g_test_bug",
        constants$316.g_test_bug$FUNC
    );
}

