// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1811 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1811() {}
    static final FunctionDescriptor gtk_stack_add_named$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stack_add_named$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_add_named",
        constants$1811.gtk_stack_add_named$FUNC
    );
    static final FunctionDescriptor gtk_stack_add_titled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stack_add_titled$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_add_titled",
        constants$1811.gtk_stack_add_titled$FUNC
    );
    static final FunctionDescriptor gtk_stack_get_child_by_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stack_get_child_by_name$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_get_child_by_name",
        constants$1811.gtk_stack_get_child_by_name$FUNC
    );
    static final FunctionDescriptor gtk_stack_set_visible_child$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stack_set_visible_child$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_set_visible_child",
        constants$1811.gtk_stack_set_visible_child$FUNC
    );
    static final FunctionDescriptor gtk_stack_get_visible_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stack_get_visible_child$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_get_visible_child",
        constants$1811.gtk_stack_get_visible_child$FUNC
    );
    static final FunctionDescriptor gtk_stack_set_visible_child_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stack_set_visible_child_name$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_set_visible_child_name",
        constants$1811.gtk_stack_set_visible_child_name$FUNC
    );
}

