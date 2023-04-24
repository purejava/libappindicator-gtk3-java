// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _xstate {
 *     struct _fpstate fpstate;
 *     struct _xsave_hdr xstate_hdr;
 *     struct _ymmh_state ymmh;
 * };
 * }
 */
public class _xstate {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("cwd"),
            Constants$root.C_SHORT$LAYOUT.withName("swd"),
            Constants$root.C_SHORT$LAYOUT.withName("ftw"),
            Constants$root.C_SHORT$LAYOUT.withName("fop"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("rip"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("rdp"),
            Constants$root.C_INT$LAYOUT.withName("mxcsr"),
            Constants$root.C_INT$LAYOUT.withName("mxcr_mask"),
            MemoryLayout.sequenceLayout(8, MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(4, Constants$root.C_SHORT$LAYOUT).withName("significand"),
                Constants$root.C_SHORT$LAYOUT.withName("exponent"),
                MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("__glibc_reserved1")
            ).withName("_fpxreg")).withName("_st"),
            MemoryLayout.sequenceLayout(16, MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(4, Constants$root.C_INT$LAYOUT).withName("element")
            ).withName("_xmmreg")).withName("_xmm"),
            MemoryLayout.sequenceLayout(24, Constants$root.C_INT$LAYOUT).withName("__glibc_reserved1")
        ).withName("fpstate"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("xstate_bv"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_LONG_LONG$LAYOUT).withName("__glibc_reserved1"),
            MemoryLayout.sequenceLayout(5, Constants$root.C_LONG_LONG$LAYOUT).withName("__glibc_reserved2")
        ).withName("xstate_hdr"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, Constants$root.C_INT$LAYOUT).withName("ymmh_space")
        ).withName("ymmh")
    ).withName("_xstate");
    public static MemoryLayout $LAYOUT() {
        return _xstate.$struct$LAYOUT;
    }
    public static MemorySegment fpstate$slice(MemorySegment seg) {
        return seg.asSlice(0, 512);
    }
    public static MemorySegment xstate_hdr$slice(MemorySegment seg) {
        return seg.asSlice(512, 64);
    }
    public static MemorySegment ymmh$slice(MemorySegment seg) {
        return seg.asSlice(576, 256);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

