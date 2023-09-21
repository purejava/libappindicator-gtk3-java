// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GSocketControlMessageClass {
 *     struct _GObjectClass parent_class;
 *     unsigned long (*get_size)(struct _GSocketControlMessage*);
 *     int (*get_level)(struct _GSocketControlMessage*);
 *     int (*get_type)(struct _GSocketControlMessage*);
 *     void (*serialize)(struct _GSocketControlMessage*,void*);
 *     struct _GSocketControlMessage* (*deserialize)(int,int,unsigned long,void*);
 *     void (*_g_reserved1)();
 *     void (*_g_reserved2)();
 *     void (*_g_reserved3)();
 *     void (*_g_reserved4)();
 *     void (*_g_reserved5)();
 * };
 * }
 */
public class _GSocketControlMessageClass {

    public static MemoryLayout $LAYOUT() {
        return constants$1305.const$5;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * unsigned long (*get_size)(struct _GSocketControlMessage*);
     * }
     */
    public interface get_size {

        long apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(get_size fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1306.const$0, fi, constants$4.const$0, scope);
        }
        static get_size ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (long)constants$1065.const$3.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_size$VH() {
        return constants$1306.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long (*get_size)(struct _GSocketControlMessage*);
     * }
     */
    public static MemorySegment get_size$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1306.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long (*get_size)(struct _GSocketControlMessage*);
     * }
     */
    public static void get_size$set(MemorySegment seg, MemorySegment x) {
        constants$1306.const$1.set(seg, x);
    }
    public static MemorySegment get_size$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1306.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void get_size$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1306.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_size get_size(MemorySegment segment, Arena scope) {
        return get_size.ofAddress(get_size$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*get_level)(struct _GSocketControlMessage*);
     * }
     */
    public interface get_level {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_level fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1306.const$2, fi, constants$10.const$5, scope);
        }
        static get_level ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_level$VH() {
        return constants$1306.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*get_level)(struct _GSocketControlMessage*);
     * }
     */
    public static MemorySegment get_level$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1306.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*get_level)(struct _GSocketControlMessage*);
     * }
     */
    public static void get_level$set(MemorySegment seg, MemorySegment x) {
        constants$1306.const$3.set(seg, x);
    }
    public static MemorySegment get_level$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1306.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void get_level$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1306.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_level get_level(MemorySegment segment, Arena scope) {
        return get_level.ofAddress(get_level$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*get_type)(struct _GSocketControlMessage*);
     * }
     */
    public interface get_type {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_type fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1306.const$4, fi, constants$10.const$5, scope);
        }
        static get_type ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_type$VH() {
        return constants$1306.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*get_type)(struct _GSocketControlMessage*);
     * }
     */
    public static MemorySegment get_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1306.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*get_type)(struct _GSocketControlMessage*);
     * }
     */
    public static void get_type$set(MemorySegment seg, MemorySegment x) {
        constants$1306.const$5.set(seg, x);
    }
    public static MemorySegment get_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1306.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void get_type$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1306.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_type get_type(MemorySegment segment, Arena scope) {
        return get_type.ofAddress(get_type$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*serialize)(struct _GSocketControlMessage*,void*);
     * }
     */
    public interface serialize {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(serialize fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1307.const$0, fi, constants$13.const$4, scope);
        }
        static serialize ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle serialize$VH() {
        return constants$1307.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*serialize)(struct _GSocketControlMessage*,void*);
     * }
     */
    public static MemorySegment serialize$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1307.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*serialize)(struct _GSocketControlMessage*,void*);
     * }
     */
    public static void serialize$set(MemorySegment seg, MemorySegment x) {
        constants$1307.const$1.set(seg, x);
    }
    public static MemorySegment serialize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1307.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void serialize$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1307.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static serialize serialize(MemorySegment segment, Arena scope) {
        return serialize.ofAddress(serialize$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GSocketControlMessage* (*deserialize)(int,int,unsigned long,void*);
     * }
     */
    public interface deserialize {

        java.lang.foreign.MemorySegment apply(int _x0, int _x1, long _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(deserialize fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1307.const$3, fi, constants$1307.const$2, scope);
        }
        static deserialize ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (int __x0, int __x1, long __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$1307.const$4.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle deserialize$VH() {
        return constants$1307.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GSocketControlMessage* (*deserialize)(int,int,unsigned long,void*);
     * }
     */
    public static MemorySegment deserialize$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1307.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GSocketControlMessage* (*deserialize)(int,int,unsigned long,void*);
     * }
     */
    public static void deserialize$set(MemorySegment seg, MemorySegment x) {
        constants$1307.const$5.set(seg, x);
    }
    public static MemorySegment deserialize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1307.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void deserialize$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1307.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static deserialize deserialize(MemorySegment segment, Arena scope) {
        return deserialize.ofAddress(deserialize$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved1)();
     * }
     */
    public interface _g_reserved1 {

        void apply();
        static MemorySegment allocate(_g_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1308.const$0, fi, constants$7.const$5, scope);
        }
        static _g_reserved1 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle _g_reserved1$VH() {
        return constants$1308.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static MemorySegment _g_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1308.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static void _g_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$1308.const$1.set(seg, x);
    }
    public static MemorySegment _g_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1308.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1308.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved1 _g_reserved1(MemorySegment segment, Arena scope) {
        return _g_reserved1.ofAddress(_g_reserved1$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved2)();
     * }
     */
    public interface _g_reserved2 {

        void apply();
        static MemorySegment allocate(_g_reserved2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1308.const$2, fi, constants$7.const$5, scope);
        }
        static _g_reserved2 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle _g_reserved2$VH() {
        return constants$1308.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static MemorySegment _g_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1308.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static void _g_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$1308.const$3.set(seg, x);
    }
    public static MemorySegment _g_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1308.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1308.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved2 _g_reserved2(MemorySegment segment, Arena scope) {
        return _g_reserved2.ofAddress(_g_reserved2$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved3)();
     * }
     */
    public interface _g_reserved3 {

        void apply();
        static MemorySegment allocate(_g_reserved3 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1308.const$4, fi, constants$7.const$5, scope);
        }
        static _g_reserved3 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle _g_reserved3$VH() {
        return constants$1308.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static MemorySegment _g_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1308.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static void _g_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$1308.const$5.set(seg, x);
    }
    public static MemorySegment _g_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1308.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1308.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved3 _g_reserved3(MemorySegment segment, Arena scope) {
        return _g_reserved3.ofAddress(_g_reserved3$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved4)();
     * }
     */
    public interface _g_reserved4 {

        void apply();
        static MemorySegment allocate(_g_reserved4 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1309.const$0, fi, constants$7.const$5, scope);
        }
        static _g_reserved4 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle _g_reserved4$VH() {
        return constants$1309.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved4)();
     * }
     */
    public static MemorySegment _g_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1309.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved4)();
     * }
     */
    public static void _g_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$1309.const$1.set(seg, x);
    }
    public static MemorySegment _g_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1309.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1309.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved4 _g_reserved4(MemorySegment segment, Arena scope) {
        return _g_reserved4.ofAddress(_g_reserved4$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved5)();
     * }
     */
    public interface _g_reserved5 {

        void apply();
        static MemorySegment allocate(_g_reserved5 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1309.const$2, fi, constants$7.const$5, scope);
        }
        static _g_reserved5 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle _g_reserved5$VH() {
        return constants$1309.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved5)();
     * }
     */
    public static MemorySegment _g_reserved5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1309.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved5)();
     * }
     */
    public static void _g_reserved5$set(MemorySegment seg, MemorySegment x) {
        constants$1309.const$3.set(seg, x);
    }
    public static MemorySegment _g_reserved5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1309.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved5$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1309.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved5 _g_reserved5(MemorySegment segment, Arena scope) {
        return _g_reserved5.ofAddress(_g_reserved5$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

