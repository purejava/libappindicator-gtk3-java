// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GParamSpecOverride {
 *     struct _GParamSpec parent_instance;
 *     struct _GParamSpec* overridden;
 * };
 * }
 */
public class _GParamSpecOverride {

    public static MemoryLayout $LAYOUT() {
        return constants$665.const$0;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    public static VarHandle overridden$VH() {
        return constants$665.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GParamSpec* overridden;
     * }
     */
    public static MemorySegment overridden$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$665.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GParamSpec* overridden;
     * }
     */
    public static void overridden$set(MemorySegment seg, MemorySegment x) {
        constants$665.const$1.set(seg, x);
    }
    public static MemorySegment overridden$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$665.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void overridden$set(MemorySegment seg, long index, MemorySegment x) {
        constants$665.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

