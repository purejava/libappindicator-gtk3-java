// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GUriParamsIter {
 *     int dummy0;
 *     void* dummy1;
 *     void* dummy2;
 *     unsigned char dummy3[256];
 * };
 * }
 */
public class _GUriParamsIter {

    public static MemoryLayout $LAYOUT() {
        return constants$487.const$3;
    }
    public static VarHandle dummy0$VH() {
        return constants$487.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dummy0;
     * }
     */
    public static int dummy0$get(MemorySegment seg) {
        return (int)constants$487.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dummy0;
     * }
     */
    public static void dummy0$set(MemorySegment seg, int x) {
        constants$487.const$4.set(seg, x);
    }
    public static int dummy0$get(MemorySegment seg, long index) {
        return (int)constants$487.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy0$set(MemorySegment seg, long index, int x) {
        constants$487.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dummy1$VH() {
        return constants$487.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* dummy1;
     * }
     */
    public static MemorySegment dummy1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$487.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* dummy1;
     * }
     */
    public static void dummy1$set(MemorySegment seg, MemorySegment x) {
        constants$487.const$5.set(seg, x);
    }
    public static MemorySegment dummy1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$487.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$487.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dummy2$VH() {
        return constants$488.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* dummy2;
     * }
     */
    public static MemorySegment dummy2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$488.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* dummy2;
     * }
     */
    public static void dummy2$set(MemorySegment seg, MemorySegment x) {
        constants$488.const$0.set(seg, x);
    }
    public static MemorySegment dummy2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$488.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$488.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment dummy3$slice(MemorySegment seg) {
        return seg.asSlice(24, 256);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


