// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkAccelKey {
 *     unsigned int accel_key;
 *     enum GdkModifierType accel_mods;
 *      *     unsigned int accel_flags;
 * };
 * }
 */
public class _GtkAccelKey {

    public static MemoryLayout $LAYOUT() {
        return constants$1957.const$4;
    }
    public static VarHandle accel_key$VH() {
        return constants$1957.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int accel_key;
     * }
     */
    public static int accel_key$get(MemorySegment seg) {
        return (int)constants$1957.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int accel_key;
     * }
     */
    public static void accel_key$set(MemorySegment seg, int x) {
        constants$1957.const$5.set(seg, x);
    }
    public static int accel_key$get(MemorySegment seg, long index) {
        return (int)constants$1957.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void accel_key$set(MemorySegment seg, long index, int x) {
        constants$1957.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle accel_mods$VH() {
        return constants$1958.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GdkModifierType accel_mods;
     * }
     */
    public static int accel_mods$get(MemorySegment seg) {
        return (int)constants$1958.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GdkModifierType accel_mods;
     * }
     */
    public static void accel_mods$set(MemorySegment seg, int x) {
        constants$1958.const$0.set(seg, x);
    }
    public static int accel_mods$get(MemorySegment seg, long index) {
        return (int)constants$1958.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void accel_mods$set(MemorySegment seg, long index, int x) {
        constants$1958.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


