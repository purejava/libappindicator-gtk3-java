// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct timespec {
 *     long tv_sec;
 *     long tv_nsec;
 * };
 * }
 */
public class timespec {

    public static MemoryLayout $LAYOUT() {
        return constants$2.const$3;
    }
    public static VarHandle tv_sec$VH() {
        return constants$2.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long tv_sec;
     * }
     */
    public static long tv_sec$get(MemorySegment seg) {
        return (long)constants$2.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long tv_sec;
     * }
     */
    public static void tv_sec$set(MemorySegment seg, long x) {
        constants$2.const$4.set(seg, x);
    }
    public static long tv_sec$get(MemorySegment seg, long index) {
        return (long)constants$2.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void tv_sec$set(MemorySegment seg, long index, long x) {
        constants$2.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle tv_nsec$VH() {
        return constants$2.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long tv_nsec;
     * }
     */
    public static long tv_nsec$get(MemorySegment seg) {
        return (long)constants$2.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long tv_nsec;
     * }
     */
    public static void tv_nsec$set(MemorySegment seg, long x) {
        constants$2.const$5.set(seg, x);
    }
    public static long tv_nsec$get(MemorySegment seg, long index) {
        return (long)constants$2.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void tv_nsec$set(MemorySegment seg, long index, long x) {
        constants$2.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


