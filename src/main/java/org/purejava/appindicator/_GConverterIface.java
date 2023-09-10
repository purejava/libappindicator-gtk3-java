// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GConverterIface {
 *     struct _GTypeInterface g_iface;
 *     enum GConverterResult (*convert)(struct _GConverter*,void*,unsigned long,void*,unsigned long,enum GConverterFlags,unsigned long*,unsigned long*,struct _GError**);
 *     void (*reset)(struct _GConverter*);
 * };
 * }
 */
public class _GConverterIface {

    public static MemoryLayout $LAYOUT() {
        return constants$802.const$5;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
 * enum GConverterResult (*convert)(struct _GConverter*,void*,unsigned long,void*,unsigned long,enum GConverterFlags,unsigned long*,unsigned long*,struct _GError**);
     * }
     */
    public interface convert {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, long _x2, java.lang.foreign.MemorySegment _x3, long _x4, int _x5, java.lang.foreign.MemorySegment _x6, java.lang.foreign.MemorySegment _x7, java.lang.foreign.MemorySegment _x8);
        static MemorySegment allocate(convert fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$803.const$1, fi, constants$803.const$0, scope);
        }
        static convert ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, long __x2, java.lang.foreign.MemorySegment __x3, long __x4, int __x5, java.lang.foreign.MemorySegment __x6, java.lang.foreign.MemorySegment __x7, java.lang.foreign.MemorySegment __x8) -> {
                try {
                    return (int)constants$803.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6, __x7, __x8);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle convert$VH() {
        return constants$803.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GConverterResult (*convert)(struct _GConverter*,void*,unsigned long,void*,unsigned long,enum GConverterFlags,unsigned long*,unsigned long*,struct _GError**);
     * }
     */
    public static MemorySegment convert$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$803.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GConverterResult (*convert)(struct _GConverter*,void*,unsigned long,void*,unsigned long,enum GConverterFlags,unsigned long*,unsigned long*,struct _GError**);
     * }
     */
    public static void convert$set(MemorySegment seg, MemorySegment x) {
        constants$803.const$3.set(seg, x);
    }
    public static MemorySegment convert$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$803.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void convert$set(MemorySegment seg, long index, MemorySegment x) {
        constants$803.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static convert convert(MemorySegment segment, Arena scope) {
        return convert.ofAddress(convert$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*reset)(struct _GConverter*);
     * }
     */
    public interface reset {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(reset fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$803.const$4, fi, constants$13.const$1, scope);
        }
        static reset ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle reset$VH() {
        return constants$803.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reset)(struct _GConverter*);
     * }
     */
    public static MemorySegment reset$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$803.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reset)(struct _GConverter*);
     * }
     */
    public static void reset$set(MemorySegment seg, MemorySegment x) {
        constants$803.const$5.set(seg, x);
    }
    public static MemorySegment reset$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$803.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void reset$set(MemorySegment seg, long index, MemorySegment x) {
        constants$803.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static reset reset(MemorySegment segment, Arena scope) {
        return reset.ofAddress(reset$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


