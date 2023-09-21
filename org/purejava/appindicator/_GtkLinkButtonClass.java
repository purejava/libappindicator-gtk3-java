// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkLinkButtonClass {
 *     struct _GtkButtonClass parent_class;
 *     int (*activate_link)(struct _GtkLinkButton*);
 *     void (*_gtk_padding1)();
 *     void (*_gtk_padding2)();
 *     void (*_gtk_padding3)();
 *     void (*_gtk_padding4)();
 * };
 * }
 */
public class _GtkLinkButtonClass {

    public static MemoryLayout $LAYOUT() {
        return constants$2838.const$1;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 1088);
    }
    /**
     * {@snippet :
 * int (*activate_link)(struct _GtkLinkButton*);
     * }
     */
    public interface activate_link {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(activate_link fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2838.const$2, fi, constants$10.const$5, scope);
        }
        static activate_link ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$14.const$2.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle activate_link$VH() {
        return constants$2838.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*activate_link)(struct _GtkLinkButton*);
     * }
     */
    public static MemorySegment activate_link$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2838.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*activate_link)(struct _GtkLinkButton*);
     * }
     */
    public static void activate_link$set(MemorySegment seg, MemorySegment x) {
        constants$2838.const$3.set(seg, x);
    }
    public static MemorySegment activate_link$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2838.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void activate_link$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2838.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate_link activate_link(MemorySegment segment, Arena scope) {
        return activate_link.ofAddress(activate_link$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_padding1)();
     * }
     */
    public interface _gtk_padding1 {

        void apply();
        static MemorySegment allocate(_gtk_padding1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2838.const$4, fi, constants$7.const$5, scope);
        }
        static _gtk_padding1 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_padding1$VH() {
        return constants$2838.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_padding1)();
     * }
     */
    public static MemorySegment _gtk_padding1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2838.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_padding1)();
     * }
     */
    public static void _gtk_padding1$set(MemorySegment seg, MemorySegment x) {
        constants$2838.const$5.set(seg, x);
    }
    public static MemorySegment _gtk_padding1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2838.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_padding1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2838.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_padding1 _gtk_padding1(MemorySegment segment, Arena scope) {
        return _gtk_padding1.ofAddress(_gtk_padding1$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_padding2)();
     * }
     */
    public interface _gtk_padding2 {

        void apply();
        static MemorySegment allocate(_gtk_padding2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2839.const$0, fi, constants$7.const$5, scope);
        }
        static _gtk_padding2 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_padding2$VH() {
        return constants$2839.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_padding2)();
     * }
     */
    public static MemorySegment _gtk_padding2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2839.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_padding2)();
     * }
     */
    public static void _gtk_padding2$set(MemorySegment seg, MemorySegment x) {
        constants$2839.const$1.set(seg, x);
    }
    public static MemorySegment _gtk_padding2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2839.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_padding2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2839.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_padding2 _gtk_padding2(MemorySegment segment, Arena scope) {
        return _gtk_padding2.ofAddress(_gtk_padding2$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_padding3)();
     * }
     */
    public interface _gtk_padding3 {

        void apply();
        static MemorySegment allocate(_gtk_padding3 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2839.const$2, fi, constants$7.const$5, scope);
        }
        static _gtk_padding3 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_padding3$VH() {
        return constants$2839.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_padding3)();
     * }
     */
    public static MemorySegment _gtk_padding3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2839.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_padding3)();
     * }
     */
    public static void _gtk_padding3$set(MemorySegment seg, MemorySegment x) {
        constants$2839.const$3.set(seg, x);
    }
    public static MemorySegment _gtk_padding3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2839.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_padding3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2839.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_padding3 _gtk_padding3(MemorySegment segment, Arena scope) {
        return _gtk_padding3.ofAddress(_gtk_padding3$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_padding4)();
     * }
     */
    public interface _gtk_padding4 {

        void apply();
        static MemorySegment allocate(_gtk_padding4 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2839.const$4, fi, constants$7.const$5, scope);
        }
        static _gtk_padding4 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_padding4$VH() {
        return constants$2839.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_padding4)();
     * }
     */
    public static MemorySegment _gtk_padding4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2839.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_padding4)();
     * }
     */
    public static void _gtk_padding4$set(MemorySegment seg, MemorySegment x) {
        constants$2839.const$5.set(seg, x);
    }
    public static MemorySegment _gtk_padding4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2839.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_padding4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2839.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_padding4 _gtk_padding4(MemorySegment segment, Arena scope) {
        return _gtk_padding4.ofAddress(_gtk_padding4$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

