// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GdkEventKey {
 *     enum GdkEventType type;
 *     struct _GdkWindow* window;
 *     signed char send_event;
 *     unsigned int time;
 *     unsigned int state;
 *     unsigned int keyval;
 *     int length;
 *     char* string;
 *     unsigned short hardware_keycode;
 *     unsigned char group;
 *      *     unsigned int is_modifier;
 * };
 * }
 */
public class _GdkEventKey {

    public static MemoryLayout $LAYOUT() {
        return constants$1778.const$4;
    }
    public static VarHandle type$VH() {
        return constants$1778.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GdkEventType type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$1778.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GdkEventType type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$1778.const$5.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$1778.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$1778.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle window$VH() {
        return constants$1779.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GdkWindow* window;
     * }
     */
    public static MemorySegment window$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1779.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GdkWindow* window;
     * }
     */
    public static void window$set(MemorySegment seg, MemorySegment x) {
        constants$1779.const$0.set(seg, x);
    }
    public static MemorySegment window$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1779.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1779.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle send_event$VH() {
        return constants$1779.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * signed char send_event;
     * }
     */
    public static byte send_event$get(MemorySegment seg) {
        return (byte)constants$1779.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * signed char send_event;
     * }
     */
    public static void send_event$set(MemorySegment seg, byte x) {
        constants$1779.const$1.set(seg, x);
    }
    public static byte send_event$get(MemorySegment seg, long index) {
        return (byte)constants$1779.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, byte x) {
        constants$1779.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle time$VH() {
        return constants$1779.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int time;
     * }
     */
    public static int time$get(MemorySegment seg) {
        return (int)constants$1779.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int time;
     * }
     */
    public static void time$set(MemorySegment seg, int x) {
        constants$1779.const$2.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)constants$1779.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        constants$1779.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle state$VH() {
        return constants$1779.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int state;
     * }
     */
    public static int state$get(MemorySegment seg) {
        return (int)constants$1779.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int state;
     * }
     */
    public static void state$set(MemorySegment seg, int x) {
        constants$1779.const$3.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)constants$1779.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        constants$1779.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle keyval$VH() {
        return constants$1779.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int keyval;
     * }
     */
    public static int keyval$get(MemorySegment seg) {
        return (int)constants$1779.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int keyval;
     * }
     */
    public static void keyval$set(MemorySegment seg, int x) {
        constants$1779.const$4.set(seg, x);
    }
    public static int keyval$get(MemorySegment seg, long index) {
        return (int)constants$1779.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void keyval$set(MemorySegment seg, long index, int x) {
        constants$1779.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle length$VH() {
        return constants$1779.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int length;
     * }
     */
    public static int length$get(MemorySegment seg) {
        return (int)constants$1779.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int length;
     * }
     */
    public static void length$set(MemorySegment seg, int x) {
        constants$1779.const$5.set(seg, x);
    }
    public static int length$get(MemorySegment seg, long index) {
        return (int)constants$1779.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, int x) {
        constants$1779.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle string$VH() {
        return constants$1780.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* string;
     * }
     */
    public static MemorySegment string$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1780.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* string;
     * }
     */
    public static void string$set(MemorySegment seg, MemorySegment x) {
        constants$1780.const$0.set(seg, x);
    }
    public static MemorySegment string$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1780.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void string$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1780.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hardware_keycode$VH() {
        return constants$1780.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short hardware_keycode;
     * }
     */
    public static short hardware_keycode$get(MemorySegment seg) {
        return (short)constants$1780.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short hardware_keycode;
     * }
     */
    public static void hardware_keycode$set(MemorySegment seg, short x) {
        constants$1780.const$1.set(seg, x);
    }
    public static short hardware_keycode$get(MemorySegment seg, long index) {
        return (short)constants$1780.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void hardware_keycode$set(MemorySegment seg, long index, short x) {
        constants$1780.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle group$VH() {
        return constants$1780.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char group;
     * }
     */
    public static byte group$get(MemorySegment seg) {
        return (byte)constants$1780.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char group;
     * }
     */
    public static void group$set(MemorySegment seg, byte x) {
        constants$1780.const$2.set(seg, x);
    }
    public static byte group$get(MemorySegment seg, long index) {
        return (byte)constants$1780.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void group$set(MemorySegment seg, long index, byte x) {
        constants$1780.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

