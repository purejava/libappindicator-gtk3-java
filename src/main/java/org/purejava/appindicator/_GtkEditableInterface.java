// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkEditableInterface {
 *     struct _GTypeInterface base_iface;
 *     void (*insert_text)(struct _GtkEditable*,char*,int,int*);
 *     void (*delete_text)(struct _GtkEditable*,int,int);
 *     void (*changed)(struct _GtkEditable*);
 *     void (*do_insert_text)(struct _GtkEditable*,char*,int,int*);
 *     void (*do_delete_text)(struct _GtkEditable*,int,int);
 *     char* (*get_chars)(struct _GtkEditable*,int,int);
 *     void (*set_selection_bounds)(struct _GtkEditable*,int,int);
 *     int (*get_selection_bounds)(struct _GtkEditable*,int*,int*);
 *     void (*set_position)(struct _GtkEditable*,int);
 *     int (*get_position)(struct _GtkEditable*);
 * };
 * }
 */
public class _GtkEditableInterface {

    public static MemoryLayout $LAYOUT() {
        return constants$2396.const$5;
    }
    public static MemorySegment base_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
 * void (*insert_text)(struct _GtkEditable*,char*,int,int*);
     * }
     */
    public interface insert_text {

        void apply(java.lang.foreign.MemorySegment clipboard, java.lang.foreign.MemorySegment atoms, int n_atoms, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(insert_text fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2397.const$0, fi, constants$464.const$4, scope);
        }
        static insert_text ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _clipboard, java.lang.foreign.MemorySegment _atoms, int _n_atoms, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$737.const$4.invokeExact(symbol, _clipboard, _atoms, _n_atoms, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle insert_text$VH() {
        return constants$2397.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*insert_text)(struct _GtkEditable*,char*,int,int*);
     * }
     */
    public static MemorySegment insert_text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2397.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*insert_text)(struct _GtkEditable*,char*,int,int*);
     * }
     */
    public static void insert_text$set(MemorySegment seg, MemorySegment x) {
        constants$2397.const$1.set(seg, x);
    }
    public static MemorySegment insert_text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2397.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void insert_text$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2397.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static insert_text insert_text(MemorySegment segment, Arena scope) {
        return insert_text.ofAddress(insert_text$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*delete_text)(struct _GtkEditable*,int,int);
     * }
     */
    public interface delete_text {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
        static MemorySegment allocate(delete_text fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2397.const$2, fi, constants$467.const$3, scope);
        }
        static delete_text ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2) -> {
                try {
                    constants$1901.const$2.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle delete_text$VH() {
        return constants$2397.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*delete_text)(struct _GtkEditable*,int,int);
     * }
     */
    public static MemorySegment delete_text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2397.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*delete_text)(struct _GtkEditable*,int,int);
     * }
     */
    public static void delete_text$set(MemorySegment seg, MemorySegment x) {
        constants$2397.const$3.set(seg, x);
    }
    public static MemorySegment delete_text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2397.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void delete_text$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2397.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static delete_text delete_text(MemorySegment segment, Arena scope) {
        return delete_text.ofAddress(delete_text$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*changed)(struct _GtkEditable*);
     * }
     */
    public interface changed {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(changed fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2397.const$4, fi, constants$13.const$1, scope);
        }
        static changed ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle changed$VH() {
        return constants$2397.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*changed)(struct _GtkEditable*);
     * }
     */
    public static MemorySegment changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2397.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*changed)(struct _GtkEditable*);
     * }
     */
    public static void changed$set(MemorySegment seg, MemorySegment x) {
        constants$2397.const$5.set(seg, x);
    }
    public static MemorySegment changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2397.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void changed$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2397.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static changed changed(MemorySegment segment, Arena scope) {
        return changed.ofAddress(changed$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*do_insert_text)(struct _GtkEditable*,char*,int,int*);
     * }
     */
    public interface do_insert_text {

        void apply(java.lang.foreign.MemorySegment clipboard, java.lang.foreign.MemorySegment atoms, int n_atoms, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(do_insert_text fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2398.const$0, fi, constants$464.const$4, scope);
        }
        static do_insert_text ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _clipboard, java.lang.foreign.MemorySegment _atoms, int _n_atoms, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$737.const$4.invokeExact(symbol, _clipboard, _atoms, _n_atoms, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle do_insert_text$VH() {
        return constants$2398.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*do_insert_text)(struct _GtkEditable*,char*,int,int*);
     * }
     */
    public static MemorySegment do_insert_text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2398.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*do_insert_text)(struct _GtkEditable*,char*,int,int*);
     * }
     */
    public static void do_insert_text$set(MemorySegment seg, MemorySegment x) {
        constants$2398.const$1.set(seg, x);
    }
    public static MemorySegment do_insert_text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2398.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void do_insert_text$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2398.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static do_insert_text do_insert_text(MemorySegment segment, Arena scope) {
        return do_insert_text.ofAddress(do_insert_text$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*do_delete_text)(struct _GtkEditable*,int,int);
     * }
     */
    public interface do_delete_text {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
        static MemorySegment allocate(do_delete_text fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2398.const$2, fi, constants$467.const$3, scope);
        }
        static do_delete_text ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2) -> {
                try {
                    constants$1901.const$2.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle do_delete_text$VH() {
        return constants$2398.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*do_delete_text)(struct _GtkEditable*,int,int);
     * }
     */
    public static MemorySegment do_delete_text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2398.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*do_delete_text)(struct _GtkEditable*,int,int);
     * }
     */
    public static void do_delete_text$set(MemorySegment seg, MemorySegment x) {
        constants$2398.const$3.set(seg, x);
    }
    public static MemorySegment do_delete_text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2398.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void do_delete_text$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2398.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static do_delete_text do_delete_text(MemorySegment segment, Arena scope) {
        return do_delete_text.ofAddress(do_delete_text$get(segment), scope);
    }
    /**
     * {@snippet :
 * char* (*get_chars)(struct _GtkEditable*,int,int);
     * }
     */
    public interface get_chars {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
        static MemorySegment allocate(get_chars fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2398.const$4, fi, constants$33.const$5, scope);
        }
        static get_chars ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$1822.const$5.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_chars$VH() {
        return constants$2398.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_chars)(struct _GtkEditable*,int,int);
     * }
     */
    public static MemorySegment get_chars$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2398.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_chars)(struct _GtkEditable*,int,int);
     * }
     */
    public static void get_chars$set(MemorySegment seg, MemorySegment x) {
        constants$2398.const$5.set(seg, x);
    }
    public static MemorySegment get_chars$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2398.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void get_chars$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2398.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_chars get_chars(MemorySegment segment, Arena scope) {
        return get_chars.ofAddress(get_chars$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*set_selection_bounds)(struct _GtkEditable*,int,int);
     * }
     */
    public interface set_selection_bounds {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
        static MemorySegment allocate(set_selection_bounds fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2399.const$0, fi, constants$467.const$3, scope);
        }
        static set_selection_bounds ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2) -> {
                try {
                    constants$1901.const$2.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle set_selection_bounds$VH() {
        return constants$2399.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*set_selection_bounds)(struct _GtkEditable*,int,int);
     * }
     */
    public static MemorySegment set_selection_bounds$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2399.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*set_selection_bounds)(struct _GtkEditable*,int,int);
     * }
     */
    public static void set_selection_bounds$set(MemorySegment seg, MemorySegment x) {
        constants$2399.const$1.set(seg, x);
    }
    public static MemorySegment set_selection_bounds$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2399.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void set_selection_bounds$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2399.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_selection_bounds set_selection_bounds(MemorySegment segment, Arena scope) {
        return set_selection_bounds.ofAddress(set_selection_bounds$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*get_selection_bounds)(struct _GtkEditable*,int*,int*);
     * }
     */
    public interface get_selection_bounds {

        int apply(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_selection_bounds fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2399.const$2, fi, constants$12.const$2, scope);
        }
        static get_selection_bounds ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _a, java.lang.foreign.MemorySegment _b, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$12.const$4.invokeExact(symbol, _a, _b, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_selection_bounds$VH() {
        return constants$2399.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*get_selection_bounds)(struct _GtkEditable*,int*,int*);
     * }
     */
    public static MemorySegment get_selection_bounds$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2399.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*get_selection_bounds)(struct _GtkEditable*,int*,int*);
     * }
     */
    public static void get_selection_bounds$set(MemorySegment seg, MemorySegment x) {
        constants$2399.const$3.set(seg, x);
    }
    public static MemorySegment get_selection_bounds$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2399.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void get_selection_bounds$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2399.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_selection_bounds get_selection_bounds(MemorySegment segment, Arena scope) {
        return get_selection_bounds.ofAddress(get_selection_bounds$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*set_position)(struct _GtkEditable*,int);
     * }
     */
    public interface set_position {

        void apply(java.lang.foreign.MemorySegment colors, int n_colors);
        static MemorySegment allocate(set_position fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2399.const$4, fi, constants$40.const$2, scope);
        }
        static set_position ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _colors, int _n_colors) -> {
                try {
                    constants$509.const$5.invokeExact(symbol, _colors, _n_colors);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle set_position$VH() {
        return constants$2399.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*set_position)(struct _GtkEditable*,int);
     * }
     */
    public static MemorySegment set_position$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2399.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*set_position)(struct _GtkEditable*,int);
     * }
     */
    public static void set_position$set(MemorySegment seg, MemorySegment x) {
        constants$2399.const$5.set(seg, x);
    }
    public static MemorySegment set_position$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2399.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void set_position$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2399.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_position set_position(MemorySegment segment, Arena scope) {
        return set_position.ofAddress(set_position$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*get_position)(struct _GtkEditable*);
     * }
     */
    public interface get_position {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_position fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2400.const$0, fi, constants$10.const$5, scope);
        }
        static get_position ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_position$VH() {
        return constants$2400.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*get_position)(struct _GtkEditable*);
     * }
     */
    public static MemorySegment get_position$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2400.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*get_position)(struct _GtkEditable*);
     * }
     */
    public static void get_position$set(MemorySegment seg, MemorySegment x) {
        constants$2400.const$1.set(seg, x);
    }
    public static MemorySegment get_position$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2400.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void get_position$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2400.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_position get_position(MemorySegment segment, Arena scope) {
        return get_position.ofAddress(get_position$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


