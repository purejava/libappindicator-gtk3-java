// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1895 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1895() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_FLOAT,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_saturate_and_pixelate",
        constants$1895.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_apply_embedded_orientation",
        constants$5.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_set_option",
        constants$12.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_get_option",
        constants$5.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_remove_option",
        constants$9.const$0
    );
}


