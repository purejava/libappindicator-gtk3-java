// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkFrame {
 *     struct _GtkBin bin;
 *     struct _GtkFramePrivate* priv;
 * };
 * }
 */
public class _GtkFrame {

    public static MemoryLayout $LAYOUT() {
        return constants$2515.const$0;
    }
    public static MemorySegment bin$slice(MemorySegment seg) {
        return seg.asSlice(0, 48);
    }
    public static VarHandle priv$VH() {
        return constants$2515.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkFramePrivate* priv;
     * }
     */
    public static MemorySegment priv$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2515.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkFramePrivate* priv;
     * }
     */
    public static void priv$set(MemorySegment seg, MemorySegment x) {
        constants$2515.const$1.set(seg, x);
    }
    public static MemorySegment priv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2515.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2515.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


