// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1293 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1293() {}
    static final FunctionDescriptor gtk_container_set_focus_chain$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_container_set_focus_chain$MH = RuntimeHelper.downcallHandle(
        "gtk_container_set_focus_chain",
        constants$1293.gtk_container_set_focus_chain$FUNC
    );
    static final FunctionDescriptor gtk_container_get_focus_chain$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_container_get_focus_chain$MH = RuntimeHelper.downcallHandle(
        "gtk_container_get_focus_chain",
        constants$1293.gtk_container_get_focus_chain$FUNC
    );
    static final FunctionDescriptor gtk_container_unset_focus_chain$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_container_unset_focus_chain$MH = RuntimeHelper.downcallHandle(
        "gtk_container_unset_focus_chain",
        constants$1293.gtk_container_unset_focus_chain$FUNC
    );
    static final FunctionDescriptor gtk_container_set_reallocate_redraws$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_container_set_reallocate_redraws$MH = RuntimeHelper.downcallHandle(
        "gtk_container_set_reallocate_redraws",
        constants$1293.gtk_container_set_reallocate_redraws$FUNC
    );
    static final FunctionDescriptor gtk_container_set_focus_child$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_container_set_focus_child$MH = RuntimeHelper.downcallHandle(
        "gtk_container_set_focus_child",
        constants$1293.gtk_container_set_focus_child$FUNC
    );
    static final FunctionDescriptor gtk_container_get_focus_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_container_get_focus_child$MH = RuntimeHelper.downcallHandle(
        "gtk_container_get_focus_child",
        constants$1293.gtk_container_get_focus_child$FUNC
    );
}

