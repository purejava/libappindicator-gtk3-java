// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$1214 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1214() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_pollable_output_stream_create_source",
        constants$5.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_pollable_output_stream_write_nonblocking",
        constants$759.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_pollable_output_stream_writev_nonblocking",
        constants$766.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_pollable_source_new",
        constants$5.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_pollable_source_new_full",
        constants$23.const$0
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "g_pollable_stream_read",
        constants$1214.const$5
    );
}

