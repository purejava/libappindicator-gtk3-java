// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GStaticResource {
 *     unsigned char* data;
 *     unsigned long data_len;
 *     struct _GResource* resource;
 *     struct _GStaticResource* next;
 *     void* padding;
 * };
 * }
 */
public class _GStaticResource {

    public static MemoryLayout $LAYOUT() {
        return constants$1244.const$4;
    }
    public static VarHandle data$VH() {
        return constants$1244.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* data;
     * }
     */
    public static MemorySegment data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1244.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* data;
     * }
     */
    public static void data$set(MemorySegment seg, MemorySegment x) {
        constants$1244.const$5.set(seg, x);
    }
    public static MemorySegment data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1244.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1244.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle data_len$VH() {
        return constants$1245.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long data_len;
     * }
     */
    public static long data_len$get(MemorySegment seg) {
        return (long)constants$1245.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long data_len;
     * }
     */
    public static void data_len$set(MemorySegment seg, long x) {
        constants$1245.const$0.set(seg, x);
    }
    public static long data_len$get(MemorySegment seg, long index) {
        return (long)constants$1245.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void data_len$set(MemorySegment seg, long index, long x) {
        constants$1245.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle resource$VH() {
        return constants$1245.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GResource* resource;
     * }
     */
    public static MemorySegment resource$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1245.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GResource* resource;
     * }
     */
    public static void resource$set(MemorySegment seg, MemorySegment x) {
        constants$1245.const$1.set(seg, x);
    }
    public static MemorySegment resource$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1245.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void resource$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1245.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle next$VH() {
        return constants$1245.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GStaticResource* next;
     * }
     */
    public static MemorySegment next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1245.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GStaticResource* next;
     * }
     */
    public static void next$set(MemorySegment seg, MemorySegment x) {
        constants$1245.const$2.set(seg, x);
    }
    public static MemorySegment next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1245.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1245.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle padding$VH() {
        return constants$1245.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* padding;
     * }
     */
    public static MemorySegment padding$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1245.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* padding;
     * }
     */
    public static void padding$set(MemorySegment seg, MemorySegment x) {
        constants$1245.const$3.set(seg, x);
    }
    public static MemorySegment padding$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1245.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void padding$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1245.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


