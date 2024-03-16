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
 * struct ucontext_t {
 *     unsigned long uc_flags;
 *     struct ucontext_t *uc_link;
 *     stack_t uc_stack;
 *     sigset_t uc_sigmask;
 *     mcontext_t uc_mcontext;
 * }
 * }
 */
public class ucontext_t {

    ucontext_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_LONG.withName("uc_flags"),
        app_indicator_h.C_POINTER.withName("uc_link"),
        stack_t.layout().withName("uc_stack"),
        __sigset_t.layout().withName("uc_sigmask"),
        MemoryLayout.paddingLayout(8),
        mcontext_t.layout().withName("uc_mcontext")
    ).withName("ucontext_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong uc_flags$LAYOUT = (OfLong)$LAYOUT.select(groupElement("uc_flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long uc_flags
     * }
     */
    public static final OfLong uc_flags$layout() {
        return uc_flags$LAYOUT;
    }

    private static final long uc_flags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long uc_flags
     * }
     */
    public static final long uc_flags$offset() {
        return uc_flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long uc_flags
     * }
     */
    public static long uc_flags(MemorySegment struct) {
        return struct.get(uc_flags$LAYOUT, uc_flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long uc_flags
     * }
     */
    public static void uc_flags(MemorySegment struct, long fieldValue) {
        struct.set(uc_flags$LAYOUT, uc_flags$OFFSET, fieldValue);
    }

    private static final AddressLayout uc_link$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("uc_link"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct ucontext_t *uc_link
     * }
     */
    public static final AddressLayout uc_link$layout() {
        return uc_link$LAYOUT;
    }

    private static final long uc_link$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct ucontext_t *uc_link
     * }
     */
    public static final long uc_link$offset() {
        return uc_link$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct ucontext_t *uc_link
     * }
     */
    public static MemorySegment uc_link(MemorySegment struct) {
        return struct.get(uc_link$LAYOUT, uc_link$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct ucontext_t *uc_link
     * }
     */
    public static void uc_link(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(uc_link$LAYOUT, uc_link$OFFSET, fieldValue);
    }

    private static final GroupLayout uc_stack$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("uc_stack"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * stack_t uc_stack
     * }
     */
    public static final GroupLayout uc_stack$layout() {
        return uc_stack$LAYOUT;
    }

    private static final long uc_stack$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * stack_t uc_stack
     * }
     */
    public static final long uc_stack$offset() {
        return uc_stack$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * stack_t uc_stack
     * }
     */
    public static MemorySegment uc_stack(MemorySegment struct) {
        return struct.asSlice(uc_stack$OFFSET, uc_stack$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * stack_t uc_stack
     * }
     */
    public static void uc_stack(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, uc_stack$OFFSET, uc_stack$LAYOUT.byteSize());
    }

    private static final GroupLayout uc_sigmask$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("uc_sigmask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * sigset_t uc_sigmask
     * }
     */
    public static final GroupLayout uc_sigmask$layout() {
        return uc_sigmask$LAYOUT;
    }

    private static final long uc_sigmask$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * sigset_t uc_sigmask
     * }
     */
    public static final long uc_sigmask$offset() {
        return uc_sigmask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * sigset_t uc_sigmask
     * }
     */
    public static MemorySegment uc_sigmask(MemorySegment struct) {
        return struct.asSlice(uc_sigmask$OFFSET, uc_sigmask$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * sigset_t uc_sigmask
     * }
     */
    public static void uc_sigmask(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, uc_sigmask$OFFSET, uc_sigmask$LAYOUT.byteSize());
    }

    private static final GroupLayout uc_mcontext$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("uc_mcontext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * mcontext_t uc_mcontext
     * }
     */
    public static final GroupLayout uc_mcontext$layout() {
        return uc_mcontext$LAYOUT;
    }

    private static final long uc_mcontext$OFFSET = 176;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * mcontext_t uc_mcontext
     * }
     */
    public static final long uc_mcontext$offset() {
        return uc_mcontext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * mcontext_t uc_mcontext
     * }
     */
    public static MemorySegment uc_mcontext(MemorySegment struct) {
        return struct.asSlice(uc_mcontext$OFFSET, uc_mcontext$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * mcontext_t uc_mcontext
     * }
     */
    public static void uc_mcontext(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, uc_mcontext$OFFSET, uc_mcontext$LAYOUT.byteSize());
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

