// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct sigcontext {
 *     unsigned long long fault_address;
 *     unsigned long long regs[31];
 *     unsigned long long sp;
 *     unsigned long long pc;
 *     unsigned long long pstate;
 *     unsigned char __reserved[4096];
 * };
 * }
 */
public class sigcontext {

    public static MemoryLayout $LAYOUT() {
        return constants$130.const$3;
    }
    public static VarHandle fault_address$VH() {
        return constants$130.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long long fault_address;
     * }
     */
    public static long fault_address$get(MemorySegment seg) {
        return (long)constants$130.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long long fault_address;
     * }
     */
    public static void fault_address$set(MemorySegment seg, long x) {
        constants$130.const$4.set(seg, x);
    }
    public static long fault_address$get(MemorySegment seg, long index) {
        return (long)constants$130.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void fault_address$set(MemorySegment seg, long index, long x) {
        constants$130.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment regs$slice(MemorySegment seg) {
        return seg.asSlice(8, 248);
    }
    public static VarHandle sp$VH() {
        return constants$130.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long long sp;
     * }
     */
    public static long sp$get(MemorySegment seg) {
        return (long)constants$130.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long long sp;
     * }
     */
    public static void sp$set(MemorySegment seg, long x) {
        constants$130.const$5.set(seg, x);
    }
    public static long sp$get(MemorySegment seg, long index) {
        return (long)constants$130.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sp$set(MemorySegment seg, long index, long x) {
        constants$130.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pc$VH() {
        return constants$131.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long long pc;
     * }
     */
    public static long pc$get(MemorySegment seg) {
        return (long)constants$131.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long long pc;
     * }
     */
    public static void pc$set(MemorySegment seg, long x) {
        constants$131.const$0.set(seg, x);
    }
    public static long pc$get(MemorySegment seg, long index) {
        return (long)constants$131.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pc$set(MemorySegment seg, long index, long x) {
        constants$131.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pstate$VH() {
        return constants$131.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long long pstate;
     * }
     */
    public static long pstate$get(MemorySegment seg) {
        return (long)constants$131.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long long pstate;
     * }
     */
    public static void pstate$set(MemorySegment seg, long x) {
        constants$131.const$1.set(seg, x);
    }
    public static long pstate$get(MemorySegment seg, long index) {
        return (long)constants$131.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pstate$set(MemorySegment seg, long index, long x) {
        constants$131.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __reserved$slice(MemorySegment seg) {
        return seg.asSlice(288, 4096);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


