// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GDebugControllerDBusClass {
 *     struct _GObjectClass parent_class;
 *     int (*authorize)(struct _GDebugControllerDBus*,struct _GDBusMethodInvocation*);
 *     void* padding[12];
 * };
 * }
 */
public class _GDebugControllerDBusClass {

    public static MemoryLayout $LAYOUT() {
        return constants$937.const$3;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * int (*authorize)(struct _GDebugControllerDBus*,struct _GDBusMethodInvocation*);
     * }
     */
    public interface authorize {

        int apply(java.lang.foreign.MemorySegment filter_info, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(authorize fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$937.const$4, fi, constants$9.const$0, scope);
        }
        static authorize ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _filter_info, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$12.const$1.invokeExact(symbol, _filter_info, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle authorize$VH() {
        return constants$937.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*authorize)(struct _GDebugControllerDBus*,struct _GDBusMethodInvocation*);
     * }
     */
    public static MemorySegment authorize$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$937.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*authorize)(struct _GDebugControllerDBus*,struct _GDBusMethodInvocation*);
     * }
     */
    public static void authorize$set(MemorySegment seg, MemorySegment x) {
        constants$937.const$5.set(seg, x);
    }
    public static MemorySegment authorize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$937.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void authorize$set(MemorySegment seg, long index, MemorySegment x) {
        constants$937.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static authorize authorize(MemorySegment segment, Arena scope) {
        return authorize.ofAddress(authorize$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(144, 96);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


