// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
/**
 * {@snippet :
 * struct __pthread_unwind_buf_t {
 *     struct __cancel_jmp_buf_tag __cancel_jmp_buf[1];
 *     void* __pad[4];
 * };
 * }
 */
public class __pthread_unwind_buf_t {

    public static MemoryLayout $LAYOUT() {
        return constants$523.const$2;
    }
    public static MemorySegment __cancel_jmp_buf$slice(MemorySegment seg) {
        return seg.asSlice(0, 184);
    }
    public static MemorySegment __pad$slice(MemorySegment seg) {
        return seg.asSlice(184, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


