// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct GWeakRef {
 *     union  priv;
 * };
 * }
 */
public class GWeakRef {

    public static MemoryLayout $LAYOUT() {
        return constants$644.const$1;
    }
    /**
     * {@snippet :
     * union {
     *     void* p;
     * };
     * }
     */
    public static final class priv {

        // Suppresses default constructor, ensuring non-instantiability.
        private priv() {}
        public static MemoryLayout $LAYOUT() {
            return constants$644.const$2;
        }
        public static VarHandle p$VH() {
            return constants$644.const$3;
        }
        /**
         * Getter for field:
         * {@snippet :
         * void* p;
         * }
         */
        public static MemorySegment p$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$644.const$3.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * void* p;
         * }
         */
        public static void p$set(MemorySegment seg, MemorySegment x) {
            constants$644.const$3.set(seg, x);
        }
        public static MemorySegment p$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$644.const$3.get(seg.asSlice(index*sizeof()));
        }
        public static void p$set(MemorySegment seg, long index, MemorySegment x) {
            constants$644.const$3.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment priv$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


