// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GdkColor {
 *     guint32 pixel;
 *     guint16 red;
 *     guint16 green;
 *     guint16 blue;
 * };
 * }
 */
public class _GdkColor {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("pixel"),
        Constants$root.C_SHORT$LAYOUT.withName("red"),
        Constants$root.C_SHORT$LAYOUT.withName("green"),
        Constants$root.C_SHORT$LAYOUT.withName("blue"),
        MemoryLayout.paddingLayout(16)
    ).withName("_GdkColor");
    public static MemoryLayout $LAYOUT() {
        return _GdkColor.$struct$LAYOUT;
    }
    static final VarHandle pixel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pixel"));
    public static VarHandle pixel$VH() {
        return _GdkColor.pixel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint32 pixel;
     * }
     */
    public static int pixel$get(MemorySegment seg) {
        return (int)_GdkColor.pixel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint32 pixel;
     * }
     */
    public static void pixel$set(MemorySegment seg, int x) {
        _GdkColor.pixel$VH.set(seg, x);
    }
    public static int pixel$get(MemorySegment seg, long index) {
        return (int)_GdkColor.pixel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pixel$set(MemorySegment seg, long index, int x) {
        _GdkColor.pixel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle red$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("red"));
    public static VarHandle red$VH() {
        return _GdkColor.red$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint16 red;
     * }
     */
    public static short red$get(MemorySegment seg) {
        return (short)_GdkColor.red$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint16 red;
     * }
     */
    public static void red$set(MemorySegment seg, short x) {
        _GdkColor.red$VH.set(seg, x);
    }
    public static short red$get(MemorySegment seg, long index) {
        return (short)_GdkColor.red$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void red$set(MemorySegment seg, long index, short x) {
        _GdkColor.red$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle green$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("green"));
    public static VarHandle green$VH() {
        return _GdkColor.green$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint16 green;
     * }
     */
    public static short green$get(MemorySegment seg) {
        return (short)_GdkColor.green$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint16 green;
     * }
     */
    public static void green$set(MemorySegment seg, short x) {
        _GdkColor.green$VH.set(seg, x);
    }
    public static short green$get(MemorySegment seg, long index) {
        return (short)_GdkColor.green$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void green$set(MemorySegment seg, long index, short x) {
        _GdkColor.green$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle blue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("blue"));
    public static VarHandle blue$VH() {
        return _GdkColor.blue$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint16 blue;
     * }
     */
    public static short blue$get(MemorySegment seg) {
        return (short)_GdkColor.blue$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint16 blue;
     * }
     */
    public static void blue$set(MemorySegment seg, short x) {
        _GdkColor.blue$VH.set(seg, x);
    }
    public static short blue$get(MemorySegment seg, long index) {
        return (short)_GdkColor.blue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void blue$set(MemorySegment seg, long index, short x) {
        _GdkColor.blue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

