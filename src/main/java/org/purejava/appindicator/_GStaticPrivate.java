// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GStaticPrivate {
 *     unsigned int index;
 * };
 * }
 */
public class _GStaticPrivate {

    public static MemoryLayout $LAYOUT() {
        return constants$544.const$0;
    }
    public static VarHandle index$VH() {
        return constants$544.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int index;
     * }
     */
    public static int index$get(MemorySegment seg) {
        return (int)constants$544.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int index;
     * }
     */
    public static void index$set(MemorySegment seg, int x) {
        constants$544.const$1.set(seg, x);
    }
    public static int index$get(MemorySegment seg, long index) {
        return (int)constants$544.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void index$set(MemorySegment seg, long index, int x) {
        constants$544.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


