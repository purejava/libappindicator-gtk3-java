// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1825 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1825() {}
    static final FunctionDescriptor gtk_text_mark_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_mark_new$MH = RuntimeHelper.downcallHandle(
        "gtk_text_mark_new",
        constants$1825.gtk_text_mark_new$FUNC
    );
    static final FunctionDescriptor gtk_text_mark_set_visible$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_mark_set_visible$MH = RuntimeHelper.downcallHandle(
        "gtk_text_mark_set_visible",
        constants$1825.gtk_text_mark_set_visible$FUNC
    );
    static final FunctionDescriptor gtk_text_mark_get_visible$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_mark_get_visible$MH = RuntimeHelper.downcallHandle(
        "gtk_text_mark_get_visible",
        constants$1825.gtk_text_mark_get_visible$FUNC
    );
    static final FunctionDescriptor gtk_text_mark_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_mark_get_name$MH = RuntimeHelper.downcallHandle(
        "gtk_text_mark_get_name",
        constants$1825.gtk_text_mark_get_name$FUNC
    );
    static final FunctionDescriptor gtk_text_mark_get_deleted$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_mark_get_deleted$MH = RuntimeHelper.downcallHandle(
        "gtk_text_mark_get_deleted",
        constants$1825.gtk_text_mark_get_deleted$FUNC
    );
    static final FunctionDescriptor gtk_text_mark_get_buffer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_mark_get_buffer$MH = RuntimeHelper.downcallHandle(
        "gtk_text_mark_get_buffer",
        constants$1825.gtk_text_mark_get_buffer$FUNC
    );
}

