// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkPageRange {
 *     int start;
 *     int end;
 * };
 * }
 */
public class _GtkPageRange {

    public static MemoryLayout $LAYOUT() {
        return constants$2955.const$3;
    }
    public static VarHandle start$VH() {
        return constants$2955.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int start;
     * }
     */
    public static int start$get(MemorySegment seg) {
        return (int)constants$2955.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int start;
     * }
     */
    public static void start$set(MemorySegment seg, int x) {
        constants$2955.const$4.set(seg, x);
    }
    public static int start$get(MemorySegment seg, long index) {
        return (int)constants$2955.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void start$set(MemorySegment seg, long index, int x) {
        constants$2955.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle end$VH() {
        return constants$2955.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int end;
     * }
     */
    public static int end$get(MemorySegment seg) {
        return (int)constants$2955.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int end;
     * }
     */
    public static void end$set(MemorySegment seg, int x) {
        constants$2955.const$5.set(seg, x);
    }
    public static int end$get(MemorySegment seg, long index) {
        return (int)constants$2955.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void end$set(MemorySegment seg, long index, int x) {
        constants$2955.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


