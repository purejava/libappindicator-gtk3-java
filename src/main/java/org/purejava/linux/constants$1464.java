// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1464 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1464() {}
    static final FunctionDescriptor GtkTreeViewRowSeparatorFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkTreeViewRowSeparatorFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTreeViewRowSeparatorFunc_UP$MH = RuntimeHelper.upcallHandle(GtkTreeViewRowSeparatorFunc.class, "apply", constants$1464.GtkTreeViewRowSeparatorFunc_UP$FUNC);
    static final FunctionDescriptor GtkTreeViewRowSeparatorFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTreeViewRowSeparatorFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1464.GtkTreeViewRowSeparatorFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GtkTreeViewSearchPositionFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkTreeViewSearchPositionFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTreeViewSearchPositionFunc_UP$MH = RuntimeHelper.upcallHandle(GtkTreeViewSearchPositionFunc.class, "apply", constants$1464.GtkTreeViewSearchPositionFunc_UP$FUNC);
    static final FunctionDescriptor GtkTreeViewSearchPositionFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTreeViewSearchPositionFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1464.GtkTreeViewSearchPositionFunc_DOWN$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_tree_view_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_type",
        constants$1464.gtk_tree_view_get_type$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_tree_view_new$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_new",
        constants$1464.gtk_tree_view_new$FUNC
    );
}

