// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkAboutDialog {
 *     GtkDialog parent_instance;
 *     GtkAboutDialogPrivate* priv;
 * };
 * }
 */
public class _GtkAboutDialog {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        MemoryLayout.structLayout(
                            MemoryLayout.structLayout(
                                MemoryLayout.structLayout(
                                    Constants$root.C_POINTER$LAYOUT.withName("g_class")
                                ).withName("g_type_instance"),
                                Constants$root.C_INT$LAYOUT.withName("ref_count"),
                                MemoryLayout.paddingLayout(32),
                                Constants$root.C_POINTER$LAYOUT.withName("qdata")
                            ).withName("parent_instance"),
                            Constants$root.C_POINTER$LAYOUT.withName("priv")
                        ).withName("widget"),
                        Constants$root.C_POINTER$LAYOUT.withName("priv")
                    ).withName("container"),
                    Constants$root.C_POINTER$LAYOUT.withName("priv")
                ).withName("bin"),
                Constants$root.C_POINTER$LAYOUT.withName("priv")
            ).withName("window"),
            Constants$root.C_POINTER$LAYOUT.withName("priv")
        ).withName("parent_instance"),
        Constants$root.C_POINTER$LAYOUT.withName("priv")
    ).withName("_GtkAboutDialog");
    public static MemoryLayout $LAYOUT() {
        return _GtkAboutDialog.$struct$LAYOUT;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 64);
    }
    static final VarHandle priv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    public static VarHandle priv$VH() {
        return _GtkAboutDialog.priv$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkAboutDialogPrivate* priv;
     * }
     */
    public static MemorySegment priv$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkAboutDialog.priv$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkAboutDialogPrivate* priv;
     * }
     */
    public static void priv$set(MemorySegment seg, MemorySegment x) {
        _GtkAboutDialog.priv$VH.set(seg, x);
    }
    public static MemorySegment priv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkAboutDialog.priv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkAboutDialog.priv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

