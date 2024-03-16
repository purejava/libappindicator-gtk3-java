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
 * struct _PangoColor {
 *     guint16 red;
 *     guint16 green;
 *     guint16 blue;
 * }
 * }
 */
public class _PangoColor {

    _PangoColor() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_SHORT.withName("red"),
        app_indicator_h.C_SHORT.withName("green"),
        app_indicator_h.C_SHORT.withName("blue")
    ).withName("_PangoColor");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort red$LAYOUT = (OfShort)$LAYOUT.select(groupElement("red"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint16 red
     * }
     */
    public static final OfShort red$layout() {
        return red$LAYOUT;
    }

    private static final long red$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint16 red
     * }
     */
    public static final long red$offset() {
        return red$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint16 red
     * }
     */
    public static short red(MemorySegment struct) {
        return struct.get(red$LAYOUT, red$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint16 red
     * }
     */
    public static void red(MemorySegment struct, short fieldValue) {
        struct.set(red$LAYOUT, red$OFFSET, fieldValue);
    }

    private static final OfShort green$LAYOUT = (OfShort)$LAYOUT.select(groupElement("green"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint16 green
     * }
     */
    public static final OfShort green$layout() {
        return green$LAYOUT;
    }

    private static final long green$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint16 green
     * }
     */
    public static final long green$offset() {
        return green$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint16 green
     * }
     */
    public static short green(MemorySegment struct) {
        return struct.get(green$LAYOUT, green$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint16 green
     * }
     */
    public static void green(MemorySegment struct, short fieldValue) {
        struct.set(green$LAYOUT, green$OFFSET, fieldValue);
    }

    private static final OfShort blue$LAYOUT = (OfShort)$LAYOUT.select(groupElement("blue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint16 blue
     * }
     */
    public static final OfShort blue$layout() {
        return blue$LAYOUT;
    }

    private static final long blue$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint16 blue
     * }
     */
    public static final long blue$offset() {
        return blue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint16 blue
     * }
     */
    public static short blue(MemorySegment struct) {
        return struct.get(blue$LAYOUT, blue$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint16 blue
     * }
     */
    public static void blue(MemorySegment struct, short fieldValue) {
        struct.set(blue$LAYOUT, blue$OFFSET, fieldValue);
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

