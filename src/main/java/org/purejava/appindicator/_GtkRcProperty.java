// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkRcProperty {
 *     unsigned int type_name;
 *     unsigned int property_name;
 *     char* origin;
 *     struct _GValue value;
 * };
 * }
 */
public class _GtkRcProperty {

    public static MemoryLayout $LAYOUT() {
        return constants$3335.const$0;
    }
    public static VarHandle type_name$VH() {
        return constants$3335.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int type_name;
     * }
     */
    public static int type_name$get(MemorySegment seg) {
        return (int)constants$3335.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int type_name;
     * }
     */
    public static void type_name$set(MemorySegment seg, int x) {
        constants$3335.const$1.set(seg, x);
    }
    public static int type_name$get(MemorySegment seg, long index) {
        return (int)constants$3335.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void type_name$set(MemorySegment seg, long index, int x) {
        constants$3335.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle property_name$VH() {
        return constants$3335.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int property_name;
     * }
     */
    public static int property_name$get(MemorySegment seg) {
        return (int)constants$3335.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int property_name;
     * }
     */
    public static void property_name$set(MemorySegment seg, int x) {
        constants$3335.const$2.set(seg, x);
    }
    public static int property_name$get(MemorySegment seg, long index) {
        return (int)constants$3335.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void property_name$set(MemorySegment seg, long index, int x) {
        constants$3335.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle origin$VH() {
        return constants$3335.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* origin;
     * }
     */
    public static MemorySegment origin$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3335.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* origin;
     * }
     */
    public static void origin$set(MemorySegment seg, MemorySegment x) {
        constants$3335.const$3.set(seg, x);
    }
    public static MemorySegment origin$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3335.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void origin$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3335.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment value$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


