// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkTextAttributes {
 *     unsigned int refcount;
 *     struct _GtkTextAppearance appearance;
 *     enum GtkJustification justification;
 *     enum GtkTextDirection direction;
 *     struct _PangoFontDescription* font;
 *     double font_scale;
 *     int left_margin;
 *     int right_margin;
 *     int indent;
 *     int pixels_above_lines;
 *     int pixels_below_lines;
 *     int pixels_inside_wrap;
 *     struct _PangoTabArray* tabs;
 *     enum GtkWrapMode wrap_mode;
 *     struct _PangoLanguage* language;
 *     struct _GdkColor* pg_bg_color;
 *      *     unsigned int invisible;
 *     unsigned int bg_full_height;
 *     unsigned int editable;
 *     unsigned int no_fallback;
 *     struct _GdkRGBA* pg_bg_rgba;
 *     int letter_spacing;
 *     char* font_features;
 * };
 * }
 */
public class _GtkTextAttributes {

    public static MemoryLayout $LAYOUT() {
        return constants$2355.const$2;
    }
    public static VarHandle refcount$VH() {
        return constants$2355.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int refcount;
     * }
     */
    public static int refcount$get(MemorySegment seg) {
        return (int)constants$2355.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int refcount;
     * }
     */
    public static void refcount$set(MemorySegment seg, int x) {
        constants$2355.const$3.set(seg, x);
    }
    public static int refcount$get(MemorySegment seg, long index) {
        return (int)constants$2355.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void refcount$set(MemorySegment seg, long index, int x) {
        constants$2355.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment appearance$slice(MemorySegment seg) {
        return seg.asSlice(8, 48);
    }
    public static VarHandle justification$VH() {
        return constants$2355.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GtkJustification justification;
     * }
     */
    public static int justification$get(MemorySegment seg) {
        return (int)constants$2355.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GtkJustification justification;
     * }
     */
    public static void justification$set(MemorySegment seg, int x) {
        constants$2355.const$4.set(seg, x);
    }
    public static int justification$get(MemorySegment seg, long index) {
        return (int)constants$2355.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void justification$set(MemorySegment seg, long index, int x) {
        constants$2355.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle direction$VH() {
        return constants$2355.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GtkTextDirection direction;
     * }
     */
    public static int direction$get(MemorySegment seg) {
        return (int)constants$2355.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GtkTextDirection direction;
     * }
     */
    public static void direction$set(MemorySegment seg, int x) {
        constants$2355.const$5.set(seg, x);
    }
    public static int direction$get(MemorySegment seg, long index) {
        return (int)constants$2355.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void direction$set(MemorySegment seg, long index, int x) {
        constants$2355.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle font$VH() {
        return constants$2356.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _PangoFontDescription* font;
     * }
     */
    public static MemorySegment font$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2356.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _PangoFontDescription* font;
     * }
     */
    public static void font$set(MemorySegment seg, MemorySegment x) {
        constants$2356.const$0.set(seg, x);
    }
    public static MemorySegment font$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2356.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void font$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2356.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle font_scale$VH() {
        return constants$2356.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double font_scale;
     * }
     */
    public static double font_scale$get(MemorySegment seg) {
        return (double)constants$2356.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double font_scale;
     * }
     */
    public static void font_scale$set(MemorySegment seg, double x) {
        constants$2356.const$1.set(seg, x);
    }
    public static double font_scale$get(MemorySegment seg, long index) {
        return (double)constants$2356.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void font_scale$set(MemorySegment seg, long index, double x) {
        constants$2356.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle left_margin$VH() {
        return constants$2356.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int left_margin;
     * }
     */
    public static int left_margin$get(MemorySegment seg) {
        return (int)constants$2356.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int left_margin;
     * }
     */
    public static void left_margin$set(MemorySegment seg, int x) {
        constants$2356.const$2.set(seg, x);
    }
    public static int left_margin$get(MemorySegment seg, long index) {
        return (int)constants$2356.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void left_margin$set(MemorySegment seg, long index, int x) {
        constants$2356.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle right_margin$VH() {
        return constants$2356.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int right_margin;
     * }
     */
    public static int right_margin$get(MemorySegment seg) {
        return (int)constants$2356.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int right_margin;
     * }
     */
    public static void right_margin$set(MemorySegment seg, int x) {
        constants$2356.const$3.set(seg, x);
    }
    public static int right_margin$get(MemorySegment seg, long index) {
        return (int)constants$2356.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void right_margin$set(MemorySegment seg, long index, int x) {
        constants$2356.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle indent$VH() {
        return constants$2356.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int indent;
     * }
     */
    public static int indent$get(MemorySegment seg) {
        return (int)constants$2356.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int indent;
     * }
     */
    public static void indent$set(MemorySegment seg, int x) {
        constants$2356.const$4.set(seg, x);
    }
    public static int indent$get(MemorySegment seg, long index) {
        return (int)constants$2356.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void indent$set(MemorySegment seg, long index, int x) {
        constants$2356.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pixels_above_lines$VH() {
        return constants$2356.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pixels_above_lines;
     * }
     */
    public static int pixels_above_lines$get(MemorySegment seg) {
        return (int)constants$2356.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pixels_above_lines;
     * }
     */
    public static void pixels_above_lines$set(MemorySegment seg, int x) {
        constants$2356.const$5.set(seg, x);
    }
    public static int pixels_above_lines$get(MemorySegment seg, long index) {
        return (int)constants$2356.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pixels_above_lines$set(MemorySegment seg, long index, int x) {
        constants$2356.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pixels_below_lines$VH() {
        return constants$2357.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pixels_below_lines;
     * }
     */
    public static int pixels_below_lines$get(MemorySegment seg) {
        return (int)constants$2357.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pixels_below_lines;
     * }
     */
    public static void pixels_below_lines$set(MemorySegment seg, int x) {
        constants$2357.const$0.set(seg, x);
    }
    public static int pixels_below_lines$get(MemorySegment seg, long index) {
        return (int)constants$2357.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pixels_below_lines$set(MemorySegment seg, long index, int x) {
        constants$2357.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pixels_inside_wrap$VH() {
        return constants$2357.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pixels_inside_wrap;
     * }
     */
    public static int pixels_inside_wrap$get(MemorySegment seg) {
        return (int)constants$2357.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pixels_inside_wrap;
     * }
     */
    public static void pixels_inside_wrap$set(MemorySegment seg, int x) {
        constants$2357.const$1.set(seg, x);
    }
    public static int pixels_inside_wrap$get(MemorySegment seg, long index) {
        return (int)constants$2357.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pixels_inside_wrap$set(MemorySegment seg, long index, int x) {
        constants$2357.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle tabs$VH() {
        return constants$2357.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _PangoTabArray* tabs;
     * }
     */
    public static MemorySegment tabs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2357.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _PangoTabArray* tabs;
     * }
     */
    public static void tabs$set(MemorySegment seg, MemorySegment x) {
        constants$2357.const$2.set(seg, x);
    }
    public static MemorySegment tabs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2357.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void tabs$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2357.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wrap_mode$VH() {
        return constants$2357.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GtkWrapMode wrap_mode;
     * }
     */
    public static int wrap_mode$get(MemorySegment seg) {
        return (int)constants$2357.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GtkWrapMode wrap_mode;
     * }
     */
    public static void wrap_mode$set(MemorySegment seg, int x) {
        constants$2357.const$3.set(seg, x);
    }
    public static int wrap_mode$get(MemorySegment seg, long index) {
        return (int)constants$2357.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void wrap_mode$set(MemorySegment seg, long index, int x) {
        constants$2357.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle language$VH() {
        return constants$2357.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _PangoLanguage* language;
     * }
     */
    public static MemorySegment language$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2357.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _PangoLanguage* language;
     * }
     */
    public static void language$set(MemorySegment seg, MemorySegment x) {
        constants$2357.const$4.set(seg, x);
    }
    public static MemorySegment language$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2357.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void language$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2357.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pg_bg_color$VH() {
        return constants$2357.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GdkColor* pg_bg_color;
     * }
     */
    public static MemorySegment pg_bg_color$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2357.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GdkColor* pg_bg_color;
     * }
     */
    public static void pg_bg_color$set(MemorySegment seg, MemorySegment x) {
        constants$2357.const$5.set(seg, x);
    }
    public static MemorySegment pg_bg_color$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2357.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pg_bg_color$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2357.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pg_bg_rgba$VH() {
        return constants$2358.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GdkRGBA* pg_bg_rgba;
     * }
     */
    public static MemorySegment pg_bg_rgba$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2358.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GdkRGBA* pg_bg_rgba;
     * }
     */
    public static void pg_bg_rgba$set(MemorySegment seg, MemorySegment x) {
        constants$2358.const$0.set(seg, x);
    }
    public static MemorySegment pg_bg_rgba$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2358.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pg_bg_rgba$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2358.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle letter_spacing$VH() {
        return constants$2358.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int letter_spacing;
     * }
     */
    public static int letter_spacing$get(MemorySegment seg) {
        return (int)constants$2358.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int letter_spacing;
     * }
     */
    public static void letter_spacing$set(MemorySegment seg, int x) {
        constants$2358.const$1.set(seg, x);
    }
    public static int letter_spacing$get(MemorySegment seg, long index) {
        return (int)constants$2358.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void letter_spacing$set(MemorySegment seg, long index, int x) {
        constants$2358.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle font_features$VH() {
        return constants$2358.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* font_features;
     * }
     */
    public static MemorySegment font_features$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2358.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* font_features;
     * }
     */
    public static void font_features$set(MemorySegment seg, MemorySegment x) {
        constants$2358.const$2.set(seg, x);
    }
    public static MemorySegment font_features$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2358.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void font_features$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2358.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


