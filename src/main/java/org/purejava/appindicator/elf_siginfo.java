// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct elf_siginfo {
 *     int si_signo;
 *     int si_code;
 *     int si_errno;
 * };
 * }
 */
public class elf_siginfo {

    public static MemoryLayout $LAYOUT() {
        return constants$138.const$4;
    }
    public static VarHandle si_signo$VH() {
        return constants$138.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int si_signo;
     * }
     */
    public static int si_signo$get(MemorySegment seg) {
        return (int)constants$138.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int si_signo;
     * }
     */
    public static void si_signo$set(MemorySegment seg, int x) {
        constants$138.const$5.set(seg, x);
    }
    public static int si_signo$get(MemorySegment seg, long index) {
        return (int)constants$138.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void si_signo$set(MemorySegment seg, long index, int x) {
        constants$138.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle si_code$VH() {
        return constants$139.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int si_code;
     * }
     */
    public static int si_code$get(MemorySegment seg) {
        return (int)constants$139.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int si_code;
     * }
     */
    public static void si_code$set(MemorySegment seg, int x) {
        constants$139.const$0.set(seg, x);
    }
    public static int si_code$get(MemorySegment seg, long index) {
        return (int)constants$139.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void si_code$set(MemorySegment seg, long index, int x) {
        constants$139.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle si_errno$VH() {
        return constants$139.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int si_errno;
     * }
     */
    public static int si_errno$get(MemorySegment seg) {
        return (int)constants$139.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int si_errno;
     * }
     */
    public static void si_errno$set(MemorySegment seg, int x) {
        constants$139.const$1.set(seg, x);
    }
    public static int si_errno$get(MemorySegment seg, long index) {
        return (int)constants$139.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void si_errno$set(MemorySegment seg, long index, int x) {
        constants$139.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


