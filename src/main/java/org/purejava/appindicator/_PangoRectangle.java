// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _PangoRectangle {
 *     int x;
 *     int y;
 *     int width;
 *     int height;
 * };
 * }
 */
public class _PangoRectangle {

    public static MemoryLayout $LAYOUT() {
        return constants$1528.const$2;
    }
    public static VarHandle x$VH() {
        return constants$1528.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)constants$1528.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        constants$1528.const$3.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)constants$1528.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        constants$1528.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$1528.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)constants$1528.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        constants$1528.const$4.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)constants$1528.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        constants$1528.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle width$VH() {
        return constants$1528.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static int width$get(MemorySegment seg) {
        return (int)constants$1528.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static void width$set(MemorySegment seg, int x) {
        constants$1528.const$5.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)constants$1528.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        constants$1528.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle height$VH() {
        return constants$1529.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static int height$get(MemorySegment seg) {
        return (int)constants$1529.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static void height$set(MemorySegment seg, int x) {
        constants$1529.const$0.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)constants$1529.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        constants$1529.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


