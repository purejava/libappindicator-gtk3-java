// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3143 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3143() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_deserialize_get_can_create_tags",
        constants$9.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_serialize_formats",
        constants$5.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_deserialize_formats",
        constants$5.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_serialize",
        constants$334.const$2
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_deserialize",
        constants$3143.const$4
    );
}


