// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

/**
 * {@snippet lang=c :
 * struct _GSource {
 *     gpointer callback_data;
 *     GSourceCallbackFuncs *callback_funcs;
 *     const GSourceFuncs *source_funcs;
 *     guint ref_count;
 *     GMainContext *context;
 *     gint priority;
 *     guint flags;
 *     guint source_id;
 *     GSList *poll_fds;
 *     GSource *prev;
 *     GSource *next;
 *     char *name;
 *     GSourcePrivate *priv;
 * }
 * }
 */
public class _GSource {

    _GSource() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_POINTER.withName("callback_data"),
        app_indicator_h.C_POINTER.withName("callback_funcs"),
        app_indicator_h.C_POINTER.withName("source_funcs"),
        app_indicator_h.C_INT.withName("ref_count"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("context"),
        app_indicator_h.C_INT.withName("priority"),
        app_indicator_h.C_INT.withName("flags"),
        app_indicator_h.C_INT.withName("source_id"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("poll_fds"),
        app_indicator_h.C_POINTER.withName("prev"),
        app_indicator_h.C_POINTER.withName("next"),
        app_indicator_h.C_POINTER.withName("name"),
        app_indicator_h.C_POINTER.withName("priv")
    ).withName("_GSource");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout callback_data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("callback_data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpointer callback_data
     * }
     */
    public static final AddressLayout callback_data$layout() {
        return callback_data$LAYOUT;
    }

    private static final long callback_data$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpointer callback_data
     * }
     */
    public static final long callback_data$offset() {
        return callback_data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpointer callback_data
     * }
     */
    public static MemorySegment callback_data(MemorySegment struct) {
        return struct.get(callback_data$LAYOUT, callback_data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpointer callback_data
     * }
     */
    public static void callback_data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(callback_data$LAYOUT, callback_data$OFFSET, fieldValue);
    }

    private static final AddressLayout callback_funcs$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("callback_funcs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GSourceCallbackFuncs *callback_funcs
     * }
     */
    public static final AddressLayout callback_funcs$layout() {
        return callback_funcs$LAYOUT;
    }

    private static final long callback_funcs$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GSourceCallbackFuncs *callback_funcs
     * }
     */
    public static final long callback_funcs$offset() {
        return callback_funcs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GSourceCallbackFuncs *callback_funcs
     * }
     */
    public static MemorySegment callback_funcs(MemorySegment struct) {
        return struct.get(callback_funcs$LAYOUT, callback_funcs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GSourceCallbackFuncs *callback_funcs
     * }
     */
    public static void callback_funcs(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(callback_funcs$LAYOUT, callback_funcs$OFFSET, fieldValue);
    }

    private static final AddressLayout source_funcs$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("source_funcs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const GSourceFuncs *source_funcs
     * }
     */
    public static final AddressLayout source_funcs$layout() {
        return source_funcs$LAYOUT;
    }

    private static final long source_funcs$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const GSourceFuncs *source_funcs
     * }
     */
    public static final long source_funcs$offset() {
        return source_funcs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const GSourceFuncs *source_funcs
     * }
     */
    public static MemorySegment source_funcs(MemorySegment struct) {
        return struct.get(source_funcs$LAYOUT, source_funcs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const GSourceFuncs *source_funcs
     * }
     */
    public static void source_funcs(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(source_funcs$LAYOUT, source_funcs$OFFSET, fieldValue);
    }

    private static final OfInt ref_count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ref_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint ref_count
     * }
     */
    public static final OfInt ref_count$layout() {
        return ref_count$LAYOUT;
    }

    private static final long ref_count$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint ref_count
     * }
     */
    public static final long ref_count$offset() {
        return ref_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint ref_count
     * }
     */
    public static int ref_count(MemorySegment struct) {
        return struct.get(ref_count$LAYOUT, ref_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint ref_count
     * }
     */
    public static void ref_count(MemorySegment struct, int fieldValue) {
        struct.set(ref_count$LAYOUT, ref_count$OFFSET, fieldValue);
    }

    private static final AddressLayout context$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("context"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GMainContext *context
     * }
     */
    public static final AddressLayout context$layout() {
        return context$LAYOUT;
    }

    private static final long context$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GMainContext *context
     * }
     */
    public static final long context$offset() {
        return context$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GMainContext *context
     * }
     */
    public static MemorySegment context(MemorySegment struct) {
        return struct.get(context$LAYOUT, context$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GMainContext *context
     * }
     */
    public static void context(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(context$LAYOUT, context$OFFSET, fieldValue);
    }

    private static final OfInt priority$LAYOUT = (OfInt)$LAYOUT.select(groupElement("priority"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint priority
     * }
     */
    public static final OfInt priority$layout() {
        return priority$LAYOUT;
    }

    private static final long priority$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint priority
     * }
     */
    public static final long priority$offset() {
        return priority$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint priority
     * }
     */
    public static int priority(MemorySegment struct) {
        return struct.get(priority$LAYOUT, priority$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint priority
     * }
     */
    public static void priority(MemorySegment struct, int fieldValue) {
        struct.set(priority$LAYOUT, priority$OFFSET, fieldValue);
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final OfInt source_id$LAYOUT = (OfInt)$LAYOUT.select(groupElement("source_id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint source_id
     * }
     */
    public static final OfInt source_id$layout() {
        return source_id$LAYOUT;
    }

    private static final long source_id$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint source_id
     * }
     */
    public static final long source_id$offset() {
        return source_id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint source_id
     * }
     */
    public static int source_id(MemorySegment struct) {
        return struct.get(source_id$LAYOUT, source_id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint source_id
     * }
     */
    public static void source_id(MemorySegment struct, int fieldValue) {
        struct.set(source_id$LAYOUT, source_id$OFFSET, fieldValue);
    }

    private static final AddressLayout poll_fds$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("poll_fds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GSList *poll_fds
     * }
     */
    public static final AddressLayout poll_fds$layout() {
        return poll_fds$LAYOUT;
    }

    private static final long poll_fds$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GSList *poll_fds
     * }
     */
    public static final long poll_fds$offset() {
        return poll_fds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GSList *poll_fds
     * }
     */
    public static MemorySegment poll_fds(MemorySegment struct) {
        return struct.get(poll_fds$LAYOUT, poll_fds$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GSList *poll_fds
     * }
     */
    public static void poll_fds(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(poll_fds$LAYOUT, poll_fds$OFFSET, fieldValue);
    }

    private static final AddressLayout prev$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("prev"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GSource *prev
     * }
     */
    public static final AddressLayout prev$layout() {
        return prev$LAYOUT;
    }

    private static final long prev$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GSource *prev
     * }
     */
    public static final long prev$offset() {
        return prev$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GSource *prev
     * }
     */
    public static MemorySegment prev(MemorySegment struct) {
        return struct.get(prev$LAYOUT, prev$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GSource *prev
     * }
     */
    public static void prev(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(prev$LAYOUT, prev$OFFSET, fieldValue);
    }

    private static final AddressLayout next$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("next"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GSource *next
     * }
     */
    public static final AddressLayout next$layout() {
        return next$LAYOUT;
    }

    private static final long next$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GSource *next
     * }
     */
    public static final long next$offset() {
        return next$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GSource *next
     * }
     */
    public static MemorySegment next(MemorySegment struct) {
        return struct.get(next$LAYOUT, next$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GSource *next
     * }
     */
    public static void next(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(next$LAYOUT, next$OFFSET, fieldValue);
    }

    private static final AddressLayout name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *name
     * }
     */
    public static final AddressLayout name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *name
     * }
     */
    public static final long name$offset() {
        return name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *name
     * }
     */
    public static MemorySegment name(MemorySegment struct) {
        return struct.get(name$LAYOUT, name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *name
     * }
     */
    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(name$LAYOUT, name$OFFSET, fieldValue);
    }

    private static final AddressLayout priv$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("priv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GSourcePrivate *priv
     * }
     */
    public static final AddressLayout priv$layout() {
        return priv$LAYOUT;
    }

    private static final long priv$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GSourcePrivate *priv
     * }
     */
    public static final long priv$offset() {
        return priv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GSourcePrivate *priv
     * }
     */
    public static MemorySegment priv(MemorySegment struct) {
        return struct.get(priv$LAYOUT, priv$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GSourcePrivate *priv
     * }
     */
    public static void priv(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(priv$LAYOUT, priv$OFFSET, fieldValue);
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

