// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GFlagsClass {
 *     struct _GTypeClass g_type_class;
 *     unsigned int mask;
 *     unsigned int n_values;
 *     struct _GFlagsValue* values;
 * };
 * }
 */
public class _GFlagsClass {

    public static MemoryLayout $LAYOUT() {
        return constants$648.const$5;
    }
    public static MemorySegment g_type_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static VarHandle mask$VH() {
        return constants$649.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int mask;
     * }
     */
    public static int mask$get(MemorySegment seg) {
        return (int)constants$649.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int mask;
     * }
     */
    public static void mask$set(MemorySegment seg, int x) {
        constants$649.const$0.set(seg, x);
    }
    public static int mask$get(MemorySegment seg, long index) {
        return (int)constants$649.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void mask$set(MemorySegment seg, long index, int x) {
        constants$649.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle n_values$VH() {
        return constants$649.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int n_values;
     * }
     */
    public static int n_values$get(MemorySegment seg) {
        return (int)constants$649.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int n_values;
     * }
     */
    public static void n_values$set(MemorySegment seg, int x) {
        constants$649.const$1.set(seg, x);
    }
    public static int n_values$get(MemorySegment seg, long index) {
        return (int)constants$649.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void n_values$set(MemorySegment seg, long index, int x) {
        constants$649.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle values$VH() {
        return constants$649.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GFlagsValue* values;
     * }
     */
    public static MemorySegment values$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$649.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GFlagsValue* values;
     * }
     */
    public static void values$set(MemorySegment seg, MemorySegment x) {
        constants$649.const$2.set(seg, x);
    }
    public static MemorySegment values$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$649.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void values$set(MemorySegment seg, long index, MemorySegment x) {
        constants$649.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

