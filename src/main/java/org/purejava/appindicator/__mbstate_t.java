// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct __mbstate_t {
 *     int __count;
 *     union  __value;
 * };
 * }
 */
public class __mbstate_t {

    public static MemoryLayout $LAYOUT() {
        return constants$1652.const$0;
    }
    public static VarHandle __count$VH() {
        return constants$1652.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int __count;
     * }
     */
    public static int __count$get(MemorySegment seg) {
        return (int)constants$1652.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int __count;
     * }
     */
    public static void __count$set(MemorySegment seg, int x) {
        constants$1652.const$1.set(seg, x);
    }
    public static int __count$get(MemorySegment seg, long index) {
        return (int)constants$1652.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void __count$set(MemorySegment seg, long index, int x) {
        constants$1652.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     unsigned int __wch;
     *     char __wchb[4];
     * };
     * }
     */
    public static final class __value {

        // Suppresses default constructor, ensuring non-instantiability.
        private __value() {}
        public static MemoryLayout $LAYOUT() {
            return constants$1652.const$2;
        }
        public static VarHandle __wch$VH() {
            return constants$1652.const$3;
        }
        /**
         * Getter for field:
         * {@snippet :
         * unsigned int __wch;
         * }
         */
        public static int __wch$get(MemorySegment seg) {
            return (int)constants$1652.const$3.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * unsigned int __wch;
         * }
         */
        public static void __wch$set(MemorySegment seg, int x) {
            constants$1652.const$3.set(seg, x);
        }
        public static int __wch$get(MemorySegment seg, long index) {
            return (int)constants$1652.const$3.get(seg.asSlice(index*sizeof()));
        }
        public static void __wch$set(MemorySegment seg, long index, int x) {
            constants$1652.const$3.set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment __wchb$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment __value$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


