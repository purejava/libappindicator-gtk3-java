// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GdkEventWindowState {
 *     enum GdkEventType type;
 *     struct _GdkWindow* window;
 *     signed char send_event;
 *     enum GdkWindowState changed_mask;
 *     enum GdkWindowState new_window_state;
 * };
 * }
 */
public class _GdkEventWindowState {

    public static MemoryLayout $LAYOUT() {
        return constants$1791.const$1;
    }
    public static VarHandle type$VH() {
        return constants$1791.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GdkEventType type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$1791.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GdkEventType type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$1791.const$2.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$1791.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$1791.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle window$VH() {
        return constants$1791.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GdkWindow* window;
     * }
     */
    public static MemorySegment window$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1791.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GdkWindow* window;
     * }
     */
    public static void window$set(MemorySegment seg, MemorySegment x) {
        constants$1791.const$3.set(seg, x);
    }
    public static MemorySegment window$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1791.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1791.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle send_event$VH() {
        return constants$1791.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * signed char send_event;
     * }
     */
    public static byte send_event$get(MemorySegment seg) {
        return (byte)constants$1791.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * signed char send_event;
     * }
     */
    public static void send_event$set(MemorySegment seg, byte x) {
        constants$1791.const$4.set(seg, x);
    }
    public static byte send_event$get(MemorySegment seg, long index) {
        return (byte)constants$1791.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, byte x) {
        constants$1791.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle changed_mask$VH() {
        return constants$1791.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GdkWindowState changed_mask;
     * }
     */
    public static int changed_mask$get(MemorySegment seg) {
        return (int)constants$1791.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GdkWindowState changed_mask;
     * }
     */
    public static void changed_mask$set(MemorySegment seg, int x) {
        constants$1791.const$5.set(seg, x);
    }
    public static int changed_mask$get(MemorySegment seg, long index) {
        return (int)constants$1791.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void changed_mask$set(MemorySegment seg, long index, int x) {
        constants$1791.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle new_window_state$VH() {
        return constants$1792.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GdkWindowState new_window_state;
     * }
     */
    public static int new_window_state$get(MemorySegment seg) {
        return (int)constants$1792.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GdkWindowState new_window_state;
     * }
     */
    public static void new_window_state$set(MemorySegment seg, int x) {
        constants$1792.const$0.set(seg, x);
    }
    public static int new_window_state$get(MemorySegment seg, long index) {
        return (int)constants$1792.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void new_window_state$set(MemorySegment seg, long index, int x) {
        constants$1792.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


