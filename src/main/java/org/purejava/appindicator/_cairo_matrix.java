// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _cairo_matrix {
 *     double xx;
 *     double yx;
 *     double xy;
 *     double yy;
 *     double x0;
 *     double y0;
 * };
 * }
 */
public class _cairo_matrix {

    public static MemoryLayout $LAYOUT() {
        return constants$1677.const$1;
    }
    public static VarHandle xx$VH() {
        return constants$1677.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double xx;
     * }
     */
    public static double xx$get(MemorySegment seg) {
        return (double)constants$1677.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double xx;
     * }
     */
    public static void xx$set(MemorySegment seg, double x) {
        constants$1677.const$2.set(seg, x);
    }
    public static double xx$get(MemorySegment seg, long index) {
        return (double)constants$1677.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void xx$set(MemorySegment seg, long index, double x) {
        constants$1677.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle yx$VH() {
        return constants$1677.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double yx;
     * }
     */
    public static double yx$get(MemorySegment seg) {
        return (double)constants$1677.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double yx;
     * }
     */
    public static void yx$set(MemorySegment seg, double x) {
        constants$1677.const$3.set(seg, x);
    }
    public static double yx$get(MemorySegment seg, long index) {
        return (double)constants$1677.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void yx$set(MemorySegment seg, long index, double x) {
        constants$1677.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle xy$VH() {
        return constants$1677.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double xy;
     * }
     */
    public static double xy$get(MemorySegment seg) {
        return (double)constants$1677.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double xy;
     * }
     */
    public static void xy$set(MemorySegment seg, double x) {
        constants$1677.const$4.set(seg, x);
    }
    public static double xy$get(MemorySegment seg, long index) {
        return (double)constants$1677.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void xy$set(MemorySegment seg, long index, double x) {
        constants$1677.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle yy$VH() {
        return constants$1677.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double yy;
     * }
     */
    public static double yy$get(MemorySegment seg) {
        return (double)constants$1677.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double yy;
     * }
     */
    public static void yy$set(MemorySegment seg, double x) {
        constants$1677.const$5.set(seg, x);
    }
    public static double yy$get(MemorySegment seg, long index) {
        return (double)constants$1677.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void yy$set(MemorySegment seg, long index, double x) {
        constants$1677.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle x0$VH() {
        return constants$1678.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double x0;
     * }
     */
    public static double x0$get(MemorySegment seg) {
        return (double)constants$1678.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double x0;
     * }
     */
    public static void x0$set(MemorySegment seg, double x) {
        constants$1678.const$0.set(seg, x);
    }
    public static double x0$get(MemorySegment seg, long index) {
        return (double)constants$1678.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void x0$set(MemorySegment seg, long index, double x) {
        constants$1678.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y0$VH() {
        return constants$1678.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double y0;
     * }
     */
    public static double y0$get(MemorySegment seg) {
        return (double)constants$1678.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double y0;
     * }
     */
    public static void y0$set(MemorySegment seg, double x) {
        constants$1678.const$1.set(seg, x);
    }
    public static double y0$get(MemorySegment seg, long index) {
        return (double)constants$1678.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void y0$set(MemorySegment seg, long index, double x) {
        constants$1678.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


