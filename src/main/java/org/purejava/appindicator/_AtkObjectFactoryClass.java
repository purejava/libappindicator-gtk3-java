// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _AtkObjectFactoryClass {
 *     struct _GObjectClass parent_class;
 *     struct _AtkObject* (*create_accessible)(struct _GObject*);
 *     void (*invalidate)(struct _AtkObjectFactory*);
 *     unsigned long (*get_accessible_type)();
 *     int (*pad1)(void*);
 *     int (*pad2)(void*);
 * };
 * }
 */
public class _AtkObjectFactoryClass {

    public static MemoryLayout $LAYOUT() {
        return constants$2048.const$5;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * struct _AtkObject* (*create_accessible)(struct _GObject*);
     * }
     */
    public interface create_accessible {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(create_accessible fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2049.const$0, fi, constants$5.const$2, scope);
        }
        static create_accessible ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle create_accessible$VH() {
        return constants$2049.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _AtkObject* (*create_accessible)(struct _GObject*);
     * }
     */
    public static MemorySegment create_accessible$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2049.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _AtkObject* (*create_accessible)(struct _GObject*);
     * }
     */
    public static void create_accessible$set(MemorySegment seg, MemorySegment x) {
        constants$2049.const$1.set(seg, x);
    }
    public static MemorySegment create_accessible$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2049.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void create_accessible$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2049.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static create_accessible create_accessible(MemorySegment segment, Arena scope) {
        return create_accessible.ofAddress(create_accessible$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*invalidate)(struct _AtkObjectFactory*);
     * }
     */
    public interface invalidate {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(invalidate fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2049.const$2, fi, constants$13.const$1, scope);
        }
        static invalidate ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle invalidate$VH() {
        return constants$2049.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*invalidate)(struct _AtkObjectFactory*);
     * }
     */
    public static MemorySegment invalidate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2049.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*invalidate)(struct _AtkObjectFactory*);
     * }
     */
    public static void invalidate$set(MemorySegment seg, MemorySegment x) {
        constants$2049.const$3.set(seg, x);
    }
    public static MemorySegment invalidate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2049.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void invalidate$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2049.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static invalidate invalidate(MemorySegment segment, Arena scope) {
        return invalidate.ofAddress(invalidate$get(segment), scope);
    }
    /**
     * {@snippet :
 * unsigned long (*get_accessible_type)();
     * }
     */
    public interface get_accessible_type {

        long apply();
        static MemorySegment allocate(get_accessible_type fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2049.const$4, fi, constants$3.const$5, scope);
        }
        static get_accessible_type ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    return (long)constants$513.const$0.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_accessible_type$VH() {
        return constants$2049.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long (*get_accessible_type)();
     * }
     */
    public static MemorySegment get_accessible_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2049.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long (*get_accessible_type)();
     * }
     */
    public static void get_accessible_type$set(MemorySegment seg, MemorySegment x) {
        constants$2049.const$5.set(seg, x);
    }
    public static MemorySegment get_accessible_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2049.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void get_accessible_type$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2049.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_accessible_type get_accessible_type(MemorySegment segment, Arena scope) {
        return get_accessible_type.ofAddress(get_accessible_type$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*pad1)(void*);
     * }
     */
    public interface pad1 {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(pad1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2050.const$0, fi, constants$10.const$5, scope);
        }
        static pad1 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$14.const$2.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle pad1$VH() {
        return constants$2050.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*pad1)(void*);
     * }
     */
    public static MemorySegment pad1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2050.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*pad1)(void*);
     * }
     */
    public static void pad1$set(MemorySegment seg, MemorySegment x) {
        constants$2050.const$1.set(seg, x);
    }
    public static MemorySegment pad1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2050.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pad1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2050.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static pad1 pad1(MemorySegment segment, Arena scope) {
        return pad1.ofAddress(pad1$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*pad2)(void*);
     * }
     */
    public interface pad2 {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(pad2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2050.const$2, fi, constants$10.const$5, scope);
        }
        static pad2 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$14.const$2.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle pad2$VH() {
        return constants$2050.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*pad2)(void*);
     * }
     */
    public static MemorySegment pad2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2050.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*pad2)(void*);
     * }
     */
    public static void pad2$set(MemorySegment seg, MemorySegment x) {
        constants$2050.const$3.set(seg, x);
    }
    public static MemorySegment pad2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2050.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pad2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2050.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static pad2 pad2(MemorySegment segment, Arena scope) {
        return pad2.ofAddress(pad2$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


