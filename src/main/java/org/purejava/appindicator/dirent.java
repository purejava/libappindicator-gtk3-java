// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.MemoryLayout.PathElement.sequenceElement;
import static java.lang.foreign.ValueLayout.*;

/**
 * {@snippet lang=c :
 * struct dirent {
 *     __ino_t d_ino;
 *     __off_t d_off;
 *     unsigned short d_reclen;
 *     unsigned char d_type;
 *     char d_name[256];
 * }
 * }
 */
public class dirent {

    dirent() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_LONG.withName("d_ino"),
        app_indicator_h.C_LONG.withName("d_off"),
        app_indicator_h.C_SHORT.withName("d_reclen"),
        app_indicator_h.C_CHAR.withName("d_type"),
        MemoryLayout.sequenceLayout(256, app_indicator_h.C_CHAR).withName("d_name"),
        MemoryLayout.paddingLayout(5)
    ).withName("dirent");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong d_ino$LAYOUT = (OfLong)$LAYOUT.select(groupElement("d_ino"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __ino_t d_ino
     * }
     */
    public static final OfLong d_ino$layout() {
        return d_ino$LAYOUT;
    }

    private static final long d_ino$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __ino_t d_ino
     * }
     */
    public static final long d_ino$offset() {
        return d_ino$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __ino_t d_ino
     * }
     */
    public static long d_ino(MemorySegment struct) {
        return struct.get(d_ino$LAYOUT, d_ino$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __ino_t d_ino
     * }
     */
    public static void d_ino(MemorySegment struct, long fieldValue) {
        struct.set(d_ino$LAYOUT, d_ino$OFFSET, fieldValue);
    }

    private static final OfLong d_off$LAYOUT = (OfLong)$LAYOUT.select(groupElement("d_off"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __off_t d_off
     * }
     */
    public static final OfLong d_off$layout() {
        return d_off$LAYOUT;
    }

    private static final long d_off$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __off_t d_off
     * }
     */
    public static final long d_off$offset() {
        return d_off$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __off_t d_off
     * }
     */
    public static long d_off(MemorySegment struct) {
        return struct.get(d_off$LAYOUT, d_off$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __off_t d_off
     * }
     */
    public static void d_off(MemorySegment struct, long fieldValue) {
        struct.set(d_off$LAYOUT, d_off$OFFSET, fieldValue);
    }

    private static final OfShort d_reclen$LAYOUT = (OfShort)$LAYOUT.select(groupElement("d_reclen"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short d_reclen
     * }
     */
    public static final OfShort d_reclen$layout() {
        return d_reclen$LAYOUT;
    }

    private static final long d_reclen$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short d_reclen
     * }
     */
    public static final long d_reclen$offset() {
        return d_reclen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short d_reclen
     * }
     */
    public static short d_reclen(MemorySegment struct) {
        return struct.get(d_reclen$LAYOUT, d_reclen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short d_reclen
     * }
     */
    public static void d_reclen(MemorySegment struct, short fieldValue) {
        struct.set(d_reclen$LAYOUT, d_reclen$OFFSET, fieldValue);
    }

    private static final OfByte d_type$LAYOUT = (OfByte)$LAYOUT.select(groupElement("d_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char d_type
     * }
     */
    public static final OfByte d_type$layout() {
        return d_type$LAYOUT;
    }

    private static final long d_type$OFFSET = 18;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char d_type
     * }
     */
    public static final long d_type$offset() {
        return d_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char d_type
     * }
     */
    public static byte d_type(MemorySegment struct) {
        return struct.get(d_type$LAYOUT, d_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char d_type
     * }
     */
    public static void d_type(MemorySegment struct, byte fieldValue) {
        struct.set(d_type$LAYOUT, d_type$OFFSET, fieldValue);
    }

    private static final SequenceLayout d_name$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("d_name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char d_name[256]
     * }
     */
    public static final SequenceLayout d_name$layout() {
        return d_name$LAYOUT;
    }

    private static final long d_name$OFFSET = 19;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char d_name[256]
     * }
     */
    public static final long d_name$offset() {
        return d_name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char d_name[256]
     * }
     */
    public static MemorySegment d_name(MemorySegment struct) {
        return struct.asSlice(d_name$OFFSET, d_name$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char d_name[256]
     * }
     */
    public static void d_name(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, d_name$OFFSET, d_name$LAYOUT.byteSize());
    }

    private static long[] d_name$DIMS = { 256 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char d_name[256]
     * }
     */
    public static long[] d_name$dimensions() {
        return d_name$DIMS;
    }
    private static final VarHandle d_name$ELEM_HANDLE = d_name$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char d_name[256]
     * }
     */
    public static byte d_name(MemorySegment struct, long index0) {
        return (byte)d_name$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char d_name[256]
     * }
     */
    public static void d_name(MemorySegment struct, long index0, byte fieldValue) {
        d_name$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

