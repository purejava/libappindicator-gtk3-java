// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * union pthread_rwlockattr_t {
 *     char __size[8];
 *     long __align;
 * };
 * }
 */
public class pthread_rwlockattr_t {

    public static MemoryLayout $LAYOUT() {
        return constants$79.const$0;
    }
    public static MemorySegment __size$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static VarHandle __align$VH() {
        return constants$79.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long __align;
     * }
     */
    public static long __align$get(MemorySegment seg) {
        return (long)constants$79.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long __align;
     * }
     */
    public static void __align$set(MemorySegment seg, long x) {
        constants$79.const$1.set(seg, x);
    }
    public static long __align$get(MemorySegment seg, long index) {
        return (long)constants$79.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void __align$set(MemorySegment seg, long index, long x) {
        constants$79.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


