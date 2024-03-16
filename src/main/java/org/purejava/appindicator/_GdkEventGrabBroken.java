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
 * struct _GdkEventGrabBroken {
 *     GdkEventType type;
 *     GdkWindow *window;
 *     gint8 send_event;
 *     gboolean keyboard;
 *     gboolean implicit;
 *     GdkWindow *grab_window;
 * }
 * }
 */
public class _GdkEventGrabBroken {

    _GdkEventGrabBroken() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("window"),
        app_indicator_h.C_CHAR.withName("send_event"),
        MemoryLayout.paddingLayout(3),
        app_indicator_h.C_INT.withName("keyboard"),
        app_indicator_h.C_INT.withName("implicit"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("grab_window")
    ).withName("_GdkEventGrabBroken");

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

    private static final OfInt keyboard$LAYOUT = (OfInt)$LAYOUT.select(groupElement("keyboard"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean keyboard
     * }
     */
    public static final OfInt keyboard$layout() {
        return keyboard$LAYOUT;
    }

    private static final long keyboard$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean keyboard
     * }
     */
    public static final long keyboard$offset() {
        return keyboard$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean keyboard
     * }
     */
    public static int keyboard(MemorySegment struct) {
        return struct.get(keyboard$LAYOUT, keyboard$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean keyboard
     * }
     */
    public static void keyboard(MemorySegment struct, int fieldValue) {
        struct.set(keyboard$LAYOUT, keyboard$OFFSET, fieldValue);
    }

    private static final OfInt implicit$LAYOUT = (OfInt)$LAYOUT.select(groupElement("implicit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean implicit
     * }
     */
    public static final OfInt implicit$layout() {
        return implicit$LAYOUT;
    }

    private static final long implicit$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean implicit
     * }
     */
    public static final long implicit$offset() {
        return implicit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean implicit
     * }
     */
    public static int implicit(MemorySegment struct) {
        return struct.get(implicit$LAYOUT, implicit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean implicit
     * }
     */
    public static void implicit(MemorySegment struct, int fieldValue) {
        struct.set(implicit$LAYOUT, implicit$OFFSET, fieldValue);
    }

    private static final AddressLayout grab_window$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("grab_window"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GdkWindow *grab_window
     * }
     */
    public static final AddressLayout grab_window$layout() {
        return grab_window$LAYOUT;
    }

    private static final long grab_window$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GdkWindow *grab_window
     * }
     */
    public static final long grab_window$offset() {
        return grab_window$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GdkWindow *grab_window
     * }
     */
    public static MemorySegment grab_window(MemorySegment struct) {
        return struct.get(grab_window$LAYOUT, grab_window$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GdkWindow *grab_window
     * }
     */
    public static void grab_window(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(grab_window$LAYOUT, grab_window$OFFSET, fieldValue);
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

