// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkRequisition {
 *     int width;
 *     int height;
 * };
 * }
 */
public class _GtkRequisition {

    public static MemoryLayout $LAYOUT() {
        return constants$2100.const$1;
    }
    public static VarHandle width$VH() {
        return constants$2100.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static int width$get(MemorySegment seg) {
        return (int)constants$2100.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static void width$set(MemorySegment seg, int x) {
        constants$2100.const$2.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)constants$2100.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        constants$2100.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle height$VH() {
        return constants$2100.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static int height$get(MemorySegment seg) {
        return (int)constants$2100.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static void height$set(MemorySegment seg, int x) {
        constants$2100.const$3.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)constants$2100.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        constants$2100.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


