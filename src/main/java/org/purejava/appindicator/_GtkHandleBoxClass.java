// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkHandleBoxClass {
 *     struct _GtkBinClass parent_class;
 *     void (*child_attached)(struct _GtkHandleBox*,struct _GtkWidget*);
 *     void (*child_detached)(struct _GtkHandleBox*,struct _GtkWidget*);
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 * };
 * }
 */
public class _GtkHandleBoxClass {

    public static MemoryLayout $LAYOUT() {
        return constants$3296.const$3;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 1008);
    }
    /**
     * {@snippet :
 * void (*child_attached)(struct _GtkHandleBox*,struct _GtkWidget*);
     * }
     */
    public interface child_attached {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(child_attached fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3296.const$4, fi, constants$13.const$4, scope);
        }
        static child_attached ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$14.const$0.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle child_attached$VH() {
        return constants$3296.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*child_attached)(struct _GtkHandleBox*,struct _GtkWidget*);
     * }
     */
    public static MemorySegment child_attached$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3296.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*child_attached)(struct _GtkHandleBox*,struct _GtkWidget*);
     * }
     */
    public static void child_attached$set(MemorySegment seg, MemorySegment x) {
        constants$3296.const$5.set(seg, x);
    }
    public static MemorySegment child_attached$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3296.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void child_attached$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3296.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static child_attached child_attached(MemorySegment segment, Arena scope) {
        return child_attached.ofAddress(child_attached$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*child_detached)(struct _GtkHandleBox*,struct _GtkWidget*);
     * }
     */
    public interface child_detached {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(child_detached fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3297.const$0, fi, constants$13.const$4, scope);
        }
        static child_detached ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$14.const$0.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle child_detached$VH() {
        return constants$3297.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*child_detached)(struct _GtkHandleBox*,struct _GtkWidget*);
     * }
     */
    public static MemorySegment child_detached$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3297.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*child_detached)(struct _GtkHandleBox*,struct _GtkWidget*);
     * }
     */
    public static void child_detached$set(MemorySegment seg, MemorySegment x) {
        constants$3297.const$1.set(seg, x);
    }
    public static MemorySegment child_detached$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3297.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void child_detached$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3297.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static child_detached child_detached(MemorySegment segment, Arena scope) {
        return child_detached.ofAddress(child_detached$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3297.const$2, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved1 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle _gtk_reserved1$VH() {
        return constants$3297.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3297.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$3297.const$3.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3297.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3297.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1(MemorySegment segment, Arena scope) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved2)();
     * }
     */
    public interface _gtk_reserved2 {

        void apply();
        static MemorySegment allocate(_gtk_reserved2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3297.const$4, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved2 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle _gtk_reserved2$VH() {
        return constants$3297.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3297.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$3297.const$5.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3297.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3297.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2(MemorySegment segment, Arena scope) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved3)();
     * }
     */
    public interface _gtk_reserved3 {

        void apply();
        static MemorySegment allocate(_gtk_reserved3 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3298.const$0, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved3 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle _gtk_reserved3$VH() {
        return constants$3298.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3298.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$3298.const$1.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3298.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3298.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3(MemorySegment segment, Arena scope) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved4)();
     * }
     */
    public interface _gtk_reserved4 {

        void apply();
        static MemorySegment allocate(_gtk_reserved4 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3298.const$2, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved4 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle _gtk_reserved4$VH() {
        return constants$3298.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3298.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$3298.const$3.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3298.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3298.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4(MemorySegment segment, Arena scope) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


