// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GTimeVal {
 *     long tv_sec;
 *     long tv_usec;
 * };
 * }
 */
public class _GTimeVal {

    public static MemoryLayout $LAYOUT() {
        return constants$16.const$4;
    }
    public static VarHandle tv_sec$VH() {
        return constants$16.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long tv_sec;
     * }
     */
    public static long tv_sec$get(MemorySegment seg) {
        return (long)constants$16.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long tv_sec;
     * }
     */
    public static void tv_sec$set(MemorySegment seg, long x) {
        constants$16.const$5.set(seg, x);
    }
    public static long tv_sec$get(MemorySegment seg, long index) {
        return (long)constants$16.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void tv_sec$set(MemorySegment seg, long index, long x) {
        constants$16.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle tv_usec$VH() {
        return constants$17.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long tv_usec;
     * }
     */
    public static long tv_usec$get(MemorySegment seg) {
        return (long)constants$17.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long tv_usec;
     * }
     */
    public static void tv_usec$set(MemorySegment seg, long x) {
        constants$17.const$0.set(seg, x);
    }
    public static long tv_usec$get(MemorySegment seg, long index) {
        return (long)constants$17.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void tv_usec$set(MemorySegment seg, long index, long x) {
        constants$17.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

