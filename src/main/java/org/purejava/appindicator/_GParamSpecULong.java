// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GParamSpecULong {
 *     struct _GParamSpec parent_instance;
 *     unsigned long minimum;
 *     unsigned long maximum;
 *     unsigned long default_value;
 * };
 * }
 */
public class _GParamSpecULong {

    public static MemoryLayout $LAYOUT() {
        return constants$658.const$0;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    public static VarHandle minimum$VH() {
        return constants$658.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long minimum;
     * }
     */
    public static long minimum$get(MemorySegment seg) {
        return (long)constants$658.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long minimum;
     * }
     */
    public static void minimum$set(MemorySegment seg, long x) {
        constants$658.const$1.set(seg, x);
    }
    public static long minimum$get(MemorySegment seg, long index) {
        return (long)constants$658.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void minimum$set(MemorySegment seg, long index, long x) {
        constants$658.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maximum$VH() {
        return constants$658.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long maximum;
     * }
     */
    public static long maximum$get(MemorySegment seg) {
        return (long)constants$658.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long maximum;
     * }
     */
    public static void maximum$set(MemorySegment seg, long x) {
        constants$658.const$2.set(seg, x);
    }
    public static long maximum$get(MemorySegment seg, long index) {
        return (long)constants$658.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void maximum$set(MemorySegment seg, long index, long x) {
        constants$658.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle default_value$VH() {
        return constants$658.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long default_value;
     * }
     */
    public static long default_value$get(MemorySegment seg) {
        return (long)constants$658.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long default_value;
     * }
     */
    public static void default_value$set(MemorySegment seg, long x) {
        constants$658.const$3.set(seg, x);
    }
    public static long default_value$get(MemorySegment seg, long index) {
        return (long)constants$658.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void default_value$set(MemorySegment seg, long index, long x) {
        constants$658.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


