// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct elf_prpsinfo {
 *     char pr_state;
 *     char pr_sname;
 *     char pr_zomb;
 *     char pr_nice;
 *     unsigned long pr_flag;
 *     unsigned int pr_uid;
 *     unsigned int pr_gid;
 *     int pr_pid;
 *     int pr_ppid;
 *     int pr_pgrp;
 *     int pr_sid;
 *     char pr_fname[16];
 *     char pr_psargs[80];
 * };
 * }
 */
public class elf_prpsinfo {

    public static MemoryLayout $LAYOUT() {
        return constants$140.const$5;
    }
    public static VarHandle pr_state$VH() {
        return constants$141.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char pr_state;
     * }
     */
    public static byte pr_state$get(MemorySegment seg) {
        return (byte)constants$141.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char pr_state;
     * }
     */
    public static void pr_state$set(MemorySegment seg, byte x) {
        constants$141.const$0.set(seg, x);
    }
    public static byte pr_state$get(MemorySegment seg, long index) {
        return (byte)constants$141.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pr_state$set(MemorySegment seg, long index, byte x) {
        constants$141.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pr_sname$VH() {
        return constants$141.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char pr_sname;
     * }
     */
    public static byte pr_sname$get(MemorySegment seg) {
        return (byte)constants$141.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char pr_sname;
     * }
     */
    public static void pr_sname$set(MemorySegment seg, byte x) {
        constants$141.const$1.set(seg, x);
    }
    public static byte pr_sname$get(MemorySegment seg, long index) {
        return (byte)constants$141.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pr_sname$set(MemorySegment seg, long index, byte x) {
        constants$141.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pr_zomb$VH() {
        return constants$141.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char pr_zomb;
     * }
     */
    public static byte pr_zomb$get(MemorySegment seg) {
        return (byte)constants$141.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char pr_zomb;
     * }
     */
    public static void pr_zomb$set(MemorySegment seg, byte x) {
        constants$141.const$2.set(seg, x);
    }
    public static byte pr_zomb$get(MemorySegment seg, long index) {
        return (byte)constants$141.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pr_zomb$set(MemorySegment seg, long index, byte x) {
        constants$141.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pr_nice$VH() {
        return constants$141.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char pr_nice;
     * }
     */
    public static byte pr_nice$get(MemorySegment seg) {
        return (byte)constants$141.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char pr_nice;
     * }
     */
    public static void pr_nice$set(MemorySegment seg, byte x) {
        constants$141.const$3.set(seg, x);
    }
    public static byte pr_nice$get(MemorySegment seg, long index) {
        return (byte)constants$141.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pr_nice$set(MemorySegment seg, long index, byte x) {
        constants$141.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pr_flag$VH() {
        return constants$141.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long pr_flag;
     * }
     */
    public static long pr_flag$get(MemorySegment seg) {
        return (long)constants$141.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long pr_flag;
     * }
     */
    public static void pr_flag$set(MemorySegment seg, long x) {
        constants$141.const$4.set(seg, x);
    }
    public static long pr_flag$get(MemorySegment seg, long index) {
        return (long)constants$141.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pr_flag$set(MemorySegment seg, long index, long x) {
        constants$141.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pr_uid$VH() {
        return constants$141.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int pr_uid;
     * }
     */
    public static int pr_uid$get(MemorySegment seg) {
        return (int)constants$141.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int pr_uid;
     * }
     */
    public static void pr_uid$set(MemorySegment seg, int x) {
        constants$141.const$5.set(seg, x);
    }
    public static int pr_uid$get(MemorySegment seg, long index) {
        return (int)constants$141.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pr_uid$set(MemorySegment seg, long index, int x) {
        constants$141.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pr_gid$VH() {
        return constants$142.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int pr_gid;
     * }
     */
    public static int pr_gid$get(MemorySegment seg) {
        return (int)constants$142.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int pr_gid;
     * }
     */
    public static void pr_gid$set(MemorySegment seg, int x) {
        constants$142.const$0.set(seg, x);
    }
    public static int pr_gid$get(MemorySegment seg, long index) {
        return (int)constants$142.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pr_gid$set(MemorySegment seg, long index, int x) {
        constants$142.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pr_pid$VH() {
        return constants$142.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pr_pid;
     * }
     */
    public static int pr_pid$get(MemorySegment seg) {
        return (int)constants$142.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pr_pid;
     * }
     */
    public static void pr_pid$set(MemorySegment seg, int x) {
        constants$142.const$1.set(seg, x);
    }
    public static int pr_pid$get(MemorySegment seg, long index) {
        return (int)constants$142.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pr_pid$set(MemorySegment seg, long index, int x) {
        constants$142.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pr_ppid$VH() {
        return constants$142.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pr_ppid;
     * }
     */
    public static int pr_ppid$get(MemorySegment seg) {
        return (int)constants$142.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pr_ppid;
     * }
     */
    public static void pr_ppid$set(MemorySegment seg, int x) {
        constants$142.const$2.set(seg, x);
    }
    public static int pr_ppid$get(MemorySegment seg, long index) {
        return (int)constants$142.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pr_ppid$set(MemorySegment seg, long index, int x) {
        constants$142.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pr_pgrp$VH() {
        return constants$142.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pr_pgrp;
     * }
     */
    public static int pr_pgrp$get(MemorySegment seg) {
        return (int)constants$142.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pr_pgrp;
     * }
     */
    public static void pr_pgrp$set(MemorySegment seg, int x) {
        constants$142.const$3.set(seg, x);
    }
    public static int pr_pgrp$get(MemorySegment seg, long index) {
        return (int)constants$142.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pr_pgrp$set(MemorySegment seg, long index, int x) {
        constants$142.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pr_sid$VH() {
        return constants$142.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pr_sid;
     * }
     */
    public static int pr_sid$get(MemorySegment seg) {
        return (int)constants$142.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pr_sid;
     * }
     */
    public static void pr_sid$set(MemorySegment seg, int x) {
        constants$142.const$4.set(seg, x);
    }
    public static int pr_sid$get(MemorySegment seg, long index) {
        return (int)constants$142.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pr_sid$set(MemorySegment seg, long index, int x) {
        constants$142.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment pr_fname$slice(MemorySegment seg) {
        return seg.asSlice(40, 16);
    }
    public static MemorySegment pr_psargs$slice(MemorySegment seg) {
        return seg.asSlice(56, 80);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


