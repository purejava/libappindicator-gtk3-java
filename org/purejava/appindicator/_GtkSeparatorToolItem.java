// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkSeparatorToolItem {
 *     struct _GtkToolItem parent;
 *     struct _GtkSeparatorToolItemPrivate* priv;
 * };
 * }
 */
public class _GtkSeparatorToolItem {

    public static MemoryLayout $LAYOUT() {
        return constants$3078.const$4;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 56);
    }
    public static VarHandle priv$VH() {
        return constants$3078.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkSeparatorToolItemPrivate* priv;
     * }
     */
    public static MemorySegment priv$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3078.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkSeparatorToolItemPrivate* priv;
     * }
     */
    public static void priv$set(MemorySegment seg, MemorySegment x) {
        constants$3078.const$5.set(seg, x);
    }
    public static MemorySegment priv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3078.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3078.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

