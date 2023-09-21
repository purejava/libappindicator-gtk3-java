// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct GTestLogMsg {
 *     enum GTestLogType log_type;
 *     unsigned int n_strings;
 *     char** strings;
 *     unsigned int n_nums;
 *     long double* nums;
 * };
 * }
 */
public class GTestLogMsg {

    public static MemoryLayout $LAYOUT() {
        return constants$461.const$2;
    }
    public static VarHandle log_type$VH() {
        return constants$461.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GTestLogType log_type;
     * }
     */
    public static int log_type$get(MemorySegment seg) {
        return (int)constants$461.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GTestLogType log_type;
     * }
     */
    public static void log_type$set(MemorySegment seg, int x) {
        constants$461.const$3.set(seg, x);
    }
    public static int log_type$get(MemorySegment seg, long index) {
        return (int)constants$461.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void log_type$set(MemorySegment seg, long index, int x) {
        constants$461.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle n_strings$VH() {
        return constants$461.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int n_strings;
     * }
     */
    public static int n_strings$get(MemorySegment seg) {
        return (int)constants$461.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int n_strings;
     * }
     */
    public static void n_strings$set(MemorySegment seg, int x) {
        constants$461.const$4.set(seg, x);
    }
    public static int n_strings$get(MemorySegment seg, long index) {
        return (int)constants$461.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void n_strings$set(MemorySegment seg, long index, int x) {
        constants$461.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle strings$VH() {
        return constants$461.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char** strings;
     * }
     */
    public static MemorySegment strings$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$461.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char** strings;
     * }
     */
    public static void strings$set(MemorySegment seg, MemorySegment x) {
        constants$461.const$5.set(seg, x);
    }
    public static MemorySegment strings$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$461.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void strings$set(MemorySegment seg, long index, MemorySegment x) {
        constants$461.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle n_nums$VH() {
        return constants$462.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int n_nums;
     * }
     */
    public static int n_nums$get(MemorySegment seg) {
        return (int)constants$462.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int n_nums;
     * }
     */
    public static void n_nums$set(MemorySegment seg, int x) {
        constants$462.const$0.set(seg, x);
    }
    public static int n_nums$get(MemorySegment seg, long index) {
        return (int)constants$462.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void n_nums$set(MemorySegment seg, long index, int x) {
        constants$462.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nums$VH() {
        return constants$462.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long double* nums;
     * }
     */
    public static MemorySegment nums$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$462.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long double* nums;
     * }
     */
    public static void nums$set(MemorySegment seg, MemorySegment x) {
        constants$462.const$1.set(seg, x);
    }
    public static MemorySegment nums$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$462.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void nums$set(MemorySegment seg, long index, MemorySegment x) {
        constants$462.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

