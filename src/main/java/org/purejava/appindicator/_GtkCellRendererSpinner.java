// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkCellRendererSpinner {
 *     struct _GtkCellRenderer parent;
 *     struct _GtkCellRendererSpinnerPrivate* priv;
 * };
 * }
 */
public class _GtkCellRendererSpinner {

    public static MemoryLayout $LAYOUT() {
        return constants$2594.const$3;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static VarHandle priv$VH() {
        return constants$2594.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkCellRendererSpinnerPrivate* priv;
     * }
     */
    public static MemorySegment priv$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2594.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkCellRendererSpinnerPrivate* priv;
     * }
     */
    public static void priv$set(MemorySegment seg, MemorySegment x) {
        constants$2594.const$4.set(seg, x);
    }
    public static MemorySegment priv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2594.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2594.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


