// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1711 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1711() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(cairo_user_scaled_font_init_func_t.class, "apply", constants$12.const$2);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(cairo_user_scaled_font_render_glyph_func_t.class, "apply", constants$393.const$4);
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(cairo_user_scaled_font_text_to_glyphs_func_t.class, "apply", constants$1711.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$1711.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(cairo_user_scaled_font_unicode_to_glyph_func_t.class, "apply", constants$62.const$2);
}

