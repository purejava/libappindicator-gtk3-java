// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkAccelKey {
 *     guint accel_key;
 *     GdkModifierType accel_mods;
 *      *     guint accel_flags;
 * };
 * }
 */
public class _GtkAccelKey {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("accel_key"),
        Constants$root.C_INT$LAYOUT.withName("accel_mods"),
        MemoryLayout.paddingLayout(32)
    ).withName("_GtkAccelKey");
    public static MemoryLayout $LAYOUT() {
        return _GtkAccelKey.$struct$LAYOUT;
    }
    static final VarHandle accel_key$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("accel_key"));
    public static VarHandle accel_key$VH() {
        return _GtkAccelKey.accel_key$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint accel_key;
     * }
     */
    public static int accel_key$get(MemorySegment seg) {
        return (int)_GtkAccelKey.accel_key$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint accel_key;
     * }
     */
    public static void accel_key$set(MemorySegment seg, int x) {
        _GtkAccelKey.accel_key$VH.set(seg, x);
    }
    public static int accel_key$get(MemorySegment seg, long index) {
        return (int)_GtkAccelKey.accel_key$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void accel_key$set(MemorySegment seg, long index, int x) {
        _GtkAccelKey.accel_key$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle accel_mods$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("accel_mods"));
    public static VarHandle accel_mods$VH() {
        return _GtkAccelKey.accel_mods$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkModifierType accel_mods;
     * }
     */
    public static int accel_mods$get(MemorySegment seg) {
        return (int)_GtkAccelKey.accel_mods$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkModifierType accel_mods;
     * }
     */
    public static void accel_mods$set(MemorySegment seg, int x) {
        _GtkAccelKey.accel_mods$VH.set(seg, x);
    }
    public static int accel_mods$get(MemorySegment seg, long index) {
        return (int)_GtkAccelKey.accel_mods$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void accel_mods$set(MemorySegment seg, long index, int x) {
        _GtkAccelKey.accel_mods$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

