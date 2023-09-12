// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GPtrArray {
 *     void** pdata;
 *     unsigned int len;
 * };
 * }
 */
public class _GPtrArray {

    public static MemoryLayout $LAYOUT() {
        return constants$29.const$5;
    }
    public static VarHandle pdata$VH() {
        return constants$30.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void** pdata;
     * }
     */
    public static MemorySegment pdata$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$30.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void** pdata;
     * }
     */
    public static void pdata$set(MemorySegment seg, MemorySegment x) {
        constants$30.const$0.set(seg, x);
    }
    public static MemorySegment pdata$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$30.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pdata$set(MemorySegment seg, long index, MemorySegment x) {
        constants$30.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle len$VH() {
        return constants$30.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int len;
     * }
     */
    public static int len$get(MemorySegment seg) {
        return (int)constants$30.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int len;
     * }
     */
    public static void len$set(MemorySegment seg, int x) {
        constants$30.const$1.set(seg, x);
    }
    public static int len$get(MemorySegment seg, long index) {
        return (int)constants$30.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void len$set(MemorySegment seg, long index, int x) {
        constants$30.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


