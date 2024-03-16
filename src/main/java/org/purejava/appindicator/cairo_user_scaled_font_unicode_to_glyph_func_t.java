// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef cairo_status_t (*cairo_user_scaled_font_unicode_to_glyph_func_t)(cairo_scaled_font_t *, unsigned long, unsigned long *)
 * }
 */
public class cairo_user_scaled_font_unicode_to_glyph_func_t {

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment scaled_font, long unicode, MemorySegment glyph_index);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        app_indicator_h.C_INT,
        app_indicator_h.C_POINTER,
        app_indicator_h.C_LONG,
        app_indicator_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(cairo_user_scaled_font_unicode_to_glyph_func_t.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(cairo_user_scaled_font_unicode_to_glyph_func_t.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment scaled_font, long unicode, MemorySegment glyph_index) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, scaled_font, unicode, glyph_index);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

