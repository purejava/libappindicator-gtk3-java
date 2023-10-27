// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GSocketAddressClass {
 *     struct _GObjectClass parent_class;
 *     enum GSocketFamily (*get_family)(struct _GSocketAddress*);
 *     long (*get_native_size)(struct _GSocketAddress*);
 *     int (*to_native)(struct _GSocketAddress*,void*,unsigned long,struct _GError**);
 * };
 * }
 */
public class _GSocketAddressClass {

    public static MemoryLayout $LAYOUT() {
        return constants$1107.const$2;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * enum GSocketFamily (*get_family)(struct _GSocketAddress*);
     * }
     */
    public interface get_family {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(get_family fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1107.const$3, fi, constants$10.const$5, scope);
        }
        static get_family ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)constants$14.const$2.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_family$VH() {
        return constants$1107.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GSocketFamily (*get_family)(struct _GSocketAddress*);
     * }
     */
    public static MemorySegment get_family$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1107.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GSocketFamily (*get_family)(struct _GSocketAddress*);
     * }
     */
    public static void get_family$set(MemorySegment seg, MemorySegment x) {
        constants$1107.const$4.set(seg, x);
    }
    public static MemorySegment get_family$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1107.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void get_family$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1107.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_family get_family(MemorySegment segment, Arena scope) {
        return get_family.ofAddress(get_family$get(segment), scope);
    }
    /**
     * {@snippet :
 * long (*get_native_size)(struct _GSocketAddress*);
     * }
     */
    public interface get_native_size {

        long apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(get_native_size fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1107.const$5, fi, constants$4.const$0, scope);
        }
        static get_native_size ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (long)constants$1068.const$5.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_native_size$VH() {
        return constants$1108.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long (*get_native_size)(struct _GSocketAddress*);
     * }
     */
    public static MemorySegment get_native_size$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1108.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long (*get_native_size)(struct _GSocketAddress*);
     * }
     */
    public static void get_native_size$set(MemorySegment seg, MemorySegment x) {
        constants$1108.const$0.set(seg, x);
    }
    public static MemorySegment get_native_size$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1108.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void get_native_size$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1108.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_native_size get_native_size(MemorySegment segment, Arena scope) {
        return get_native_size.ofAddress(get_native_size$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*to_native)(struct _GSocketAddress*,void*,unsigned long,struct _GError**);
     * }
     */
    public interface to_native {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, long _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(to_native fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1108.const$1, fi, constants$27.const$2, scope);
        }
        static to_native ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, long __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)constants$1108.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle to_native$VH() {
        return constants$1108.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*to_native)(struct _GSocketAddress*,void*,unsigned long,struct _GError**);
     * }
     */
    public static MemorySegment to_native$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1108.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*to_native)(struct _GSocketAddress*,void*,unsigned long,struct _GError**);
     * }
     */
    public static void to_native$set(MemorySegment seg, MemorySegment x) {
        constants$1108.const$3.set(seg, x);
    }
    public static MemorySegment to_native$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1108.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void to_native$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1108.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static to_native to_native(MemorySegment segment, Arena scope) {
        return to_native.ofAddress(to_native$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


