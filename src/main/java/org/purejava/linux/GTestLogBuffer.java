// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     GString* data;
 *     GSList* msgs;
 * };
 * }
 */
public class GTestLogBuffer {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_POINTER$LAYOUT.withName("msgs")
    );
    public static MemoryLayout $LAYOUT() {
        return GTestLogBuffer.$struct$LAYOUT;
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return GTestLogBuffer.data$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GString* data;
     * }
     */
    public static MemorySegment data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)GTestLogBuffer.data$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GString* data;
     * }
     */
    public static void data$set(MemorySegment seg, MemorySegment x) {
        GTestLogBuffer.data$VH.set(seg, x);
    }
    public static MemorySegment data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)GTestLogBuffer.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemorySegment x) {
        GTestLogBuffer.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle msgs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("msgs"));
    public static VarHandle msgs$VH() {
        return GTestLogBuffer.msgs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSList* msgs;
     * }
     */
    public static MemorySegment msgs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)GTestLogBuffer.msgs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSList* msgs;
     * }
     */
    public static void msgs$set(MemorySegment seg, MemorySegment x) {
        GTestLogBuffer.msgs$VH.set(seg, x);
    }
    public static MemorySegment msgs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)GTestLogBuffer.msgs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void msgs$set(MemorySegment seg, long index, MemorySegment x) {
        GTestLogBuffer.msgs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

