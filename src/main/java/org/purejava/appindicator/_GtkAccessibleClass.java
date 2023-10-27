// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkAccessibleClass {
 *     struct _AtkObjectClass parent_class;
 *     void (*connect_widget_destroyed)(struct _GtkAccessible*);
 *     void (*widget_set)(struct _GtkAccessible*);
 *     void (*widget_unset)(struct _GtkAccessible*);
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 * };
 * }
 */
public class _GtkAccessibleClass {

    public static MemoryLayout $LAYOUT() {
        return constants$2268.const$3;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 352);
    }
    /**
     * {@snippet :
 * void (*connect_widget_destroyed)(struct _GtkAccessible*);
     * }
     */
    public interface connect_widget_destroyed {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(connect_widget_destroyed fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2268.const$4, fi, constants$13.const$1, scope);
        }
        static connect_widget_destroyed ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle connect_widget_destroyed$VH() {
        return constants$2268.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*connect_widget_destroyed)(struct _GtkAccessible*);
     * }
     */
    public static MemorySegment connect_widget_destroyed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2268.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*connect_widget_destroyed)(struct _GtkAccessible*);
     * }
     */
    public static void connect_widget_destroyed$set(MemorySegment seg, MemorySegment x) {
        constants$2268.const$5.set(seg, x);
    }
    public static MemorySegment connect_widget_destroyed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2268.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void connect_widget_destroyed$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2268.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static connect_widget_destroyed connect_widget_destroyed(MemorySegment segment, Arena scope) {
        return connect_widget_destroyed.ofAddress(connect_widget_destroyed$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*widget_set)(struct _GtkAccessible*);
     * }
     */
    public interface widget_set {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(widget_set fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2269.const$0, fi, constants$13.const$1, scope);
        }
        static widget_set ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle widget_set$VH() {
        return constants$2269.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*widget_set)(struct _GtkAccessible*);
     * }
     */
    public static MemorySegment widget_set$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2269.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*widget_set)(struct _GtkAccessible*);
     * }
     */
    public static void widget_set$set(MemorySegment seg, MemorySegment x) {
        constants$2269.const$1.set(seg, x);
    }
    public static MemorySegment widget_set$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2269.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void widget_set$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2269.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static widget_set widget_set(MemorySegment segment, Arena scope) {
        return widget_set.ofAddress(widget_set$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*widget_unset)(struct _GtkAccessible*);
     * }
     */
    public interface widget_unset {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(widget_unset fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2269.const$2, fi, constants$13.const$1, scope);
        }
        static widget_unset ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle widget_unset$VH() {
        return constants$2269.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*widget_unset)(struct _GtkAccessible*);
     * }
     */
    public static MemorySegment widget_unset$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2269.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*widget_unset)(struct _GtkAccessible*);
     * }
     */
    public static void widget_unset$set(MemorySegment seg, MemorySegment x) {
        constants$2269.const$3.set(seg, x);
    }
    public static MemorySegment widget_unset$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2269.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void widget_unset$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2269.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static widget_unset widget_unset(MemorySegment segment, Arena scope) {
        return widget_unset.ofAddress(widget_unset$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved3)();
     * }
     */
    public interface _gtk_reserved3 {

        void apply();
        static MemorySegment allocate(_gtk_reserved3 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2269.const$4, fi, constants$7.const$5, scope);
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
        return constants$2269.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2269.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$2269.const$5.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2269.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2269.const$5.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2270.const$0, fi, constants$7.const$5, scope);
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
        return constants$2270.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2270.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$2270.const$1.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2270.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2270.const$1.set(seg.asSlice(index*sizeof()), x);
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


