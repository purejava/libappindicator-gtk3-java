// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct hb_glyph_position_t {
 *     int x_advance;
 *     int y_advance;
 *     int x_offset;
 *     int y_offset;
 *     union _hb_var_int_t var;
 * };
 * }
 */
public class hb_glyph_position_t {

    public static MemoryLayout $LAYOUT() {
        return constants$1509.const$3;
    }
    public static VarHandle x_advance$VH() {
        return constants$1509.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int x_advance;
     * }
     */
    public static int x_advance$get(MemorySegment seg) {
        return (int)constants$1509.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int x_advance;
     * }
     */
    public static void x_advance$set(MemorySegment seg, int x) {
        constants$1509.const$4.set(seg, x);
    }
    public static int x_advance$get(MemorySegment seg, long index) {
        return (int)constants$1509.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void x_advance$set(MemorySegment seg, long index, int x) {
        constants$1509.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y_advance$VH() {
        return constants$1509.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y_advance;
     * }
     */
    public static int y_advance$get(MemorySegment seg) {
        return (int)constants$1509.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y_advance;
     * }
     */
    public static void y_advance$set(MemorySegment seg, int x) {
        constants$1509.const$5.set(seg, x);
    }
    public static int y_advance$get(MemorySegment seg, long index) {
        return (int)constants$1509.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void y_advance$set(MemorySegment seg, long index, int x) {
        constants$1509.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle x_offset$VH() {
        return constants$1510.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int x_offset;
     * }
     */
    public static int x_offset$get(MemorySegment seg) {
        return (int)constants$1510.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int x_offset;
     * }
     */
    public static void x_offset$set(MemorySegment seg, int x) {
        constants$1510.const$0.set(seg, x);
    }
    public static int x_offset$get(MemorySegment seg, long index) {
        return (int)constants$1510.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void x_offset$set(MemorySegment seg, long index, int x) {
        constants$1510.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y_offset$VH() {
        return constants$1510.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y_offset;
     * }
     */
    public static int y_offset$get(MemorySegment seg) {
        return (int)constants$1510.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y_offset;
     * }
     */
    public static void y_offset$set(MemorySegment seg, int x) {
        constants$1510.const$1.set(seg, x);
    }
    public static int y_offset$get(MemorySegment seg, long index) {
        return (int)constants$1510.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void y_offset$set(MemorySegment seg, long index, int x) {
        constants$1510.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment var_$slice(MemorySegment seg) {
        return seg.asSlice(16, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


