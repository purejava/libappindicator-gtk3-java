// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$335 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$335() {}
    static final FunctionDescriptor g_tree_upper_bound$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_upper_bound$MH = RuntimeHelper.downcallHandle(
        "g_tree_upper_bound",
        constants$335.g_tree_upper_bound$FUNC
    );
    static final FunctionDescriptor g_tree_height$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_height$MH = RuntimeHelper.downcallHandle(
        "g_tree_height",
        constants$335.g_tree_height$FUNC
    );
    static final FunctionDescriptor g_tree_nnodes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_nnodes$MH = RuntimeHelper.downcallHandle(
        "g_tree_nnodes",
        constants$335.g_tree_nnodes$FUNC
    );
    static final FunctionDescriptor g_uri_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_uri_ref$MH = RuntimeHelper.downcallHandle(
        "g_uri_ref",
        constants$335.g_uri_ref$FUNC
    );
    static final FunctionDescriptor g_uri_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_uri_unref$MH = RuntimeHelper.downcallHandle(
        "g_uri_unref",
        constants$335.g_uri_unref$FUNC
    );
    static final FunctionDescriptor g_uri_split$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_uri_split$MH = RuntimeHelper.downcallHandle(
        "g_uri_split",
        constants$335.g_uri_split$FUNC
    );
}

