// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkSeparator {
 *     struct _GtkWidget widget;
 *     struct _GtkSeparatorPrivate* priv;
 * };
 * }
 */
public class _GtkSeparator {

    public static MemoryLayout $LAYOUT() {
        return constants$3074.const$3;
    }
    public static MemorySegment widget$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static VarHandle priv$VH() {
        return constants$3074.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkSeparatorPrivate* priv;
     * }
     */
    public static MemorySegment priv$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3074.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkSeparatorPrivate* priv;
     * }
     */
    public static void priv$set(MemorySegment seg, MemorySegment x) {
        constants$3074.const$4.set(seg, x);
    }
    public static MemorySegment priv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3074.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3074.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


