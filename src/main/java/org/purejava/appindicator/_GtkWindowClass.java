// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkWindowClass {
 *     struct _GtkBinClass parent_class;
 *     void (*set_focus)(struct _GtkWindow*,struct _GtkWidget*);
 *     void (*activate_focus)(struct _GtkWindow*);
 *     void (*activate_default)(struct _GtkWindow*);
 *     void (*keys_changed)(struct _GtkWindow*);
 *     int (*enable_debugging)(struct _GtkWindow*,int);
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 * };
 * }
 */
public class _GtkWindowClass {

    public static MemoryLayout $LAYOUT() {
        return constants$2187.const$3;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 1008);
    }
    /**
     * {@snippet :
 * void (*set_focus)(struct _GtkWindow*,struct _GtkWidget*);
     * }
     */
    public interface set_focus {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(set_focus fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2187.const$4, fi, constants$13.const$4, scope);
        }
        static set_focus ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle set_focus$VH() {
        return constants$2187.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*set_focus)(struct _GtkWindow*,struct _GtkWidget*);
     * }
     */
    public static MemorySegment set_focus$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2187.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*set_focus)(struct _GtkWindow*,struct _GtkWidget*);
     * }
     */
    public static void set_focus$set(MemorySegment seg, MemorySegment x) {
        constants$2187.const$5.set(seg, x);
    }
    public static MemorySegment set_focus$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2187.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void set_focus$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2187.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_focus set_focus(MemorySegment segment, Arena scope) {
        return set_focus.ofAddress(set_focus$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*activate_focus)(struct _GtkWindow*);
     * }
     */
    public interface activate_focus {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(activate_focus fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2188.const$0, fi, constants$13.const$1, scope);
        }
        static activate_focus ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle activate_focus$VH() {
        return constants$2188.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*activate_focus)(struct _GtkWindow*);
     * }
     */
    public static MemorySegment activate_focus$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2188.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*activate_focus)(struct _GtkWindow*);
     * }
     */
    public static void activate_focus$set(MemorySegment seg, MemorySegment x) {
        constants$2188.const$1.set(seg, x);
    }
    public static MemorySegment activate_focus$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2188.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void activate_focus$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2188.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate_focus activate_focus(MemorySegment segment, Arena scope) {
        return activate_focus.ofAddress(activate_focus$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*activate_default)(struct _GtkWindow*);
     * }
     */
    public interface activate_default {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(activate_default fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2188.const$2, fi, constants$13.const$1, scope);
        }
        static activate_default ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle activate_default$VH() {
        return constants$2188.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*activate_default)(struct _GtkWindow*);
     * }
     */
    public static MemorySegment activate_default$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2188.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*activate_default)(struct _GtkWindow*);
     * }
     */
    public static void activate_default$set(MemorySegment seg, MemorySegment x) {
        constants$2188.const$3.set(seg, x);
    }
    public static MemorySegment activate_default$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2188.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void activate_default$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2188.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate_default activate_default(MemorySegment segment, Arena scope) {
        return activate_default.ofAddress(activate_default$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*keys_changed)(struct _GtkWindow*);
     * }
     */
    public interface keys_changed {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(keys_changed fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2188.const$4, fi, constants$13.const$1, scope);
        }
        static keys_changed ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle keys_changed$VH() {
        return constants$2188.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*keys_changed)(struct _GtkWindow*);
     * }
     */
    public static MemorySegment keys_changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2188.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*keys_changed)(struct _GtkWindow*);
     * }
     */
    public static void keys_changed$set(MemorySegment seg, MemorySegment x) {
        constants$2188.const$5.set(seg, x);
    }
    public static MemorySegment keys_changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2188.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void keys_changed$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2188.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static keys_changed keys_changed(MemorySegment segment, Arena scope) {
        return keys_changed.ofAddress(keys_changed$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*enable_debugging)(struct _GtkWindow*,int);
     * }
     */
    public interface enable_debugging {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(enable_debugging fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2189.const$0, fi, constants$11.const$4, scope);
        }
        static enable_debugging ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)constants$837.const$4.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle enable_debugging$VH() {
        return constants$2189.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*enable_debugging)(struct _GtkWindow*,int);
     * }
     */
    public static MemorySegment enable_debugging$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2189.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*enable_debugging)(struct _GtkWindow*,int);
     * }
     */
    public static void enable_debugging$set(MemorySegment seg, MemorySegment x) {
        constants$2189.const$1.set(seg, x);
    }
    public static MemorySegment enable_debugging$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2189.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void enable_debugging$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2189.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static enable_debugging enable_debugging(MemorySegment segment, Arena scope) {
        return enable_debugging.ofAddress(enable_debugging$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2189.const$2, fi, constants$7.const$5, scope);
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
        return constants$2189.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2189.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$2189.const$3.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2189.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2189.const$3.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2189.const$4, fi, constants$7.const$5, scope);
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
        return constants$2189.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2189.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$2189.const$5.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2189.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2189.const$5.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2190.const$0, fi, constants$7.const$5, scope);
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
        return constants$2190.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2190.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$2190.const$1.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2190.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2190.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3(MemorySegment segment, Arena scope) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

