// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkFixedChild {
 *     struct _GtkWidget* widget;
 *     int x;
 *     int y;
 * };
 * }
 */
public class _GtkFixedChild {

    public static MemoryLayout $LAYOUT() {
        return constants$2673.const$5;
    }
    public static VarHandle widget$VH() {
        return constants$2674.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkWidget* widget;
     * }
     */
    public static MemorySegment widget$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2674.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkWidget* widget;
     * }
     */
    public static void widget$set(MemorySegment seg, MemorySegment x) {
        constants$2674.const$0.set(seg, x);
    }
    public static MemorySegment widget$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2674.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void widget$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2674.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle x$VH() {
        return constants$2674.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)constants$2674.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        constants$2674.const$1.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)constants$2674.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        constants$2674.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$2674.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)constants$2674.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        constants$2674.const$2.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)constants$2674.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        constants$2674.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


