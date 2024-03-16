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
 * struct _GtkRecentData {
 *     gchar *display_name;
 *     gchar *description;
 *     gchar *mime_type;
 *     gchar *app_name;
 *     gchar *app_exec;
 *     gchar **groups;
 *     gboolean is_private;
 * }
 * }
 */
public class _GtkRecentData {

    _GtkRecentData() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_POINTER.withName("display_name"),
        app_indicator_h.C_POINTER.withName("description"),
        app_indicator_h.C_POINTER.withName("mime_type"),
        app_indicator_h.C_POINTER.withName("app_name"),
        app_indicator_h.C_POINTER.withName("app_exec"),
        app_indicator_h.C_POINTER.withName("groups"),
        app_indicator_h.C_INT.withName("is_private"),
        MemoryLayout.paddingLayout(4)
    ).withName("_GtkRecentData");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout display_name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("display_name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gchar *display_name
     * }
     */
    public static final AddressLayout display_name$layout() {
        return display_name$LAYOUT;
    }

    private static final long display_name$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gchar *display_name
     * }
     */
    public static final long display_name$offset() {
        return display_name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gchar *display_name
     * }
     */
    public static MemorySegment display_name(MemorySegment struct) {
        return struct.get(display_name$LAYOUT, display_name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gchar *display_name
     * }
     */
    public static void display_name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(display_name$LAYOUT, display_name$OFFSET, fieldValue);
    }

    private static final AddressLayout description$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("description"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gchar *description
     * }
     */
    public static final AddressLayout description$layout() {
        return description$LAYOUT;
    }

    private static final long description$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gchar *description
     * }
     */
    public static final long description$offset() {
        return description$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gchar *description
     * }
     */
    public static MemorySegment description(MemorySegment struct) {
        return struct.get(description$LAYOUT, description$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gchar *description
     * }
     */
    public static void description(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(description$LAYOUT, description$OFFSET, fieldValue);
    }

    private static final AddressLayout mime_type$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("mime_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gchar *mime_type
     * }
     */
    public static final AddressLayout mime_type$layout() {
        return mime_type$LAYOUT;
    }

    private static final long mime_type$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gchar *mime_type
     * }
     */
    public static final long mime_type$offset() {
        return mime_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gchar *mime_type
     * }
     */
    public static MemorySegment mime_type(MemorySegment struct) {
        return struct.get(mime_type$LAYOUT, mime_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gchar *mime_type
     * }
     */
    public static void mime_type(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(mime_type$LAYOUT, mime_type$OFFSET, fieldValue);
    }

    private static final AddressLayout app_name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("app_name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gchar *app_name
     * }
     */
    public static final AddressLayout app_name$layout() {
        return app_name$LAYOUT;
    }

    private static final long app_name$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gchar *app_name
     * }
     */
    public static final long app_name$offset() {
        return app_name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gchar *app_name
     * }
     */
    public static MemorySegment app_name(MemorySegment struct) {
        return struct.get(app_name$LAYOUT, app_name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gchar *app_name
     * }
     */
    public static void app_name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(app_name$LAYOUT, app_name$OFFSET, fieldValue);
    }

    private static final AddressLayout app_exec$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("app_exec"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gchar *app_exec
     * }
     */
    public static final AddressLayout app_exec$layout() {
        return app_exec$LAYOUT;
    }

    private static final long app_exec$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gchar *app_exec
     * }
     */
    public static final long app_exec$offset() {
        return app_exec$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gchar *app_exec
     * }
     */
    public static MemorySegment app_exec(MemorySegment struct) {
        return struct.get(app_exec$LAYOUT, app_exec$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gchar *app_exec
     * }
     */
    public static void app_exec(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(app_exec$LAYOUT, app_exec$OFFSET, fieldValue);
    }

    private static final AddressLayout groups$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("groups"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gchar **groups
     * }
     */
    public static final AddressLayout groups$layout() {
        return groups$LAYOUT;
    }

    private static final long groups$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gchar **groups
     * }
     */
    public static final long groups$offset() {
        return groups$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gchar **groups
     * }
     */
    public static MemorySegment groups(MemorySegment struct) {
        return struct.get(groups$LAYOUT, groups$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gchar **groups
     * }
     */
    public static void groups(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(groups$LAYOUT, groups$OFFSET, fieldValue);
    }

    private static final OfInt is_private$LAYOUT = (OfInt)$LAYOUT.select(groupElement("is_private"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean is_private
     * }
     */
    public static final OfInt is_private$layout() {
        return is_private$LAYOUT;
    }

    private static final long is_private$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean is_private
     * }
     */
    public static final long is_private$offset() {
        return is_private$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean is_private
     * }
     */
    public static int is_private(MemorySegment struct) {
        return struct.get(is_private$LAYOUT, is_private$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean is_private
     * }
     */
    public static void is_private(MemorySegment struct, int fieldValue) {
        struct.set(is_private$LAYOUT, is_private$OFFSET, fieldValue);
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

