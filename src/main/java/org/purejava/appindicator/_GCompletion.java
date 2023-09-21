// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GCompletion {
 *     struct _GList* items;
 *     char* (*func)(void*);
 *     char* prefix;
 *     struct _GList* cache;
 *     int (*strncmp_func)(char*,char*,unsigned long);
 * };
 * }
 */
public class _GCompletion {

    public static MemoryLayout $LAYOUT() {
        return constants$496.const$3;
    }
    public static VarHandle items$VH() {
        return constants$496.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GList* items;
     * }
     */
    public static MemorySegment items$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$496.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GList* items;
     * }
     */
    public static void items$set(MemorySegment seg, MemorySegment x) {
        constants$496.const$4.set(seg, x);
    }
    public static MemorySegment items$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$496.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void items$set(MemorySegment seg, long index, MemorySegment x) {
        constants$496.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * char* (*func)(void*);
     * }
     */
    public interface func {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(func fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$496.const$5, fi, constants$5.const$2, scope);
        }
        static func ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle func$VH() {
        return constants$497.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*func)(void*);
     * }
     */
    public static MemorySegment func$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$497.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*func)(void*);
     * }
     */
    public static void func$set(MemorySegment seg, MemorySegment x) {
        constants$497.const$0.set(seg, x);
    }
    public static MemorySegment func$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$497.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void func$set(MemorySegment seg, long index, MemorySegment x) {
        constants$497.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static func func(MemorySegment segment, Arena scope) {
        return func.ofAddress(func$get(segment), scope);
    }
    public static VarHandle prefix$VH() {
        return constants$497.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* prefix;
     * }
     */
    public static MemorySegment prefix$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$497.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* prefix;
     * }
     */
    public static void prefix$set(MemorySegment seg, MemorySegment x) {
        constants$497.const$1.set(seg, x);
    }
    public static MemorySegment prefix$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$497.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void prefix$set(MemorySegment seg, long index, MemorySegment x) {
        constants$497.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cache$VH() {
        return constants$497.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GList* cache;
     * }
     */
    public static MemorySegment cache$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$497.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GList* cache;
     * }
     */
    public static void cache$set(MemorySegment seg, MemorySegment x) {
        constants$497.const$2.set(seg, x);
    }
    public static MemorySegment cache$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$497.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cache$set(MemorySegment seg, long index, MemorySegment x) {
        constants$497.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * int (*strncmp_func)(char*,char*,unsigned long);
     * }
     */
    public interface strncmp_func {

        int apply(java.lang.foreign.MemorySegment s1, java.lang.foreign.MemorySegment s2, long n);
        static MemorySegment allocate(strncmp_func fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$497.const$3, fi, constants$18.const$2, scope);
        }
        static strncmp_func ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _s1, java.lang.foreign.MemorySegment _s2, long _n) -> {
                try {
                    return (int)constants$496.const$2.invokeExact(symbol, _s1, _s2, _n);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle strncmp_func$VH() {
        return constants$497.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*strncmp_func)(char*,char*,unsigned long);
     * }
     */
    public static MemorySegment strncmp_func$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$497.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*strncmp_func)(char*,char*,unsigned long);
     * }
     */
    public static void strncmp_func$set(MemorySegment seg, MemorySegment x) {
        constants$497.const$4.set(seg, x);
    }
    public static MemorySegment strncmp_func$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$497.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void strncmp_func$set(MemorySegment seg, long index, MemorySegment x) {
        constants$497.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static strncmp_func strncmp_func(MemorySegment segment, Arena scope) {
        return strncmp_func.ofAddress(strncmp_func$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

