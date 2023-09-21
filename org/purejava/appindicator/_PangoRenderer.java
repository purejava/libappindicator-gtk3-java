// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PangoRenderer {
 *     struct _GObject parent_instance;
 *     enum PangoUnderline underline;
 *     int strikethrough;
 *     int active_count;
 *     struct _PangoMatrix* matrix;
 *     struct _PangoRendererPrivate* priv;
 * };
 * }
 */
public class _PangoRenderer {

    public static MemoryLayout $LAYOUT() {
        return constants$1640.const$4;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static VarHandle underline$VH() {
        return constants$1640.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum PangoUnderline underline;
     * }
     */
    public static int underline$get(MemorySegment seg) {
        return (int)constants$1640.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum PangoUnderline underline;
     * }
     */
    public static void underline$set(MemorySegment seg, int x) {
        constants$1640.const$5.set(seg, x);
    }
    public static int underline$get(MemorySegment seg, long index) {
        return (int)constants$1640.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void underline$set(MemorySegment seg, long index, int x) {
        constants$1640.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle strikethrough$VH() {
        return constants$1641.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int strikethrough;
     * }
     */
    public static int strikethrough$get(MemorySegment seg) {
        return (int)constants$1641.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int strikethrough;
     * }
     */
    public static void strikethrough$set(MemorySegment seg, int x) {
        constants$1641.const$0.set(seg, x);
    }
    public static int strikethrough$get(MemorySegment seg, long index) {
        return (int)constants$1641.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void strikethrough$set(MemorySegment seg, long index, int x) {
        constants$1641.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle active_count$VH() {
        return constants$1641.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int active_count;
     * }
     */
    public static int active_count$get(MemorySegment seg) {
        return (int)constants$1641.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int active_count;
     * }
     */
    public static void active_count$set(MemorySegment seg, int x) {
        constants$1641.const$1.set(seg, x);
    }
    public static int active_count$get(MemorySegment seg, long index) {
        return (int)constants$1641.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void active_count$set(MemorySegment seg, long index, int x) {
        constants$1641.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle matrix$VH() {
        return constants$1641.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _PangoMatrix* matrix;
     * }
     */
    public static MemorySegment matrix$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1641.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _PangoMatrix* matrix;
     * }
     */
    public static void matrix$set(MemorySegment seg, MemorySegment x) {
        constants$1641.const$2.set(seg, x);
    }
    public static MemorySegment matrix$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1641.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void matrix$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1641.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle priv$VH() {
        return constants$1641.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _PangoRendererPrivate* priv;
     * }
     */
    public static MemorySegment priv$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1641.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _PangoRendererPrivate* priv;
     * }
     */
    public static void priv$set(MemorySegment seg, MemorySegment x) {
        constants$1641.const$3.set(seg, x);
    }
    public static MemorySegment priv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1641.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1641.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

