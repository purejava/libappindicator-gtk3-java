// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _AtkSelectionIface {
 *     struct _GTypeInterface parent;
 *     int (*add_selection)(struct _AtkSelection*,int);
 *     int (*clear_selection)(struct _AtkSelection*);
 *     struct _AtkObject* (*ref_selection)(struct _AtkSelection*,int);
 *     int (*get_selection_count)(struct _AtkSelection*);
 *     int (*is_child_selected)(struct _AtkSelection*,int);
 *     int (*remove_selection)(struct _AtkSelection*,int);
 *     int (*select_all_selection)(struct _AtkSelection*);
 *     void (*selection_changed)(struct _AtkSelection*);
 * };
 * }
 */
public class _AtkSelectionIface {

    public static MemoryLayout $LAYOUT() {
        return constants$2056.const$0;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
 * int (*add_selection)(struct _AtkSelection*,int);
     * }
     */
    public interface add_selection {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(add_selection fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2056.const$1, fi, constants$11.const$4, scope);
        }
        static add_selection ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle add_selection$VH() {
        return constants$2056.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*add_selection)(struct _AtkSelection*,int);
     * }
     */
    public static MemorySegment add_selection$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2056.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*add_selection)(struct _AtkSelection*,int);
     * }
     */
    public static void add_selection$set(MemorySegment seg, MemorySegment x) {
        constants$2056.const$2.set(seg, x);
    }
    public static MemorySegment add_selection$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2056.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void add_selection$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2056.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static add_selection add_selection(MemorySegment segment, Arena scope) {
        return add_selection.ofAddress(add_selection$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*clear_selection)(struct _AtkSelection*);
     * }
     */
    public interface clear_selection {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(clear_selection fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2056.const$3, fi, constants$10.const$5, scope);
        }
        static clear_selection ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle clear_selection$VH() {
        return constants$2056.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*clear_selection)(struct _AtkSelection*);
     * }
     */
    public static MemorySegment clear_selection$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2056.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*clear_selection)(struct _AtkSelection*);
     * }
     */
    public static void clear_selection$set(MemorySegment seg, MemorySegment x) {
        constants$2056.const$4.set(seg, x);
    }
    public static MemorySegment clear_selection$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2056.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void clear_selection$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2056.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static clear_selection clear_selection(MemorySegment segment, Arena scope) {
        return clear_selection.ofAddress(clear_selection$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _AtkObject* (*ref_selection)(struct _AtkSelection*,int);
     * }
     */
    public interface ref_selection {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(ref_selection fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2056.const$5, fi, constants$21.const$3, scope);
        }
        static ref_selection ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$318.const$0.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle ref_selection$VH() {
        return constants$2057.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _AtkObject* (*ref_selection)(struct _AtkSelection*,int);
     * }
     */
    public static MemorySegment ref_selection$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2057.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _AtkObject* (*ref_selection)(struct _AtkSelection*,int);
     * }
     */
    public static void ref_selection$set(MemorySegment seg, MemorySegment x) {
        constants$2057.const$0.set(seg, x);
    }
    public static MemorySegment ref_selection$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2057.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_selection$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2057.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static ref_selection ref_selection(MemorySegment segment, Arena scope) {
        return ref_selection.ofAddress(ref_selection$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*get_selection_count)(struct _AtkSelection*);
     * }
     */
    public interface get_selection_count {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_selection_count fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2057.const$1, fi, constants$10.const$5, scope);
        }
        static get_selection_count ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_selection_count$VH() {
        return constants$2057.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*get_selection_count)(struct _AtkSelection*);
     * }
     */
    public static MemorySegment get_selection_count$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2057.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*get_selection_count)(struct _AtkSelection*);
     * }
     */
    public static void get_selection_count$set(MemorySegment seg, MemorySegment x) {
        constants$2057.const$2.set(seg, x);
    }
    public static MemorySegment get_selection_count$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2057.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void get_selection_count$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2057.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_selection_count get_selection_count(MemorySegment segment, Arena scope) {
        return get_selection_count.ofAddress(get_selection_count$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*is_child_selected)(struct _AtkSelection*,int);
     * }
     */
    public interface is_child_selected {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(is_child_selected fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2057.const$3, fi, constants$11.const$4, scope);
        }
        static is_child_selected ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle is_child_selected$VH() {
        return constants$2057.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*is_child_selected)(struct _AtkSelection*,int);
     * }
     */
    public static MemorySegment is_child_selected$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2057.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*is_child_selected)(struct _AtkSelection*,int);
     * }
     */
    public static void is_child_selected$set(MemorySegment seg, MemorySegment x) {
        constants$2057.const$4.set(seg, x);
    }
    public static MemorySegment is_child_selected$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2057.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void is_child_selected$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2057.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_child_selected is_child_selected(MemorySegment segment, Arena scope) {
        return is_child_selected.ofAddress(is_child_selected$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*remove_selection)(struct _AtkSelection*,int);
     * }
     */
    public interface remove_selection {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(remove_selection fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2057.const$5, fi, constants$11.const$4, scope);
        }
        static remove_selection ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle remove_selection$VH() {
        return constants$2058.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*remove_selection)(struct _AtkSelection*,int);
     * }
     */
    public static MemorySegment remove_selection$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2058.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*remove_selection)(struct _AtkSelection*,int);
     * }
     */
    public static void remove_selection$set(MemorySegment seg, MemorySegment x) {
        constants$2058.const$0.set(seg, x);
    }
    public static MemorySegment remove_selection$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2058.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void remove_selection$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2058.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static remove_selection remove_selection(MemorySegment segment, Arena scope) {
        return remove_selection.ofAddress(remove_selection$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*select_all_selection)(struct _AtkSelection*);
     * }
     */
    public interface select_all_selection {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(select_all_selection fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2058.const$1, fi, constants$10.const$5, scope);
        }
        static select_all_selection ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle select_all_selection$VH() {
        return constants$2058.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*select_all_selection)(struct _AtkSelection*);
     * }
     */
    public static MemorySegment select_all_selection$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2058.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*select_all_selection)(struct _AtkSelection*);
     * }
     */
    public static void select_all_selection$set(MemorySegment seg, MemorySegment x) {
        constants$2058.const$2.set(seg, x);
    }
    public static MemorySegment select_all_selection$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2058.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void select_all_selection$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2058.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static select_all_selection select_all_selection(MemorySegment segment, Arena scope) {
        return select_all_selection.ofAddress(select_all_selection$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*selection_changed)(struct _AtkSelection*);
     * }
     */
    public interface selection_changed {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(selection_changed fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2058.const$3, fi, constants$13.const$1, scope);
        }
        static selection_changed ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle selection_changed$VH() {
        return constants$2058.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*selection_changed)(struct _AtkSelection*);
     * }
     */
    public static MemorySegment selection_changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2058.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*selection_changed)(struct _AtkSelection*);
     * }
     */
    public static void selection_changed$set(MemorySegment seg, MemorySegment x) {
        constants$2058.const$4.set(seg, x);
    }
    public static MemorySegment selection_changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2058.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void selection_changed$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2058.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static selection_changed selection_changed(MemorySegment segment, Arena scope) {
        return selection_changed.ofAddress(selection_changed$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


