// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _PangoFontsetClass {
 *     struct _GObjectClass parent_class;
 *     struct _PangoFont* (*get_font)(struct _PangoFontset*,unsigned int);
 *     struct _PangoFontMetrics* (*get_metrics)(struct _PangoFontset*);
 *     struct _PangoLanguage* (*get_language)(struct _PangoFontset*);
 *     void (*foreach)(struct _PangoFontset*,int (*)(struct _PangoFontset*,struct _PangoFont*,void*),void*);
 *     void (*_pango_reserved1)();
 *     void (*_pango_reserved2)();
 *     void (*_pango_reserved3)();
 *     void (*_pango_reserved4)();
 * };
 * }
 */
public class _PangoFontsetClass {

    public static MemoryLayout $LAYOUT() {
        return constants$1586.const$2;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * struct _PangoFont* (*get_font)(struct _PangoFontset*,unsigned int);
     * }
     */
    public interface get_font {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(get_font fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1586.const$3, fi, constants$21.const$3, scope);
        }
        static get_font ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_font$VH() {
        return constants$1586.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _PangoFont* (*get_font)(struct _PangoFontset*,unsigned int);
     * }
     */
    public static MemorySegment get_font$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1586.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _PangoFont* (*get_font)(struct _PangoFontset*,unsigned int);
     * }
     */
    public static void get_font$set(MemorySegment seg, MemorySegment x) {
        constants$1586.const$4.set(seg, x);
    }
    public static MemorySegment get_font$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1586.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void get_font$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1586.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_font get_font(MemorySegment segment, Arena scope) {
        return get_font.ofAddress(get_font$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _PangoFontMetrics* (*get_metrics)(struct _PangoFontset*);
     * }
     */
    public interface get_metrics {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_metrics fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1586.const$5, fi, constants$5.const$2, scope);
        }
        static get_metrics ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_metrics$VH() {
        return constants$1587.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _PangoFontMetrics* (*get_metrics)(struct _PangoFontset*);
     * }
     */
    public static MemorySegment get_metrics$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1587.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _PangoFontMetrics* (*get_metrics)(struct _PangoFontset*);
     * }
     */
    public static void get_metrics$set(MemorySegment seg, MemorySegment x) {
        constants$1587.const$0.set(seg, x);
    }
    public static MemorySegment get_metrics$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1587.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void get_metrics$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1587.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_metrics get_metrics(MemorySegment segment, Arena scope) {
        return get_metrics.ofAddress(get_metrics$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _PangoLanguage* (*get_language)(struct _PangoFontset*);
     * }
     */
    public interface get_language {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_language fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1587.const$1, fi, constants$5.const$2, scope);
        }
        static get_language ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_language$VH() {
        return constants$1587.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _PangoLanguage* (*get_language)(struct _PangoFontset*);
     * }
     */
    public static MemorySegment get_language$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1587.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _PangoLanguage* (*get_language)(struct _PangoFontset*);
     * }
     */
    public static void get_language$set(MemorySegment seg, MemorySegment x) {
        constants$1587.const$2.set(seg, x);
    }
    public static MemorySegment get_language$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1587.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void get_language$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1587.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_language get_language(MemorySegment segment, Arena scope) {
        return get_language.ofAddress(get_language$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*foreach)(struct _PangoFontset*,int (*)(struct _PangoFontset*,struct _PangoFont*,void*),void*);
     * }
     */
    public interface foreach {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(foreach fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1587.const$3, fi, constants$14.const$3, scope);
        }
        static foreach ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle foreach$VH() {
        return constants$1587.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*foreach)(struct _PangoFontset*,int (*)(struct _PangoFontset*,struct _PangoFont*,void*),void*);
     * }
     */
    public static MemorySegment foreach$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1587.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*foreach)(struct _PangoFontset*,int (*)(struct _PangoFontset*,struct _PangoFont*,void*),void*);
     * }
     */
    public static void foreach$set(MemorySegment seg, MemorySegment x) {
        constants$1587.const$4.set(seg, x);
    }
    public static MemorySegment foreach$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1587.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void foreach$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1587.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static foreach foreach(MemorySegment segment, Arena scope) {
        return foreach.ofAddress(foreach$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_pango_reserved1)();
     * }
     */
    public interface _pango_reserved1 {

        void apply();
        static MemorySegment allocate(_pango_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1587.const$5, fi, constants$7.const$5, scope);
        }
        static _pango_reserved1 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _pango_reserved1$VH() {
        return constants$1588.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_pango_reserved1)();
     * }
     */
    public static MemorySegment _pango_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1588.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_pango_reserved1)();
     * }
     */
    public static void _pango_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$1588.const$0.set(seg, x);
    }
    public static MemorySegment _pango_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1588.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1588.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved1 _pango_reserved1(MemorySegment segment, Arena scope) {
        return _pango_reserved1.ofAddress(_pango_reserved1$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_pango_reserved2)();
     * }
     */
    public interface _pango_reserved2 {

        void apply();
        static MemorySegment allocate(_pango_reserved2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1588.const$1, fi, constants$7.const$5, scope);
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
        return constants$1588.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_pango_reserved2)();
     * }
     */
    public static MemorySegment _pango_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1588.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_pango_reserved2)();
     * }
     */
    public static void _pango_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$1588.const$2.set(seg, x);
    }
    public static MemorySegment _pango_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1588.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1588.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved2 _pango_reserved2(MemorySegment segment, Arena scope) {
        return _pango_reserved2.ofAddress(_pango_reserved2$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_pango_reserved3)();
     * }
     */
    public interface _pango_reserved3 {

        void apply();
        static MemorySegment allocate(_pango_reserved3 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1588.const$3, fi, constants$7.const$5, scope);
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
        return constants$1588.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_pango_reserved3)();
     * }
     */
    public static MemorySegment _pango_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1588.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_pango_reserved3)();
     * }
     */
    public static void _pango_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$1588.const$4.set(seg, x);
    }
    public static MemorySegment _pango_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1588.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1588.const$4.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$1588.const$5, fi, constants$7.const$5, scope);
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
        return constants$1589.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_pango_reserved4)();
     * }
     */
    public static MemorySegment _pango_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1589.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_pango_reserved4)();
     * }
     */
    public static void _pango_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$1589.const$0.set(seg, x);
    }
    public static MemorySegment _pango_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1589.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1589.const$0.set(seg.asSlice(index*sizeof()), x);
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

