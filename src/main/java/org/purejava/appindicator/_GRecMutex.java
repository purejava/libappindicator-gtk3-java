// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GRecMutex {
 *     void* p;
 *     unsigned int i[2];
 * };
 * }
 */
public class _GRecMutex {

    public static MemoryLayout $LAYOUT() {
        return constants$100.const$1;
    }
    public static VarHandle p$VH() {
        return constants$100.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* p;
     * }
     */
    public static MemorySegment p$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$100.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* p;
     * }
     */
    public static void p$set(MemorySegment seg, MemorySegment x) {
        constants$100.const$2.set(seg, x);
    }
    public static MemorySegment p$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$100.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void p$set(MemorySegment seg, long index, MemorySegment x) {
        constants$100.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment i$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


