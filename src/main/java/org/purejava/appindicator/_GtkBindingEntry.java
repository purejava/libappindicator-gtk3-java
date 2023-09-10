// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkBindingEntry {
 *     unsigned int keyval;
 *     enum GdkModifierType modifiers;
 *     struct _GtkBindingSet* binding_set;
 *      *     unsigned int destroyed;
 *     unsigned int in_emission;
 *     unsigned int marks_unbound;
 *     struct _GtkBindingEntry* set_next;
 *     struct _GtkBindingEntry* hash_next;
 *     struct _GtkBindingSignal* signals;
 * };
 * }
 */
public class _GtkBindingEntry {

    public static MemoryLayout $LAYOUT() {
        return constants$2529.const$4;
    }
    public static VarHandle keyval$VH() {
        return constants$2529.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int keyval;
     * }
     */
    public static int keyval$get(MemorySegment seg) {
        return (int)constants$2529.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int keyval;
     * }
     */
    public static void keyval$set(MemorySegment seg, int x) {
        constants$2529.const$5.set(seg, x);
    }
    public static int keyval$get(MemorySegment seg, long index) {
        return (int)constants$2529.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void keyval$set(MemorySegment seg, long index, int x) {
        constants$2529.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle modifiers$VH() {
        return constants$2530.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GdkModifierType modifiers;
     * }
     */
    public static int modifiers$get(MemorySegment seg) {
        return (int)constants$2530.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GdkModifierType modifiers;
     * }
     */
    public static void modifiers$set(MemorySegment seg, int x) {
        constants$2530.const$0.set(seg, x);
    }
    public static int modifiers$get(MemorySegment seg, long index) {
        return (int)constants$2530.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void modifiers$set(MemorySegment seg, long index, int x) {
        constants$2530.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle binding_set$VH() {
        return constants$2530.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkBindingSet* binding_set;
     * }
     */
    public static MemorySegment binding_set$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2530.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkBindingSet* binding_set;
     * }
     */
    public static void binding_set$set(MemorySegment seg, MemorySegment x) {
        constants$2530.const$1.set(seg, x);
    }
    public static MemorySegment binding_set$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2530.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void binding_set$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2530.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle set_next$VH() {
        return constants$2530.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkBindingEntry* set_next;
     * }
     */
    public static MemorySegment set_next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2530.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkBindingEntry* set_next;
     * }
     */
    public static void set_next$set(MemorySegment seg, MemorySegment x) {
        constants$2530.const$2.set(seg, x);
    }
    public static MemorySegment set_next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2530.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void set_next$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2530.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hash_next$VH() {
        return constants$2530.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkBindingEntry* hash_next;
     * }
     */
    public static MemorySegment hash_next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2530.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkBindingEntry* hash_next;
     * }
     */
    public static void hash_next$set(MemorySegment seg, MemorySegment x) {
        constants$2530.const$3.set(seg, x);
    }
    public static MemorySegment hash_next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2530.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void hash_next$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2530.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle signals$VH() {
        return constants$2530.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkBindingSignal* signals;
     * }
     */
    public static MemorySegment signals$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2530.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkBindingSignal* signals;
     * }
     */
    public static void signals$set(MemorySegment seg, MemorySegment x) {
        constants$2530.const$4.set(seg, x);
    }
    public static MemorySegment signals$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2530.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void signals$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2530.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


