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
 * struct _PangoEngineScriptInfo {
 *     PangoScript script;
 *     const gchar *langs;
 * }
 * }
 */
public class _PangoEngineScriptInfo {

    _PangoEngineScriptInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_INT.withName("script"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("langs")
    ).withName("_PangoEngineScriptInfo");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt script$LAYOUT = (OfInt)$LAYOUT.select(groupElement("script"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PangoScript script
     * }
     */
    public static final OfInt script$layout() {
        return script$LAYOUT;
    }

    private static final long script$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PangoScript script
     * }
     */
    public static final long script$offset() {
        return script$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PangoScript script
     * }
     */
    public static int script(MemorySegment struct) {
        return struct.get(script$LAYOUT, script$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PangoScript script
     * }
     */
    public static void script(MemorySegment struct, int fieldValue) {
        struct.set(script$LAYOUT, script$OFFSET, fieldValue);
    }

    private static final AddressLayout langs$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("langs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const gchar *langs
     * }
     */
    public static final AddressLayout langs$layout() {
        return langs$LAYOUT;
    }

    private static final long langs$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const gchar *langs
     * }
     */
    public static final long langs$offset() {
        return langs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const gchar *langs
     * }
     */
    public static MemorySegment langs(MemorySegment struct) {
        return struct.get(langs$LAYOUT, langs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const gchar *langs
     * }
     */
    public static void langs(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(langs$LAYOUT, langs$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

