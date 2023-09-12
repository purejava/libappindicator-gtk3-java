// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GdkEventTouch {
 *     enum GdkEventType type;
 *     struct _GdkWindow* window;
 *     signed char send_event;
 *     unsigned int time;
 *     double x;
 *     double y;
 *     double* axes;
 *     unsigned int state;
 *     struct _GdkEventSequence* sequence;
 *     int emulating_pointer;
 *     struct _GdkDevice* device;
 *     double x_root;
 *     double y_root;
 * };
 * }
 */
public class _GdkEventTouch {

    public static MemoryLayout $LAYOUT() {
        return constants$1774.const$0;
    }
    public static VarHandle type$VH() {
        return constants$1774.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GdkEventType type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$1774.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GdkEventType type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$1774.const$1.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$1774.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$1774.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle window$VH() {
        return constants$1774.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GdkWindow* window;
     * }
     */
    public static MemorySegment window$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1774.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GdkWindow* window;
     * }
     */
    public static void window$set(MemorySegment seg, MemorySegment x) {
        constants$1774.const$2.set(seg, x);
    }
    public static MemorySegment window$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1774.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1774.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle send_event$VH() {
        return constants$1774.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * signed char send_event;
     * }
     */
    public static byte send_event$get(MemorySegment seg) {
        return (byte)constants$1774.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * signed char send_event;
     * }
     */
    public static void send_event$set(MemorySegment seg, byte x) {
        constants$1774.const$3.set(seg, x);
    }
    public static byte send_event$get(MemorySegment seg, long index) {
        return (byte)constants$1774.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, byte x) {
        constants$1774.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle time$VH() {
        return constants$1774.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int time;
     * }
     */
    public static int time$get(MemorySegment seg) {
        return (int)constants$1774.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int time;
     * }
     */
    public static void time$set(MemorySegment seg, int x) {
        constants$1774.const$4.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)constants$1774.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        constants$1774.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle x$VH() {
        return constants$1774.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double x;
     * }
     */
    public static double x$get(MemorySegment seg) {
        return (double)constants$1774.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double x;
     * }
     */
    public static void x$set(MemorySegment seg, double x) {
        constants$1774.const$5.set(seg, x);
    }
    public static double x$get(MemorySegment seg, long index) {
        return (double)constants$1774.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, double x) {
        constants$1774.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$1775.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double y;
     * }
     */
    public static double y$get(MemorySegment seg) {
        return (double)constants$1775.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double y;
     * }
     */
    public static void y$set(MemorySegment seg, double x) {
        constants$1775.const$0.set(seg, x);
    }
    public static double y$get(MemorySegment seg, long index) {
        return (double)constants$1775.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, double x) {
        constants$1775.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle axes$VH() {
        return constants$1775.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double* axes;
     * }
     */
    public static MemorySegment axes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1775.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double* axes;
     * }
     */
    public static void axes$set(MemorySegment seg, MemorySegment x) {
        constants$1775.const$1.set(seg, x);
    }
    public static MemorySegment axes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1775.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void axes$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1775.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle state$VH() {
        return constants$1775.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int state;
     * }
     */
    public static int state$get(MemorySegment seg) {
        return (int)constants$1775.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int state;
     * }
     */
    public static void state$set(MemorySegment seg, int x) {
        constants$1775.const$2.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)constants$1775.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        constants$1775.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sequence$VH() {
        return constants$1775.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GdkEventSequence* sequence;
     * }
     */
    public static MemorySegment sequence$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1775.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GdkEventSequence* sequence;
     * }
     */
    public static void sequence$set(MemorySegment seg, MemorySegment x) {
        constants$1775.const$3.set(seg, x);
    }
    public static MemorySegment sequence$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1775.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void sequence$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1775.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle emulating_pointer$VH() {
        return constants$1775.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int emulating_pointer;
     * }
     */
    public static int emulating_pointer$get(MemorySegment seg) {
        return (int)constants$1775.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int emulating_pointer;
     * }
     */
    public static void emulating_pointer$set(MemorySegment seg, int x) {
        constants$1775.const$4.set(seg, x);
    }
    public static int emulating_pointer$get(MemorySegment seg, long index) {
        return (int)constants$1775.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void emulating_pointer$set(MemorySegment seg, long index, int x) {
        constants$1775.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle device$VH() {
        return constants$1775.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GdkDevice* device;
     * }
     */
    public static MemorySegment device$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1775.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GdkDevice* device;
     * }
     */
    public static void device$set(MemorySegment seg, MemorySegment x) {
        constants$1775.const$5.set(seg, x);
    }
    public static MemorySegment device$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1775.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void device$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1775.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle x_root$VH() {
        return constants$1776.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double x_root;
     * }
     */
    public static double x_root$get(MemorySegment seg) {
        return (double)constants$1776.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double x_root;
     * }
     */
    public static void x_root$set(MemorySegment seg, double x) {
        constants$1776.const$0.set(seg, x);
    }
    public static double x_root$get(MemorySegment seg, long index) {
        return (double)constants$1776.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void x_root$set(MemorySegment seg, long index, double x) {
        constants$1776.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y_root$VH() {
        return constants$1776.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double y_root;
     * }
     */
    public static double y_root$get(MemorySegment seg) {
        return (double)constants$1776.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double y_root;
     * }
     */
    public static void y_root$set(MemorySegment seg, double x) {
        constants$1776.const$1.set(seg, x);
    }
    public static double y_root$get(MemorySegment seg, long index) {
        return (double)constants$1776.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void y_root$set(MemorySegment seg, long index, double x) {
        constants$1776.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


