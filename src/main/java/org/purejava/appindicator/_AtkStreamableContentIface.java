// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _AtkStreamableContentIface {
 *     struct _GTypeInterface parent;
 *     int (*get_n_mime_types)(struct _AtkStreamableContent*);
 *     char* (*get_mime_type)(struct _AtkStreamableContent*,int);
 *     struct _GIOChannel* (*get_stream)(struct _AtkStreamableContent*,char*);
 *     char* (*get_uri)(struct _AtkStreamableContent*,char*);
 *     int (*pad1)(void*);
 *     int (*pad2)(void*);
 *     int (*pad3)(void*);
 * };
 * }
 */
public class _AtkStreamableContentIface {

    public static MemoryLayout $LAYOUT() {
        return constants$2064.const$0;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
 * int (*get_n_mime_types)(struct _AtkStreamableContent*);
     * }
     */
    public interface get_n_mime_types {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_n_mime_types fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2064.const$1, fi, constants$10.const$5, scope);
        }
        static get_n_mime_types ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_n_mime_types$VH() {
        return constants$2064.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*get_n_mime_types)(struct _AtkStreamableContent*);
     * }
     */
    public static MemorySegment get_n_mime_types$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2064.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*get_n_mime_types)(struct _AtkStreamableContent*);
     * }
     */
    public static void get_n_mime_types$set(MemorySegment seg, MemorySegment x) {
        constants$2064.const$2.set(seg, x);
    }
    public static MemorySegment get_n_mime_types$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2064.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void get_n_mime_types$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2064.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_n_mime_types get_n_mime_types(MemorySegment segment, Arena scope) {
        return get_n_mime_types.ofAddress(get_n_mime_types$get(segment), scope);
    }
    /**
     * {@snippet :
 * char* (*get_mime_type)(struct _AtkStreamableContent*,int);
     * }
     */
    public interface get_mime_type {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(get_mime_type fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2064.const$3, fi, constants$21.const$3, scope);
        }
        static get_mime_type ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$318.const$0.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_mime_type$VH() {
        return constants$2064.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_mime_type)(struct _AtkStreamableContent*,int);
     * }
     */
    public static MemorySegment get_mime_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2064.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_mime_type)(struct _AtkStreamableContent*,int);
     * }
     */
    public static void get_mime_type$set(MemorySegment seg, MemorySegment x) {
        constants$2064.const$4.set(seg, x);
    }
    public static MemorySegment get_mime_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2064.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void get_mime_type$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2064.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_mime_type get_mime_type(MemorySegment segment, Arena scope) {
        return get_mime_type.ofAddress(get_mime_type$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GIOChannel* (*get_stream)(struct _AtkStreamableContent*,char*);
     * }
     */
    public interface get_stream {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment func_data);
        static MemorySegment allocate(get_stream fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2064.const$5, fi, constants$5.const$5, scope);
        }
        static get_stream ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _func_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$15.const$1.invokeExact(symbol, _path, _func_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_stream$VH() {
        return constants$2065.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GIOChannel* (*get_stream)(struct _AtkStreamableContent*,char*);
     * }
     */
    public static MemorySegment get_stream$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2065.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GIOChannel* (*get_stream)(struct _AtkStreamableContent*,char*);
     * }
     */
    public static void get_stream$set(MemorySegment seg, MemorySegment x) {
        constants$2065.const$0.set(seg, x);
    }
    public static MemorySegment get_stream$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2065.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void get_stream$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2065.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_stream get_stream(MemorySegment segment, Arena scope) {
        return get_stream.ofAddress(get_stream$get(segment), scope);
    }
    /**
     * {@snippet :
 * char* (*get_uri)(struct _AtkStreamableContent*,char*);
     * }
     */
    public interface get_uri {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment func_data);
        static MemorySegment allocate(get_uri fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2065.const$1, fi, constants$5.const$5, scope);
        }
        static get_uri ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _func_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$15.const$1.invokeExact(symbol, _path, _func_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_uri$VH() {
        return constants$2065.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_uri)(struct _AtkStreamableContent*,char*);
     * }
     */
    public static MemorySegment get_uri$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2065.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_uri)(struct _AtkStreamableContent*,char*);
     * }
     */
    public static void get_uri$set(MemorySegment seg, MemorySegment x) {
        constants$2065.const$2.set(seg, x);
    }
    public static MemorySegment get_uri$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2065.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void get_uri$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2065.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_uri get_uri(MemorySegment segment, Arena scope) {
        return get_uri.ofAddress(get_uri$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*pad1)(void*);
     * }
     */
    public interface pad1 {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(pad1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2065.const$3, fi, constants$10.const$5, scope);
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
        return constants$2065.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*pad1)(void*);
     * }
     */
    public static MemorySegment pad1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2065.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*pad1)(void*);
     * }
     */
    public static void pad1$set(MemorySegment seg, MemorySegment x) {
        constants$2065.const$4.set(seg, x);
    }
    public static MemorySegment pad1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2065.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pad1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2065.const$4.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2065.const$5, fi, constants$10.const$5, scope);
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
        return constants$2066.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*pad2)(void*);
     * }
     */
    public static MemorySegment pad2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2066.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*pad2)(void*);
     * }
     */
    public static void pad2$set(MemorySegment seg, MemorySegment x) {
        constants$2066.const$0.set(seg, x);
    }
    public static MemorySegment pad2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2066.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pad2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2066.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static pad2 pad2(MemorySegment segment, Arena scope) {
        return pad2.ofAddress(pad2$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*pad3)(void*);
     * }
     */
    public interface pad3 {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(pad3 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2066.const$1, fi, constants$10.const$5, scope);
        }
        static pad3 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle pad3$VH() {
        return constants$2066.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*pad3)(void*);
     * }
     */
    public static MemorySegment pad3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2066.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*pad3)(void*);
     * }
     */
    public static void pad3$set(MemorySegment seg, MemorySegment x) {
        constants$2066.const$2.set(seg, x);
    }
    public static MemorySegment pad3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2066.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pad3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2066.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static pad3 pad3(MemorySegment segment, Arena scope) {
        return pad3.ofAddress(pad3$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


