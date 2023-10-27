// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * union _hb_var_num_t {
 *     float f;
 *     unsigned int u32;
 *     int i32;
 *     unsigned short u16[2];
 *     short i16[2];
 *     unsigned char u8[4];
 *     signed char i8[4];
 * };
 * }
 */
public class _hb_var_num_t {

    public static MemoryLayout $LAYOUT() {
        return constants$1418.const$2;
    }
    public static VarHandle f$VH() {
        return constants$1418.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float f;
     * }
     */
    public static float f$get(MemorySegment seg) {
        return (float)constants$1418.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float f;
     * }
     */
    public static void f$set(MemorySegment seg, float x) {
        constants$1418.const$3.set(seg, x);
    }
    public static float f$get(MemorySegment seg, long index) {
        return (float)constants$1418.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void f$set(MemorySegment seg, long index, float x) {
        constants$1418.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle u32$VH() {
        return constants$1418.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int u32;
     * }
     */
    public static int u32$get(MemorySegment seg) {
        return (int)constants$1418.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int u32;
     * }
     */
    public static void u32$set(MemorySegment seg, int x) {
        constants$1418.const$4.set(seg, x);
    }
    public static int u32$get(MemorySegment seg, long index) {
        return (int)constants$1418.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void u32$set(MemorySegment seg, long index, int x) {
        constants$1418.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle i32$VH() {
        return constants$1418.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int i32;
     * }
     */
    public static int i32$get(MemorySegment seg) {
        return (int)constants$1418.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int i32;
     * }
     */
    public static void i32$set(MemorySegment seg, int x) {
        constants$1418.const$5.set(seg, x);
    }
    public static int i32$get(MemorySegment seg, long index) {
        return (int)constants$1418.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void i32$set(MemorySegment seg, long index, int x) {
        constants$1418.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment u16$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static MemorySegment i16$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static MemorySegment u8$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static MemorySegment i8$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


