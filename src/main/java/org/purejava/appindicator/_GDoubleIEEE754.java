// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union _GDoubleIEEE754 {
 *     double v_double;
 *     struct  mpn;
 * };
 * }
 */
public class _GDoubleIEEE754 {

    public static MemoryLayout $LAYOUT() {
        return constants$16.const$1;
    }
    public static VarHandle v_double$VH() {
        return constants$16.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double v_double;
     * }
     */
    public static double v_double$get(MemorySegment seg) {
        return (double)constants$16.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double v_double;
     * }
     */
    public static void v_double$set(MemorySegment seg, double x) {
        constants$16.const$2.set(seg, x);
    }
    public static double v_double$get(MemorySegment seg, long index) {
        return (double)constants$16.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void v_double$set(MemorySegment seg, long index, double x) {
        constants$16.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * struct {
     *          *     unsigned int mantissa_low;
     *     unsigned int mantissa_high;
     *     unsigned int biased_exponent;
     *     unsigned int sign;
     * };
     * }
     */
    public static final class mpn {

        // Suppresses default constructor, ensuring non-instantiability.
        private mpn() {}
        public static MemoryLayout $LAYOUT() {
            return constants$16.const$3;
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment mpn$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


