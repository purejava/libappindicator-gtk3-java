// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1478 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1478() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(hb_font_get_glyph_v_advance_func_t.class, "apply", constants$327.const$4);
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(hb_font_get_glyph_advances_func_t.class, "apply", constants$1478.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$1478.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(hb_font_get_glyph_h_advances_func_t.class, "apply", constants$1478.const$1);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(hb_font_get_glyph_v_advances_func_t.class, "apply", constants$1478.const$1);
}

