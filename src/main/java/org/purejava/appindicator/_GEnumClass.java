// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GEnumClass {
 *     struct _GTypeClass g_type_class;
 *     int minimum;
 *     int maximum;
 *     unsigned int n_values;
 *     struct _GEnumValue* values;
 * };
 * }
 */
public class _GEnumClass {

    public static MemoryLayout $LAYOUT() {
        return constants$648.const$0;
    }
    public static MemorySegment g_type_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static VarHandle minimum$VH() {
        return constants$648.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int minimum;
     * }
     */
    public static int minimum$get(MemorySegment seg) {
        return (int)constants$648.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int minimum;
     * }
     */
    public static void minimum$set(MemorySegment seg, int x) {
        constants$648.const$1.set(seg, x);
    }
    public static int minimum$get(MemorySegment seg, long index) {
        return (int)constants$648.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void minimum$set(MemorySegment seg, long index, int x) {
        constants$648.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maximum$VH() {
        return constants$648.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int maximum;
     * }
     */
    public static int maximum$get(MemorySegment seg) {
        return (int)constants$648.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int maximum;
     * }
     */
    public static void maximum$set(MemorySegment seg, int x) {
        constants$648.const$2.set(seg, x);
    }
    public static int maximum$get(MemorySegment seg, long index) {
        return (int)constants$648.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void maximum$set(MemorySegment seg, long index, int x) {
        constants$648.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle n_values$VH() {
        return constants$648.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int n_values;
     * }
     */
    public static int n_values$get(MemorySegment seg) {
        return (int)constants$648.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int n_values;
     * }
     */
    public static void n_values$set(MemorySegment seg, int x) {
        constants$648.const$3.set(seg, x);
    }
    public static int n_values$get(MemorySegment seg, long index) {
        return (int)constants$648.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void n_values$set(MemorySegment seg, long index, int x) {
        constants$648.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle values$VH() {
        return constants$648.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GEnumValue* values;
     * }
     */
    public static MemorySegment values$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$648.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GEnumValue* values;
     * }
     */
    public static void values$set(MemorySegment seg, MemorySegment x) {
        constants$648.const$4.set(seg, x);
    }
    public static MemorySegment values$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$648.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void values$set(MemorySegment seg, long index, MemorySegment x) {
        constants$648.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


