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
 * struct _GdkEventSelection {
 *     GdkEventType type;
 *     GdkWindow *window;
 *     gint8 send_event;
 *     GdkAtom selection;
 *     GdkAtom target;
 *     GdkAtom property;
 *     guint32 time;
 *     GdkWindow *requestor;
 * }
 * }
 */
public class _GdkEventSelection {

    _GdkEventSelection() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("window"),
        app_indicator_h.C_CHAR.withName("send_event"),
        MemoryLayout.paddingLayout(7),
        app_indicator_h.C_POINTER.withName("selection"),
        app_indicator_h.C_POINTER.withName("target"),
        app_indicator_h.C_POINTER.withName("property"),
        app_indicator_h.C_INT.withName("time"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("requestor")
    ).withName("_GdkEventSelection");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GdkEventType type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GdkEventType type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GdkEventType type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GdkEventType type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final AddressLayout window$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("window"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GdkWindow *window
     * }
     */
    public static final AddressLayout window$layout() {
        return window$LAYOUT;
    }

    private static final long window$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GdkWindow *window
     * }
     */
    public static final long window$offset() {
        return window$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GdkWindow *window
     * }
     */
    public static MemorySegment window(MemorySegment struct) {
        return struct.get(window$LAYOUT, window$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GdkWindow *window
     * }
     */
    public static void window(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(window$LAYOUT, window$OFFSET, fieldValue);
    }

    private static final OfByte send_event$LAYOUT = (OfByte)$LAYOUT.select(groupElement("send_event"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint8 send_event
     * }
     */
    public static final OfByte send_event$layout() {
        return send_event$LAYOUT;
    }

    private static final long send_event$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint8 send_event
     * }
     */
    public static final long send_event$offset() {
        return send_event$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint8 send_event
     * }
     */
    public static byte send_event(MemorySegment struct) {
        return struct.get(send_event$LAYOUT, send_event$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint8 send_event
     * }
     */
    public static void send_event(MemorySegment struct, byte fieldValue) {
        struct.set(send_event$LAYOUT, send_event$OFFSET, fieldValue);
    }

    private static final AddressLayout selection$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("selection"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GdkAtom selection
     * }
     */
    public static final AddressLayout selection$layout() {
        return selection$LAYOUT;
    }

    private static final long selection$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GdkAtom selection
     * }
     */
    public static final long selection$offset() {
        return selection$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GdkAtom selection
     * }
     */
    public static MemorySegment selection(MemorySegment struct) {
        return struct.get(selection$LAYOUT, selection$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GdkAtom selection
     * }
     */
    public static void selection(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(selection$LAYOUT, selection$OFFSET, fieldValue);
    }

    private static final AddressLayout target$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("target"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GdkAtom target
     * }
     */
    public static final AddressLayout target$layout() {
        return target$LAYOUT;
    }

    private static final long target$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GdkAtom target
     * }
     */
    public static final long target$offset() {
        return target$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GdkAtom target
     * }
     */
    public static MemorySegment target(MemorySegment struct) {
        return struct.get(target$LAYOUT, target$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GdkAtom target
     * }
     */
    public static void target(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(target$LAYOUT, target$OFFSET, fieldValue);
    }

    private static final AddressLayout property$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("property"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GdkAtom property
     * }
     */
    public static final AddressLayout property$layout() {
        return property$LAYOUT;
    }

    private static final long property$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GdkAtom property
     * }
     */
    public static final long property$offset() {
        return property$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GdkAtom property
     * }
     */
    public static MemorySegment property(MemorySegment struct) {
        return struct.get(property$LAYOUT, property$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GdkAtom property
     * }
     */
    public static void property(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(property$LAYOUT, property$OFFSET, fieldValue);
    }

    private static final OfInt time$LAYOUT = (OfInt)$LAYOUT.select(groupElement("time"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint32 time
     * }
     */
    public static final OfInt time$layout() {
        return time$LAYOUT;
    }

    private static final long time$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint32 time
     * }
     */
    public static final long time$offset() {
        return time$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint32 time
     * }
     */
    public static int time(MemorySegment struct) {
        return struct.get(time$LAYOUT, time$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint32 time
     * }
     */
    public static void time(MemorySegment struct, int fieldValue) {
        struct.set(time$LAYOUT, time$OFFSET, fieldValue);
    }

    private static final AddressLayout requestor$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("requestor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GdkWindow *requestor
     * }
     */
    public static final AddressLayout requestor$layout() {
        return requestor$LAYOUT;
    }

    private static final long requestor$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GdkWindow *requestor
     * }
     */
    public static final long requestor$offset() {
        return requestor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GdkWindow *requestor
     * }
     */
    public static MemorySegment requestor(MemorySegment struct) {
        return struct.get(requestor$LAYOUT, requestor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GdkWindow *requestor
     * }
     */
    public static void requestor(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(requestor$LAYOUT, requestor$OFFSET, fieldValue);
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

