// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _AtkActionIface {
 *     struct _GTypeInterface parent;
 *     int (*do_action)(struct _AtkAction*,int);
 *     int (*get_n_actions)(struct _AtkAction*);
 *     char* (*get_description)(struct _AtkAction*,int);
 *     char* (*get_name)(struct _AtkAction*,int);
 *     char* (*get_keybinding)(struct _AtkAction*,int);
 *     int (*set_description)(struct _AtkAction*,int,char*);
 *     char* (*get_localized_name)(struct _AtkAction*,int);
 * };
 * }
 */
public class _AtkActionIface {

    public static MemoryLayout $LAYOUT() {
        return constants$1987.const$1;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
 * int (*do_action)(struct _AtkAction*,int);
     * }
     */
    public interface do_action {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(do_action fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1987.const$2, fi, constants$11.const$4, scope);
        }
        static do_action ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)constants$840.const$4.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle do_action$VH() {
        return constants$1987.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*do_action)(struct _AtkAction*,int);
     * }
     */
    public static MemorySegment do_action$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1987.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*do_action)(struct _AtkAction*,int);
     * }
     */
    public static void do_action$set(MemorySegment seg, MemorySegment x) {
        constants$1987.const$3.set(seg, x);
    }
    public static MemorySegment do_action$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1987.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void do_action$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1987.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static do_action do_action(MemorySegment segment, Arena scope) {
        return do_action.ofAddress(do_action$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*get_n_actions)(struct _AtkAction*);
     * }
     */
    public interface get_n_actions {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_n_actions fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1987.const$4, fi, constants$10.const$5, scope);
        }
        static get_n_actions ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_n_actions$VH() {
        return constants$1987.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*get_n_actions)(struct _AtkAction*);
     * }
     */
    public static MemorySegment get_n_actions$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1987.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*get_n_actions)(struct _AtkAction*);
     * }
     */
    public static void get_n_actions$set(MemorySegment seg, MemorySegment x) {
        constants$1987.const$5.set(seg, x);
    }
    public static MemorySegment get_n_actions$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1987.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void get_n_actions$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1987.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_n_actions get_n_actions(MemorySegment segment, Arena scope) {
        return get_n_actions.ofAddress(get_n_actions$get(segment), scope);
    }
    /**
     * {@snippet :
 * char* (*get_description)(struct _AtkAction*,int);
     * }
     */
    public interface get_description {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(get_description fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1988.const$0, fi, constants$21.const$3, scope);
        }
        static get_description ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$319.const$0.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_description$VH() {
        return constants$1988.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_description)(struct _AtkAction*,int);
     * }
     */
    public static MemorySegment get_description$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1988.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_description)(struct _AtkAction*,int);
     * }
     */
    public static void get_description$set(MemorySegment seg, MemorySegment x) {
        constants$1988.const$1.set(seg, x);
    }
    public static MemorySegment get_description$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1988.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void get_description$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1988.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_description get_description(MemorySegment segment, Arena scope) {
        return get_description.ofAddress(get_description$get(segment), scope);
    }
    /**
     * {@snippet :
 * char* (*get_name)(struct _AtkAction*,int);
     * }
     */
    public interface get_name {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(get_name fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1988.const$2, fi, constants$21.const$3, scope);
        }
        static get_name ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$319.const$0.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_name$VH() {
        return constants$1988.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_name)(struct _AtkAction*,int);
     * }
     */
    public static MemorySegment get_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1988.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_name)(struct _AtkAction*,int);
     * }
     */
    public static void get_name$set(MemorySegment seg, MemorySegment x) {
        constants$1988.const$3.set(seg, x);
    }
    public static MemorySegment get_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1988.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void get_name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1988.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_name get_name(MemorySegment segment, Arena scope) {
        return get_name.ofAddress(get_name$get(segment), scope);
    }
    /**
     * {@snippet :
 * char* (*get_keybinding)(struct _AtkAction*,int);
     * }
     */
    public interface get_keybinding {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(get_keybinding fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1988.const$4, fi, constants$21.const$3, scope);
        }
        static get_keybinding ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$319.const$0.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_keybinding$VH() {
        return constants$1988.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_keybinding)(struct _AtkAction*,int);
     * }
     */
    public static MemorySegment get_keybinding$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1988.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_keybinding)(struct _AtkAction*,int);
     * }
     */
    public static void get_keybinding$set(MemorySegment seg, MemorySegment x) {
        constants$1988.const$5.set(seg, x);
    }
    public static MemorySegment get_keybinding$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1988.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void get_keybinding$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1988.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_keybinding get_keybinding(MemorySegment segment, Arena scope) {
        return get_keybinding.ofAddress(get_keybinding$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*set_description)(struct _AtkAction*,int,char*);
     * }
     */
    public interface set_description {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(set_description fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1989.const$0, fi, constants$150.const$0, scope);
        }
        static set_description ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)constants$316.const$3.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle set_description$VH() {
        return constants$1989.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*set_description)(struct _AtkAction*,int,char*);
     * }
     */
    public static MemorySegment set_description$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1989.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*set_description)(struct _AtkAction*,int,char*);
     * }
     */
    public static void set_description$set(MemorySegment seg, MemorySegment x) {
        constants$1989.const$1.set(seg, x);
    }
    public static MemorySegment set_description$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1989.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void set_description$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1989.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_description set_description(MemorySegment segment, Arena scope) {
        return set_description.ofAddress(set_description$get(segment), scope);
    }
    /**
     * {@snippet :
 * char* (*get_localized_name)(struct _AtkAction*,int);
     * }
     */
    public interface get_localized_name {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(get_localized_name fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1989.const$2, fi, constants$21.const$3, scope);
        }
        static get_localized_name ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$319.const$0.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_localized_name$VH() {
        return constants$1989.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_localized_name)(struct _AtkAction*,int);
     * }
     */
    public static MemorySegment get_localized_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1989.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_localized_name)(struct _AtkAction*,int);
     * }
     */
    public static void get_localized_name$set(MemorySegment seg, MemorySegment x) {
        constants$1989.const$3.set(seg, x);
    }
    public static MemorySegment get_localized_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1989.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void get_localized_name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1989.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_localized_name get_localized_name(MemorySegment segment, Arena scope) {
        return get_localized_name.ofAddress(get_localized_name$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


