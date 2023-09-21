// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _PangoGlyphItemIter {
 *     struct _PangoGlyphItem* glyph_item;
 *     char* text;
 *     int start_glyph;
 *     int start_index;
 *     int start_char;
 *     int end_glyph;
 *     int end_index;
 *     int end_char;
 * };
 * }
 */
public class _PangoGlyphItemIter {

    public static MemoryLayout $LAYOUT() {
        return constants$1616.const$2;
    }
    public static VarHandle glyph_item$VH() {
        return constants$1616.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _PangoGlyphItem* glyph_item;
     * }
     */
    public static MemorySegment glyph_item$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1616.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _PangoGlyphItem* glyph_item;
     * }
     */
    public static void glyph_item$set(MemorySegment seg, MemorySegment x) {
        constants$1616.const$3.set(seg, x);
    }
    public static MemorySegment glyph_item$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1616.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void glyph_item$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1616.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle text$VH() {
        return constants$1616.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* text;
     * }
     */
    public static MemorySegment text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1616.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* text;
     * }
     */
    public static void text$set(MemorySegment seg, MemorySegment x) {
        constants$1616.const$4.set(seg, x);
    }
    public static MemorySegment text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1616.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void text$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1616.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle start_glyph$VH() {
        return constants$1616.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int start_glyph;
     * }
     */
    public static int start_glyph$get(MemorySegment seg) {
        return (int)constants$1616.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int start_glyph;
     * }
     */
    public static void start_glyph$set(MemorySegment seg, int x) {
        constants$1616.const$5.set(seg, x);
    }
    public static int start_glyph$get(MemorySegment seg, long index) {
        return (int)constants$1616.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void start_glyph$set(MemorySegment seg, long index, int x) {
        constants$1616.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle start_index$VH() {
        return constants$1617.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int start_index;
     * }
     */
    public static int start_index$get(MemorySegment seg) {
        return (int)constants$1617.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int start_index;
     * }
     */
    public static void start_index$set(MemorySegment seg, int x) {
        constants$1617.const$0.set(seg, x);
    }
    public static int start_index$get(MemorySegment seg, long index) {
        return (int)constants$1617.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void start_index$set(MemorySegment seg, long index, int x) {
        constants$1617.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle start_char$VH() {
        return constants$1617.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int start_char;
     * }
     */
    public static int start_char$get(MemorySegment seg) {
        return (int)constants$1617.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int start_char;
     * }
     */
    public static void start_char$set(MemorySegment seg, int x) {
        constants$1617.const$1.set(seg, x);
    }
    public static int start_char$get(MemorySegment seg, long index) {
        return (int)constants$1617.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void start_char$set(MemorySegment seg, long index, int x) {
        constants$1617.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle end_glyph$VH() {
        return constants$1617.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int end_glyph;
     * }
     */
    public static int end_glyph$get(MemorySegment seg) {
        return (int)constants$1617.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int end_glyph;
     * }
     */
    public static void end_glyph$set(MemorySegment seg, int x) {
        constants$1617.const$2.set(seg, x);
    }
    public static int end_glyph$get(MemorySegment seg, long index) {
        return (int)constants$1617.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void end_glyph$set(MemorySegment seg, long index, int x) {
        constants$1617.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle end_index$VH() {
        return constants$1617.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int end_index;
     * }
     */
    public static int end_index$get(MemorySegment seg) {
        return (int)constants$1617.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int end_index;
     * }
     */
    public static void end_index$set(MemorySegment seg, int x) {
        constants$1617.const$3.set(seg, x);
    }
    public static int end_index$get(MemorySegment seg, long index) {
        return (int)constants$1617.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void end_index$set(MemorySegment seg, long index, int x) {
        constants$1617.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle end_char$VH() {
        return constants$1617.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int end_char;
     * }
     */
    public static int end_char$get(MemorySegment seg) {
        return (int)constants$1617.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int end_char;
     * }
     */
    public static void end_char$set(MemorySegment seg, int x) {
        constants$1617.const$4.set(seg, x);
    }
    public static int end_char$get(MemorySegment seg, long index) {
        return (int)constants$1617.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void end_char$set(MemorySegment seg, long index, int x) {
        constants$1617.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

