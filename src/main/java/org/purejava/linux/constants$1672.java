// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1672 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1672() {}
    static final FunctionDescriptor gtk_link_button_set_uri$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_link_button_set_uri$MH = RuntimeHelper.downcallHandle(
        "gtk_link_button_set_uri",
        constants$1672.gtk_link_button_set_uri$FUNC
    );
    static final FunctionDescriptor gtk_link_button_get_visited$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_link_button_get_visited$MH = RuntimeHelper.downcallHandle(
        "gtk_link_button_get_visited",
        constants$1672.gtk_link_button_get_visited$FUNC
    );
    static final FunctionDescriptor gtk_link_button_set_visited$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_link_button_set_visited$MH = RuntimeHelper.downcallHandle(
        "gtk_link_button_set_visited",
        constants$1672.gtk_link_button_set_visited$FUNC
    );
    static final FunctionDescriptor GtkListBoxFilterFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkListBoxFilterFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxFilterFunc_UP$MH = RuntimeHelper.upcallHandle(GtkListBoxFilterFunc.class, "apply", constants$1672.GtkListBoxFilterFunc_UP$FUNC);
    static final FunctionDescriptor GtkListBoxFilterFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxFilterFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1672.GtkListBoxFilterFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GtkListBoxSortFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkListBoxSortFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxSortFunc_UP$MH = RuntimeHelper.upcallHandle(GtkListBoxSortFunc.class, "apply", constants$1672.GtkListBoxSortFunc_UP$FUNC);
}

