// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GTypeModule {
 *     struct _GObject parent_instance;
 *     unsigned int use_count;
 *     struct _GSList* type_infos;
 *     struct _GSList* interface_infos;
 *     char* name;
 * };
 * }
 */
public class _GTypeModule {

    public static MemoryLayout $LAYOUT() {
        return constants$675.const$0;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static VarHandle use_count$VH() {
        return constants$675.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int use_count;
     * }
     */
    public static int use_count$get(MemorySegment seg) {
        return (int)constants$675.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int use_count;
     * }
     */
    public static void use_count$set(MemorySegment seg, int x) {
        constants$675.const$1.set(seg, x);
    }
    public static int use_count$get(MemorySegment seg, long index) {
        return (int)constants$675.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void use_count$set(MemorySegment seg, long index, int x) {
        constants$675.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle type_infos$VH() {
        return constants$675.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GSList* type_infos;
     * }
     */
    public static MemorySegment type_infos$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$675.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GSList* type_infos;
     * }
     */
    public static void type_infos$set(MemorySegment seg, MemorySegment x) {
        constants$675.const$2.set(seg, x);
    }
    public static MemorySegment type_infos$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$675.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void type_infos$set(MemorySegment seg, long index, MemorySegment x) {
        constants$675.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle interface_infos$VH() {
        return constants$675.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GSList* interface_infos;
     * }
     */
    public static MemorySegment interface_infos$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$675.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GSList* interface_infos;
     * }
     */
    public static void interface_infos$set(MemorySegment seg, MemorySegment x) {
        constants$675.const$3.set(seg, x);
    }
    public static MemorySegment interface_infos$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$675.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void interface_infos$set(MemorySegment seg, long index, MemorySegment x) {
        constants$675.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle name$VH() {
        return constants$675.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$675.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        constants$675.const$4.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$675.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$675.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


