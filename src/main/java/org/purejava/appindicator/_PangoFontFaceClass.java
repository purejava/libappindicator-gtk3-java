// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _PangoFontFaceClass {
 *     struct _GObjectClass parent_class;
 *     char* (*get_face_name)(struct _PangoFontFace*);
 *     struct _PangoFontDescription* (*describe)(struct _PangoFontFace*);
 *     void (*list_sizes)(struct _PangoFontFace*,int**,int*);
 *     int (*is_synthesized)(struct _PangoFontFace*);
 *     struct _PangoFontFamily* (*get_family)(struct _PangoFontFace*);
 *     void (*_pango_reserved3)();
 *     void (*_pango_reserved4)();
 * };
 * }
 */
public class _PangoFontFaceClass {

    public static MemoryLayout $LAYOUT() {
        return constants$1550.const$3;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * char* (*get_face_name)(struct _PangoFontFace*);
     * }
     */
    public interface get_face_name {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_face_name fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1550.const$4, fi, constants$5.const$2, scope);
        }
        static get_face_name ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_face_name$VH() {
        return constants$1550.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_face_name)(struct _PangoFontFace*);
     * }
     */
    public static MemorySegment get_face_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1550.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_face_name)(struct _PangoFontFace*);
     * }
     */
    public static void get_face_name$set(MemorySegment seg, MemorySegment x) {
        constants$1550.const$5.set(seg, x);
    }
    public static MemorySegment get_face_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1550.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void get_face_name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1550.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_face_name get_face_name(MemorySegment segment, Arena scope) {
        return get_face_name.ofAddress(get_face_name$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _PangoFontDescription* (*describe)(struct _PangoFontFace*);
     * }
     */
    public interface describe {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(describe fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1551.const$0, fi, constants$5.const$2, scope);
        }
        static describe ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle describe$VH() {
        return constants$1551.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _PangoFontDescription* (*describe)(struct _PangoFontFace*);
     * }
     */
    public static MemorySegment describe$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1551.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _PangoFontDescription* (*describe)(struct _PangoFontFace*);
     * }
     */
    public static void describe$set(MemorySegment seg, MemorySegment x) {
        constants$1551.const$1.set(seg, x);
    }
    public static MemorySegment describe$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1551.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void describe$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1551.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static describe describe(MemorySegment segment, Arena scope) {
        return describe.ofAddress(describe$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*list_sizes)(struct _PangoFontFace*,int**,int*);
     * }
     */
    public interface list_sizes {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(list_sizes fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1551.const$2, fi, constants$14.const$3, scope);
        }
        static list_sizes ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    constants$14.const$5.invokeExact(symbol, _key, _value, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle list_sizes$VH() {
        return constants$1551.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*list_sizes)(struct _PangoFontFace*,int**,int*);
     * }
     */
    public static MemorySegment list_sizes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1551.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*list_sizes)(struct _PangoFontFace*,int**,int*);
     * }
     */
    public static void list_sizes$set(MemorySegment seg, MemorySegment x) {
        constants$1551.const$3.set(seg, x);
    }
    public static MemorySegment list_sizes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1551.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void list_sizes$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1551.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static list_sizes list_sizes(MemorySegment segment, Arena scope) {
        return list_sizes.ofAddress(list_sizes$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*is_synthesized)(struct _PangoFontFace*);
     * }
     */
    public interface is_synthesized {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(is_synthesized fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1551.const$4, fi, constants$10.const$5, scope);
        }
        static is_synthesized ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle is_synthesized$VH() {
        return constants$1551.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*is_synthesized)(struct _PangoFontFace*);
     * }
     */
    public static MemorySegment is_synthesized$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1551.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*is_synthesized)(struct _PangoFontFace*);
     * }
     */
    public static void is_synthesized$set(MemorySegment seg, MemorySegment x) {
        constants$1551.const$5.set(seg, x);
    }
    public static MemorySegment is_synthesized$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1551.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void is_synthesized$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1551.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_synthesized is_synthesized(MemorySegment segment, Arena scope) {
        return is_synthesized.ofAddress(is_synthesized$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _PangoFontFamily* (*get_family)(struct _PangoFontFace*);
     * }
     */
    public interface get_family {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_family fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1552.const$0, fi, constants$5.const$2, scope);
        }
        static get_family ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_family$VH() {
        return constants$1552.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _PangoFontFamily* (*get_family)(struct _PangoFontFace*);
     * }
     */
    public static MemorySegment get_family$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1552.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _PangoFontFamily* (*get_family)(struct _PangoFontFace*);
     * }
     */
    public static void get_family$set(MemorySegment seg, MemorySegment x) {
        constants$1552.const$1.set(seg, x);
    }
    public static MemorySegment get_family$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1552.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void get_family$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1552.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_family get_family(MemorySegment segment, Arena scope) {
        return get_family.ofAddress(get_family$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_pango_reserved3)();
     * }
     */
    public interface _pango_reserved3 {

        void apply();
        static MemorySegment allocate(_pango_reserved3 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1552.const$2, fi, constants$7.const$5, scope);
        }
        static _pango_reserved3 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _pango_reserved3$VH() {
        return constants$1552.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_pango_reserved3)();
     * }
     */
    public static MemorySegment _pango_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1552.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_pango_reserved3)();
     * }
     */
    public static void _pango_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$1552.const$3.set(seg, x);
    }
    public static MemorySegment _pango_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1552.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1552.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved3 _pango_reserved3(MemorySegment segment, Arena scope) {
        return _pango_reserved3.ofAddress(_pango_reserved3$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_pango_reserved4)();
     * }
     */
    public interface _pango_reserved4 {

        void apply();
        static MemorySegment allocate(_pango_reserved4 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1552.const$4, fi, constants$7.const$5, scope);
        }
        static _pango_reserved4 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _pango_reserved4$VH() {
        return constants$1552.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_pango_reserved4)();
     * }
     */
    public static MemorySegment _pango_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1552.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_pango_reserved4)();
     * }
     */
    public static void _pango_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$1552.const$5.set(seg, x);
    }
    public static MemorySegment _pango_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1552.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1552.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved4 _pango_reserved4(MemorySegment segment, Arena scope) {
        return _pango_reserved4.ofAddress(_pango_reserved4$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


