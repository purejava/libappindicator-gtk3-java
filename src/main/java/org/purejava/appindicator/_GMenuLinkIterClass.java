// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GMenuLinkIterClass {
 *     struct _GObjectClass parent_class;
 *     int (*get_next)(struct _GMenuLinkIter*,char**,struct _GMenuModel**);
 * };
 * }
 */
public class _GMenuLinkIterClass {

    public static MemoryLayout $LAYOUT() {
        return constants$1151.const$4;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * int (*get_next)(struct _GMenuLinkIter*,char**,struct _GMenuModel**);
     * }
     */
    public interface get_next {

        int apply(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_next fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1151.const$5, fi, constants$12.const$2, scope);
        }
        static get_next ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _a, java.lang.foreign.MemorySegment _b, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$12.const$4.invokeExact(symbol, _a, _b, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_next$VH() {
        return constants$1152.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*get_next)(struct _GMenuLinkIter*,char**,struct _GMenuModel**);
     * }
     */
    public static MemorySegment get_next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1152.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*get_next)(struct _GMenuLinkIter*,char**,struct _GMenuModel**);
     * }
     */
    public static void get_next$set(MemorySegment seg, MemorySegment x) {
        constants$1152.const$0.set(seg, x);
    }
    public static MemorySegment get_next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1152.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void get_next$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1152.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_next get_next(MemorySegment segment, Arena scope) {
        return get_next.ofAddress(get_next$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


