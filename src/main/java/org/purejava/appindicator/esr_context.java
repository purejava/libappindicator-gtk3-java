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
 * struct esr_context {
 *     struct _aarch64_ctx head;
 *     __u64 esr;
 * }
 * }
 */
public class esr_context {

    esr_context() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _aarch64_ctx.layout().withName("head"),
        app_indicator_h.C_LONG_LONG.withName("esr")
    ).withName("esr_context");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout head$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("head"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct _aarch64_ctx head
     * }
     */
    public static final GroupLayout head$layout() {
        return head$LAYOUT;
    }

    private static final long head$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct _aarch64_ctx head
     * }
     */
    public static final long head$offset() {
        return head$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct _aarch64_ctx head
     * }
     */
    public static MemorySegment head(MemorySegment struct) {
        return struct.asSlice(head$OFFSET, head$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct _aarch64_ctx head
     * }
     */
    public static void head(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, head$OFFSET, head$LAYOUT.byteSize());
    }

    private static final OfLong esr$LAYOUT = (OfLong)$LAYOUT.select(groupElement("esr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 esr
     * }
     */
    public static final OfLong esr$layout() {
        return esr$LAYOUT;
    }

    private static final long esr$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 esr
     * }
     */
    public static final long esr$offset() {
        return esr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 esr
     * }
     */
    public static long esr(MemorySegment struct) {
        return struct.get(esr$LAYOUT, esr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 esr
     * }
     */
    public static void esr(MemorySegment struct, long fieldValue) {
        struct.set(esr$LAYOUT, esr$OFFSET, fieldValue);
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
