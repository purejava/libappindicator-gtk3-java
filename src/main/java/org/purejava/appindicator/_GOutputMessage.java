// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GOutputMessage {
 *     GSocketAddress* address;
 *     GOutputVector* vectors;
 *     guint num_vectors;
 *     guint bytes_sent;
 *     GSocketControlMessage** control_messages;
 *     guint num_control_messages;
 * };
 * }
 */
public class _GOutputMessage {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("address"),
        Constants$root.C_POINTER$LAYOUT.withName("vectors"),
        Constants$root.C_INT$LAYOUT.withName("num_vectors"),
        Constants$root.C_INT$LAYOUT.withName("bytes_sent"),
        Constants$root.C_POINTER$LAYOUT.withName("control_messages"),
        Constants$root.C_INT$LAYOUT.withName("num_control_messages"),
        MemoryLayout.paddingLayout(32)
    ).withName("_GOutputMessage");
    public static MemoryLayout $LAYOUT() {
        return _GOutputMessage.$struct$LAYOUT;
    }
    static final VarHandle address$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("address"));
    public static VarHandle address$VH() {
        return _GOutputMessage.address$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSocketAddress* address;
     * }
     */
    public static MemorySegment address$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GOutputMessage.address$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSocketAddress* address;
     * }
     */
    public static void address$set(MemorySegment seg, MemorySegment x) {
        _GOutputMessage.address$VH.set(seg, x);
    }
    public static MemorySegment address$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GOutputMessage.address$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void address$set(MemorySegment seg, long index, MemorySegment x) {
        _GOutputMessage.address$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vectors$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vectors"));
    public static VarHandle vectors$VH() {
        return _GOutputMessage.vectors$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GOutputVector* vectors;
     * }
     */
    public static MemorySegment vectors$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GOutputMessage.vectors$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GOutputVector* vectors;
     * }
     */
    public static void vectors$set(MemorySegment seg, MemorySegment x) {
        _GOutputMessage.vectors$VH.set(seg, x);
    }
    public static MemorySegment vectors$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GOutputMessage.vectors$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vectors$set(MemorySegment seg, long index, MemorySegment x) {
        _GOutputMessage.vectors$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle num_vectors$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("num_vectors"));
    public static VarHandle num_vectors$VH() {
        return _GOutputMessage.num_vectors$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint num_vectors;
     * }
     */
    public static int num_vectors$get(MemorySegment seg) {
        return (int)_GOutputMessage.num_vectors$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint num_vectors;
     * }
     */
    public static void num_vectors$set(MemorySegment seg, int x) {
        _GOutputMessage.num_vectors$VH.set(seg, x);
    }
    public static int num_vectors$get(MemorySegment seg, long index) {
        return (int)_GOutputMessage.num_vectors$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void num_vectors$set(MemorySegment seg, long index, int x) {
        _GOutputMessage.num_vectors$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bytes_sent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bytes_sent"));
    public static VarHandle bytes_sent$VH() {
        return _GOutputMessage.bytes_sent$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint bytes_sent;
     * }
     */
    public static int bytes_sent$get(MemorySegment seg) {
        return (int)_GOutputMessage.bytes_sent$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint bytes_sent;
     * }
     */
    public static void bytes_sent$set(MemorySegment seg, int x) {
        _GOutputMessage.bytes_sent$VH.set(seg, x);
    }
    public static int bytes_sent$get(MemorySegment seg, long index) {
        return (int)_GOutputMessage.bytes_sent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bytes_sent$set(MemorySegment seg, long index, int x) {
        _GOutputMessage.bytes_sent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle control_messages$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("control_messages"));
    public static VarHandle control_messages$VH() {
        return _GOutputMessage.control_messages$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSocketControlMessage** control_messages;
     * }
     */
    public static MemorySegment control_messages$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GOutputMessage.control_messages$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSocketControlMessage** control_messages;
     * }
     */
    public static void control_messages$set(MemorySegment seg, MemorySegment x) {
        _GOutputMessage.control_messages$VH.set(seg, x);
    }
    public static MemorySegment control_messages$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GOutputMessage.control_messages$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void control_messages$set(MemorySegment seg, long index, MemorySegment x) {
        _GOutputMessage.control_messages$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle num_control_messages$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("num_control_messages"));
    public static VarHandle num_control_messages$VH() {
        return _GOutputMessage.num_control_messages$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint num_control_messages;
     * }
     */
    public static int num_control_messages$get(MemorySegment seg) {
        return (int)_GOutputMessage.num_control_messages$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint num_control_messages;
     * }
     */
    public static void num_control_messages$set(MemorySegment seg, int x) {
        _GOutputMessage.num_control_messages$VH.set(seg, x);
    }
    public static int num_control_messages$get(MemorySegment seg, long index) {
        return (int)_GOutputMessage.num_control_messages$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void num_control_messages$set(MemorySegment seg, long index, int x) {
        _GOutputMessage.num_control_messages$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

