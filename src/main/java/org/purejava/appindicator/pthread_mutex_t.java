// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union pthread_mutex_t {
 *     struct __pthread_mutex_s __data;
 *     char __size[48];
 *     long __align;
 * };
 * }
 */
public class pthread_mutex_t {

    public static MemoryLayout $LAYOUT() {
        return constants$78.const$0;
    }
    public static MemorySegment __data$slice(MemorySegment seg) {
        return seg.asSlice(0, 40);
    }
    public static MemorySegment __size$slice(MemorySegment seg) {
        return seg.asSlice(0, 48);
    }
    public static VarHandle __align$VH() {
        return constants$78.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long __align;
     * }
     */
    public static long __align$get(MemorySegment seg) {
        return (long)constants$78.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long __align;
     * }
     */
    public static void __align$set(MemorySegment seg, long x) {
        constants$78.const$1.set(seg, x);
    }
    public static long __align$get(MemorySegment seg, long index) {
        return (long)constants$78.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void __align$set(MemorySegment seg, long index, long x) {
        constants$78.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


