// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1358 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1358() {}
    static final FunctionDescriptor gtk_box_set_spacing$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_box_set_spacing$MH = RuntimeHelper.downcallHandle(
        "gtk_box_set_spacing",
        constants$1358.gtk_box_set_spacing$FUNC
    );
    static final FunctionDescriptor gtk_box_get_spacing$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_box_get_spacing$MH = RuntimeHelper.downcallHandle(
        "gtk_box_get_spacing",
        constants$1358.gtk_box_get_spacing$FUNC
    );
    static final FunctionDescriptor gtk_box_set_baseline_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_box_set_baseline_position$MH = RuntimeHelper.downcallHandle(
        "gtk_box_set_baseline_position",
        constants$1358.gtk_box_set_baseline_position$FUNC
    );
    static final FunctionDescriptor gtk_box_get_baseline_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_box_get_baseline_position$MH = RuntimeHelper.downcallHandle(
        "gtk_box_get_baseline_position",
        constants$1358.gtk_box_get_baseline_position$FUNC
    );
    static final FunctionDescriptor gtk_box_reorder_child$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_box_reorder_child$MH = RuntimeHelper.downcallHandle(
        "gtk_box_reorder_child",
        constants$1358.gtk_box_reorder_child$FUNC
    );
    static final FunctionDescriptor gtk_box_query_child_packing$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_box_query_child_packing$MH = RuntimeHelper.downcallHandle(
        "gtk_box_query_child_packing",
        constants$1358.gtk_box_query_child_packing$FUNC
    );
}

