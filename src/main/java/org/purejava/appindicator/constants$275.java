// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$275 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$275() {}
    static final FunctionDescriptor g_queue_reverse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_reverse$MH = RuntimeHelper.downcallHandle(
        "g_queue_reverse",
        constants$275.g_queue_reverse$FUNC
    );
    static final FunctionDescriptor g_queue_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_copy$MH = RuntimeHelper.downcallHandle(
        "g_queue_copy",
        constants$275.g_queue_copy$FUNC
    );
    static final FunctionDescriptor g_queue_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_foreach$MH = RuntimeHelper.downcallHandle(
        "g_queue_foreach",
        constants$275.g_queue_foreach$FUNC
    );
    static final FunctionDescriptor g_queue_find$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_find$MH = RuntimeHelper.downcallHandle(
        "g_queue_find",
        constants$275.g_queue_find$FUNC
    );
    static final FunctionDescriptor g_queue_find_custom$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_find_custom$MH = RuntimeHelper.downcallHandle(
        "g_queue_find_custom",
        constants$275.g_queue_find_custom$FUNC
    );
    static final FunctionDescriptor g_queue_sort$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_sort$MH = RuntimeHelper.downcallHandle(
        "g_queue_sort",
        constants$275.g_queue_sort$FUNC
    );
}

