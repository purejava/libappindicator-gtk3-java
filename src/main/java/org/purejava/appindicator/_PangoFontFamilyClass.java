// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _PangoFontFamilyClass {
 *     struct _GObjectClass parent_class;
 *     void (*list_faces)(struct _PangoFontFamily*,struct _PangoFontFace***,int*);
 *     char* (*get_name)(struct _PangoFontFamily*);
 *     int (*is_monospace)(struct _PangoFontFamily*);
 *     int (*is_variable)(struct _PangoFontFamily*);
 *     struct _PangoFontFace* (*get_face)(struct _PangoFontFamily*,char*);
 *     void (*_pango_reserved2)();
 * };
 * }
 */
public class _PangoFontFamilyClass {

    public static MemoryLayout $LAYOUT() {
        return constants$1552.const$1;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * void (*list_faces)(struct _PangoFontFamily*,struct _PangoFontFace***,int*);
     * }
     */
    public interface list_faces {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(list_faces fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1552.const$2, fi, constants$14.const$3, scope);
        }
        static list_faces ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle list_faces$VH() {
        return constants$1552.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*list_faces)(struct _PangoFontFamily*,struct _PangoFontFace***,int*);
     * }
     */
    public static MemorySegment list_faces$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1552.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*list_faces)(struct _PangoFontFamily*,struct _PangoFontFace***,int*);
     * }
     */
    public static void list_faces$set(MemorySegment seg, MemorySegment x) {
        constants$1552.const$3.set(seg, x);
    }
    public static MemorySegment list_faces$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1552.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void list_faces$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1552.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static list_faces list_faces(MemorySegment segment, Arena scope) {
        return list_faces.ofAddress(list_faces$get(segment), scope);
    }
    /**
     * {@snippet :
 * char* (*get_name)(struct _PangoFontFamily*);
     * }
     */
    public interface get_name {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_name fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1552.const$4, fi, constants$5.const$2, scope);
        }
        static get_name ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_name$VH() {
        return constants$1552.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_name)(struct _PangoFontFamily*);
     * }
     */
    public static MemorySegment get_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1552.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_name)(struct _PangoFontFamily*);
     * }
     */
    public static void get_name$set(MemorySegment seg, MemorySegment x) {
        constants$1552.const$5.set(seg, x);
    }
    public static MemorySegment get_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1552.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void get_name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1552.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_name get_name(MemorySegment segment, Arena scope) {
        return get_name.ofAddress(get_name$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*is_monospace)(struct _PangoFontFamily*);
     * }
     */
    public interface is_monospace {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(is_monospace fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1553.const$0, fi, constants$10.const$5, scope);
        }
        static is_monospace ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle is_monospace$VH() {
        return constants$1553.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*is_monospace)(struct _PangoFontFamily*);
     * }
     */
    public static MemorySegment is_monospace$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1553.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*is_monospace)(struct _PangoFontFamily*);
     * }
     */
    public static void is_monospace$set(MemorySegment seg, MemorySegment x) {
        constants$1553.const$1.set(seg, x);
    }
    public static MemorySegment is_monospace$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1553.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void is_monospace$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1553.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_monospace is_monospace(MemorySegment segment, Arena scope) {
        return is_monospace.ofAddress(is_monospace$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*is_variable)(struct _PangoFontFamily*);
     * }
     */
    public interface is_variable {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(is_variable fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1553.const$2, fi, constants$10.const$5, scope);
        }
        static is_variable ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle is_variable$VH() {
        return constants$1553.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*is_variable)(struct _PangoFontFamily*);
     * }
     */
    public static MemorySegment is_variable$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1553.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*is_variable)(struct _PangoFontFamily*);
     * }
     */
    public static void is_variable$set(MemorySegment seg, MemorySegment x) {
        constants$1553.const$3.set(seg, x);
    }
    public static MemorySegment is_variable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1553.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void is_variable$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1553.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_variable is_variable(MemorySegment segment, Arena scope) {
        return is_variable.ofAddress(is_variable$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _PangoFontFace* (*get_face)(struct _PangoFontFamily*,char*);
     * }
     */
    public interface get_face {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment func_data);
        static MemorySegment allocate(get_face fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1553.const$4, fi, constants$5.const$5, scope);
        }
        static get_face ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _func_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$15.const$1.invokeExact(symbol, _path, _func_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_face$VH() {
        return constants$1553.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _PangoFontFace* (*get_face)(struct _PangoFontFamily*,char*);
     * }
     */
    public static MemorySegment get_face$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1553.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _PangoFontFace* (*get_face)(struct _PangoFontFamily*,char*);
     * }
     */
    public static void get_face$set(MemorySegment seg, MemorySegment x) {
        constants$1553.const$5.set(seg, x);
    }
    public static MemorySegment get_face$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1553.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void get_face$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1553.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_face get_face(MemorySegment segment, Arena scope) {
        return get_face.ofAddress(get_face$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_pango_reserved2)();
     * }
     */
    public interface _pango_reserved2 {

        void apply();
        static MemorySegment allocate(_pango_reserved2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1554.const$0, fi, constants$7.const$5, scope);
        }
        static _pango_reserved2 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _pango_reserved2$VH() {
        return constants$1554.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_pango_reserved2)();
     * }
     */
    public static MemorySegment _pango_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1554.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_pango_reserved2)();
     * }
     */
    public static void _pango_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$1554.const$1.set(seg, x);
    }
    public static MemorySegment _pango_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1554.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1554.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved2 _pango_reserved2(MemorySegment segment, Arena scope) {
        return _pango_reserved2.ofAddress(_pango_reserved2$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


