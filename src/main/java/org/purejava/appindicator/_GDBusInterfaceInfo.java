// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GDBusInterfaceInfo {
 *     int ref_count;
 *     char* name;
 *     struct _GDBusMethodInfo** methods;
 *     struct _GDBusSignalInfo** signals;
 *     struct _GDBusPropertyInfo** properties;
 *     struct _GDBusAnnotationInfo** annotations;
 * };
 * }
 */
public class _GDBusInterfaceInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$884.const$2;
    }
    public static VarHandle ref_count$VH() {
        return constants$884.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int ref_count;
     * }
     */
    public static int ref_count$get(MemorySegment seg) {
        return (int)constants$884.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int ref_count;
     * }
     */
    public static void ref_count$set(MemorySegment seg, int x) {
        constants$884.const$3.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)constants$884.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        constants$884.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle name$VH() {
        return constants$884.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$884.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        constants$884.const$4.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$884.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$884.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle methods$VH() {
        return constants$884.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GDBusMethodInfo** methods;
     * }
     */
    public static MemorySegment methods$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$884.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GDBusMethodInfo** methods;
     * }
     */
    public static void methods$set(MemorySegment seg, MemorySegment x) {
        constants$884.const$5.set(seg, x);
    }
    public static MemorySegment methods$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$884.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void methods$set(MemorySegment seg, long index, MemorySegment x) {
        constants$884.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle signals$VH() {
        return constants$885.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GDBusSignalInfo** signals;
     * }
     */
    public static MemorySegment signals$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$885.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GDBusSignalInfo** signals;
     * }
     */
    public static void signals$set(MemorySegment seg, MemorySegment x) {
        constants$885.const$0.set(seg, x);
    }
    public static MemorySegment signals$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$885.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void signals$set(MemorySegment seg, long index, MemorySegment x) {
        constants$885.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle properties$VH() {
        return constants$885.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GDBusPropertyInfo** properties;
     * }
     */
    public static MemorySegment properties$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$885.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GDBusPropertyInfo** properties;
     * }
     */
    public static void properties$set(MemorySegment seg, MemorySegment x) {
        constants$885.const$1.set(seg, x);
    }
    public static MemorySegment properties$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$885.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void properties$set(MemorySegment seg, long index, MemorySegment x) {
        constants$885.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle annotations$VH() {
        return constants$885.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GDBusAnnotationInfo** annotations;
     * }
     */
    public static MemorySegment annotations$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$885.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GDBusAnnotationInfo** annotations;
     * }
     */
    public static void annotations$set(MemorySegment seg, MemorySegment x) {
        constants$885.const$2.set(seg, x);
    }
    public static MemorySegment annotations$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$885.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void annotations$set(MemorySegment seg, long index, MemorySegment x) {
        constants$885.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


