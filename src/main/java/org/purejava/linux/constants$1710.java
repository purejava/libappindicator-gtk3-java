// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1710 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1710() {}
    static final FunctionDescriptor gtk_notebook_insert_page$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_notebook_insert_page$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_insert_page",
        constants$1710.gtk_notebook_insert_page$FUNC
    );
    static final FunctionDescriptor gtk_notebook_insert_page_menu$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_notebook_insert_page_menu$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_insert_page_menu",
        constants$1710.gtk_notebook_insert_page_menu$FUNC
    );
    static final FunctionDescriptor gtk_notebook_remove_page$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_notebook_remove_page$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_remove_page",
        constants$1710.gtk_notebook_remove_page$FUNC
    );
    static final FunctionDescriptor gtk_notebook_set_group_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_set_group_name$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_set_group_name",
        constants$1710.gtk_notebook_set_group_name$FUNC
    );
    static final FunctionDescriptor gtk_notebook_get_group_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_get_group_name$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_get_group_name",
        constants$1710.gtk_notebook_get_group_name$FUNC
    );
    static final FunctionDescriptor gtk_notebook_get_current_page$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_get_current_page$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_get_current_page",
        constants$1710.gtk_notebook_get_current_page$FUNC
    );
}

