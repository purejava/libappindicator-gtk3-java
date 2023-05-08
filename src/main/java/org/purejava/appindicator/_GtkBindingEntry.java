// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GtkBindingEntry {
 *     guint keyval;
 *     GdkModifierType modifiers;
 *     GtkBindingSet* binding_set;
 *      *     guint destroyed;
 *     guint in_emission;
 *     guint marks_unbound;
 *     GtkBindingEntry* set_next;
 *     GtkBindingEntry* hash_next;
 *     GtkBindingSignal* signals;
 * };
 * }
 */
public class _GtkBindingEntry {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("keyval"),
        Constants$root.C_INT$LAYOUT.withName("modifiers"),
        Constants$root.C_POINTER$LAYOUT.withName("binding_set"),
        MemoryLayout.paddingLayout(64),
        Constants$root.C_POINTER$LAYOUT.withName("set_next"),
        Constants$root.C_POINTER$LAYOUT.withName("hash_next"),
        Constants$root.C_POINTER$LAYOUT.withName("signals")
    ).withName("_GtkBindingEntry");
    public static MemoryLayout $LAYOUT() {
        return _GtkBindingEntry.$struct$LAYOUT;
    }
    static final VarHandle keyval$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("keyval"));
    public static VarHandle keyval$VH() {
        return _GtkBindingEntry.keyval$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint keyval;
     * }
     */
    public static int keyval$get(MemorySegment seg) {
        return (int)_GtkBindingEntry.keyval$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint keyval;
     * }
     */
    public static void keyval$set(MemorySegment seg, int x) {
        _GtkBindingEntry.keyval$VH.set(seg, x);
    }
    public static int keyval$get(MemorySegment seg, long index) {
        return (int)_GtkBindingEntry.keyval$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void keyval$set(MemorySegment seg, long index, int x) {
        _GtkBindingEntry.keyval$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle modifiers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("modifiers"));
    public static VarHandle modifiers$VH() {
        return _GtkBindingEntry.modifiers$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkModifierType modifiers;
     * }
     */
    public static int modifiers$get(MemorySegment seg) {
        return (int)_GtkBindingEntry.modifiers$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkModifierType modifiers;
     * }
     */
    public static void modifiers$set(MemorySegment seg, int x) {
        _GtkBindingEntry.modifiers$VH.set(seg, x);
    }
    public static int modifiers$get(MemorySegment seg, long index) {
        return (int)_GtkBindingEntry.modifiers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void modifiers$set(MemorySegment seg, long index, int x) {
        _GtkBindingEntry.modifiers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle binding_set$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("binding_set"));
    public static VarHandle binding_set$VH() {
        return _GtkBindingEntry.binding_set$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkBindingSet* binding_set;
     * }
     */
    public static MemorySegment binding_set$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBindingEntry.binding_set$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkBindingSet* binding_set;
     * }
     */
    public static void binding_set$set(MemorySegment seg, MemorySegment x) {
        _GtkBindingEntry.binding_set$VH.set(seg, x);
    }
    public static MemorySegment binding_set$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBindingEntry.binding_set$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void binding_set$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBindingEntry.binding_set$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle set_next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_next"));
    public static VarHandle set_next$VH() {
        return _GtkBindingEntry.set_next$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkBindingEntry* set_next;
     * }
     */
    public static MemorySegment set_next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBindingEntry.set_next$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkBindingEntry* set_next;
     * }
     */
    public static void set_next$set(MemorySegment seg, MemorySegment x) {
        _GtkBindingEntry.set_next$VH.set(seg, x);
    }
    public static MemorySegment set_next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBindingEntry.set_next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_next$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBindingEntry.set_next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hash_next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hash_next"));
    public static VarHandle hash_next$VH() {
        return _GtkBindingEntry.hash_next$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkBindingEntry* hash_next;
     * }
     */
    public static MemorySegment hash_next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBindingEntry.hash_next$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkBindingEntry* hash_next;
     * }
     */
    public static void hash_next$set(MemorySegment seg, MemorySegment x) {
        _GtkBindingEntry.hash_next$VH.set(seg, x);
    }
    public static MemorySegment hash_next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBindingEntry.hash_next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hash_next$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBindingEntry.hash_next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle signals$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("signals"));
    public static VarHandle signals$VH() {
        return _GtkBindingEntry.signals$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkBindingSignal* signals;
     * }
     */
    public static MemorySegment signals$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBindingEntry.signals$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkBindingSignal* signals;
     * }
     */
    public static void signals$set(MemorySegment seg, MemorySegment x) {
        _GtkBindingEntry.signals$VH.set(seg, x);
    }
    public static MemorySegment signals$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBindingEntry.signals$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void signals$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBindingEntry.signals$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

