// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GParamSpec {
 *     struct _GTypeInstance g_type_instance;
 *     char* name;
 *     enum GParamFlags flags;
 *     unsigned long value_type;
 *     unsigned long owner_type;
 *     char* _nick;
 *     char* _blurb;
 *     struct _GData* qdata;
 *     unsigned int ref_count;
 *     unsigned int param_id;
 * };
 * }
 */
public class _GParamSpec {

    public static MemoryLayout $LAYOUT() {
        return constants$571.const$3;
    }
    public static MemorySegment g_type_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static VarHandle name$VH() {
        return constants$571.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$571.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        constants$571.const$4.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$571.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$571.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$571.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GParamFlags flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$571.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GParamFlags flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$571.const$5.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$571.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$571.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle value_type$VH() {
        return constants$572.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long value_type;
     * }
     */
    public static long value_type$get(MemorySegment seg) {
        return (long)constants$572.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long value_type;
     * }
     */
    public static void value_type$set(MemorySegment seg, long x) {
        constants$572.const$0.set(seg, x);
    }
    public static long value_type$get(MemorySegment seg, long index) {
        return (long)constants$572.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void value_type$set(MemorySegment seg, long index, long x) {
        constants$572.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle owner_type$VH() {
        return constants$572.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long owner_type;
     * }
     */
    public static long owner_type$get(MemorySegment seg) {
        return (long)constants$572.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long owner_type;
     * }
     */
    public static void owner_type$set(MemorySegment seg, long x) {
        constants$572.const$1.set(seg, x);
    }
    public static long owner_type$get(MemorySegment seg, long index) {
        return (long)constants$572.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void owner_type$set(MemorySegment seg, long index, long x) {
        constants$572.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle _nick$VH() {
        return constants$572.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* _nick;
     * }
     */
    public static MemorySegment _nick$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$572.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* _nick;
     * }
     */
    public static void _nick$set(MemorySegment seg, MemorySegment x) {
        constants$572.const$2.set(seg, x);
    }
    public static MemorySegment _nick$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$572.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _nick$set(MemorySegment seg, long index, MemorySegment x) {
        constants$572.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle _blurb$VH() {
        return constants$572.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* _blurb;
     * }
     */
    public static MemorySegment _blurb$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$572.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* _blurb;
     * }
     */
    public static void _blurb$set(MemorySegment seg, MemorySegment x) {
        constants$572.const$3.set(seg, x);
    }
    public static MemorySegment _blurb$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$572.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _blurb$set(MemorySegment seg, long index, MemorySegment x) {
        constants$572.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle qdata$VH() {
        return constants$572.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GData* qdata;
     * }
     */
    public static MemorySegment qdata$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$572.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GData* qdata;
     * }
     */
    public static void qdata$set(MemorySegment seg, MemorySegment x) {
        constants$572.const$4.set(seg, x);
    }
    public static MemorySegment qdata$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$572.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void qdata$set(MemorySegment seg, long index, MemorySegment x) {
        constants$572.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ref_count$VH() {
        return constants$572.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int ref_count;
     * }
     */
    public static int ref_count$get(MemorySegment seg) {
        return (int)constants$572.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int ref_count;
     * }
     */
    public static void ref_count$set(MemorySegment seg, int x) {
        constants$572.const$5.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)constants$572.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        constants$572.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle param_id$VH() {
        return constants$573.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int param_id;
     * }
     */
    public static int param_id$get(MemorySegment seg) {
        return (int)constants$573.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int param_id;
     * }
     */
    public static void param_id$set(MemorySegment seg, int x) {
        constants$573.const$0.set(seg, x);
    }
    public static int param_id$get(MemorySegment seg, long index) {
        return (int)constants$573.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void param_id$set(MemorySegment seg, long index, int x) {
        constants$573.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


