// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkLabel {
 *     struct _GtkMisc misc;
 *     struct _GtkLabelPrivate* priv;
 * };
 * }
 */
public class _GtkLabel {

    public static MemoryLayout $LAYOUT() {
        return constants$2242.const$2;
    }
    public static MemorySegment misc$slice(MemorySegment seg) {
        return seg.asSlice(0, 40);
    }
    public static VarHandle priv$VH() {
        return constants$2242.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkLabelPrivate* priv;
     * }
     */
    public static MemorySegment priv$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2242.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkLabelPrivate* priv;
     * }
     */
    public static void priv$set(MemorySegment seg, MemorySegment x) {
        constants$2242.const$3.set(seg, x);
    }
    public static MemorySegment priv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2242.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2242.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


