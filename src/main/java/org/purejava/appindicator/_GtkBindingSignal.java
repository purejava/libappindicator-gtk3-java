// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkBindingSignal {
 *     struct _GtkBindingSignal* next;
 *     char* signal_name;
 *     unsigned int n_args;
 *     struct _GtkBindingArg* args;
 * };
 * }
 */
public class _GtkBindingSignal {

    public static MemoryLayout $LAYOUT() {
        return constants$2531.const$5;
    }
    public static VarHandle next$VH() {
        return constants$2532.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkBindingSignal* next;
     * }
     */
    public static MemorySegment next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2532.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkBindingSignal* next;
     * }
     */
    public static void next$set(MemorySegment seg, MemorySegment x) {
        constants$2532.const$0.set(seg, x);
    }
    public static MemorySegment next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2532.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2532.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle signal_name$VH() {
        return constants$2532.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* signal_name;
     * }
     */
    public static MemorySegment signal_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2532.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* signal_name;
     * }
     */
    public static void signal_name$set(MemorySegment seg, MemorySegment x) {
        constants$2532.const$1.set(seg, x);
    }
    public static MemorySegment signal_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2532.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void signal_name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2532.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle n_args$VH() {
        return constants$2532.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int n_args;
     * }
     */
    public static int n_args$get(MemorySegment seg) {
        return (int)constants$2532.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int n_args;
     * }
     */
    public static void n_args$set(MemorySegment seg, int x) {
        constants$2532.const$2.set(seg, x);
    }
    public static int n_args$get(MemorySegment seg, long index) {
        return (int)constants$2532.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void n_args$set(MemorySegment seg, long index, int x) {
        constants$2532.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle args$VH() {
        return constants$2532.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkBindingArg* args;
     * }
     */
    public static MemorySegment args$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2532.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkBindingArg* args;
     * }
     */
    public static void args$set(MemorySegment seg, MemorySegment x) {
        constants$2532.const$3.set(seg, x);
    }
    public static MemorySegment args$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2532.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void args$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2532.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


