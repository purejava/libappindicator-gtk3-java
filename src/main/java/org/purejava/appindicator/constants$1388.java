// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1388 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1388() {}
    static final FunctionDescriptor gtk_cell_area_request_renderer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_request_renderer$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_request_renderer",
        constants$1388.gtk_cell_area_request_renderer$FUNC
    );
    static final FunctionDescriptor _gtk_cell_area_set_cell_data_func_with_proxy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _gtk_cell_area_set_cell_data_func_with_proxy$MH = RuntimeHelper.downcallHandle(
        "_gtk_cell_area_set_cell_data_func_with_proxy",
        constants$1388._gtk_cell_area_set_cell_data_func_with_proxy$FUNC
    );
    static final FunctionDescriptor GtkTreeCellDataFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkTreeCellDataFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTreeCellDataFunc_UP$MH = RuntimeHelper.upcallHandle(GtkTreeCellDataFunc.class, "apply", constants$1388.GtkTreeCellDataFunc_UP$FUNC);
    static final FunctionDescriptor GtkTreeCellDataFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTreeCellDataFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1388.GtkTreeCellDataFunc_DOWN$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_column_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_tree_view_column_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_column_get_type",
        constants$1388.gtk_tree_view_column_get_type$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_column_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_tree_view_column_new$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_column_new",
        constants$1388.gtk_tree_view_column_new$FUNC
    );
}

