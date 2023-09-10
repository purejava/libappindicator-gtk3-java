// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GTypeValueTable {
 *     void (*value_init)(struct _GValue*);
 *     void (*value_free)(struct _GValue*);
 *     void (*value_copy)(struct _GValue*,struct _GValue*);
 *     void* (*value_peek_pointer)(struct _GValue*);
 *     char* collect_format;
 *     char* (*collect_value)(struct _GValue*,unsigned int,union _GTypeCValue*,unsigned int);
 *     char* lcopy_format;
 *     char* (*lcopy_value)(struct _GValue*,unsigned int,union _GTypeCValue*,unsigned int);
 * };
 * }
 */
public class _GTypeValueTable {

    public static MemoryLayout $LAYOUT() {
        return constants$557.const$2;
    }
    /**
     * {@snippet :
 * void (*value_init)(struct _GValue*);
     * }
     */
    public interface value_init {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(value_init fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$557.const$3, fi, constants$13.const$1, scope);
        }
        static value_init ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle value_init$VH() {
        return constants$557.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*value_init)(struct _GValue*);
     * }
     */
    public static MemorySegment value_init$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$557.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*value_init)(struct _GValue*);
     * }
     */
    public static void value_init$set(MemorySegment seg, MemorySegment x) {
        constants$557.const$4.set(seg, x);
    }
    public static MemorySegment value_init$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$557.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void value_init$set(MemorySegment seg, long index, MemorySegment x) {
        constants$557.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static value_init value_init(MemorySegment segment, Arena scope) {
        return value_init.ofAddress(value_init$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*value_free)(struct _GValue*);
     * }
     */
    public interface value_free {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(value_free fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$557.const$5, fi, constants$13.const$1, scope);
        }
        static value_free ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle value_free$VH() {
        return constants$558.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*value_free)(struct _GValue*);
     * }
     */
    public static MemorySegment value_free$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$558.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*value_free)(struct _GValue*);
     * }
     */
    public static void value_free$set(MemorySegment seg, MemorySegment x) {
        constants$558.const$0.set(seg, x);
    }
    public static MemorySegment value_free$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$558.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void value_free$set(MemorySegment seg, long index, MemorySegment x) {
        constants$558.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static value_free value_free(MemorySegment segment, Arena scope) {
        return value_free.ofAddress(value_free$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*value_copy)(struct _GValue*,struct _GValue*);
     * }
     */
    public interface value_copy {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(value_copy fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$558.const$1, fi, constants$13.const$4, scope);
        }
        static value_copy ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle value_copy$VH() {
        return constants$558.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*value_copy)(struct _GValue*,struct _GValue*);
     * }
     */
    public static MemorySegment value_copy$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$558.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*value_copy)(struct _GValue*,struct _GValue*);
     * }
     */
    public static void value_copy$set(MemorySegment seg, MemorySegment x) {
        constants$558.const$2.set(seg, x);
    }
    public static MemorySegment value_copy$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$558.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void value_copy$set(MemorySegment seg, long index, MemorySegment x) {
        constants$558.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static value_copy value_copy(MemorySegment segment, Arena scope) {
        return value_copy.ofAddress(value_copy$get(segment), scope);
    }
    /**
     * {@snippet :
 * void* (*value_peek_pointer)(struct _GValue*);
     * }
     */
    public interface value_peek_pointer {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(value_peek_pointer fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$558.const$3, fi, constants$5.const$2, scope);
        }
        static value_peek_pointer ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$99.const$0.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle value_peek_pointer$VH() {
        return constants$558.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* (*value_peek_pointer)(struct _GValue*);
     * }
     */
    public static MemorySegment value_peek_pointer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$558.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* (*value_peek_pointer)(struct _GValue*);
     * }
     */
    public static void value_peek_pointer$set(MemorySegment seg, MemorySegment x) {
        constants$558.const$4.set(seg, x);
    }
    public static MemorySegment value_peek_pointer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$558.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void value_peek_pointer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$558.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static value_peek_pointer value_peek_pointer(MemorySegment segment, Arena scope) {
        return value_peek_pointer.ofAddress(value_peek_pointer$get(segment), scope);
    }
    public static VarHandle collect_format$VH() {
        return constants$558.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* collect_format;
     * }
     */
    public static MemorySegment collect_format$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$558.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* collect_format;
     * }
     */
    public static void collect_format$set(MemorySegment seg, MemorySegment x) {
        constants$558.const$5.set(seg, x);
    }
    public static MemorySegment collect_format$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$558.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void collect_format$set(MemorySegment seg, long index, MemorySegment x) {
        constants$558.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * char* (*collect_value)(struct _GValue*,unsigned int,union _GTypeCValue*,unsigned int);
     * }
     */
    public interface collect_value {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, int _x3);
        static MemorySegment allocate(collect_value fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$559.const$0, fi, constants$33.const$0, scope);
        }
        static collect_value ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, int __x3) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$559.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle collect_value$VH() {
        return constants$559.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*collect_value)(struct _GValue*,unsigned int,union _GTypeCValue*,unsigned int);
     * }
     */
    public static MemorySegment collect_value$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$559.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*collect_value)(struct _GValue*,unsigned int,union _GTypeCValue*,unsigned int);
     * }
     */
    public static void collect_value$set(MemorySegment seg, MemorySegment x) {
        constants$559.const$2.set(seg, x);
    }
    public static MemorySegment collect_value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$559.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void collect_value$set(MemorySegment seg, long index, MemorySegment x) {
        constants$559.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static collect_value collect_value(MemorySegment segment, Arena scope) {
        return collect_value.ofAddress(collect_value$get(segment), scope);
    }
    public static VarHandle lcopy_format$VH() {
        return constants$559.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* lcopy_format;
     * }
     */
    public static MemorySegment lcopy_format$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$559.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* lcopy_format;
     * }
     */
    public static void lcopy_format$set(MemorySegment seg, MemorySegment x) {
        constants$559.const$3.set(seg, x);
    }
    public static MemorySegment lcopy_format$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$559.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void lcopy_format$set(MemorySegment seg, long index, MemorySegment x) {
        constants$559.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * char* (*lcopy_value)(struct _GValue*,unsigned int,union _GTypeCValue*,unsigned int);
     * }
     */
    public interface lcopy_value {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, int _x3);
        static MemorySegment allocate(lcopy_value fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$559.const$4, fi, constants$33.const$0, scope);
        }
        static lcopy_value ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, int __x3) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$559.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle lcopy_value$VH() {
        return constants$559.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*lcopy_value)(struct _GValue*,unsigned int,union _GTypeCValue*,unsigned int);
     * }
     */
    public static MemorySegment lcopy_value$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$559.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*lcopy_value)(struct _GValue*,unsigned int,union _GTypeCValue*,unsigned int);
     * }
     */
    public static void lcopy_value$set(MemorySegment seg, MemorySegment x) {
        constants$559.const$5.set(seg, x);
    }
    public static MemorySegment lcopy_value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$559.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void lcopy_value$set(MemorySegment seg, long index, MemorySegment x) {
        constants$559.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static lcopy_value lcopy_value(MemorySegment segment, Arena scope) {
        return lcopy_value.ofAddress(lcopy_value$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


