// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GParamSpecEnum {
 *     struct _GParamSpec parent_instance;
 *     struct _GEnumClass* enum_class;
 *     int default_value;
 * };
 * }
 */
public class _GParamSpecEnum {

    public static MemoryLayout $LAYOUT() {
        return constants$660.const$2;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    public static VarHandle enum_class$VH() {
        return constants$660.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GEnumClass* enum_class;
     * }
     */
    public static MemorySegment enum_class$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$660.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GEnumClass* enum_class;
     * }
     */
    public static void enum_class$set(MemorySegment seg, MemorySegment x) {
        constants$660.const$3.set(seg, x);
    }
    public static MemorySegment enum_class$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$660.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void enum_class$set(MemorySegment seg, long index, MemorySegment x) {
        constants$660.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle default_value$VH() {
        return constants$660.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int default_value;
     * }
     */
    public static int default_value$get(MemorySegment seg) {
        return (int)constants$660.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int default_value;
     * }
     */
    public static void default_value$set(MemorySegment seg, int x) {
        constants$660.const$4.set(seg, x);
    }
    public static int default_value$get(MemorySegment seg, long index) {
        return (int)constants$660.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void default_value$set(MemorySegment seg, long index, int x) {
        constants$660.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


