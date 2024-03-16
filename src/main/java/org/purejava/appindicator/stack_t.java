// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.OfLong;

/**
 * {@snippet lang=c :
 * struct {
 *     void *ss_sp;
 *     int ss_flags;
 *     size_t ss_size;
 * }
 * }
 */
public class stack_t {

    stack_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_POINTER.withName("ss_sp"),
        app_indicator_h.C_INT.withName("ss_flags"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_LONG.withName("ss_size")
    ).withName("$anon$26:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout ss_sp$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ss_sp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *ss_sp
     * }
     */
    public static final AddressLayout ss_sp$layout() {
        return ss_sp$LAYOUT;
    }

    private static final long ss_sp$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *ss_sp
     * }
     */
    public static final long ss_sp$offset() {
        return ss_sp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *ss_sp
     * }
     */
    public static MemorySegment ss_sp(MemorySegment struct) {
        return struct.get(ss_sp$LAYOUT, ss_sp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *ss_sp
     * }
     */
    public static void ss_sp(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ss_sp$LAYOUT, ss_sp$OFFSET, fieldValue);
    }

    private static final OfInt ss_flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ss_flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int ss_flags
     * }
     */
    public static final OfInt ss_flags$layout() {
        return ss_flags$LAYOUT;
    }

    private static final long ss_flags$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int ss_flags
     * }
     */
    public static final long ss_flags$offset() {
        return ss_flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int ss_flags
     * }
     */
    public static int ss_flags(MemorySegment struct) {
        return struct.get(ss_flags$LAYOUT, ss_flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int ss_flags
     * }
     */
    public static void ss_flags(MemorySegment struct, int fieldValue) {
        struct.set(ss_flags$LAYOUT, ss_flags$OFFSET, fieldValue);
    }

    private static final OfLong ss_size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ss_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t ss_size
     * }
     */
    public static final OfLong ss_size$layout() {
        return ss_size$LAYOUT;
    }

    private static final long ss_size$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t ss_size
     * }
     */
    public static final long ss_size$offset() {
        return ss_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t ss_size
     * }
     */
    public static long ss_size(MemorySegment struct) {
        return struct.get(ss_size$LAYOUT, ss_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t ss_size
     * }
     */
    public static void ss_size(MemorySegment struct, long fieldValue) {
        struct.set(ss_size$LAYOUT, ss_size$OFFSET, fieldValue);
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

