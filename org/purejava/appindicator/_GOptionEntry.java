// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GOptionEntry {
 *     char* long_name;
 *     char short_name;
 *     int flags;
 *     enum GOptionArg arg;
 *     void* arg_data;
 *     char* description;
 *     char* arg_description;
 * };
 * }
 */
public class _GOptionEntry {

    public static MemoryLayout $LAYOUT() {
        return constants$382.const$4;
    }
    public static VarHandle long_name$VH() {
        return constants$382.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* long_name;
     * }
     */
    public static MemorySegment long_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$382.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* long_name;
     * }
     */
    public static void long_name$set(MemorySegment seg, MemorySegment x) {
        constants$382.const$5.set(seg, x);
    }
    public static MemorySegment long_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$382.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void long_name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$382.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle short_name$VH() {
        return constants$383.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char short_name;
     * }
     */
    public static byte short_name$get(MemorySegment seg) {
        return (byte)constants$383.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char short_name;
     * }
     */
    public static void short_name$set(MemorySegment seg, byte x) {
        constants$383.const$0.set(seg, x);
    }
    public static byte short_name$get(MemorySegment seg, long index) {
        return (byte)constants$383.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void short_name$set(MemorySegment seg, long index, byte x) {
        constants$383.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$383.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$383.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$383.const$1.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$383.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$383.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle arg$VH() {
        return constants$383.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GOptionArg arg;
     * }
     */
    public static int arg$get(MemorySegment seg) {
        return (int)constants$383.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GOptionArg arg;
     * }
     */
    public static void arg$set(MemorySegment seg, int x) {
        constants$383.const$2.set(seg, x);
    }
    public static int arg$get(MemorySegment seg, long index) {
        return (int)constants$383.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void arg$set(MemorySegment seg, long index, int x) {
        constants$383.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle arg_data$VH() {
        return constants$383.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* arg_data;
     * }
     */
    public static MemorySegment arg_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$383.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* arg_data;
     * }
     */
    public static void arg_data$set(MemorySegment seg, MemorySegment x) {
        constants$383.const$3.set(seg, x);
    }
    public static MemorySegment arg_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$383.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void arg_data$set(MemorySegment seg, long index, MemorySegment x) {
        constants$383.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle description$VH() {
        return constants$383.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* description;
     * }
     */
    public static MemorySegment description$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$383.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* description;
     * }
     */
    public static void description$set(MemorySegment seg, MemorySegment x) {
        constants$383.const$4.set(seg, x);
    }
    public static MemorySegment description$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$383.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void description$set(MemorySegment seg, long index, MemorySegment x) {
        constants$383.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle arg_description$VH() {
        return constants$383.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* arg_description;
     * }
     */
    public static MemorySegment arg_description$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$383.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* arg_description;
     * }
     */
    public static void arg_description$set(MemorySegment seg, MemorySegment x) {
        constants$383.const$5.set(seg, x);
    }
    public static MemorySegment arg_description$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$383.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void arg_description$set(MemorySegment seg, long index, MemorySegment x) {
        constants$383.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

