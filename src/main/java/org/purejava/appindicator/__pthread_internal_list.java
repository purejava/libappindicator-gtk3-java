// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct __pthread_internal_list {
 *     struct __pthread_internal_list* __prev;
 *     struct __pthread_internal_list* __next;
 * };
 * }
 */
public class __pthread_internal_list {

    public static MemoryLayout $LAYOUT() {
        return constants$72.const$1;
    }
    public static VarHandle __prev$VH() {
        return constants$72.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct __pthread_internal_list* __prev;
     * }
     */
    public static MemorySegment __prev$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$72.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct __pthread_internal_list* __prev;
     * }
     */
    public static void __prev$set(MemorySegment seg, MemorySegment x) {
        constants$72.const$2.set(seg, x);
    }
    public static MemorySegment __prev$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$72.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void __prev$set(MemorySegment seg, long index, MemorySegment x) {
        constants$72.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle __next$VH() {
        return constants$72.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct __pthread_internal_list* __next;
     * }
     */
    public static MemorySegment __next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$72.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct __pthread_internal_list* __next;
     * }
     */
    public static void __next$set(MemorySegment seg, MemorySegment x) {
        constants$72.const$3.set(seg, x);
    }
    public static MemorySegment __next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$72.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void __next$set(MemorySegment seg, long index, MemorySegment x) {
        constants$72.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


