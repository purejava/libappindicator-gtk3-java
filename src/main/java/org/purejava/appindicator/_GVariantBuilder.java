// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GVariantBuilder {
 *     union  u;
 * };
 * }
 */
public class _GVariantBuilder {

    public static MemoryLayout $LAYOUT() {
        return constants$364.const$3;
    }
    /**
     * {@snippet :
     * union {
     *     struct  s;
     *     unsigned long x[16];
     * };
     * }
     */
    public static final class u {

        // Suppresses default constructor, ensuring non-instantiability.
        private u() {}
        public static MemoryLayout $LAYOUT() {
            return constants$364.const$4;
        }
        /**
         * {@snippet :
         * struct {
         *     unsigned long partial_magic;
         *     struct _GVariantType* type;
         *     unsigned long y[14];
         * };
         * }
         */
        public static final class s {

            // Suppresses default constructor, ensuring non-instantiability.
            private s() {}
            public static MemoryLayout $LAYOUT() {
                return constants$364.const$5;
            }
            public static VarHandle partial_magic$VH() {
                return constants$365.const$0;
            }
            /**
             * Getter for field:
             * {@snippet :
             * unsigned long partial_magic;
             * }
             */
            public static long partial_magic$get(MemorySegment seg) {
                return (long)constants$365.const$0.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * unsigned long partial_magic;
             * }
             */
            public static void partial_magic$set(MemorySegment seg, long x) {
                constants$365.const$0.set(seg, x);
            }
            public static long partial_magic$get(MemorySegment seg, long index) {
                return (long)constants$365.const$0.get(seg.asSlice(index*sizeof()));
            }
            public static void partial_magic$set(MemorySegment seg, long index, long x) {
                constants$365.const$0.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle type$VH() {
                return constants$365.const$1;
            }
            /**
             * Getter for field:
             * {@snippet :
             * struct _GVariantType* type;
             * }
             */
            public static MemorySegment type$get(MemorySegment seg) {
                return (java.lang.foreign.MemorySegment)constants$365.const$1.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * struct _GVariantType* type;
             * }
             */
            public static void type$set(MemorySegment seg, MemorySegment x) {
                constants$365.const$1.set(seg, x);
            }
            public static MemorySegment type$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemorySegment)constants$365.const$1.get(seg.asSlice(index*sizeof()));
            }
            public static void type$set(MemorySegment seg, long index, MemorySegment x) {
                constants$365.const$1.set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment y$slice(MemorySegment seg) {
                return seg.asSlice(16, 112);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
        }

        public static MemorySegment s$slice(MemorySegment seg) {
            return seg.asSlice(0, 128);
        }
        public static MemorySegment x$slice(MemorySegment seg) {
            return seg.asSlice(0, 128);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment u$slice(MemorySegment seg) {
        return seg.asSlice(0, 128);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

