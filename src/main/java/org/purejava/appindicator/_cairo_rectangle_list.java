// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _cairo_rectangle_list {
 *     enum _cairo_status status;
 *     struct _cairo_rectangle* rectangles;
 *     int num_rectangles;
 * };
 * }
 */
public class _cairo_rectangle_list {

    public static MemoryLayout $LAYOUT() {
        return constants$1693.const$1;
    }
    public static VarHandle status$VH() {
        return constants$1693.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum _cairo_status status;
     * }
     */
    public static int status$get(MemorySegment seg) {
        return (int)constants$1693.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum _cairo_status status;
     * }
     */
    public static void status$set(MemorySegment seg, int x) {
        constants$1693.const$2.set(seg, x);
    }
    public static int status$get(MemorySegment seg, long index) {
        return (int)constants$1693.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void status$set(MemorySegment seg, long index, int x) {
        constants$1693.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rectangles$VH() {
        return constants$1693.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _cairo_rectangle* rectangles;
     * }
     */
    public static MemorySegment rectangles$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1693.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _cairo_rectangle* rectangles;
     * }
     */
    public static void rectangles$set(MemorySegment seg, MemorySegment x) {
        constants$1693.const$3.set(seg, x);
    }
    public static MemorySegment rectangles$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1693.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void rectangles$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1693.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle num_rectangles$VH() {
        return constants$1693.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int num_rectangles;
     * }
     */
    public static int num_rectangles$get(MemorySegment seg) {
        return (int)constants$1693.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int num_rectangles;
     * }
     */
    public static void num_rectangles$set(MemorySegment seg, int x) {
        constants$1693.const$4.set(seg, x);
    }
    public static int num_rectangles$get(MemorySegment seg, long index) {
        return (int)constants$1693.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void num_rectangles$set(MemorySegment seg, long index, int x) {
        constants$1693.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


