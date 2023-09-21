// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkButtonClass {
 *     struct _GtkBinClass parent_class;
 *     void (*pressed)(struct _GtkButton*);
 *     void (*released)(struct _GtkButton*);
 *     void (*clicked)(struct _GtkButton*);
 *     void (*enter)(struct _GtkButton*);
 *     void (*leave)(struct _GtkButton*);
 *     void (*activate)(struct _GtkButton*);
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 * };
 * }
 */
public class _GtkButtonClass {

    public static MemoryLayout $LAYOUT() {
        return constants$2549.const$2;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 1008);
    }
    /**
     * {@snippet :
 * void (*pressed)(struct _GtkButton*);
     * }
     */
    public interface pressed {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(pressed fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2549.const$3, fi, constants$13.const$1, scope);
        }
        static pressed ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle pressed$VH() {
        return constants$2549.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*pressed)(struct _GtkButton*);
     * }
     */
    public static MemorySegment pressed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2549.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*pressed)(struct _GtkButton*);
     * }
     */
    public static void pressed$set(MemorySegment seg, MemorySegment x) {
        constants$2549.const$4.set(seg, x);
    }
    public static MemorySegment pressed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2549.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pressed$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2549.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static pressed pressed(MemorySegment segment, Arena scope) {
        return pressed.ofAddress(pressed$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*released)(struct _GtkButton*);
     * }
     */
    public interface released {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(released fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2549.const$5, fi, constants$13.const$1, scope);
        }
        static released ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle released$VH() {
        return constants$2550.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*released)(struct _GtkButton*);
     * }
     */
    public static MemorySegment released$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2550.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*released)(struct _GtkButton*);
     * }
     */
    public static void released$set(MemorySegment seg, MemorySegment x) {
        constants$2550.const$0.set(seg, x);
    }
    public static MemorySegment released$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2550.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void released$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2550.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static released released(MemorySegment segment, Arena scope) {
        return released.ofAddress(released$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*clicked)(struct _GtkButton*);
     * }
     */
    public interface clicked {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(clicked fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2550.const$1, fi, constants$13.const$1, scope);
        }
        static clicked ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle clicked$VH() {
        return constants$2550.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*clicked)(struct _GtkButton*);
     * }
     */
    public static MemorySegment clicked$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2550.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*clicked)(struct _GtkButton*);
     * }
     */
    public static void clicked$set(MemorySegment seg, MemorySegment x) {
        constants$2550.const$2.set(seg, x);
    }
    public static MemorySegment clicked$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2550.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void clicked$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2550.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static clicked clicked(MemorySegment segment, Arena scope) {
        return clicked.ofAddress(clicked$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*enter)(struct _GtkButton*);
     * }
     */
    public interface enter {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(enter fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2550.const$3, fi, constants$13.const$1, scope);
        }
        static enter ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle enter$VH() {
        return constants$2550.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*enter)(struct _GtkButton*);
     * }
     */
    public static MemorySegment enter$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2550.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*enter)(struct _GtkButton*);
     * }
     */
    public static void enter$set(MemorySegment seg, MemorySegment x) {
        constants$2550.const$4.set(seg, x);
    }
    public static MemorySegment enter$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2550.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void enter$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2550.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static enter enter(MemorySegment segment, Arena scope) {
        return enter.ofAddress(enter$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*leave)(struct _GtkButton*);
     * }
     */
    public interface leave {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(leave fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2550.const$5, fi, constants$13.const$1, scope);
        }
        static leave ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle leave$VH() {
        return constants$2551.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*leave)(struct _GtkButton*);
     * }
     */
    public static MemorySegment leave$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2551.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*leave)(struct _GtkButton*);
     * }
     */
    public static void leave$set(MemorySegment seg, MemorySegment x) {
        constants$2551.const$0.set(seg, x);
    }
    public static MemorySegment leave$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2551.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void leave$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2551.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static leave leave(MemorySegment segment, Arena scope) {
        return leave.ofAddress(leave$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*activate)(struct _GtkButton*);
     * }
     */
    public interface activate {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(activate fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2551.const$1, fi, constants$13.const$1, scope);
        }
        static activate ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle activate$VH() {
        return constants$2551.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*activate)(struct _GtkButton*);
     * }
     */
    public static MemorySegment activate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2551.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*activate)(struct _GtkButton*);
     * }
     */
    public static void activate$set(MemorySegment seg, MemorySegment x) {
        constants$2551.const$2.set(seg, x);
    }
    public static MemorySegment activate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2551.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void activate$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2551.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate activate(MemorySegment segment, Arena scope) {
        return activate.ofAddress(activate$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2551.const$3, fi, constants$7.const$5, scope);
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
        return constants$2551.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2551.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$2551.const$4.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2551.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2551.const$4.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2551.const$5, fi, constants$7.const$5, scope);
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
        return constants$2552.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2552.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$2552.const$0.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2552.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2552.const$0.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2552.const$1, fi, constants$7.const$5, scope);
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
        return constants$2552.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2552.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$2552.const$2.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2552.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2552.const$2.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2552.const$3, fi, constants$7.const$5, scope);
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
        return constants$2552.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2552.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$2552.const$4.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2552.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2552.const$4.set(seg.asSlice(index*sizeof()), x);
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

