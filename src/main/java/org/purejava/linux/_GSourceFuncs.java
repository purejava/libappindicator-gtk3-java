// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GSourceFuncs {
 *     gboolean (*prepare)(GSource*,gint*);
 *     gboolean (*check)(GSource*);
 *     gboolean (*dispatch)(GSource*,GSourceFunc,gpointer);
 *     void (*finalize)(GSource*);
 *     GSourceFunc closure_callback;
 *     GSourceDummyMarshal closure_marshal;
 * };
 * }
 */
public class _GSourceFuncs {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("prepare"),
        Constants$root.C_POINTER$LAYOUT.withName("check"),
        Constants$root.C_POINTER$LAYOUT.withName("dispatch"),
        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_callback"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_marshal")
    ).withName("_GSourceFuncs");
    public static MemoryLayout $LAYOUT() {
        return _GSourceFuncs.$struct$LAYOUT;
    }
    static final FunctionDescriptor prepare$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor prepare_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle prepare_UP$MH = RuntimeHelper.upcallHandle(prepare.class, "apply", _GSourceFuncs.prepare_UP$FUNC);
    static final FunctionDescriptor prepare_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle prepare_DOWN$MH = RuntimeHelper.downcallHandle(
        _GSourceFuncs.prepare_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*prepare)(GSource*,gint*);
     * }
     */
    public interface prepare {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(prepare fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GSourceFuncs.prepare_UP$MH, fi, _GSourceFuncs.prepare$FUNC, scope);
        }
        static prepare ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)_GSourceFuncs.prepare_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle prepare$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("prepare"));
    public static VarHandle prepare$VH() {
        return _GSourceFuncs.prepare$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*prepare)(GSource*,gint*);
     * }
     */
    public static MemorySegment prepare$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSourceFuncs.prepare$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*prepare)(GSource*,gint*);
     * }
     */
    public static void prepare$set(MemorySegment seg, MemorySegment x) {
        _GSourceFuncs.prepare$VH.set(seg, x);
    }
    public static MemorySegment prepare$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSourceFuncs.prepare$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void prepare$set(MemorySegment seg, long index, MemorySegment x) {
        _GSourceFuncs.prepare$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static prepare prepare(MemorySegment segment, SegmentScope scope) {
        return prepare.ofAddress(prepare$get(segment), scope);
    }
    static final FunctionDescriptor check$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor check_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle check_UP$MH = RuntimeHelper.upcallHandle(check.class, "apply", _GSourceFuncs.check_UP$FUNC);
    static final FunctionDescriptor check_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle check_DOWN$MH = RuntimeHelper.downcallHandle(
        _GSourceFuncs.check_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*check)(GSource*);
     * }
     */
    public interface check {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(check fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GSourceFuncs.check_UP$MH, fi, _GSourceFuncs.check$FUNC, scope);
        }
        static check ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)_GSourceFuncs.check_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle check$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("check"));
    public static VarHandle check$VH() {
        return _GSourceFuncs.check$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*check)(GSource*);
     * }
     */
    public static MemorySegment check$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSourceFuncs.check$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*check)(GSource*);
     * }
     */
    public static void check$set(MemorySegment seg, MemorySegment x) {
        _GSourceFuncs.check$VH.set(seg, x);
    }
    public static MemorySegment check$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSourceFuncs.check$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void check$set(MemorySegment seg, long index, MemorySegment x) {
        _GSourceFuncs.check$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static check check(MemorySegment segment, SegmentScope scope) {
        return check.ofAddress(check$get(segment), scope);
    }
    static final FunctionDescriptor dispatch$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor dispatch_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle dispatch_UP$MH = RuntimeHelper.upcallHandle(dispatch.class, "apply", _GSourceFuncs.dispatch_UP$FUNC);
    static final FunctionDescriptor dispatch_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle dispatch_DOWN$MH = RuntimeHelper.downcallHandle(
        _GSourceFuncs.dispatch_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*dispatch)(GSource*,GSourceFunc,gpointer);
     * }
     */
    public interface dispatch {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(dispatch fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GSourceFuncs.dispatch_UP$MH, fi, _GSourceFuncs.dispatch$FUNC, scope);
        }
        static dispatch ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)_GSourceFuncs.dispatch_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle dispatch$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dispatch"));
    public static VarHandle dispatch$VH() {
        return _GSourceFuncs.dispatch$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*dispatch)(GSource*,GSourceFunc,gpointer);
     * }
     */
    public static MemorySegment dispatch$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSourceFuncs.dispatch$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*dispatch)(GSource*,GSourceFunc,gpointer);
     * }
     */
    public static void dispatch$set(MemorySegment seg, MemorySegment x) {
        _GSourceFuncs.dispatch$VH.set(seg, x);
    }
    public static MemorySegment dispatch$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSourceFuncs.dispatch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dispatch$set(MemorySegment seg, long index, MemorySegment x) {
        _GSourceFuncs.dispatch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static dispatch dispatch(MemorySegment segment, SegmentScope scope) {
        return dispatch.ofAddress(dispatch$get(segment), scope);
    }
    static final FunctionDescriptor finalize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor finalize_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle finalize_UP$MH = RuntimeHelper.upcallHandle(finalize.class, "apply", _GSourceFuncs.finalize_UP$FUNC);
    static final FunctionDescriptor finalize_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle finalize_DOWN$MH = RuntimeHelper.downcallHandle(
        _GSourceFuncs.finalize_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*finalize)(GSource*);
     * }
     */
    public interface finalize {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(finalize fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GSourceFuncs.finalize_UP$MH, fi, _GSourceFuncs.finalize$FUNC, scope);
        }
        static finalize ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    _GSourceFuncs.finalize_DOWN$MH.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle finalize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("finalize"));
    public static VarHandle finalize$VH() {
        return _GSourceFuncs.finalize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*finalize)(GSource*);
     * }
     */
    public static MemorySegment finalize$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSourceFuncs.finalize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*finalize)(GSource*);
     * }
     */
    public static void finalize$set(MemorySegment seg, MemorySegment x) {
        _GSourceFuncs.finalize$VH.set(seg, x);
    }
    public static MemorySegment finalize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSourceFuncs.finalize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void finalize$set(MemorySegment seg, long index, MemorySegment x) {
        _GSourceFuncs.finalize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static finalize finalize(MemorySegment segment, SegmentScope scope) {
        return finalize.ofAddress(finalize$get(segment), scope);
    }
    static final VarHandle closure_callback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("closure_callback"));
    public static VarHandle closure_callback$VH() {
        return _GSourceFuncs.closure_callback$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSourceFunc closure_callback;
     * }
     */
    public static MemorySegment closure_callback$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSourceFuncs.closure_callback$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSourceFunc closure_callback;
     * }
     */
    public static void closure_callback$set(MemorySegment seg, MemorySegment x) {
        _GSourceFuncs.closure_callback$VH.set(seg, x);
    }
    public static MemorySegment closure_callback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSourceFuncs.closure_callback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void closure_callback$set(MemorySegment seg, long index, MemorySegment x) {
        _GSourceFuncs.closure_callback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GSourceFunc closure_callback(MemorySegment segment, SegmentScope scope) {
        return GSourceFunc.ofAddress(closure_callback$get(segment), scope);
    }
    static final VarHandle closure_marshal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("closure_marshal"));
    public static VarHandle closure_marshal$VH() {
        return _GSourceFuncs.closure_marshal$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSourceDummyMarshal closure_marshal;
     * }
     */
    public static MemorySegment closure_marshal$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSourceFuncs.closure_marshal$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSourceDummyMarshal closure_marshal;
     * }
     */
    public static void closure_marshal$set(MemorySegment seg, MemorySegment x) {
        _GSourceFuncs.closure_marshal$VH.set(seg, x);
    }
    public static MemorySegment closure_marshal$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSourceFuncs.closure_marshal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void closure_marshal$set(MemorySegment seg, long index, MemorySegment x) {
        _GSourceFuncs.closure_marshal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GSourceDummyMarshal closure_marshal(MemorySegment segment, SegmentScope scope) {
        return GSourceDummyMarshal.ofAddress(closure_marshal$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

