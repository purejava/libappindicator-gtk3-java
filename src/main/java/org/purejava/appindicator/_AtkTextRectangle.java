// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _AtkTextRectangle {
 *     int x;
 *     int y;
 *     int width;
 *     int height;
 * };
 * }
 */
public class _AtkTextRectangle {

    public static MemoryLayout $LAYOUT() {
        return constants$2008.const$4;
    }
    public static VarHandle x$VH() {
        return constants$2008.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)constants$2008.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        constants$2008.const$5.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)constants$2008.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        constants$2008.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$2009.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)constants$2009.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        constants$2009.const$0.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)constants$2009.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        constants$2009.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle width$VH() {
        return constants$2009.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static int width$get(MemorySegment seg) {
        return (int)constants$2009.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static void width$set(MemorySegment seg, int x) {
        constants$2009.const$1.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)constants$2009.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        constants$2009.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle height$VH() {
        return constants$2009.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static int height$get(MemorySegment seg) {
        return (int)constants$2009.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static void height$set(MemorySegment seg, int x) {
        constants$2009.const$2.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)constants$2009.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        constants$2009.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


