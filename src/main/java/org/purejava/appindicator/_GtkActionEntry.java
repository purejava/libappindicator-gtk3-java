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
 * struct _GtkActionEntry {
 *     const gchar *name;
 *     const gchar *stock_id;
 *     const gchar *label;
 *     const gchar *accelerator;
 *     const gchar *tooltip;
 *     GCallback callback;
 * }
 * }
 */
public class _GtkActionEntry {

    _GtkActionEntry() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_POINTER.withName("name"),
        app_indicator_h.C_POINTER.withName("stock_id"),
        app_indicator_h.C_POINTER.withName("label"),
        app_indicator_h.C_POINTER.withName("accelerator"),
        app_indicator_h.C_POINTER.withName("tooltip"),
        app_indicator_h.C_POINTER.withName("callback")
    ).withName("_GtkActionEntry");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const gchar *name
     * }
     */
    public static final AddressLayout name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const gchar *name
     * }
     */
    public static final long name$offset() {
        return name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const gchar *name
     * }
     */
    public static MemorySegment name(MemorySegment struct) {
        return struct.get(name$LAYOUT, name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const gchar *name
     * }
     */
    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(name$LAYOUT, name$OFFSET, fieldValue);
    }

    private static final AddressLayout stock_id$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("stock_id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const gchar *stock_id
     * }
     */
    public static final AddressLayout stock_id$layout() {
        return stock_id$LAYOUT;
    }

    private static final long stock_id$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const gchar *stock_id
     * }
     */
    public static final long stock_id$offset() {
        return stock_id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const gchar *stock_id
     * }
     */
    public static MemorySegment stock_id(MemorySegment struct) {
        return struct.get(stock_id$LAYOUT, stock_id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const gchar *stock_id
     * }
     */
    public static void stock_id(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(stock_id$LAYOUT, stock_id$OFFSET, fieldValue);
    }

    private static final AddressLayout label$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("label"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const gchar *label
     * }
     */
    public static final AddressLayout label$layout() {
        return label$LAYOUT;
    }

    private static final long label$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const gchar *label
     * }
     */
    public static final long label$offset() {
        return label$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const gchar *label
     * }
     */
    public static MemorySegment label(MemorySegment struct) {
        return struct.get(label$LAYOUT, label$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const gchar *label
     * }
     */
    public static void label(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(label$LAYOUT, label$OFFSET, fieldValue);
    }

    private static final AddressLayout accelerator$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("accelerator"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const gchar *accelerator
     * }
     */
    public static final AddressLayout accelerator$layout() {
        return accelerator$LAYOUT;
    }

    private static final long accelerator$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const gchar *accelerator
     * }
     */
    public static final long accelerator$offset() {
        return accelerator$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const gchar *accelerator
     * }
     */
    public static MemorySegment accelerator(MemorySegment struct) {
        return struct.get(accelerator$LAYOUT, accelerator$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const gchar *accelerator
     * }
     */
    public static void accelerator(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(accelerator$LAYOUT, accelerator$OFFSET, fieldValue);
    }

    private static final AddressLayout tooltip$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("tooltip"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const gchar *tooltip
     * }
     */
    public static final AddressLayout tooltip$layout() {
        return tooltip$LAYOUT;
    }

    private static final long tooltip$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const gchar *tooltip
     * }
     */
    public static final long tooltip$offset() {
        return tooltip$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const gchar *tooltip
     * }
     */
    public static MemorySegment tooltip(MemorySegment struct) {
        return struct.get(tooltip$LAYOUT, tooltip$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const gchar *tooltip
     * }
     */
    public static void tooltip(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(tooltip$LAYOUT, tooltip$OFFSET, fieldValue);
    }

    private static final AddressLayout callback$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("callback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GCallback callback
     * }
     */
    public static final AddressLayout callback$layout() {
        return callback$LAYOUT;
    }

    private static final long callback$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GCallback callback
     * }
     */
    public static final long callback$offset() {
        return callback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GCallback callback
     * }
     */
    public static MemorySegment callback(MemorySegment struct) {
        return struct.get(callback$LAYOUT, callback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GCallback callback
     * }
     */
    public static void callback(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(callback$LAYOUT, callback$OFFSET, fieldValue);
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

