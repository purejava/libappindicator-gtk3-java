// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1502 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1502() {}
    static final FunctionDescriptor gtk_binding_entry_add_signal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_binding_entry_add_signal$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_binding_entry_add_signal",
        constants$1502.gtk_binding_entry_add_signal$FUNC
    );
    static final FunctionDescriptor gtk_binding_entry_add_signall$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_binding_entry_add_signall$MH = RuntimeHelper.downcallHandle(
        "gtk_binding_entry_add_signall",
        constants$1502.gtk_binding_entry_add_signall$FUNC
    );
    static final FunctionDescriptor gtk_binding_entry_add_signal_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_binding_entry_add_signal_from_string$MH = RuntimeHelper.downcallHandle(
        "gtk_binding_entry_add_signal_from_string",
        constants$1502.gtk_binding_entry_add_signal_from_string$FUNC
    );
    static final FunctionDescriptor gtk_binding_entry_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_binding_entry_remove$MH = RuntimeHelper.downcallHandle(
        "gtk_binding_entry_remove",
        constants$1502.gtk_binding_entry_remove$FUNC
    );
    static final FunctionDescriptor gtk_builder_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gtk_builder_error_quark$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_error_quark",
        constants$1502.gtk_builder_error_quark$FUNC
    );
    static final FunctionDescriptor gtk_builder_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_builder_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_get_type",
        constants$1502.gtk_builder_get_type$FUNC
    );
}

