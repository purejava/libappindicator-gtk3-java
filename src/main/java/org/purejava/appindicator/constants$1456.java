// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
final class constants$1456 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1456() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(hb_paint_pop_transform_func_t.class, "apply", constants$14.const$3);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(hb_paint_push_clip_glyph_func_t.class, "apply", constants$379.const$3);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$379.const$3
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_FLOAT,
        JAVA_FLOAT,
        JAVA_FLOAT,
        JAVA_FLOAT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(hb_paint_push_clip_rectangle_func_t.class, "apply", constants$1456.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$1456.const$3
    );
}


