// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1522 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1522() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_shape",
        constants$179.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "hb_shape",
        constants$331.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "hb_shape_full",
        constants$328.const$5
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_FLOAT,
        JAVA_FLOAT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "hb_shape_justify",
        constants$1522.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "hb_shape_list_shapers",
        constants$35.const$2
    );
}


