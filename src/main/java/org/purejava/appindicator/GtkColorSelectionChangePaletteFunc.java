// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*GtkColorSelectionChangePaletteFunc)(struct _GdkColor* colors,int n_colors);
 * }
 */
public interface GtkColorSelectionChangePaletteFunc {

    void apply(java.lang.foreign.MemorySegment colors, int n_colors);
    static MemorySegment allocate(GtkColorSelectionChangePaletteFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$3276.const$1, fi, constants$40.const$2, scope);
    }
    static GtkColorSelectionChangePaletteFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _colors, int _n_colors) -> {
            try {
                constants$509.const$5.invokeExact(symbol, _colors, _n_colors);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


