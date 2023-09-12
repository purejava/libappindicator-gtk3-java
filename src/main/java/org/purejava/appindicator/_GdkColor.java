// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GdkColor {
 *     unsigned int pixel;
 *     unsigned short red;
 *     unsigned short green;
 *     unsigned short blue;
 * };
 * }
 */
public class _GdkColor {

    public static MemoryLayout $LAYOUT() {
        return constants$1874.const$4;
    }
    public static VarHandle pixel$VH() {
        return constants$1874.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int pixel;
     * }
     */
    public static int pixel$get(MemorySegment seg) {
        return (int)constants$1874.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int pixel;
     * }
     */
    public static void pixel$set(MemorySegment seg, int x) {
        constants$1874.const$5.set(seg, x);
    }
    public static int pixel$get(MemorySegment seg, long index) {
        return (int)constants$1874.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pixel$set(MemorySegment seg, long index, int x) {
        constants$1874.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle red$VH() {
        return constants$1875.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short red;
     * }
     */
    public static short red$get(MemorySegment seg) {
        return (short)constants$1875.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short red;
     * }
     */
    public static void red$set(MemorySegment seg, short x) {
        constants$1875.const$0.set(seg, x);
    }
    public static short red$get(MemorySegment seg, long index) {
        return (short)constants$1875.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void red$set(MemorySegment seg, long index, short x) {
        constants$1875.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle green$VH() {
        return constants$1875.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short green;
     * }
     */
    public static short green$get(MemorySegment seg) {
        return (short)constants$1875.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short green;
     * }
     */
    public static void green$set(MemorySegment seg, short x) {
        constants$1875.const$1.set(seg, x);
    }
    public static short green$get(MemorySegment seg, long index) {
        return (short)constants$1875.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void green$set(MemorySegment seg, long index, short x) {
        constants$1875.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle blue$VH() {
        return constants$1875.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short blue;
     * }
     */
    public static short blue$get(MemorySegment seg) {
        return (short)constants$1875.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short blue;
     * }
     */
    public static void blue$set(MemorySegment seg, short x) {
        constants$1875.const$2.set(seg, x);
    }
    public static short blue$get(MemorySegment seg, long index) {
        return (short)constants$1875.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void blue$set(MemorySegment seg, long index, short x) {
        constants$1875.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


