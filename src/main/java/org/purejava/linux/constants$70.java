// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$70 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$70() {}
    static final FunctionDescriptor g_async_queue_push_sorted$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_push_sorted$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_push_sorted",
        constants$70.g_async_queue_push_sorted$FUNC
    );
    static final FunctionDescriptor g_async_queue_push_sorted_unlocked$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_push_sorted_unlocked$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_push_sorted_unlocked",
        constants$70.g_async_queue_push_sorted_unlocked$FUNC
    );
    static final FunctionDescriptor g_async_queue_pop$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_pop$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_pop",
        constants$70.g_async_queue_pop$FUNC
    );
    static final FunctionDescriptor g_async_queue_pop_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_pop_unlocked$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_pop_unlocked",
        constants$70.g_async_queue_pop_unlocked$FUNC
    );
    static final FunctionDescriptor g_async_queue_try_pop$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_try_pop$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_try_pop",
        constants$70.g_async_queue_try_pop$FUNC
    );
    static final FunctionDescriptor g_async_queue_try_pop_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_try_pop_unlocked$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_try_pop_unlocked",
        constants$70.g_async_queue_try_pop_unlocked$FUNC
    );
}

