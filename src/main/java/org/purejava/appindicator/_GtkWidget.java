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
 * struct _GtkWidget {
 *     GInitiallyUnowned parent_instance;
 *     GtkWidgetPrivate *priv;
 * }
 * }
 */
public class _GtkWidget {

    _GtkWidget() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GObject.layout().withName("parent_instance"),
        app_indicator_h.C_POINTER.withName("priv")
    ).withName("_GtkWidget");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout parent_instance$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("parent_instance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GInitiallyUnowned parent_instance
     * }
     */
    public static final GroupLayout parent_instance$layout() {
        return parent_instance$LAYOUT;
    }

    private static final long parent_instance$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GInitiallyUnowned parent_instance
     * }
     */
    public static final long parent_instance$offset() {
        return parent_instance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GInitiallyUnowned parent_instance
     * }
     */
    public static MemorySegment parent_instance(MemorySegment struct) {
        return struct.asSlice(parent_instance$OFFSET, parent_instance$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GInitiallyUnowned parent_instance
     * }
     */
    public static void parent_instance(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_instance$OFFSET, parent_instance$LAYOUT.byteSize());
    }

    private static final AddressLayout priv$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("priv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GtkWidgetPrivate *priv
     * }
     */
    public static final AddressLayout priv$layout() {
        return priv$LAYOUT;
    }

    private static final long priv$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GtkWidgetPrivate *priv
     * }
     */
    public static final long priv$offset() {
        return priv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GtkWidgetPrivate *priv
     * }
     */
    public static MemorySegment priv(MemorySegment struct) {
        return struct.get(priv$LAYOUT, priv$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GtkWidgetPrivate *priv
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

