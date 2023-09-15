// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct GStaticMutex {
 *     union _GMutex* mutex;
 *     union pthread_mutex_t unused;
 * };
 * }
 */
public class GStaticMutex {

    public static MemoryLayout $LAYOUT() {
        return constants$536.const$5;
    }
    public static VarHandle mutex$VH() {
        return constants$537.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * union _GMutex* mutex;
     * }
     */
    public static MemorySegment mutex$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$537.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * union _GMutex* mutex;
     * }
     */
    public static void mutex$set(MemorySegment seg, MemorySegment x) {
        constants$537.const$0.set(seg, x);
    }
    public static MemorySegment mutex$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$537.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void mutex$set(MemorySegment seg, long index, MemorySegment x) {
        constants$537.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment unused$slice(MemorySegment seg) {
        return seg.asSlice(8, 48);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


