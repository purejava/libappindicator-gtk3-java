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
 * struct _GtkRcProperty {
 *     GQuark type_name;
 *     GQuark property_name;
 *     gchar *origin;
 *     GValue value;
 * }
 * }
 */
public class _GtkRcProperty {

    _GtkRcProperty() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_INT.withName("type_name"),
        app_indicator_h.C_INT.withName("property_name"),
        app_indicator_h.C_POINTER.withName("origin"),
        _GValue.layout().withName("value")
    ).withName("_GtkRcProperty");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt type_name$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type_name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GQuark type_name
     * }
     */
    public static final OfInt type_name$layout() {
        return type_name$LAYOUT;
    }

    private static final long type_name$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GQuark type_name
     * }
     */
    public static final long type_name$offset() {
        return type_name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GQuark type_name
     * }
     */
    public static int type_name(MemorySegment struct) {
        return struct.get(type_name$LAYOUT, type_name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GQuark type_name
     * }
     */
    public static void type_name(MemorySegment struct, int fieldValue) {
        struct.set(type_name$LAYOUT, type_name$OFFSET, fieldValue);
    }

    private static final OfInt property_name$LAYOUT = (OfInt)$LAYOUT.select(groupElement("property_name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GQuark property_name
     * }
     */
    public static final OfInt property_name$layout() {
        return property_name$LAYOUT;
    }

    private static final long property_name$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GQuark property_name
     * }
     */
    public static final long property_name$offset() {
        return property_name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GQuark property_name
     * }
     */
    public static int property_name(MemorySegment struct) {
        return struct.get(property_name$LAYOUT, property_name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GQuark property_name
     * }
     */
    public static void property_name(MemorySegment struct, int fieldValue) {
        struct.set(property_name$LAYOUT, property_name$OFFSET, fieldValue);
    }

    private static final AddressLayout origin$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("origin"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gchar *origin
     * }
     */
    public static final AddressLayout origin$layout() {
        return origin$LAYOUT;
    }

    private static final long origin$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gchar *origin
     * }
     */
    public static final long origin$offset() {
        return origin$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gchar *origin
     * }
     */
    public static MemorySegment origin(MemorySegment struct) {
        return struct.get(origin$LAYOUT, origin$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gchar *origin
     * }
     */
    public static void origin(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(origin$LAYOUT, origin$OFFSET, fieldValue);
    }

    private static final GroupLayout value$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GValue value
     * }
     */
    public static final GroupLayout value$layout() {
        return value$LAYOUT;
    }

    private static final long value$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GValue value
     * }
     */
    public static final long value$offset() {
        return value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GValue value
     * }
     */
    public static MemorySegment value(MemorySegment struct) {
        return struct.asSlice(value$OFFSET, value$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GValue value
     * }
     */
    public static void value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, value$OFFSET, value$LAYOUT.byteSize());
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

