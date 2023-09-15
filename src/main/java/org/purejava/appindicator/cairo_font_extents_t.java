// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct cairo_font_extents_t {
 *     double ascent;
 *     double descent;
 *     double height;
 *     double max_x_advance;
 *     double max_y_advance;
 * };
 * }
 */
public class cairo_font_extents_t {

    public static MemoryLayout $LAYOUT() {
        return constants$1697.const$3;
    }
    public static VarHandle ascent$VH() {
        return constants$1697.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double ascent;
     * }
     */
    public static double ascent$get(MemorySegment seg) {
        return (double)constants$1697.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double ascent;
     * }
     */
    public static void ascent$set(MemorySegment seg, double x) {
        constants$1697.const$4.set(seg, x);
    }
    public static double ascent$get(MemorySegment seg, long index) {
        return (double)constants$1697.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ascent$set(MemorySegment seg, long index, double x) {
        constants$1697.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle descent$VH() {
        return constants$1697.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double descent;
     * }
     */
    public static double descent$get(MemorySegment seg) {
        return (double)constants$1697.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double descent;
     * }
     */
    public static void descent$set(MemorySegment seg, double x) {
        constants$1697.const$5.set(seg, x);
    }
    public static double descent$get(MemorySegment seg, long index) {
        return (double)constants$1697.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void descent$set(MemorySegment seg, long index, double x) {
        constants$1697.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle height$VH() {
        return constants$1698.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double height;
     * }
     */
    public static double height$get(MemorySegment seg) {
        return (double)constants$1698.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double height;
     * }
     */
    public static void height$set(MemorySegment seg, double x) {
        constants$1698.const$0.set(seg, x);
    }
    public static double height$get(MemorySegment seg, long index) {
        return (double)constants$1698.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, double x) {
        constants$1698.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle max_x_advance$VH() {
        return constants$1698.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double max_x_advance;
     * }
     */
    public static double max_x_advance$get(MemorySegment seg) {
        return (double)constants$1698.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double max_x_advance;
     * }
     */
    public static void max_x_advance$set(MemorySegment seg, double x) {
        constants$1698.const$1.set(seg, x);
    }
    public static double max_x_advance$get(MemorySegment seg, long index) {
        return (double)constants$1698.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void max_x_advance$set(MemorySegment seg, long index, double x) {
        constants$1698.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle max_y_advance$VH() {
        return constants$1698.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double max_y_advance;
     * }
     */
    public static double max_y_advance$get(MemorySegment seg) {
        return (double)constants$1698.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double max_y_advance;
     * }
     */
    public static void max_y_advance$set(MemorySegment seg, double x) {
        constants$1698.const$2.set(seg, x);
    }
    public static double max_y_advance$get(MemorySegment seg, long index) {
        return (double)constants$1698.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void max_y_advance$set(MemorySegment seg, long index, double x) {
        constants$1698.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


