// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct sched_param {
 *     int sched_priority;
 * };
 * }
 */
public class sched_param {

    public static MemoryLayout $LAYOUT() {
        return constants$512.const$5;
    }
    public static VarHandle sched_priority$VH() {
        return constants$513.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int sched_priority;
     * }
     */
    public static int sched_priority$get(MemorySegment seg) {
        return (int)constants$513.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int sched_priority;
     * }
     */
    public static void sched_priority$set(MemorySegment seg, int x) {
        constants$513.const$0.set(seg, x);
    }
    public static int sched_priority$get(MemorySegment seg, long index) {
        return (int)constants$513.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sched_priority$set(MemorySegment seg, long index, int x) {
        constants$513.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


