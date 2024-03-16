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
 * struct __jmp_buf_tag {
 *     __jmp_buf __jmpbuf;
 *     int __mask_was_saved;
 *     __sigset_t __saved_mask;
 * }
 * }
 */
public class __jmp_buf_tag {

    __jmp_buf_tag() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(22, app_indicator_h.C_LONG_LONG).withName("__jmpbuf"),
        app_indicator_h.C_INT.withName("__mask_was_saved"),
        MemoryLayout.paddingLayout(4),
        __sigset_t.layout().withName("__saved_mask")
    ).withName("__jmp_buf_tag");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout __jmpbuf$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__jmpbuf"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __jmp_buf __jmpbuf
     * }
     */
    public static final SequenceLayout __jmpbuf$layout() {
        return __jmpbuf$LAYOUT;
    }

    private static final long __jmpbuf$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __jmp_buf __jmpbuf
     * }
     */
    public static final long __jmpbuf$offset() {
        return __jmpbuf$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __jmp_buf __jmpbuf
     * }
     */
    public static MemorySegment __jmpbuf(MemorySegment struct) {
        return struct.asSlice(__jmpbuf$OFFSET, __jmpbuf$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __jmp_buf __jmpbuf
     * }
     */
    public static void __jmpbuf(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __jmpbuf$OFFSET, __jmpbuf$LAYOUT.byteSize());
    }

    private static final OfInt __mask_was_saved$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__mask_was_saved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int __mask_was_saved
     * }
     */
    public static final OfInt __mask_was_saved$layout() {
        return __mask_was_saved$LAYOUT;
    }

    private static final long __mask_was_saved$OFFSET = 176;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int __mask_was_saved
     * }
     */
    public static final long __mask_was_saved$offset() {
        return __mask_was_saved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int __mask_was_saved
     * }
     */
    public static int __mask_was_saved(MemorySegment struct) {
        return struct.get(__mask_was_saved$LAYOUT, __mask_was_saved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int __mask_was_saved
     * }
     */
    public static void __mask_was_saved(MemorySegment struct, int fieldValue) {
        struct.set(__mask_was_saved$LAYOUT, __mask_was_saved$OFFSET, fieldValue);
    }

    private static final GroupLayout __saved_mask$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("__saved_mask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __sigset_t __saved_mask
     * }
     */
    public static final GroupLayout __saved_mask$layout() {
        return __saved_mask$LAYOUT;
    }

    private static final long __saved_mask$OFFSET = 184;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __sigset_t __saved_mask
     * }
     */
    public static final long __saved_mask$offset() {
        return __saved_mask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __sigset_t __saved_mask
     * }
     */
    public static MemorySegment __saved_mask(MemorySegment struct) {
        return struct.asSlice(__saved_mask$OFFSET, __saved_mask$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __sigset_t __saved_mask
     * }
     */
    public static void __saved_mask(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __saved_mask$OFFSET, __saved_mask$LAYOUT.byteSize());
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

