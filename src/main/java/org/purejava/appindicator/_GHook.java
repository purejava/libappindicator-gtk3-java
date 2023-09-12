// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GHook {
 *     void* data;
 *     struct _GHook* next;
 *     struct _GHook* prev;
 *     unsigned int ref_count;
 *     unsigned long hook_id;
 *     unsigned int flags;
 *     void* func;
 *     void (*destroy)(void*);
 * };
 * }
 */
public class _GHook {

    public static MemoryLayout $LAYOUT() {
        return constants$240.const$1;
    }
    public static VarHandle data$VH() {
        return constants$240.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* data;
     * }
     */
    public static MemorySegment data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$240.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* data;
     * }
     */
    public static void data$set(MemorySegment seg, MemorySegment x) {
        constants$240.const$2.set(seg, x);
    }
    public static MemorySegment data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$240.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemorySegment x) {
        constants$240.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle next$VH() {
        return constants$240.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GHook* next;
     * }
     */
    public static MemorySegment next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$240.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GHook* next;
     * }
     */
    public static void next$set(MemorySegment seg, MemorySegment x) {
        constants$240.const$3.set(seg, x);
    }
    public static MemorySegment next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$240.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemorySegment x) {
        constants$240.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle prev$VH() {
        return constants$240.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GHook* prev;
     * }
     */
    public static MemorySegment prev$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$240.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GHook* prev;
     * }
     */
    public static void prev$set(MemorySegment seg, MemorySegment x) {
        constants$240.const$4.set(seg, x);
    }
    public static MemorySegment prev$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$240.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void prev$set(MemorySegment seg, long index, MemorySegment x) {
        constants$240.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ref_count$VH() {
        return constants$240.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int ref_count;
     * }
     */
    public static int ref_count$get(MemorySegment seg) {
        return (int)constants$240.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int ref_count;
     * }
     */
    public static void ref_count$set(MemorySegment seg, int x) {
        constants$240.const$5.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)constants$240.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        constants$240.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hook_id$VH() {
        return constants$241.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long hook_id;
     * }
     */
    public static long hook_id$get(MemorySegment seg) {
        return (long)constants$241.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long hook_id;
     * }
     */
    public static void hook_id$set(MemorySegment seg, long x) {
        constants$241.const$0.set(seg, x);
    }
    public static long hook_id$get(MemorySegment seg, long index) {
        return (long)constants$241.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void hook_id$set(MemorySegment seg, long index, long x) {
        constants$241.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$241.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$241.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$241.const$1.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$241.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$241.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle func$VH() {
        return constants$241.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* func;
     * }
     */
    public static MemorySegment func$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$241.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* func;
     * }
     */
    public static void func$set(MemorySegment seg, MemorySegment x) {
        constants$241.const$2.set(seg, x);
    }
    public static MemorySegment func$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$241.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void func$set(MemorySegment seg, long index, MemorySegment x) {
        constants$241.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * void (*destroy)(void*);
     * }
     */
    public interface destroy {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(destroy fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$241.const$3, fi, constants$13.const$1, scope);
        }
        static destroy ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle destroy$VH() {
        return constants$241.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*destroy)(void*);
     * }
     */
    public static MemorySegment destroy$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$241.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*destroy)(void*);
     * }
     */
    public static void destroy$set(MemorySegment seg, MemorySegment x) {
        constants$241.const$4.set(seg, x);
    }
    public static MemorySegment destroy$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$241.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void destroy$set(MemorySegment seg, long index, MemorySegment x) {
        constants$241.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static destroy destroy(MemorySegment segment, Arena scope) {
        return destroy.ofAddress(destroy$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


