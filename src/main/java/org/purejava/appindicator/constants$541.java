// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$541 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$541() {}
    static final FunctionDescriptor g_data_input_stream_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_input_stream_new$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_new",
        constants$541.g_data_input_stream_new$FUNC
    );
    static final FunctionDescriptor g_data_input_stream_set_byte_order$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_data_input_stream_set_byte_order$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_set_byte_order",
        constants$541.g_data_input_stream_set_byte_order$FUNC
    );
    static final FunctionDescriptor g_data_input_stream_get_byte_order$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_input_stream_get_byte_order$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_get_byte_order",
        constants$541.g_data_input_stream_get_byte_order$FUNC
    );
    static final FunctionDescriptor g_data_input_stream_set_newline_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_data_input_stream_set_newline_type$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_set_newline_type",
        constants$541.g_data_input_stream_set_newline_type$FUNC
    );
    static final FunctionDescriptor g_data_input_stream_get_newline_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_input_stream_get_newline_type$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_get_newline_type",
        constants$541.g_data_input_stream_get_newline_type$FUNC
    );
    static final FunctionDescriptor g_data_input_stream_read_byte$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_input_stream_read_byte$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_read_byte",
        constants$541.g_data_input_stream_read_byte$FUNC
    );
}

