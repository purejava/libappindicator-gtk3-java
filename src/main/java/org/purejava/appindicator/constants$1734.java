// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1734 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1734() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "cairo_surface_show_page",
        constants$13.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "cairo_surface_has_show_text_glyphs",
        constants$10.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "cairo_image_surface_create",
        constants$30.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "cairo_format_stride_for_width",
        constants$123.const$5
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "cairo_image_surface_create_for_data",
        constants$1734.const$4
    );
}


