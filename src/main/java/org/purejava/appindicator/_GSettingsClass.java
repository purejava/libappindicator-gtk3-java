// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GSettingsClass {
 *     struct _GObjectClass parent_class;
 *     void (*writable_changed)(struct _GSettings*,char*);
 *     void (*changed)(struct _GSettings*,char*);
 *     int (*writable_change_event)(struct _GSettings*,unsigned int);
 *     int (*change_event)(struct _GSettings*,unsigned int*,int);
 *     void* padding[20];
 * };
 * }
 */
public class _GSettingsClass {

    public static MemoryLayout $LAYOUT() {
        return constants$1256.const$0;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * void (*writable_changed)(struct _GSettings*,char*);
     * }
     */
    public interface writable_changed {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(writable_changed fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1256.const$1, fi, constants$13.const$4, scope);
        }
        static writable_changed ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$14.const$0.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle writable_changed$VH() {
        return constants$1256.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*writable_changed)(struct _GSettings*,char*);
     * }
     */
    public static MemorySegment writable_changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1256.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*writable_changed)(struct _GSettings*,char*);
     * }
     */
    public static void writable_changed$set(MemorySegment seg, MemorySegment x) {
        constants$1256.const$2.set(seg, x);
    }
    public static MemorySegment writable_changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1256.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void writable_changed$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1256.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static writable_changed writable_changed(MemorySegment segment, Arena scope) {
        return writable_changed.ofAddress(writable_changed$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*changed)(struct _GSettings*,char*);
     * }
     */
    public interface changed {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(changed fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1256.const$3, fi, constants$13.const$4, scope);
        }
        static changed ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$14.const$0.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle changed$VH() {
        return constants$1256.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*changed)(struct _GSettings*,char*);
     * }
     */
    public static MemorySegment changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1256.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*changed)(struct _GSettings*,char*);
     * }
     */
    public static void changed$set(MemorySegment seg, MemorySegment x) {
        constants$1256.const$4.set(seg, x);
    }
    public static MemorySegment changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1256.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void changed$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1256.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static changed changed(MemorySegment segment, Arena scope) {
        return changed.ofAddress(changed$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*writable_change_event)(struct _GSettings*,unsigned int);
     * }
     */
    public interface writable_change_event {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(writable_change_event fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1256.const$5, fi, constants$11.const$4, scope);
        }
        static writable_change_event ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)constants$840.const$4.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle writable_change_event$VH() {
        return constants$1257.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*writable_change_event)(struct _GSettings*,unsigned int);
     * }
     */
    public static MemorySegment writable_change_event$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1257.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*writable_change_event)(struct _GSettings*,unsigned int);
     * }
     */
    public static void writable_change_event$set(MemorySegment seg, MemorySegment x) {
        constants$1257.const$0.set(seg, x);
    }
    public static MemorySegment writable_change_event$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1257.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void writable_change_event$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1257.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static writable_change_event writable_change_event(MemorySegment segment, Arena scope) {
        return writable_change_event.ofAddress(writable_change_event$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*change_event)(struct _GSettings*,unsigned int*,int);
     * }
     */
    public interface change_event {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2);
        static MemorySegment allocate(change_event fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1257.const$1, fi, constants$62.const$0, scope);
        }
        static change_event ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2) -> {
                try {
                    return (int)constants$958.const$2.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle change_event$VH() {
        return constants$1257.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*change_event)(struct _GSettings*,unsigned int*,int);
     * }
     */
    public static MemorySegment change_event$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1257.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*change_event)(struct _GSettings*,unsigned int*,int);
     * }
     */
    public static void change_event$set(MemorySegment seg, MemorySegment x) {
        constants$1257.const$2.set(seg, x);
    }
    public static MemorySegment change_event$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1257.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void change_event$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1257.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static change_event change_event(MemorySegment segment, Arena scope) {
        return change_event.ofAddress(change_event$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(168, 160);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


