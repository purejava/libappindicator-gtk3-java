// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1706 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1706() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "cairo_font_face_get_reference_count",
        constants$10.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "cairo_font_face_status",
        constants$10.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "cairo_font_face_get_type",
        constants$10.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "cairo_font_face_get_user_data",
        constants$5.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(cairo_font_face_set_user_data$destroy.class, "apply", constants$13.const$1);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "cairo_font_face_set_user_data",
        constants$34.const$5
    );
}

