// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct __jmp_buf_tag {
 *     unsigned long long __jmpbuf[22];
 *     int __mask_was_saved;
 *     struct __sigset_t __saved_mask;
 * };
 * }
 */
public class __jmp_buf_tag {

    public static MemoryLayout $LAYOUT() {
        return constants$515.const$1;
    }
    public static MemorySegment __jmpbuf$slice(MemorySegment seg) {
        return seg.asSlice(0, 176);
    }
    public static VarHandle __mask_was_saved$VH() {
        return constants$515.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int __mask_was_saved;
     * }
     */
    public static int __mask_was_saved$get(MemorySegment seg) {
        return (int)constants$515.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int __mask_was_saved;
     * }
     */
    public static void __mask_was_saved$set(MemorySegment seg, int x) {
        constants$515.const$2.set(seg, x);
    }
    public static int __mask_was_saved$get(MemorySegment seg, long index) {
        return (int)constants$515.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void __mask_was_saved$set(MemorySegment seg, long index, int x) {
        constants$515.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __saved_mask$slice(MemorySegment seg) {
        return seg.asSlice(184, 128);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

