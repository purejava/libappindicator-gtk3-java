// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GListModelInterface {
 *     struct _GTypeInterface g_iface;
 *     unsigned long (*get_item_type)(struct _GListModel*);
 *     unsigned int (*get_n_items)(struct _GListModel*);
 *     void* (*get_item)(struct _GListModel*,unsigned int);
 * };
 * }
 */
public class _GListModelInterface {

    public static MemoryLayout $LAYOUT() {
        return constants$1133.const$0;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
 * unsigned long (*get_item_type)(struct _GListModel*);
     * }
     */
    public interface get_item_type {

        long apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(get_item_type fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1133.const$1, fi, constants$4.const$0, scope);
        }
        static get_item_type ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_item_type$VH() {
        return constants$1133.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long (*get_item_type)(struct _GListModel*);
     * }
     */
    public static MemorySegment get_item_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1133.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long (*get_item_type)(struct _GListModel*);
     * }
     */
    public static void get_item_type$set(MemorySegment seg, MemorySegment x) {
        constants$1133.const$2.set(seg, x);
    }
    public static MemorySegment get_item_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1133.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void get_item_type$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1133.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_item_type get_item_type(MemorySegment segment, Arena scope) {
        return get_item_type.ofAddress(get_item_type$get(segment), scope);
    }
    /**
     * {@snippet :
 * unsigned int (*get_n_items)(struct _GListModel*);
     * }
     */
    public interface get_n_items {

        int apply(java.lang.foreign.MemorySegment key);
        static MemorySegment allocate(get_n_items fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1133.const$3, fi, constants$10.const$5, scope);
        }
        static get_n_items ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _key) -> {
                try {
                    return (int)constants$14.const$2.invokeExact(symbol, _key);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_n_items$VH() {
        return constants$1133.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int (*get_n_items)(struct _GListModel*);
     * }
     */
    public static MemorySegment get_n_items$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1133.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int (*get_n_items)(struct _GListModel*);
     * }
     */
    public static void get_n_items$set(MemorySegment seg, MemorySegment x) {
        constants$1133.const$4.set(seg, x);
    }
    public static MemorySegment get_n_items$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1133.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void get_n_items$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1133.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_n_items get_n_items(MemorySegment segment, Arena scope) {
        return get_n_items.ofAddress(get_n_items$get(segment), scope);
    }
    /**
     * {@snippet :
 * void* (*get_item)(struct _GListModel*,unsigned int);
     * }
     */
    public interface get_item {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(get_item fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1133.const$5, fi, constants$21.const$3, scope);
        }
        static get_item ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$319.const$0.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_item$VH() {
        return constants$1134.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* (*get_item)(struct _GListModel*,unsigned int);
     * }
     */
    public static MemorySegment get_item$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1134.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* (*get_item)(struct _GListModel*,unsigned int);
     * }
     */
    public static void get_item$set(MemorySegment seg, MemorySegment x) {
        constants$1134.const$0.set(seg, x);
    }
    public static MemorySegment get_item$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1134.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void get_item$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1134.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_item get_item(MemorySegment segment, Arena scope) {
        return get_item.ofAddress(get_item$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


