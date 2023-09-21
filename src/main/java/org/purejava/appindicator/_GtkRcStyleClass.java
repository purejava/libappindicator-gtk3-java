// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkRcStyleClass {
 *     struct _GObjectClass parent_class;
 *     struct _GtkRcStyle* (*create_rc_style)(struct _GtkRcStyle*);
 *     unsigned int (*parse)(struct _GtkRcStyle*,struct _GtkSettings*,struct _GScanner*);
 *     void (*merge)(struct _GtkRcStyle*,struct _GtkRcStyle*);
 *     struct _GtkStyle* (*create_style)(struct _GtkRcStyle*);
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 * };
 * }
 */
public class _GtkRcStyleClass {

    public static MemoryLayout $LAYOUT() {
        return constants$3322.const$4;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * struct _GtkRcStyle* (*create_rc_style)(struct _GtkRcStyle*);
     * }
     */
    public interface create_rc_style {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(create_rc_style fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3322.const$5, fi, constants$5.const$2, scope);
        }
        static create_rc_style ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$99.const$0.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle create_rc_style$VH() {
        return constants$3323.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkRcStyle* (*create_rc_style)(struct _GtkRcStyle*);
     * }
     */
    public static MemorySegment create_rc_style$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3323.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkRcStyle* (*create_rc_style)(struct _GtkRcStyle*);
     * }
     */
    public static void create_rc_style$set(MemorySegment seg, MemorySegment x) {
        constants$3323.const$0.set(seg, x);
    }
    public static MemorySegment create_rc_style$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3323.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void create_rc_style$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3323.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static create_rc_style create_rc_style(MemorySegment segment, Arena scope) {
        return create_rc_style.ofAddress(create_rc_style$get(segment), scope);
    }
    /**
     * {@snippet :
 * unsigned int (*parse)(struct _GtkRcStyle*,struct _GtkSettings*,struct _GScanner*);
     * }
     */
    public interface parse {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(parse fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3323.const$1, fi, constants$12.const$2, scope);
        }
        static parse ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)constants$12.const$4.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle parse$VH() {
        return constants$3323.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int (*parse)(struct _GtkRcStyle*,struct _GtkSettings*,struct _GScanner*);
     * }
     */
    public static MemorySegment parse$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3323.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int (*parse)(struct _GtkRcStyle*,struct _GtkSettings*,struct _GScanner*);
     * }
     */
    public static void parse$set(MemorySegment seg, MemorySegment x) {
        constants$3323.const$2.set(seg, x);
    }
    public static MemorySegment parse$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3323.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void parse$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3323.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static parse parse(MemorySegment segment, Arena scope) {
        return parse.ofAddress(parse$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*merge)(struct _GtkRcStyle*,struct _GtkRcStyle*);
     * }
     */
    public interface merge {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(merge fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3323.const$3, fi, constants$13.const$4, scope);
        }
        static merge ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle merge$VH() {
        return constants$3323.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*merge)(struct _GtkRcStyle*,struct _GtkRcStyle*);
     * }
     */
    public static MemorySegment merge$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3323.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*merge)(struct _GtkRcStyle*,struct _GtkRcStyle*);
     * }
     */
    public static void merge$set(MemorySegment seg, MemorySegment x) {
        constants$3323.const$4.set(seg, x);
    }
    public static MemorySegment merge$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3323.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void merge$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3323.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static merge merge(MemorySegment segment, Arena scope) {
        return merge.ofAddress(merge$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GtkStyle* (*create_style)(struct _GtkRcStyle*);
     * }
     */
    public interface create_style {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(create_style fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3323.const$5, fi, constants$5.const$2, scope);
        }
        static create_style ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$99.const$0.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle create_style$VH() {
        return constants$3324.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkStyle* (*create_style)(struct _GtkRcStyle*);
     * }
     */
    public static MemorySegment create_style$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3324.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkStyle* (*create_style)(struct _GtkRcStyle*);
     * }
     */
    public static void create_style$set(MemorySegment seg, MemorySegment x) {
        constants$3324.const$0.set(seg, x);
    }
    public static MemorySegment create_style$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3324.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void create_style$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3324.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static create_style create_style(MemorySegment segment, Arena scope) {
        return create_style.ofAddress(create_style$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3324.const$1, fi, constants$7.const$5, scope);
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
        return constants$3324.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3324.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$3324.const$2.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3324.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3324.const$2.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$3324.const$3, fi, constants$7.const$5, scope);
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
        return constants$3324.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3324.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$3324.const$4.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3324.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3324.const$4.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$3324.const$5, fi, constants$7.const$5, scope);
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
        return constants$3325.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3325.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$3325.const$0.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3325.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3325.const$0.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$3325.const$1, fi, constants$7.const$5, scope);
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
        return constants$3325.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3325.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$3325.const$2.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3325.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3325.const$2.set(seg.asSlice(index*sizeof()), x);
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

